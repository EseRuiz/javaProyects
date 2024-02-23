import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HighScores scor = new HighScores(Arrays.asList(70, 50, 20, 30));
        //System.out.println(scor.latest());
        //System.out.println(scor.personalBest());
        scor.personalTopThree();
        System.out.println(scor.personalTopThree());
        scor.scores();
        System.out.println(scor.scores());
        System.out.println(scor.latest());
    }
}