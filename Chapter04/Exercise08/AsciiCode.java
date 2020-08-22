package com.liang.y.daniel.chapter.four;

// Write a program that receives a character and displays its ASCII code.

import java.util.Scanner;

public class AsciiCode {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        System.out.println("The ASCII code for " + userInput + " is: " + (char) userInput);
    }
}
