import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ResistorColor res = new ResistorColor();
        int val = res.colorCode("black");
        System.out.println(val);
        String colors = Arrays.toString(res.colors());
        System.out.println("colors = " + colors);
        ResistorColorDuo res2 = new ResistorColorDuo();
        int val2 = res2.value(new String[]{ "orange", "orange" });
        System.out.println(val2);
    }
}