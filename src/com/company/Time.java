package com.company;

public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public void setHour(int hour) {
        if (hour < 0 || hour >= 24){
            throw new IllegalArgumentException("hour out of range");
        }this.hour = hour;
    }
    public void setMinute(int hour) {
        if (minute < 0 || minute >= 60){
            throw new IllegalArgumentException("minute out of range");
        }this.minute = minute;
    }
    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds >= 60){
            throw new IllegalArgumentException("minute out of range");
        }this.seconds = seconds;
    }
    public String toUniversalString(){
        return String.format("%02d:%02d:%02d",hour,minute,seconds);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s",hour > 0 || hour < 12,minute,seconds);
//                "Time{" +
//                "hour=" + hour +
//                ", minute=" + minute +
//                ", seconds=" + seconds +
//                '}';
//
    }
}
