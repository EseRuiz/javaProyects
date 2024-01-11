import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        System.out.println(Arrays.toString(this.birdsPerDay));
        return this.birdsPerDay ;
    }

    public int getToday() {
        System.out.println((this.birdsPerDay[6]));
        return this.birdsPerDay[6] ;
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[6]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int bird: this.birdsPerDay){
            if (bird==0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sumBirds = 0 ;
        for (int i = 0; i < Math.min(numberOfDays,this.birdsPerDay.length); i++) {
            sumBirds += this.birdsPerDay[i] ;
        }//Math.min devuelve el menor valor de los dos agregados si a es mayor que b devuelve b si b es mayor que a devuelve a
        return sumBirds ;
    }

    public int getBusyDays() {
        int busyDays = 0 ;
        for (int i = 0; i < this.birdsPerDay.length; i++) {
            if (this.birdsPerDay[i] > 4){ busyDays += 1 ;}
        }
        return  busyDays ;
    }
}