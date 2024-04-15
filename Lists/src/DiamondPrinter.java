import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        List<String> diamond = new ArrayList<>();
        List<String> diamondMirror = new ArrayList<>();

        List<Character> dictionary = new ArrayList<>();
        dictionary.add('A');
        dictionary.add('B');
        dictionary.add('C');
        dictionary.add('D');
        dictionary.add('E');
        dictionary.add('F');
        dictionary.add('G');
        dictionary.add('H');
        dictionary.add('I');
        dictionary.add('J');
        dictionary.add('K');
        dictionary.add('L');
        dictionary.add('M');
        dictionary.add('N');
        dictionary.add('O');
        dictionary.add('P');
        dictionary.add('Q');
        dictionary.add('R');
        dictionary.add('S');
        dictionary.add('T');
        dictionary.add('U');
        dictionary.add('V');
        dictionary.add('W');
        dictionary.add('X');
        dictionary.add('Y');
        dictionary.add('Z');

        int length = dictionary.indexOf(a)+1;
        for (int i = 0; i < length; i++) {
            if (i == 0){
                diamond.add(" ".repeat(length - 1) + dictionary.get(i) + " ".repeat(length - 1));
            }
            if (i > 0){
                diamond.add(" ".repeat(length-i - 1) + dictionary.get(i) + " ".repeat(2*i - 1) + dictionary.get(i) +" ".repeat(length - i-1));
            }
        }
        Collections.reverse(diamond);
        diamondMirror.addAll(diamond);
        diamondMirror.remove(0);
        Collections.reverse(diamond);
        diamond.addAll(diamondMirror);
        return diamond;


    }

}