package com.liang.y.daniel.chapter.three;

/* Modify Listing 2.10, ComputeChange.java, to display the nonzero denominations only, using singular words for single
units such as 1 dollar and 1 penny, and plural words for more than one unit such as 2 dollars and 3 pennies. */

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of your amount in cents ($11.32 as 1132\u00A2): ");
        int amount = in.nextInt();
        System.out.println("Your amount of " + amount + "\u00A2 consists of: ");
        int numberOfDollars = amount / 100;
        // Was about to rewrite with giant if/else chain; remembered ternary operator for quicker compact code!
        // Wondering whether there is a better way to ommit zero values...
        if (numberOfDollars != 0) {
            System.out.println((numberOfDollars > 1) ? numberOfDollars + " dollars" : numberOfDollars + " dollar");
        }
        amount %= 100;
        int numberOfQuarters = amount / 25;
        if (numberOfQuarters != 0) {
            System.out.println((numberOfQuarters > 1) ? numberOfQuarters + " quarters" : numberOfQuarters + " quarter");
        }
        amount %= 25;
        int numberOfDimes = amount / 10;
        if (numberOfDimes != 0) {
            System.out.println((numberOfDimes > 1) ? numberOfDimes + " dimes" : numberOfDimes + " dime");
        }
        amount %= 10;
        int numberOfNickels = amount / 5;
        if (numberOfNickels != 0) {
            // You will never have more than one nickel - only one or zero (otherwise you would have a dime...)
            System.out.println(numberOfNickels + " nickel");
        }
        amount %= 5;
        int numberOfPennies = amount;
        if (numberOfPennies != 0) {
            System.out.println((numberOfPennies > 1) ? numberOfPennies + " pennies" : numberOfPennies + " penny");
        }
    }
}
