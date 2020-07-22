package com.liang.y.daniel.chapter.three;

/* Programming Exercise 2.17 gives a formula to compute the wind-chill temperature. The formula is valid for
temperatures in the range between -58°F and 41°F and wind speed greater than or equal to 2. Write a program that
prompts the user to enter a temperature and a wind speed. The program displays the wind-chill temperature if the input
is valid; otherwise, it displays a message indicating whether the temperature and/or wind speed is invalid. */

import java.util.Scanner;

public class WindChillTemperature {
    public static void main(String[] args) {
        System.out.print("Enter a temperature in Fahrenheit between -58\u2109 and 41\u2109: ");
        Scanner in = new Scanner(System.in);
        double currentTemperature = in.nextDouble();
        System.out.print("Enter wind speed in miles per hour that is greater than or equal to 2: ");
        double currentWindSpeed = in.nextDouble();
        boolean validTemperature = currentTemperature >= -58 && currentTemperature <= 41;
        boolean validWindSpeed = currentWindSpeed >= 2;
        if (validTemperature && validWindSpeed) {
            double windChillTemperature = 35.74 + 0.6215 * currentTemperature - 35.75 * Math.pow(currentWindSpeed, 0.16)
                    + 0.4275 * currentTemperature * Math.pow(currentWindSpeed, 0.16);
            System.out.println("The wind chill index is: " + windChillTemperature);
        }
        if (!validTemperature) {
            System.out.println("Temperature is not valid - please insert a number between -58 and 41.");
        }
        if (!validWindSpeed) {
            System.out.println("Wind speed is not valid - please insert a number that is equal or greater than 2.");
        }
    }
}
