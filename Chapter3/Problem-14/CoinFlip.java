package com.liang.y.daniel.chapter.three;

/* Write a program that lets the user guess whether the flip of a coin results in heads or tails. The program randomly
generates an integer 0 or 1, which represents head or tail. The program prompts the user to enter a guess, and reports
whether the guess is correct or incorrect. */

import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        System.out.print("Guess heads (0) or tails (1): ");
        Scanner in = new Scanner(System.in);
        int userGuess = in.nextInt();
        double randomNumber = Math.random();
        int coinFlipResult = (randomNumber >= 0.5) ? 1 : 0;
        // Technically should account for incorrect input, however exercise does not seem to want to consider this issue
        System.out.println((coinFlipResult == userGuess) ? "You are correct" : "You are incorrect");
    }
}
