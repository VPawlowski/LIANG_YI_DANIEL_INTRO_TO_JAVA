package com.liang.y.daniel.chapter.three;

// Write a program that prompts the user to enter three integers and display the integers in non-decreasing order

import java.util.Scanner;

public class SortThreeIntegers {
    public static void main(String[] args) {
        System.out.print("Enter three integer numbers to be sorted in ascending order: ");
        Scanner in = new Scanner(System.in);
        int firstValue = in.nextInt();
        int secondValue = in.nextInt();
        int thirdValue = in.nextInt();
        int temporary;
        if (firstValue >= secondValue) {
            temporary = secondValue;
            secondValue = firstValue;
            firstValue = temporary;
        }
        if (secondValue >= thirdValue) {
            temporary = thirdValue;
            thirdValue = secondValue;
            secondValue = temporary;
        }
        /* Repeating in case the first value is smaller than the second, but not the third; otherwise smallest value will 
        sandwiched between the other two values */
        if (firstValue >= secondValue) {
            temporary = secondValue;
            secondValue = firstValue;
            firstValue = temporary;
        }
        System.out.println(firstValue + " " + secondValue + " " + thirdValue);
    }
}
