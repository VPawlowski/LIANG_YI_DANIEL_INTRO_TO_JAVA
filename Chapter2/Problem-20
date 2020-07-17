package com.liang.y.daniel.chapter.two;

/* If you know the balance and the annual percentage interest rate, you can compute the interest on the next monthly
payment using the following formula:

    interest = balance * (annualInterestRate / 1200)

Write a program that reads the balance and the annual percentage interest rate and displays the interest for the next
month. */

import java.util.Scanner;

public class MonthlyInterest {
    public static void main(String[] args) {
        System.out.print("Enter the current balance: ");
        Scanner in = new Scanner(System.in);
        double startingBalance = in.nextDouble();
        System.out.print("Enter the annual interest rate in percent form (EX 3.25): ");
        double interestRate = in.nextDouble() / 1200;
        double interestItself = startingBalance * interestRate;
        System.out.println("The interest for next month is: $" + interestItself);
    }
}
