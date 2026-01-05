public class JedliksToyCar {
    private int battery = 100;
    private int distance;
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + Integer.toString(distance) + " meters";
    }

    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        } else {
            return "Battery at " + Integer.toString(battery) + "%";
        }
    }

    public void drive() {
        if (battery > 0) {
            distance = distance + 20;
            battery = battery - 1;
        }
    }
}
