import java.util.HashMap;
import java.util.Map;

class ResistorColorDuo {
    int value(String[] colors) {
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
        String res = String.valueOf((colorDictionary.get(colors[0])+""+colorDictionary.get(colors[1])));
        return  Integer.parseInt(res);

    }
}