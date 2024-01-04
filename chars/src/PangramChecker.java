import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        char[] abe =  {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'} ;
        String ct = input.replaceAll("[^a-zA-Z]", "").toUpperCase().replaceAll("\\s", "");
        Set<Character> letrasUnicas = new HashSet<>();
        for (int i = 0; i < ct.length(); i++) {
            char castCt = ct.charAt(i);
            letrasUnicas.add(castCt);
        }

        if (letrasUnicas.size() == 26 ){
            System.out.println("true");
            return true ;
        }else {return false ;}
    }

}