import java.util.Arrays;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class HighScoresTest {
    @Test
    public void shouldReturnListOfScores() {
        HighScores highScores = new HighScores(Arrays.asList(30, 50, 20, 70));
        assertEquals(Arrays.asList(30, 50, 20, 70),highScores.scores());
    }
    @Test
   
    public void shouldReturnLatestAddedScore() {
        HighScores highScores = new HighScores(Arrays.asList(100, 0, 90, 30));
        assertEquals(30,highScores.latest());
    }
    @Test
   
    public void shouldReturnPersonalBest() {
        HighScores highScores = new HighScores(Arrays.asList(40, 100, 70));
        assertEquals(100,highScores.personalBest());
    }
    @Test
   
    public void shouldReturnPersonalTopThreeFromListOfScores() {
        HighScores highScores = new HighScores(Arrays.asList(10, 30, 90, 30, 100, 20, 10, 0, 30, 40, 40, 70, 70));
        assertEquals(Arrays.asList(100, 90, 70),highScores.personalTopThree());

    }
    @Test
   
    public void shouldReturnPersonalTopThreeSortedHighestToLowest() {
        HighScores highScores = new HighScores(Arrays.asList(20, 10, 30));
        assertEquals(Arrays.asList(30, 20, 10),highScores.personalTopThree());
    }
    @Test
   
    public void shouldReturnPersonalTopThreeWhenThereIsATie() {
        HighScores highScores = new HighScores(Arrays.asList(40, 20, 40, 30));
        assertEquals(Arrays.asList(40, 40, 30),highScores.personalTopThree());
    }
    @Test
   
    public void shouldReturnPersonalTopWhenThereIsLessThanThreeScores() {
        HighScores highScores = new HighScores(Arrays.asList(30, 70));
        assertEquals(Arrays.asList(70, 30),highScores.personalTopThree());
    }
    @Test
   
    public void shouldReturnPersonalTopWhenThereIsOnlyOneScore() {
        HighScores highScores = new HighScores(Arrays.asList(40));
        assertEquals(Arrays.asList(40),highScores.personalTopThree());
    }
    @Test
   
    public void callingLatestAfterPersonalTopThree() {
        HighScores highScores = new HighScores(Arrays.asList(70, 50, 20, 30));
        highScores.personalTopThree();
        assertEquals(30,highScores.latest());
    }
    @Test
   
    public void callingScoresAfterPersonalTopThree() {
        HighScores highScores = new HighScores(Arrays.asList(30, 50, 20, 70));
        highScores.personalTopThree();
        assertEquals(Arrays.asList(30, 50, 20, 70),highScores.scores());
    }
    @Test
   
    public void callingLatestAfterPersonalBest() {
        HighScores highScores = new HighScores(Arrays.asList(20, 70, 15, 25, 30));
        highScores.personalBest();
        assertEquals(30,highScores.latest());
    }
    @Test
   
    public void callingScoresAfterPersonalBest() {
        HighScores highScores = new HighScores(Arrays.asList(20, 70, 15, 25, 30));
        highScores.personalBest();
        assertEquals(Arrays.asList(20, 70, 15, 25, 30),highScores.scores());
    }
}