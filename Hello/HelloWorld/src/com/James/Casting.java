package com.James;

public class Casting {
    public static void main(String[] args){
// Implicit casting
        //byte > shot > int > long > float > double
//        short x = 1;
//        int y = x + 2;
        //double x = 1.1;
        //double y = x + 2; // explicit can only happen b/w compatible type

        //converting string to integer
//        String x = "1";
//        int y = Integer.parseInt(x) + 2;

        String x = "1.1";
        Double y = Double.parseDouble(x) + 2;
        System.out.println(y);
    }
}
