import java.util.HashMap;
import java.util.Map;
public class Scrabble {
    Map<Character, Integer> dictAbc = new HashMap<>();
    private String word;

    Scrabble(String word) {
        this.word = word ;
        dictAbc.put('a', 1);
        dictAbc.put('b', 3);
        dictAbc.put('c', 3);
        dictAbc.put('d', 2);
        dictAbc.put('e', 1);
        dictAbc.put('f', 4);
        dictAbc.put('g', 2);
        dictAbc.put('h', 4);
        dictAbc.put('i', 1);
        dictAbc.put('j', 8);
        dictAbc.put('k', 5);
        dictAbc.put('l', 1);
        dictAbc.put('m', 3);
        dictAbc.put('n', 1);
        dictAbc.put('o', 1);
        dictAbc.put('p', 3);
        dictAbc.put('q', 10);
        dictAbc.put('r', 1);
        dictAbc.put('s', 1);
        dictAbc.put('t', 1);
        dictAbc.put('u', 1);
        dictAbc.put('v', 4);
        dictAbc.put('w', 4);
        dictAbc.put('x', 8);
        dictAbc.put('y', 4);
        dictAbc.put('z', 10);
    }

    int getScore() {
        int resScore = 0;
        String lowWord = this.word.toLowerCase();
        for(char word: lowWord.toCharArray()){
            resScore += dictAbc.get(word);
        }
        return resScore ;
    }
}

