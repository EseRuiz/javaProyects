import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Anagram {

    private String word ;
    private List<String> anagramas = new ArrayList<>();

    public Anagram(String word) {
        this.word = word;
    }

    public List<String> match(List<String> candidates) {
        char [] letrasPrincipales = this.word.toLowerCase().toCharArray();
        Arrays.sort(letrasPrincipales);
        for(String palabra: candidates){
            if(!this.word.toUpperCase().equals(palabra.toUpperCase())){
                char [] letrasCandidatas = palabra.toLowerCase().toCharArray();
                Arrays.sort(letrasCandidatas);
                if(Arrays.equals(letrasPrincipales,letrasCandidatas)){
                    anagramas.add(palabra);
                }
            }
        }return anagramas;
    }

}