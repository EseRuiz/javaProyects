public class CarsAssemble {
    public double productionRatePerHour(int speed) {
        double prod = 0.0;
        if (speed <= 4) {
            prod = 221 * speed;
        } else if (speed <= 8) {
            prod = 221 * speed * 0.9;
        } else if (speed == 9) {
            prod = 221 * speed * 0.8;
        } else if (speed == 10) {
            prod = 221 * speed * 0.77;
        }
        return prod;
    }

    public int workingItemsPerMinute(int speed) {
        int prod = 0;
        if (speed <= 4) {
            prod =  ((221 * speed) / 60);
        } else if (speed <= 8) {
            prod = (int) ((221 * speed * 0.9) / 60);
        } else if (speed == 9) {
            prod = (int) ((221 * speed * 0.8) / 60);
        } else if (speed == 10) {
            prod = (int) ((221 * speed * 0.77) / 60);
        }
        return prod;
    }
}
