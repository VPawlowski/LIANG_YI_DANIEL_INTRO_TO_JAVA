package com.liang.y.daniel.chapter.two;

/* How cold is it outside? The temperature alone is not enough to provide the answer. Other factors including
wind speed, relative humidity, and sunshine play important roles in determining coldness outside. In 2001, the National
Weather Service (NWS) implemented the new wind-chill temperature to measure the coldness using temperature and wind
speed. The formula is:

    twc = 35.74 + 0.6215ta - 35.75(v^0.16) + 0.4275ta(v^0.16)

where ta is the outside temperature measured in degrees Fahrenheit, v is the speed measured in miles per hour, and twc
is the wind-chill temperature. The formula cannot be used for wind speeds below 2 mph or temperatures below -58F or
above 41°F. Write a program that prompts the user to enter a temperature between -58F and 41°F and a wind speed greater
than or equal to 2 then displays the wind-chill temperature. Use Math.pow(a, b) to compute v0.16. */

import java.util.Scanner;

public class WindChillTemperature {
    public static void main(String[] args) {
        System.out.print("Enter a temperature in Fahrenheit between -58\u2109 and 41\u2109: ");
        Scanner in = new Scanner(System.in);
        double currentTemperature = in.nextDouble();
        System.out.print("Enter wind speed in miles per hour that is greater than or equal to 2: ");
        double currentWindSpeed = in.nextDouble();
        double windChillTemperature = 35.74 + 0.6215 * currentTemperature - 35.75 * Math.pow(currentWindSpeed, 0.16)
                + 0.4275 * currentTemperature * Math.pow(currentWindSpeed, 0.16);
        System.out.println("The wind chill index is: " + windChillTemperature);
    }
}
