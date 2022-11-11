package com.James;


public class IF_Statements {
    public static void main(String[] args){

        int temperature = 32;
        if ( temperature > 32) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        }
        else if (temperature < 20)
            System.out.println("beautiful day");
        else
            System.out.println("cold day");
    }
}
