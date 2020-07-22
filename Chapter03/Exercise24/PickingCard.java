package com.liang.y.daniel.chapter.three;

/* Write a program that simulates picking a card from a deck of 52 cards. Your program should display the rank
(Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.*/

public class PickingCard {
    public static void main(String[] args) {
        int randomSuit = (int) (Math.random() * 4) + 1;
        int randomRank = (int) (Math.random() * 13) + 1;
        System.out.print("Your card is: ");
        switch (randomRank) {
            case 1:
                System.out.print("Ace");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            case 5:
                System.out.print("Five");
                break;
            case 6:
                System.out.print("Six");
                break;
            case 7:
                System.out.print("Seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("Nine");
                break;
            case 10:
                System.out.print("Ten");
                break;
            case 11:
                System.out.print("Jack");
                break;
            case 12:
                System.out.print("Queen");
                break;
            case 13:
                System.out.print("King");
                break;
            default:
                break;
        }
        System.out.print(" of ");
        switch (randomSuit) {
            case 1:
                System.out.println("Clubs");
                break;
            case 2:
                System.out.println("Diamonds");
                break;
            case 3:
                System.out.println("Hearts");
                break;
            case 4:
                System.out.println("Spades");
            default:
                break;
        }
    }
}
