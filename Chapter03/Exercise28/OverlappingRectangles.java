package com.liang.y.daniel.chapter.three;

/* Write a program that prompts the user to enter the center x-, y-coordinates, width, and height of two rectangles and
determines whether the second rectangle is inside the first or overlaps with the first, as shown in Figure 3.9. Test
your program to cover all cases. */

import java.util.Scanner;

public class OverlappingRectangles {
    public static void main(String[] args) {
        System.out.print("Enter r1’s center x and y-coordinates, width, and height: ");
        Scanner in = new Scanner(System.in);
        double firstCenterX = in.nextDouble();
        double firstCenterY = in.nextDouble();
        double firstWidth = in.nextDouble();
        double firstHeight = in.nextDouble();
        System.out.print("Enter r2’s center x-, y-coordinates, width, and height: ");
        double secondCenterX = in.nextDouble();
        double secondCenterY = in.nextDouble();
        double secondWidth = in.nextDouble();
        double secondHeight = in.nextDouble();
        if	((Math.pow(Math.pow(secondCenterX - firstCenterX, 2), .05) + secondWidth / 2 <= firstWidth / 2)
                && (Math.pow(Math.pow(secondCenterY - firstCenterY, 2), .05) + secondHeight / 2 <= firstHeight / 2)
                && (firstHeight / 2 + secondHeight / 2 <= firstHeight) && (firstWidth / 2 + secondWidth / 2 <= firstWidth))
            System.out.println("r2 is within r1.");
        else if ((firstCenterX + firstWidth / 2 > secondCenterX - secondWidth)
                || (firstCenterY + firstHeight / 2 > secondCenterY - secondHeight))
            System.out.println("r2 overlaps r1.");
        else
            System.out.println("r2 does not overlap r1.");
    }
}
