package com.James;

import java.text.NumberFormat;

public class Formattig_Numbers {
    public static void main(String[] args){
        // $123,4567   0.1 10%
        //getPercentInsatnce for percent
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//       String result = currency.format(1234567.891);
//        System.out.println(result);

//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result = percent.format(0.1);
//        System.out.println(result);

        //method chaining
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}
