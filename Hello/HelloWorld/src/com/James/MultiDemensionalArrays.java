package com.James;

import java.util.Arrays;

public class MultiDemensionalArrays {
    public static void main (String[] args){
        //two dimensional array
//        int [][] numbers = new int[2][3]; //2 rows 3 column
//        numbers[0][0] = 1;
        // another way

        int[][] numbers = {{1, 2, 3,}, {4, 5, 6,}};
        System.out.println(Arrays.deepToString(numbers));
    }
}
