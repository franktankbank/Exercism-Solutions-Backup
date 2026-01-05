public class Lasagna {
    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int elapsedMinutes) {
        int expectedMinutes = expectedMinutesInOven();
        return expectedMinutes - elapsedMinutes;
    }

    public int preparationTimeInMinutes(int layers) {
        int minutesPerLayer = 2;
        return layers * minutesPerLayer;
    }

    public int totalTimeInMinutes(int layers, int elapsedMinutes) {
        int prepTime = preparationTimeInMinutes(layers);
        return prepTime + elapsedMinutes;
    }
}
