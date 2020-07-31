package com.liang.y.daniel.chapter.three;

/* Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB.
Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB to U.S.
dollars. Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S.
dollars, respectively. */

import java.util.Scanner;

public class CurrencyExchanger {
    public static void main(String[] args) {
        System.out.print("Enter the current exchange rate of USD to RMB: ");
        Scanner in = new Scanner(System.in);
        double usdToRmbRate = in.nextDouble();
        System.out.print("Enter 0 to convert USD to RMB, or 1 for vice versa: ");
        int conversionOption = in.nextInt();
        double total;
        switch (conversionOption) {
            case 0:
                System.out.print("Enter USD amount to convert to RMB: ");
                total = in.nextDouble();
                System.out.println("$" + total + " is " + total * usdToRmbRate + " yuan.");
                break;
            case 1:
                System.out.print("Enter RMB amount to convert to USD: ");
                total = in.nextDouble();
                System.out.println(total + " yuan is $" + total / usdToRmbRate + " USD.");
                break;
            default:
                System.out.println("ERROR: EXPECTED 0 OR 1");
                System.exit(1);
                break;
        }
    }
}
