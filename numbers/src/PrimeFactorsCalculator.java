import java.util.ArrayList;
import java.util.List;

class PrimeFactorsCalculator {
    private List<Long> result = new ArrayList<>();
    List<Long> calculatePrimeFactorsOf(long number) {
        long val;
        long num = 2 ;
        val = number;
        while (num <= val){
            if (val % num == 0) {
                result.add(num);
                val /= num ;
                num = 1 ;
            }
            num ++;
        }return result;
    }

}