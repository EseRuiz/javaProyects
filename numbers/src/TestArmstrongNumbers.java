import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;
public class TestArmstrongNumbers {
    private ArmstrongNumbers armstrongNumbers;
    @Before
    public void setup() {
        armstrongNumbers = new ArmstrongNumbers();
    }
    @Test
    public void zeroIsArmstrongNumber() {
        assertTrue(armstrongNumbers.isArmstrongNumber(0));
    }
   
    @Test
    public void singleDigitsAreArmstrongNumbers() {
        assertTrue(armstrongNumbers.isArmstrongNumber(5));
    }

    @Test
    public void noTwoDigitArmstrongNumbers() {
        assertFalse(armstrongNumbers.isArmstrongNumber(10));
    }
   
    @Test
    public void threeDigitNumberIsArmstrongNumber() {
        assertTrue(armstrongNumbers.isArmstrongNumber(153));
    }
   
    @Test
    public void threeDigitNumberIsNotArmstrongNumber() {
        assertFalse(armstrongNumbers.isArmstrongNumber(100));
    }
   
    @Test
    public void fourDigitNumberIsArmstrongNumber() {
        assertTrue(armstrongNumbers.isArmstrongNumber(9474));
    }
   
    @Test
    public void fourDigitNumberIsNotArmstrongNumber() {
        assertFalse(armstrongNumbers.isArmstrongNumber(9475));
    }
   
    @Test
    public void sevenDigitNumberIsArmstrongNumber() {
        assertTrue(armstrongNumbers.isArmstrongNumber(9926315));
    }
   
    @Test
    public void sevenDigitNumberIsNotArmstrongNumber() {
        assertFalse(armstrongNumbers.isArmstrongNumber(9926314));
    }
}