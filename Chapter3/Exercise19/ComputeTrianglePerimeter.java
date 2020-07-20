package com.liang.y.daniel.chapter.three;

/* Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. Otherwise,
display that the input is invalid. The input is valid if the sum of every pair of two edges is greater than the
remaining edge. */

import java.util.Scanner;

public class ComputeTrianglePerimeter {
    public static void main(String[] args) {
        System.out.print("Enter the length of each side of the triangle: ");
        Scanner in = new Scanner(System.in);
        double firstSide = in.nextDouble();
        double secondSide = in.nextDouble();
        double thirdSide = in.nextDouble();
        boolean isValid = (firstSide + secondSide > thirdSide) && (secondSide + thirdSide > firstSide)
                && (firstSide + thirdSide > secondSide);
        if (isValid) {
            System.out.println("Triangle Perimeter is: " + (firstSide + secondSide + thirdSide));
        } else {
            System.out.println("Triangle is invalid.");
        }
    }
}
