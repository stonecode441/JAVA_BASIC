package com.James;

public class For_Each {
    public static void main(String[] args){
        //we use for each to iterate arrays or collections
      String[] fruits = {"Apple", "Mango", "Orange" };

     //1.
        for (int i = 0; i < fruits.length; i++)
          System.out.println(fruits[i]);

        //the reverse
        // for (int i = fruits.length; i > 0; i--)

     //2.
        //for each loop
      for (String fruit : fruits)
          System.out.println(fruit);
    }
}
