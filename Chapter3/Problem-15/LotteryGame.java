package com.liang.y.daniel.chapter.three;

/* Revise Listing 3.8, Lottery.java, to generate a lottery of a three-digit number. The program prompts the user to
enter a three-digit number and determines whether the user wins according to the following rules:

    1. If the user input matches the lottery number in the exact order, the award is $12,000.
    2. If all digits in the user input match all digits in the lottery number, the award is $5,000.
    3. If one digit in the user input matches a digit in the lottery number, the award is $2,000. */

import java.util.Scanner;

public class LotteryGame {
    public static void main(String[] args) {
        System.out.print("Enter a three-digit number: ");
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        int firstDigit = userInput / 100;
        int secondDigit = (userInput / 10) % 10;
        int thirdDigit = userInput % 10;
        // Assuming that the lottery number cannot be below 100 or above 999
        int randomNumberGenerated = (int) (Math.random() * 1000 - 100) + 100;
        int randomFirst = randomNumberGenerated / 100;
        int randomSecond = (randomNumberGenerated / 10) % 10;
        int randomThird = randomNumberGenerated % 10;
        // Just counting recurring numbers
        int counter = 0;
        if (firstDigit == randomFirst || firstDigit == randomSecond || firstDigit == randomThird) {
            counter++;
        }
        if (secondDigit == randomFirst || secondDigit == randomSecond || secondDigit == randomThird) {
            counter++;
        }
        if (thirdDigit == randomFirst || thirdDigit == randomSecond || thirdDigit == randomThird) {
            counter++;
        }
        System.out.println("The lottery number is: " + randomNumberGenerated);
        if (userInput == randomNumberGenerated) {
            System.out.println("You have correctly guessed all the numbers in the correct order; you have won $12,000!");
        } else if (counter == 3) {
            System.out.println("You have correctly guessed all the numbers; you have won $5,000!");
        } else if (counter == 1) {
            System.out.println("You have guessed one correct number; you have won $2,000!");
        } else {
            System.out.println("You have not guessed any correct numbers.");
        }
    }
}
