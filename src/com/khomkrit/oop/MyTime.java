package com.khomkrit.oop;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public MyTime(int hour, int minute, int second) {
        boolean isValidHour = hour < 24 && hour >= 0;
        boolean isValidMinute = minute < 60 && minute >= 0;
        boolean isValidSecond = second < 60 && second >= 0;
        if (isValidHour && isValidMinute && isValidSecond) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public void setTime(int hour, int minute, int second) {
        boolean isValidHour = hour < 24 && hour >= 0;
        boolean isValidMinute = minute < 60 && minute >= 0;
        boolean isValidSecond = second < 60 && second >= 0;
        if (isValidHour && isValidMinute && isValidSecond) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinite() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    public void setHour(int hour) {
        boolean isValidHour = hour < 24 && hour >= 0;
        if (isValidHour) {
            this.hour = hour;
        } else {
            throw new IllegalArgumentException("Invalid hour!");
        }
    }

    public void setMinute(int minute) {
        boolean isValidMinute = minute < 60 && minute >= 0;
        if (isValidMinute) {
            this.minute = minute;
        } else {
            throw new IllegalArgumentException("Invalid minute!");
        }
    }

    public void setSecond(int second) {
        boolean isValidSecond = second < 60 && second >= 0;
        if (isValidSecond) {
            this.second = second;
        } else {
            throw new IllegalArgumentException("Invalid second!");
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public MyTime nextSecond() {
        second++;
        if (second == 60) {
            minute++;
            second = 0;
        }
        if (minute == 60) {
            hour++;
            minute = 0;
        }
        if (hour == 24) {
            hour = 0;
        }
        return new MyTime(hour, minute, second);
    }

    public MyTime nextMinute() {
        minute++;
        if (minute == 60) {
            hour++;
            minute = 0;
        }
        if (hour == 24) {
            hour = 0;
        }
        return new MyTime(hour, minute, second);
    }

    public MyTime nextHour() {
        hour++;
        if (hour == 24) {
            hour = 0;
        }
        return new MyTime(hour, minute, second);
    }

    public MyTime previousSecond() {
        second--;
        if (second == -1) {
            minute--;
            second = 59;
        }
        if (minute == -1) {
            hour--;
            minute = 59;
        }
        if (hour == -1) {
            hour = 23;
        }
        return new MyTime(hour, minute, second);
    }

    public MyTime previousMinute() {
        minute--;
        if (minute == -1) {
            hour--;
            minute = 59;
        }
        if (hour == -1) {
            hour = 23;
        }
        return new MyTime(hour, minute, second);
    }

    public MyTime previousHour() {
        hour--;
        if (hour == -1) {
            hour = 23;
        }
        return new MyTime(hour, minute, second);
    }

    public static void main(String[] args) {
        MyTime testMyTime = new MyTime();
        testMyTime.setTime(0,0,0);
        System.out.println("Previous Second: " + testMyTime.previousSecond().toString());
        System.out.println("Current Time: " + testMyTime.nextSecond().toString());
        System.out.println("Next Second: " + testMyTime.nextSecond().toString());
    }
}
