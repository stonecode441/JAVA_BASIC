package com.James;

import java.util.Arrays;

public class Arrarys {
    public static void main(String[] arg){
//        we use  array to store list of anything
//        int[] numbers = new int[5];
//        numbers[0] = 1;
//        numbers[1] = 2;

        int[] numbers = {2, 3, 5, 1, 4};
        //sort arranges the numbers
//        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
