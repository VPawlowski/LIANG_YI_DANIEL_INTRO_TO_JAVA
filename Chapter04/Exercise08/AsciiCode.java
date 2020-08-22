package com.liang.y.daniel.chapter.four;

// Write a program that receives a character and displays its ASCII code (an integer between 0 and 127).

import java.util.Scanner;

public class AsciiCode {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        Scanner in = new Scanner(System.in);
        char userInput = in.next().charAt(0);
        System.out.println("The Unicode for the character " + userInput + " is: " +(int) userInput);
    }
}
