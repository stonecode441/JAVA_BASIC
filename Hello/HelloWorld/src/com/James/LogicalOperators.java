package com.James;

public class LogicalOperators {
    public static void main(String[] args){
//        int tempersture = 22;
//        boolean isWarm = tempersture > 20 && tempersture < 30;
//        System.out.println(isWarm);
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminlRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminlRecord;

    }
}
