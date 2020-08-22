package com.liang.y.daniel.chapter.four;

// Write a program that receives a character and displays its Unicode.

import java.util.Scanner;

public class UnicodeCode {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        Scanner in = new Scanner(System.in);
        char userInput = in.next().charAt(0);
        System.out.println("The ASCII code for " + userInput + " is: " + (int) userInput);
    }
}
