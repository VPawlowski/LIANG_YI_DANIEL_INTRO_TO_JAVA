package com.liang.y.daniel.chapter.four;

import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        System.out.print("Enter an hex digit: ");
        Scanner in = new Scanner(System.in);
        char userInput = in.next().charAt(0);
        int intValue = 0;
        // Detect if it is a digit
        if (Character.isDigit(userInput)) {
            intValue = Character.getNumericValue(userInput);
        } else if (userInput >= 'A' && userInput <= 'F') {
            switch(userInput) {
                case 'A' -> intValue = 10;
                case 'B' -> intValue = 11;
                case 'C' -> intValue = 12;
                case 'D' -> intValue = 13;
                case 'E' -> intValue = 14;
                case 'F' -> intValue = 15;
            }
        } else {
            System.out.println(userInput + " is not a valid hexadecimal number.");
            System.exit(1);
        }
        System.out.print("The binary value is: ");
        switch (intValue) {
            case 0 -> System.out.println("0000");
            case 1 -> System.out.println("0001");
            case 2 -> System.out.println("0010");
            case 3 -> System.out.println("0011");
            case 4 -> System.out.println("0100");
            case 5 -> System.out.println("0101");
            case 6 -> System.out.println("0110");
            case 7 -> System.out.println("0111");
            case 8 -> System.out.println("1000");
            case 9 -> System.out.println("1001");
            case 10 -> System.out.println("1010");
            case 11 -> System.out.println("1011");
            case 12 -> System.out.println("1100");
            case 13 -> System.out.println("1101");
            case 14 -> System.out.println("1110");
            case 15 -> System.out.println("1111");
        }
    }
}
