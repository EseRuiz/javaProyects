// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        CarsAssemble car = new CarsAssemble() ;
        double rate = car.productionRatePerHour(6);
        System.out.println(rate);
        int min = car.workingItemsPerMinute(6);
        System.out.println(min);
    }
}
