import java.util.ArrayList;
import java.util.List;

class Atbash {
    char[] dictionary = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    char[] atbashDict = {'z', 'y', 'x', 'w', 'v', 'u', 't', 's', 'r', 'q', 'p', 'o', 'n', 'm', 'l', 'k', 'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};

    String encode(String input) {
        String plainTextSpaces = input.replace(" ", "").replace(".", "").replace(",", "");
        String[] converted = plainTextSpaces.toLowerCase().split("");
        StringBuilder newStr = new StringBuilder();
        StringBuilder finalStr = new StringBuilder();
        int count = 0 ;
        for (String word : converted) {
            if (word.matches("\\d+")) {
                newStr.append(word);
            } else {
                int index = new String(dictionary).indexOf(word);
                if (index != -1) {
                    newStr.append(atbashDict[index]);
                }
            }
        }
        for (int i = 0; i < newStr.length(); i++) {
            if(count == 5){
                finalStr.append(" ");
                count = 0;
            }
            finalStr.append(newStr.charAt(i));
            count++;
        }
        return finalStr.toString();
    }

    String decode(String input) {
        String plainTextSpaces = input.replace(" ", "").replace(".", "").replace(",", "");
        String[] converted = plainTextSpaces.toLowerCase().split("");
        StringBuilder newStr = new StringBuilder();
        for (String word : converted) {
            if (word.matches("\\d+")) {
                newStr.append(word);
            } else {
                int index = new String(atbashDict).indexOf(word);
                if (index != -1) {
                    newStr.append(dictionary[index]);
                }
            }
        }
        return newStr.toString();
    }

}
