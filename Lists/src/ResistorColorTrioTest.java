import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ResistorColorTrioTest {
    private ResistorColorTrio resistorColorTrio;
    @BeforeEach
    public void setup() {
        resistorColorTrio = new ResistorColorTrio();
    }
    @Test
    public void testOrangeAndOrangeAndBlack() {
        assertEquals("33 ohms",
                resistorColorTrio.label(new String[]{"orange", "orange", "black"})
        );
    }

    
    @Test
    public void testBlueAndGreyAndBrown() {
        assertEquals("680 ohms",
                resistorColorTrio.label(new String[]{"blue", "grey", "brown"})
        );
    }

    
    @Test
    public void testRedAndBlackAndRed() {
        assertEquals("2 kiloohms",
                resistorColorTrio.label(new String[]{"red", "black", "red"})
        );
    }

    
    @Test
    public void testGreenAndBrownAndOrange() {
        assertEquals("51 kiloohms",
                resistorColorTrio.label(new String[]{"green", "brown", "orange"})
        );
    }

    
    @Test
    public void testYellowAndVioletAndYellow() {
        assertEquals("470 kiloohms",
                resistorColorTrio.label(new String[]{"yellow", "violet", "yellow"})
        );
    }

    
    @Test
    public void testBlueAndVioletAndBlue() {
        assertEquals("67 megaohms",
                resistorColorTrio.label(new String[]{"blue", "violet", "blue"})
        );
    }

    
    @Test
    public void testBlackAndBlackAndBlack() {
        assertEquals("0 ohms",
                resistorColorTrio.label(new String[]{"black", "black", "black"})
        );
    }
    
    @Test
    public void testWhiteAndWhiteAndWhite() {
        assertEquals("99 gigaohms",
                resistorColorTrio.label(new String[]{"white", "white", "white"})
        );
    }

    
    @Test
    public void testFirstTwoColorsMakeAnInvalidOctalNumber() {
        assertEquals("8 ohms",
                resistorColorTrio.label(new String[]{"black", "grey", "black"})
        );
    }
    
    @Test
    public void testIgnoreExtraColors() {
        assertEquals("650 kiloohms",
                resistorColorTrio.label(new String[]{"blue", "green", "yellow", "orange"})
        );
    }
}
