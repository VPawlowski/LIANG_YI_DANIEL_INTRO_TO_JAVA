package com.liang.y.daniel.chapter.three;

/* Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question. Revise the program to randomly
generate a multiplication question with two integers less than 1000. */

import java.util.Scanner;

public class MultiplicationThousandQuiz {
    public static void main(String[] args) {
        int randomNumberOne = (int) (Math.random() * 1000);
        int randomNumberTwo = (int) (Math.random() * 1000);
        System.out.println("What is " + randomNumberOne + " * " + randomNumberTwo + "?");
        Scanner in = new Scanner(System.in);
        int userAnswer = in.nextInt();
        int trueAnswer = randomNumberOne * randomNumberTwo;
        if (userAnswer == trueAnswer) {
            System.out.println("You are correct!");
        } else {
            System.out.println("You are incorrect, the answer should be: " + trueAnswer);
        }
    }
}
