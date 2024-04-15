import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

class ProteinTranslator {
    public static Map<String, String[]> aminoAcids = new HashMap<>();

    static {
        aminoAcids.put("Methionine", new String[]{"AUG"});
        aminoAcids.put("Phenylalanine", new String[]{"UUU", "UUC"});
        aminoAcids.put("Leucine", new String[]{"UUA", "UUG"});
        aminoAcids.put("Serine", new String[]{"UCU", "UCC", "UCA", "UCG"});
        aminoAcids.put("Tyrosine", new String[]{"UAU", "UAC"});
        aminoAcids.put("Cysteine", new String[]{"UGU", "UGC"});
        aminoAcids.put("Tryptophan", new String[]{"UGG"});
        aminoAcids.put("STOP", new String[]{"UAA", "UAG", "UGA"});
    }

    List<String> translate(String rnaSequence) {
        List<String> aminoTranslate = new ArrayList<>();
        int chunkSize = 3;
        for (int i = 0; i < rnaSequence.length(); i += chunkSize) {
            int endIndex = Math.min(i + chunkSize, rnaSequence.length());
            String chunk = rnaSequence.substring(i, endIndex);
            boolean found = false;
            for (Map.Entry<String, String[]> entry : aminoAcids.entrySet()) {
                String aminoAcid = entry.getKey();
                String[] codons = entry.getValue();
                for (String codon : codons) {
                    if (chunk.equals(codon)) {
                        if (aminoAcid.equals("STOP")) {
                            return aminoTranslate;
                        } else {
                            aminoTranslate.add(aminoAcid);
                            found = true;
                            break;
                        }
                    }
                }
                if (found) break;
            }
            if (!found) {
                throw new IllegalArgumentException("Invalid codon");
            }
        }
        return aminoTranslate;
    }
}
