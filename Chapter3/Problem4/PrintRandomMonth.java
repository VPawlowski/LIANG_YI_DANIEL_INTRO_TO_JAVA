package com.liang.y.daniel.chapter.three;

/* Write a program that randomly generates an integer between 1 and 12 and displays the English month names January,
February, . . . , December for the numbers 1, 2, . . . , 12, accordingly. */

public class PrintRandomMonth {
    public static void main(String[] args) {
        // Multiply random() result by the number of months; add 1 after int casting to start counting from first month; not 0th month
        int randomNumber = (int) (Math.random() * 12) + 1;
        // Using a switch instead if-else chain due to ease of use
        switch (randomNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            // Leaving an empty default; includes break to conform to previous cases
            default:
                break;
        }
    }
}
