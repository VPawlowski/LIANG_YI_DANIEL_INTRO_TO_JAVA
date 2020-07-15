package com.liang.y.daniel.chapter.two;

import java.util.Scanner;

/* (Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate and then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 12% for gratuity rate, the program displays $1.2
as gratuity and $11.2 as total. */

public class TipCalculator {
    public static void main(String[] args) {
        System.out.print("Enter the subtotal: ");
        Scanner in = new Scanner(System.in);
        double subtotal = in.nextDouble();
        System.out.print("Enter the gratuity rate (in percent): ");
        double gratuityRate = in.nextDouble() / 100;
        double gratuity = gratuityRate * subtotal;
        double totalCost = gratuity + subtotal;
        System.out.println("The gratuity is: $" + gratuity + "  and the total is: $" + totalCost);
    }
}
