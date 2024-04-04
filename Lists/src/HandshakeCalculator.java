import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<String> list_numbers = Arrays.asList(Integer.toBinaryString(number).split(""));
        List<Signal> signals = new ArrayList<>();
        Collections.reverse(list_numbers);
        for (int i = 0; i < list_numbers.size(); i++) {
            if (list_numbers.get(i).equals("1")){
                switch(i) {
                    case 0: signals.add(Signal.WINK);
                        break;
                    case 1: signals.add(Signal.DOUBLE_BLINK);
                        break;
                    case 2: signals.add(Signal.CLOSE_YOUR_EYES);
                        break;
                    case 3: signals.add(Signal.JUMP);
                        break;
                    case 4: Collections.reverse(signals);
                        break;
                    default:
                        break;
                }
            }
        }
        return signals;
    }

}