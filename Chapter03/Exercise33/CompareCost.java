package com.liang.y.daniel.chapter.three;

/* Suppose you shop for rice in two different packages. You would like to write a program to compare the cost. The
program prompts the user to enter the weight and price of each package and displays the one with the better price. */

import java.util.Scanner;

public class CompareCost {
    public static void main(String[] args) {
        System.out.print("Enter the size/weight of the first item: ");
        Scanner in = new Scanner(System.in);
        double firstItemWeight = in.nextDouble();
        System.out.print("Enter the price of the first item: ");
        double firstItemPrice = in.nextDouble();
        System.out.print("Enter the size/weight of the second item: ");
        double secondItemWeight = in.nextDouble();
        System.out.print("Enter the price of the second item: ");
        double secondItemPrice = in.nextDouble();
        double firstItemRatio = firstItemPrice / firstItemWeight;
        double secondItemRatio = secondItemPrice / secondItemWeight;
        if (firstItemRatio > secondItemRatio) {
            System.out.println("The second item is the better deal, at $" + secondItemRatio + " per weight unit.");
        } else if (secondItemRatio > firstItemRatio) {
            System.out.println("The first item is the better deal, at $" + firstItemRatio + " per weight unit.");
        } else {
            System.out.println("Both are equal deals. Same price.");
        }
    }
}
