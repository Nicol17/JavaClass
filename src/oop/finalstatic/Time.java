package oop.finalstatic;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour) {
        this(hour, 0, 0);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }


    // getters and setters

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // METHODS
    public String toUniversalForm() {
        //21:45:20
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandardForm() {
        //09:45:20
        int h = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String  unit = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", hour, minute, second, unit);
    }
}
