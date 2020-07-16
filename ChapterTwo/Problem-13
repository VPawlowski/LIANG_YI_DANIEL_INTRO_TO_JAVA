package com.liang.y.daniel.chapter.two;

/* Suppose you save $100 each month in a savings account with annual interest rate 3.75%. Thus, the monthly interest
rate is 0.0375/12 = 0.003125. After the first month, the value in the account becomes 100 * (1 + 0.003125) = 100.3125
After the second month, the value in the account becomes (100 + 100.3125) * (1 + 0.003125) = 200.938
After the third month, the value in the account becomes (100 + 200.938) * (1 + 0.003125) = 301.878
and so on. Write a program that prompts the user to enter a monthly saving amount and displays the account value after
the sixth month. (In Exercise 5.30, you will use a loop to simplify the code and display the account value for any
month.) */

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        System.out.print("Enter monthly saving amount: ");
        Scanner in = new Scanner(System.in);
        double monthlySavings = in.nextDouble();
        final double ANNUAL_INTEREST = 0.0375;
        double monthlyInterest = 1 + ANNUAL_INTEREST / 12;
        double firstMonthTotal = monthlySavings * monthlyInterest;
        double secondMonthTotal = (monthlySavings + firstMonthTotal) * monthlyInterest;
        double thirdMonthTotal = (monthlySavings + secondMonthTotal) * monthlyInterest;
        double fourthMonthTotal = (monthlySavings + thirdMonthTotal) * monthlyInterest;
        double fifthMonthTotal = (monthlySavings + fourthMonthTotal) * monthlyInterest;
        double sixthMonthTotal = (monthlySavings + fifthMonthTotal) * monthlyInterest;
        System.out.println("After the first month, savings is: $" + firstMonthTotal);
        System.out.println("After the second month, savings is: $" + secondMonthTotal);
        System.out.println("After the third month, savings is: $" + thirdMonthTotal);
        System.out.println("After the sixth month, savings is: $" + sixthMonthTotal);
    }
}
