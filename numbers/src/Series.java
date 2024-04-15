import java.util.ArrayList;
import java.util.List;

class Series {
    private String string;

    Series(String string) {
        if(string.isEmpty()){
            throw new IllegalArgumentException("series cannot be empty");
        }
        this.string = string ;
    }

    List<String> slices(int num) {
        if (num <= 0){
            throw new IllegalArgumentException("slice length cannot be negative or zero");
        }
        if(this.string.length()<num){
            throw new IllegalArgumentException("slice length cannot be greater than series length");
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i <= this.string.length()-num; i++) {
            res.add(this.string.substring(i, i + num));
        }
        return res;
    }

}