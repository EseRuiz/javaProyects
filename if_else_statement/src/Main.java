// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarsAssemble car = new CarsAssemble() ;
        double rate = car.productionRatePerHour(6);
        System.out.println(rate);
        int min = car.workingItemsPerMinute(6);
        System.out.println(min);
        int n = 3;
        int k = 3;
        ReservationSystems system = new ReservationSystems(n);
        List<Integer> reserved = system.reserveSeats(k);
        System.out.println("reserved = " + reserved);

        system.cancelReservation(3);
        System.out.println("reserved = " + reserved);


    }
}
