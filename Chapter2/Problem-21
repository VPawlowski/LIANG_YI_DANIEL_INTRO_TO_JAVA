package com.liang.y.daniel.chapter.two;

/* Write a program that reads in investment amount, annual interest rate, and number of years and displays the future
investment value using the following formula:

    futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)^(numberOfYears * 12)

For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value
is 1032.98. */

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        System.out.print("Enter investment amount: ");
        Scanner in = new Scanner(System.in);
        double currentInvestment = in.nextDouble();
        System.out.print("Enter annual interest rate as a percent: ");
        // 1200 is derived from dividing by 12 (number of months in a year) and dividing by 100 to get decimal form of percent
        double monthlyInterestRate = in.nextDouble() / 1200;
        System.out.print("Enter length of time in years: ");
        int numberOfYears = in.nextInt();
        double futureValue = currentInvestment * Math.pow((1 + monthlyInterestRate), numberOfYears * 12);
        System.out.println("Future value of investment is: " + futureValue);
    }
}
