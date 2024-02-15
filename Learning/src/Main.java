import java.time.LocalDateTime;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ram = new Random();
        CaptainsLog cap = new CaptainsLog(ram);
        System.out.println(cap.randomPlanetClass());
        System.out.println(cap.randomShipRegistryNumber());
        System.out.println(cap.randomStardate());
        char num = 0b0110 | 0b0101;
        System.out.println(num);
    }
}