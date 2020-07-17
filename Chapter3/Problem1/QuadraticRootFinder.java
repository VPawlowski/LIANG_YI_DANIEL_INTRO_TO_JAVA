package com.liang.y.daniel.chapter.three;

/* The two roots of a quadratic equation ax2 + bx + c = 0 can be obtained using the following formula:

    r1 = (-b + sqrt(b^2 - 4ac)) / 2a
and
    r2 = (-b - sqrt(b^2 - 4ac) / 2a

b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has two real roots. If
it is zero, the equation has one root. If it is negative, the equation has no real roots. Write a program that prompts
the user to enter values for a, b, and c and displays the result based on the discriminant. If the discriminant is
positive, display two roots. If the discriminant is 0, display one root. Otherwise, display “The equation has no real
roots.” Note you can use Math.pow(x, 0.5) to compute sqrt(x). */

import java.util.Scanner;

public class QuadraticRootFinder {
    public static void main(String[] args) {
        System.out.print("Enter values for a, b, and c: ");
        Scanner in = new Scanner(System.in);
        double valueA = in.nextDouble();
        double valueB = in.nextDouble();
        double valueC = in.nextDouble();
        double discriminantValue = Math.pow(valueB, 2) - 4 * valueA * valueC;
        double root;
        if (discriminantValue > 0) {
            System.out.println("Equation has two roots:");
            root = (-valueB + Math.pow(discriminantValue, 0.5)) / (2 * valueA);
            System.out.println(root);
            root = (-valueB - Math.pow(discriminantValue, 0.5)) / (2 * valueA);
            System.out.println(root);
        } else if (discriminantValue == 0) {
            // Discriminant is 0 - therefore omitted, as sqrt(0) is 0
            root = -valueB / (2 * valueA);
            System.out.println("Equation has one root:");
            System.out.println(root);
        } else {
            System.out.println("Equation has no real roots.");
        }
    }
}
