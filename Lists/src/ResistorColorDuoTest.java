import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ResistorColorDuoTest {
    private ResistorColorDuo resistorColorDuo;
    @BeforeEach
    public void setup() {
        resistorColorDuo = new ResistorColorDuo();
    }
    @Test
    public void testBrownAndBlack() {
        assertEquals(10,
                resistorColorDuo.value(new String[]{"brown", "black"})
        );
    }
    
    @Test
    public void testBlueAndGrey() {
        assertEquals(68,
                resistorColorDuo.value(new String[]{ "blue", "grey" })
        );
    }
    
    @Test
    public void testYellowAndViolet() {
        assertEquals(47,
                resistorColorDuo.value(new String[]{ "yellow", "violet" })
        );
    }
    
    @Test
    public void testOrangeAndOrange() {
        assertEquals(33,
                resistorColorDuo.value(new String[]{ "orange", "orange" })
        );
    }

    
    @Test
    public void testWhiteAndRed() {
        assertEquals(92,
                resistorColorDuo.value(new String[]{ "white", "red" })
        );
    }

    
    @Test
    public void testBlackAndBrownOneDigit() {
        assertEquals(1,
                resistorColorDuo.value(new String[]{ "black", "brown" })
        );
    }
    
    @Test
    public void testIgnoreAdditionalColors() {
        assertEquals(51,
                resistorColorDuo.value(new String[]{ "green", "brown", "orange" })
        );
    }
}