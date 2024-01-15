public class Main {
    public static void main(String[] args) {

        NeedForSpeed car = new NeedForSpeed(10,2);
        RaceTrack race = new RaceTrack(100);
        System.out.println("car = " + race.tryFinishTrack(car));
    }
}