package com.liang.y.daniel.chapter.three;

// Revise Programming Exercise 2.8 to display the hour using a 12-hour clock.

import java.util.Scanner;

public class CurrentTime {
    public static void main(String[] args) {
        System.out.print("Enter the timezone offset to GMT: ");
        Scanner in = new Scanner(System.in);
        int offset = in.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        final int MILLISECONDS_IN_SECOND = 1000;
        final int SECONDS_IN_MINUTE = 60;
        final int MINUTES_IN_HOUR = 60;
        final int HOURS_IN_DAY = 24;
        long totalSeconds = totalMilliseconds / MILLISECONDS_IN_SECOND;
        long currentSecond = totalSeconds % SECONDS_IN_MINUTE;
        long totalMinutes = totalSeconds / SECONDS_IN_MINUTE;
        long currentMinute = totalMinutes % MINUTES_IN_HOUR;
        long totalHours = totalMinutes / MINUTES_IN_HOUR;
        long currentHour = (totalHours + offset) % HOURS_IN_DAY;
        System.out.println("Current time is " + (currentHour > 12 ? currentHour - 12 : currentHour ) + ":"
                + currentMinute + ":" + currentSecond + ((currentHour >= 12) ? " PM" : " AM"));
    }
}
