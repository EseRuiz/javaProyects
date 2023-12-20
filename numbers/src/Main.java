import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        double prueba ;
        BigInteger test;
        Grains grans = new Grains();
        test = grans.grainsOnSquare(-1);
        System.out.println("grans = " + grans);
        CarsAssemble car = new CarsAssemble();
        prueba = car.productionRatePerHour(4);
        System.out.println(prueba);
    }
}