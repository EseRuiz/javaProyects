import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DiamondPrinter diamon = new DiamondPrinter();
        System.out.println(diamon.printToList('D'));
        IsogramChecker iso = new IsogramChecker();
        System.out.println(iso.isIsogram("up-to-date"));
    }
}