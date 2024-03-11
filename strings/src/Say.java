import java.util.HashMap;
import java.util.Map;

public class Say {
    private Map<Integer, String> firstNumber = new HashMap<>();
    private Map<Integer, String> decimals = new HashMap<>();
    private Map<Integer, String> centcimals = new HashMap<>();
    private long numb;
    private String num = "";

    private int conta = 1; // Variable conta inicializada a 1

    public String say(long number) {
        firstNumber.put(0, "zero");
        firstNumber.put(1, "one");
        firstNumber.put(2, "two");
        firstNumber.put(3, "three");
        firstNumber.put(4, "four");
        firstNumber.put(5, "five");
        firstNumber.put(6, "six");
        firstNumber.put(7, "seven");
        firstNumber.put(8, "eight");
        firstNumber.put(9, "nine");

        decimals.put(10, "ten");
        decimals.put(11, "eleven");
        decimals.put(12, "twelve");
        decimals.put(13, "thirteen");
        decimals.put(14, "fourteen");
        decimals.put(15, "fifteen");
        decimals.put(16, "sixteen");
        decimals.put(17, "seventeen");
        decimals.put(18, "eighteen");
        decimals.put(19, "nineteen");
        decimals.put(20, "twenty");
        decimals.put(30, "thirty");
        decimals.put(40, "forty");
        decimals.put(50, "fifty");
        decimals.put(60, "sixty");
        decimals.put(70, "seventy");
        decimals.put(80, "eighty");
        decimals.put(90, "ninety");

        centcimals.put(1, "hundred");
        centcimals.put(2, "thousand");
        centcimals.put(3, "million");
        centcimals.put(4, "billion");

        conta = 1;

        if (number < 0 || number > 999_999_999_999L) {
            throw new IllegalArgumentException("input out of range");
        }

        if (number == 0) {
            return firstNumber.get(0);
        }

        while (number > 0) {
            numb = number % 1000;
            String section = "";

            if (numb >= 100) {
                section += firstNumber.get((int) numb / 100) + " " + centcimals.get(1) + " ";
                numb %= 100;
            }

            if (numb > 10 && numb <= 19) {
                section += decimals.get((int) numb) + " ";
                numb = 0;
            }

            if (numb >= 20) {
                section += decimals.get((int) (numb / 10) * 10);
                if (numb % 10 != 0) {
                    section += "-";
                }
                numb %= 10;
            }

            if (numb > 0) {
                section += firstNumber.get((int) numb) + " ";
            }

            if (conta > 1 && numb != 0) {
                section += centcimals.get(conta) + " ";
            }

            num = section + num;
            conta++;
            number /= 1000;
        }

        return num.trim();
    }
}
