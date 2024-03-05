class MicroBlog {
    public String truncate(String input) {
        if(input.codePointCount(0, input.length())<5){
            return input.substring(0, input.offsetByCodePoints(0, input.codePointCount(0, input.length())));
        }else {
            return input.substring(0, input.offsetByCodePoints(0, 5));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Hamming hamin = new Hamming("G", "");
        System.out.println(hamin.getHammingDistance());

    }
}