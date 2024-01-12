public class ElonsToyCar {
    private int battery = 100;
    public int meters = 0 ;
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return (meters == 2000)? "Driven 2000 meters" : "Driven "+meters+" meters" ;
    }

    public String batteryDisplay() {
        return (battery > 0)? "Battery at "+battery+"%" : "Battery empty" ;
    }

    public void drive() {
        System.out.println(meters);
        if (meters < 2000){
            meters += 20 ;
            battery -= 1;
        }else{meters = 2000;}
    }
}