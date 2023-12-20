public class ReverseString {
    String reverse(String inputString) {
        String invert = "";
        StringBuilder invertVar = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            invert = String.valueOf(inputString.charAt(i));
            invertVar.append(invert);
        }
        return String.valueOf(invertVar);
    }
}
