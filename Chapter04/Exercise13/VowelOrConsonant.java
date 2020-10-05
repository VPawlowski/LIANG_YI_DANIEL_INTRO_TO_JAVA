package com.liang.y.daniel.chapter.four;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        System.out.print("Enter a letter: ");
        Scanner in = new Scanner(System.in);
        char userInput = in.next().charAt(0);
        // Detects if it is a character, if true, determines if consonant or vowel.
        if (Character.isLetter(userInput)) {
            // Enhanced switch which detects if a vowel is used; if not, default is assumed to be a consonant.
            switch(userInput) {
                case 'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y' -> System.out.println(userInput + " is a vowel.");
                default -> System.out.println(userInput + " is a consonant.");
            }
        } else {
            System.out.println(userInput + " is an invalid character.");
        }
    }
}
