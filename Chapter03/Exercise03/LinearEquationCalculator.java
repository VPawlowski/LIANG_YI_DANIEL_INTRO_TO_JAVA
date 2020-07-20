package com.liang.y.daniel.chapter.three;

/* A linear equation can be solved using Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report that “The equation has no
solution.” */

import java.util.Scanner;

public class LinearEquationCalculator {
    public static void main(String[] args) {
        System.out.print("Enter values for a, b, c, d, e, f: ");
        Scanner in = new Scanner(System.in);
        double valueA = in.nextDouble();
        double valueB = in.nextDouble();
        double valueC = in.nextDouble();
        double valueD = in.nextDouble();
        double valueE = in.nextDouble();
        double valueF = in.nextDouble();
        if (valueA * valueD - valueB * valueC == 0) {
            System.out.println("The equation has no solution.");
        } else {
            // These formulas are derived from Cramer's rule
            double valueX = (valueE * valueD - valueB * valueF) / (valueA * valueD - valueB * valueC);
            System.out.println("x is: " + valueX);
            double valueY = (valueA * valueF - valueE * valueC) / (valueA * valueD - valueB * valueC);
            System.out.println("y is: " + valueY);
        }
    }
}
