package com.liang.y.daniel.chapter.three;

// Write a program that prompts the user to enter an integer and displays whether the integer is an odd number or not.

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        System.out.println(userInput + " is an " + (userInput % 2 == 0 ? "even" : "odd") + " number.");
    }
}
