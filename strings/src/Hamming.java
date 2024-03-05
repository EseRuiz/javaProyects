public class Hamming {
    private String leftStrand ;
    private String rightStrand ;
    public Hamming(String leftStrand, String rightStrand) {
        if(leftStrand.length()!= rightStrand.length()){
            throw new IllegalArgumentException("strands must be of equal length");
        }
        this.leftStrand = leftStrand ;
        this.rightStrand = rightStrand ;
    }

    public int getHammingDistance() {
        int difference = 0;
        char[] left = this.leftStrand.toCharArray();
        char[] right = this.rightStrand.toCharArray();
        for (int i = 0; i < left.length; i++) {
            if (left[i] != right[i]){
                difference += 1;
            }
        }return difference;

    }
}