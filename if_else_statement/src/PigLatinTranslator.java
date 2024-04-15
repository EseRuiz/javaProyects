import java.util.ArrayList;

class PigLatinTranslator {
    public String translate(String wordss) {
        ArrayList<String> firstList = new ArrayList<>();
        ArrayList<String> consonantsList = new ArrayList<>();
        ArrayList<String> combinatedList = new ArrayList<>();


        combinatedList.add("ch");
        combinatedList.add("sc");
        combinatedList.add("qu");
        combinatedList.add("sq");
        combinatedList.add("th");
        combinatedList.add("rh");

        firstList.add("a");
        firstList.add("e");
        firstList.add("i");
        firstList.add("o");
        firstList.add("u");
        firstList.add("xr");
        firstList.add("yt");

        consonantsList.add("p");
        consonantsList.add("q");
        consonantsList.add("b");
        consonantsList.add("t");
        consonantsList.add("d");
        consonantsList.add("c");
        consonantsList.add("j");
        consonantsList.add("k");
        consonantsList.add("g");
        consonantsList.add("f");
        consonantsList.add("v");
        consonantsList.add("s");
        consonantsList.add("z");
        consonantsList.add("m");
        consonantsList.add("n");
        consonantsList.add("ñ");
        consonantsList.add("l");
        consonantsList.add("x");
        consonantsList.add("r");
        consonantsList.add("w");
        consonantsList.add("e");
        consonantsList.add("y");
        consonantsList.add("h");

        String[] words = wordss.split(" ");
        StringBuilder translatedPhrase = new StringBuilder();

        for(String word : words){
            char firstChar = word.charAt(0);
            String firstTwoChars = word.substring(0, Math.min(word.length(), 2));
            String firstThreeChars = word.substring(0, Math.min(word.length(), 3));
            String out = "";

            if (firstList.contains(String.valueOf(firstChar)) || firstList.contains(firstTwoChars)) {
                out = word + "ay";
            } else if (consonantsList.contains(String.valueOf(firstChar)) && !combinatedList.contains(firstTwoChars)) {
                out = word.substring(1) + firstChar + "ay";
            } else if  (consonantsList.contains(String.valueOf(firstChar)) && combinatedList.contains(word.substring(1, Math.min(word.length(), 3)))) {
                out = word.substring(3) + word.substring(0,3)+"ay";
            } else if (combinatedList.contains(firstTwoChars) && consonantsList.contains(word.substring(2, Math.min(word.length(), 3))) && !firstThreeChars.equals("thr")) {
                out = word.substring(2) + word.substring(0,2)+"ay";
            } else if (String.valueOf(firstChar).equals("x")) {
                out = word + "ay";
            }  else if (String.valueOf(firstChar).equals("y")) {
                out = word.substring(1) + "yay";
            }  else if (firstThreeChars.equals("thr")) {
                out = word.substring(3) + word.substring(0,3)+"ay";
            }  else if (combinatedList.contains(firstTwoChars)) {
                out = word.substring(2) + word.substring(0,2)+"ay";
            }  else if (consonantsList.contains(String.valueOf(word.charAt(1)))) {
                out = "y" + word.charAt(0) + "ay";
            } else if (String.valueOf(word.charAt(1)).equals("y")) {
                out = "y" + word + "ay";
            }
            translatedPhrase.append(out).append(" ");
        }
        return translatedPhrase.toString().trim();
    }
}
