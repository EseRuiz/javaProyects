import java.util.ArrayList;
import java.util.List;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        String new_phrase = phrase.replaceAll("[^a-zA-Z]", "").replace(" ", "").toLowerCase();
        int val = 0 ;
        List<Integer> counts = new ArrayList<>();
        if (new_phrase.equals("")){return true;}
        for (int i = 0; i < new_phrase.length(); i++) {
            for (int j = 0; j < new_phrase.length(); j++){
                if(new_phrase.charAt(i) == (new_phrase.charAt(j))){
                    val += 1 ;
                }

            }counts.add(val);val = 0;
        }
        System.out.println(counts);
        for (int i = 0; i < counts.size(); i++) {
            if (counts.get(i) > 1){
                return false ;
            }
        }
        return true;
    }

}