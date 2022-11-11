package com.James;

import java.awt.*;
import java.util.Date;

public class ReferenceTypes {
//    public static void main(String[] args){
//        byte age = 30;
//        long viewsCount = 123_456_789L;
//        float price = 10.99F;
//        char letter = 'A';
//        boolean isEligible = false;
//    }

//        public static void main(String[] args){
//        byte age = 30;
//        Date now = new Date();
//            System.out.println(now);
//    }
    public static void main(String[] arg){
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

    }

}
