import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private LocalDateTime moment;

    public Gigasecond(LocalDate moment) {
        this.moment = moment.atStartOfDay().plusSeconds(1000000000);
    }

    public Gigasecond(LocalDateTime moment) {
        this.moment = moment.plusSeconds(1000000000);
    }

    public LocalDateTime getDateTime() {
        return this.moment;
    }
}
//public class Example {
//    private int value;
//
//    public Example(String val) {
//        this.value = Integer.parseInt(val);
//    }
//
//    public Example(char val) {
//        this.value = (int) val;
//    }
//
//    public Example(int val) {
//        this.value = val;
//    }
//
//    public int getValue() {
//        return this.value;
//    }
//}