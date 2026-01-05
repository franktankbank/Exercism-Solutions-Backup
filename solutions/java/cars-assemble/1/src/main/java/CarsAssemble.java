public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int grossHourlyProductionRate = speed * 221;
        if (speed == 0) {
            return (double)grossHourlyProductionRate;
        } else if (speed >= 1 && speed <= 4) {
            return (double)grossHourlyProductionRate;
        } else if (speed >= 5 && speed <= 8) {
            return grossHourlyProductionRate * 0.90;
        } else if (speed == 9) {
            return grossHourlyProductionRate * 0.80;
        } else if (speed == 10) {
            return grossHourlyProductionRate * 0.77;
        } else {
            throw new ArithmeticException("Invalid speed. Speed must be in range 0-10");
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int)(productionRatePerHour(speed) / 60);
    }
}
