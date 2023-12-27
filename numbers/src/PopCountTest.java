import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PopCountTest {
    @Test
    @DisplayName("0 eggs")
    public void test0Eggs() {
        Assertions.assertEquals(0, new PopCount().eggCount(0));
    }

    @Test
    @DisplayName("1 egg")
    public void test1Egg() {
        assertEquals(1,new PopCount().eggCount(16));
    }

    @Test
    @DisplayName("4 eggs")
    public void test4Eggs() {
        assertEquals(4,new PopCount().eggCount(89));
    }

    @Test
    @DisplayName("13 eggs")
    public void test13Eggs() {
        assertEquals(13,new PopCount().eggCount(2000000000));
    }
}