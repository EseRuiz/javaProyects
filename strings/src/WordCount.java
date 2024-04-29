import java.util.HashMap;
import java.util.Map;

class WordCount {
    public Map<String, Integer> phrase(String input) {
        String[] newSentence = input.split("_");
        StringBuilder cleanSentence = new StringBuilder();
        for (String word : newSentence) {
            cleanSentence.append(word).append(" ");
        }
        String cleanSentenceString = cleanSentence.toString().toLowerCase().trim().replaceAll("[^\\w']+", " ");
        String[] newWord = cleanSentenceString.split(" ");
        String[] newWord2 = new String[newWord.length];
        int index = 0;
        for (String word : newWord) {
            if (word.startsWith("'") && word.endsWith("'") && word.length() > 1) {
                newWord2[index++] = word.substring(1, word.length() - 1);
            } else if (word.startsWith("'")) {
                newWord2[index++] = word.substring(1);
            } else if (word.endsWith("'")) {
                newWord2[index++] = word.substring(0, word.length() - 1);
            } else {
                newWord2[index++] = word;
            }
        }
        Map<String, Integer> dictWords = new HashMap<>();
        for (String word : newWord2) {
            if (!word.equals("")) {
                dictWords.put(word, dictWords.getOrDefault(word, 0) + 1);
            }
        }
        return  dictWords ;
    }
}