class NeedForSpeed {
    public int speed ;
    public int batteryDrain ;

    private int meters = 0 ;

    private int batery = 100;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed ;
        this.batteryDrain = batteryDrain ;
    }

    public boolean batteryDrained() {
        //if (batteryDrain == 0){return true ;}
        //return false;
        System.out.println(batery);
        return batery <= 0;
    }

    public int distanceDriven() {
        return meters;
    }

    public void drive() {
        if(batery > 0){
            System.out.println(batery);
            batery -= this.batteryDrain;
            meters += this.speed ;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50,4);
        //metodo estatico para crear un tipo de carro de nitro
    }
}

class RaceTrack {
    public int distance = 0;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean tryFinishTrack(NeedForSpeed car) {
        for (int i = 0; i < this.distance; i++) {
            System.out.println("meter"+car.distanceDriven());
            car.drive();
            if(car.distanceDriven() >= this.distance){return true;}
            if(car.batteryDrained()){return false;}
        }
        return car.batteryDrained();
    }
}