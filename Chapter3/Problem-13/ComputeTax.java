package com.liang.y.daniel.chapter.three;

/* (Listing 3.5, ComputeTax.java, gives the source code to compute taxes for single filers. Complete this program to
compute taxes for all filing statuses. */

import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        System.out.print("(0-single filer, 1-married jointly or qualifying widow(er), 2-married separately, 3-head of"
                + " household) Enter filing status: ");
        Scanner in = new Scanner (System.in);
        int filingStatus = in.nextInt();
        System.out.print("Enter taxable income: ");
        double income = in.nextDouble();
        // These are just initialized to 0 by default so that the compiler doesn't complain about lack of value
        int firstTaxBracket = 0;
        int secondTaxBracket = 0;
        int thirdTaxBracket = 0;
        int fourthTaxBracket = 0;
        int fifthTaxBracket = 0;
        // Sets the corresponding tax bracket constraints according to the filing status
        switch (filingStatus) {
            case 0:
                firstTaxBracket = 8_350;
                secondTaxBracket = 33_950;
                thirdTaxBracket = 82_250;
                fourthTaxBracket = 171_550;
                fifthTaxBracket = 372_950;
                break;
            case 1:
                firstTaxBracket = 16_700;
                secondTaxBracket = 67_900;
                thirdTaxBracket = 137_050;
                fourthTaxBracket = 208_850;
                fifthTaxBracket = 372_950;
                break;
            case 2:
                firstTaxBracket = 8_350;
                secondTaxBracket = 33_950;
                thirdTaxBracket = 68_525;
                fourthTaxBracket = 104_425;
                fifthTaxBracket = 186_475;
                break;
            case 3:
                firstTaxBracket = 11_950;
                secondTaxBracket = 45_500;
                thirdTaxBracket = 117_450;
                fourthTaxBracket = 190_200;
                fifthTaxBracket = 372_950;
                break;
            default:
                System.out.println("ERROR: INVALID STATUS!");
                System.exit(1);
                break;
        }
        // If-else block determines your placement within the tax system
        int incomeCode;
        if (income > fifthTaxBracket) {
            incomeCode = 6;
        } else if (income > fourthTaxBracket) {
            incomeCode = 5;
        } else if (income > thirdTaxBracket) {
            incomeCode = 4;
        } else if (income > secondTaxBracket) {
            incomeCode = 3;
        } else if (income > firstTaxBracket) {
            incomeCode = 2;
        } else {
            incomeCode = 1;
        }
        double taxTotal = 0;
        final double FIRST_TAX_RATE = 0.10;
        final double SECOND_TAX_RATE = 0.15;
        final double THIRD_TAX_RATE = 0.25;
        final double FOURTH_TAX_RATE = 0.28;
        final double FIFTH_TAX_RATE = 0.33;
        final double SIXTH_TAX_RATE = 0.35;
        /* Switch statement with lack of breaks is intentional; if you're in the highest tax bracket, you need to pay all 
        lower brackets just the same. Could've done it differently, but really wanted to use a breakless switch for the 
        first time */
        switch (incomeCode) {
            case 6:
                taxTotal += ((income - fifthTaxBracket) * SIXTH_TAX_RATE);
                income -= (income - fifthTaxBracket);
            case 5:
                taxTotal += ((income - fourthTaxBracket) * FIFTH_TAX_RATE);
                income -= (income - fourthTaxBracket);
            case 4:
                taxTotal += ((income - thirdTaxBracket) * FOURTH_TAX_RATE);
                income -= (income - thirdTaxBracket);
            case 3:
                taxTotal += ((income - secondTaxBracket) * THIRD_TAX_RATE);
                income -= (income - secondTaxBracket);
            case 2:
                taxTotal += ((income - firstTaxBracket) * SECOND_TAX_RATE);
                income -= (income - firstTaxBracket);
            case 1:
                taxTotal += (income * FIRST_TAX_RATE);;
                break;
            default:
                break;
        }
        System.out.println("Tax is: $" + taxTotal);
    }
}
