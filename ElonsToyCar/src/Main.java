public class Main {
    public static void main(String[] args) {
        System.out.println("Elons Toy car");
        ElonsToyCar car = ElonsToyCar.buy();
        ElonsToyCar car1 = new ElonsToyCar();
        for (int i = 0; i < 100; i++) {
            car1.drive();
        }
        car1.drive();
        System.out.println("car1 = " + car1.batteryDisplay() +" "+ car1.distanceDisplay());
        System.out.println("car = " + car);
    }
}