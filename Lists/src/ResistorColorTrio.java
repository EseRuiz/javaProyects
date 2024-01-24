import java.util.HashMap;
import java.util.Map;

class ResistorColorTrio {
    String label(String[] colors) {
        String totalRes ="";
        String res = "";
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

        if(colorDictionary.get(colors[0])==0){
             res = String.valueOf(colorDictionary.get(colors[1]));
        }else{ res = colorDictionary.get(colors[0]) + "" + colorDictionary.get(colors[1]);}


        if(colorDictionary.get(colors[2])==0){
            totalRes= res+" ohms";
        }
        if(colorDictionary.get(colors[2])==1){
            totalRes = res+"0 ohms";
        }
        if(colorDictionary.get(colors[2])==2){
            totalRes = colorDictionary.get(colors[0]) +" kiloohms";
        }
        if(colorDictionary.get(colors[2])==3){
            totalRes = res+" kiloohms";
        }
        if(colorDictionary.get(colors[2])==4){
            totalRes = res+"0 kiloohms";
        }
        if(colorDictionary.get(colors[2])==5){
            totalRes = colorDictionary.get(colors[0]) + "." + colorDictionary.get(colors[1])+"0 megaohms";
        }
        if(colorDictionary.get(colors[2])==6){
            totalRes = res+" megaohms";
        }
        if(colorDictionary.get(colors[2])==9){
            totalRes = res+" gigaohms";
        }
        return totalRes;

    }
}
