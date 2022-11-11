package com.James;

import java.util.Scanner;

public class While_Loops {
    public static void main(String[] args){
//        for (int i = 0; i < 5; i++)
//            System.out.println("supping");
//
//        int i = 0;
//        while (i > 0) {
//            System.out.println("supping " + i);
//            i--;
//        }
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            //if using while truemake sure to have a break statement
            //while loops are use ahead time when we don't know how many times to print value
            System.out.print("Input: ");
            //scanner to able to write in terminal
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            //to ehco back what users entered
            if (input.equals("quit"))
                continue;
                //contiinue moves control to the begining of the loop
               // break;
            //to break out of the loop.
            System.out.println(input);
            //do-while get executed once!
        }
//        do {
//            System.out.print("Input: ");
//            //scanner to able to write in terminal
//            input = scanner.next().toLowerCase();
//            //to ehco back what users entered
//            System.out.println(input);
//
//        } while (!input.equals("quit"));
    }
}
