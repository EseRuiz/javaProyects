class SqueakyClean {
    static String clean(String identifier) {
        char[] convert = {};
        String finalV = "";
        String cleanSpace = identifier.replace(' ','_');
        String cleanCtrl = cleanSpace.replaceAll("[\\u0000\\r\\u007F]","CTRL");
        convert = cleanCtrl.toCharArray();
        for (int i = 0; i<=(cleanCtrl.length()-1); i++){
            if (convert[i] == '-'){
                convert[i] = ' ';
                convert[i+1] = Character.toUpperCase(convert[i+1]);
            }
        }
        finalV = String.valueOf(convert).replace(" ","") ;
        finalV = finalV.replaceAll("[^\\p{L}_À-ÿḂḃ&&[^\\p{IsGreek}]_Ο]", "");
        return finalV;
    }
}
public class Main {
    public static void main(String[] args) {
        String testCl;
        SqueakyClean test = new SqueakyClean();
        testCl = test.clean("a1\uD83D\uDE002\uD83D\uDE003\uD83D\uDE00b");
        System.out.println(testCl);
        PangramChecker pam = new PangramChecker() ;
        boolean probe = pam.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs");
    }
}