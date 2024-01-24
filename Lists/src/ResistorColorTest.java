import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ResistorColorTest {
    private ResistorColor resistorColor;
    @BeforeEach
    public void setup() {
        resistorColor = new ResistorColor();
    }
    @Test
    public void testBlackColorCode() {
        assertEquals(0, resistorColor.colorCode("black"));
    }
    
    @Test
    public void testWhiteColorCode() {
        assertEquals(9,resistorColor.colorCode("white"));
    }
    
    @Test
    public void testOrangeColorCode() {
        assertEquals(3,resistorColor.colorCode("orange"));
    }
    
    @Test
    public void testColors() {
        assertArrayEquals(new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"},resistorColor.colors());
    }
}