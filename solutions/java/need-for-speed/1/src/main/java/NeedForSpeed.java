class NeedForSpeed {
    public int speed;
    public int batteryDrain;
    private int distance;
    private int battery = 100;
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery == 0 || this.batteryDrain > this.battery;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (this.battery > 0 || this.batteryDrain < this.battery) {
            this.distance = this.distance + this.speed;
            this.battery = this.battery - this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        double numberOfDrives = ((double)this.distance / (double)car.speed);
        return numberOfDrives * car.batteryDrain <= 100;
    }
}
