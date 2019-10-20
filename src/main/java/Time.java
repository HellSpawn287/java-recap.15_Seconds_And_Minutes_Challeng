public class Time {

    /*------>>>>BETTER VERSION<<<<------*/
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        if (hour < 24 && hour >= 0 && minute < 60 && minute >= 0) {
            this.hour = hour;
            this.minute = minute;
        } else {
            System.out.println("Wrong time provided. Setting Time to 00:00");
            this.hour = 0;
            this.minute = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hour, minute);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Time time = (Time) o;

        if (hour != time.hour) return false;
        return minute == time.minute;
    }
}
