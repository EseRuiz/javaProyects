import java.util.*;

class ResistorColor {
    int colorCode(String color) {
        Map<String, Integer> colorDictionary = new HashMap<>();

        colorDictionary.put("black", 0);
        colorDictionary.put("brown", 1);
        colorDictionary.put("red", 2);
        colorDictionary.put("orange", 3);
        colorDictionary.put("yellow", 4);
        colorDictionary.put("green", 5);
        colorDictionary.put("blue", 6);
        colorDictionary.put("violet", 7);
        colorDictionary.put("grey", 8);
        colorDictionary.put("white", 9);
        return colorDictionary.get((color));
    }

    String[] colors() {
        Map<String, Integer> colorDictionary = new LinkedHashMap<>();

        colorDictionary.put("black", 0);
        colorDictionary.put("brown", 1);
        colorDictionary.put("red", 2);
        colorDictionary.put("orange", 3);
        colorDictionary.put("yellow", 4);
        colorDictionary.put("green", 5);
        colorDictionary.put("blue", 6);
        colorDictionary.put("violet", 7);
        colorDictionary.put("grey", 8);
        colorDictionary.put("white", 9);

        return colorDictionary.keySet().toArray(new String[0]);

        //List<String> colorList = new ArrayList<>(colorDictionary.keySet());
        //String[] result = colorList.toArray(new String[0]);
        //return colorList.toArray(new String[0]);
    }
}