import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        String ct = input.replaceAll("[^a-zA-Z]", "").toUpperCase().replaceAll("\\s", "");
        Set<Character> letrasUnicas = new HashSet<>();
        for (int i = 0; i < ct.length(); i++) {
            letrasUnicas.add(ct.charAt(i));
        }

        if (letrasUnicas.size() == 26 ){
            return true ;
        }else {return false ;}
    }

}