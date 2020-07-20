package com.liang.y.daniel.chapter.three;

/* A shipping company uses the following function to calculate the cost (in dollars) of shipping based on the weight of
the package (in pounds).

    2.5, if 0 < x <= 2
    4.5, if 2 < x <= 4
    7.5, if 4 < x <= 10
    10.5, if 10 < x <= 20

Write a program that prompts the user to enter the weight of the package and display the shipping cost. If the weight
is greater than 20, display a message “the package cannot be shipped.” */

import java.util.Scanner;

public class ShippingCost {
    public static void main(String[] args) {
        System.out.print("Enter package weight: ");
        Scanner in = new Scanner(System.in);
        double packageWeight = in.nextDouble();
        double packageCost;
        if (packageWeight <= 0 || packageWeight > 20) {
            System.out.println("The package cannot be shipped.");
        } else {
            if (packageWeight > 0 && packageWeight <= 2) {
                packageCost = 2.5;
            } else if (packageWeight <= 4) {
                packageCost = 4.5;
            } else if (packageWeight <= 10) {
                packageCost = 7.5;
            } else {
                packageCost = 10.5;
            }
            System.out.println("The cost to send the package is: $" + packageCost);
        }
    }
}
