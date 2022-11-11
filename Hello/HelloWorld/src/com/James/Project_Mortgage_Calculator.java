package com.James;

import java.security.Principal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Project_Mortgage_Calculator {
    public static void main(String[] args){
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal = 0;
        float monthlyInterest = 0;
        int numbersOfPyments = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Principal: ");
            principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1_000_00)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }

        while (true) {
            System.out.println("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
             if (annualInterest >= 1 && annualInterest <= 30){
                 break;
             }
            System.out.println("Enter a value between 1 and 30 ");
        }
        while (true) {
            System.out.println("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30){
                numbersOfPyments = years * MONTHS_IN_YEAR;
            break;
            }
            System.out.println("Enter a value between 1 and 30 ");
        }

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numbersOfPyments) /
                (Math.pow(1 + monthlyInterest, numbersOfPyments) - 1));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: "+ mortgageFormatted);



    }
//
}
