package com.liang.y.daniel.chapter.three;

/* Write a program that plays the popular scissor–rock–paper game. (A scissor can cut a paper, a rock can knock a
scissor, and a paper can wrap a rock.) The program randomly generates a number 0, 1, or 2 representing scissor, rock,
and paper. The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user
or the computer wins, loses, or draws. */

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        System.out.print("Please select rock (0), paper (1), or scissor (2): ");
        Scanner in = new Scanner(System.in);
        int userInput = in.nextInt();
        int computerInput = (int) (Math.random() * 3);
        System.out.print("The computer is: ");
        switch (computerInput) {
            case 0:
                System.out.println("Rock");
                break;
            case 1:
                System.out.println("Paper");
                break;
            case 2:
                System.out.println("Scissor");
                break;
            default:
                System.out.println("ERROR: EXPECTED 0, 1, 2");
                System.exit(1);
                break;
        }
        System.out.print("The user is: ");
        switch (userInput) {
            case 0:
                System.out.println("Rock");
                break;
            case 1:
                System.out.println("Paper");
                break;
            case 2:
                System.out.println("Scissor");
                break;
            default:
                System.out.println("ERROR: EXPECTED 0, 1, 2");
                System.exit(1);
                break;
        }
        if (userInput == computerInput) {
            System.out.println("Draw.");
        } else {
            boolean isWinner = (userInput == 0 && computerInput == 2) || (userInput == 1 && computerInput == 0)
                    || (userInput == 2 && computerInput == 1);
            if (isWinner) {
                System.out.println("You have won!");
            } else {
                System.out.println("You have lost.");
            }
        }
    }
}
