
class BirdWatcher {
    private final int[] birdsPerDay;
    private int todayIndex;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] { 0, 2, 5, 3, 7, 8, 4 };
    }

    public int getToday() {
        this.todayIndex = this.birdsPerDay.length - 1;
        return this.birdsPerDay[this.todayIndex];
    }

    public void incrementTodaysCount() {
        int today = getToday();
        this.birdsPerDay[this.todayIndex] = today + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i : this.birdsPerDay) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int totalBirds = 0;
        if (numberOfDays > this.birdsPerDay.length) {
            for (int i = 0; i < this.birdsPerDay.length; i++) {
                totalBirds = totalBirds + this.birdsPerDay[i];
            }
        } else {
            for (int i = 0; i < numberOfDays; i++) {
                totalBirds = totalBirds + this.birdsPerDay[i];
            }
        }
        return totalBirds;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int i : this.birdsPerDay) {
            if (i >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}
