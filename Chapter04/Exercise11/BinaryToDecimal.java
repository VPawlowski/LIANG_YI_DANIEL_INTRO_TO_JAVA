package com.liang.y.daniel.chapter.four;

// Write a program that prompts the user to enter binary digits and displays its corresponding decimal value.

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        // Create constant to serve as the limit for the binary sequence.
        final int MAX_NUMBER_OF_DIGITS = 4;
        // Prompt user for input
        System.out.print("Enter binary digits (0000 to 1111): ");
        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();
        // Detects if non-binary, or if it exceeds the maximum number of digits (4). If yes, quits program.
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) != '0' && userInput.charAt(i) != '1' || userInput.length() > MAX_NUMBER_OF_DIGITS)
            {
                System.out.println("You have entered an invalid binary sequence.");
                System.exit(1);
            }
        }
        // Declares and initializes the variable for the decimal value.
        int decimalNumber = 0;
        // Converts binary sequence to decimal number.
        int binaryNumber = Integer.parseInt(userInput);
        for (int i = 0; i < MAX_NUMBER_OF_DIGITS ; i++) {
            // If one is detected, add 2^i to the decimal value.
            if (binaryNumber % 10 == 1) {
                decimalNumber += Math.pow(2, i);
            }
            // Regardless if true or not, remove a digit from the sequence.
            binaryNumber /= 10;
        }
        // Displays result
        System.out.println("The decimal number is: " + decimalNumber);
    }
}
