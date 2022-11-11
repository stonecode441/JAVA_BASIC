package com.James;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] ags){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("Fizzbuzz");
            else if (number % 5 == 0)
            System.out.println("Fizz");
            else if (number % 3 == 0)
            System.out.println("BUzz");
            else
            System.out.println(number);


    }
}
