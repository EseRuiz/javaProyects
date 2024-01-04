import java.util.ArrayList;

public class PopCount {
    public int eggCount(int number) {
        int count = 0;
        ArrayList<Integer> var = new ArrayList<>();
        while (number > 0) {
            if (number%2 == 0){ var.add(0);}
            else {var.add(1);}
            number = number / 2;
        }
        for (int v : var){ if (v==1){count += 1;}}
        return count;
    }
}