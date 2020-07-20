package com.liang.y.daniel.chapter.three;

/* The program in Listing 3.1, AdditionQuiz.java, generates two integers and prompts the user to enter the product of
these two integers. Revise the program to generate three single-digit integers and prompt the user to enter the
multiplication of these three integers */

import java.util.Scanner;

public class MultiplicationQuiz {
    public static void main(String[] args) {
        int firstNumber = (int) (Math.random() * 10);
        int secondNumber = (int) (Math.random() * 10);
        int thirdNumber = (int) (Math.random() * 10);
        System.out.println("What is " + firstNumber + " * " + secondNumber + " * " + thirdNumber + "?");
        Scanner in = new Scanner(System.in);
        int answer = in.nextInt();
        if (firstNumber * secondNumber * thirdNumber == answer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("You are incorrect, the answer is: " + firstNumber * secondNumber * thirdNumber);
        }
    }
}
