package com.codewithchang;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        // casting - double into int
        int num1 = (int) (number1 * 1000);
        int num2 = (int) (number2 * 1000);


        // compare our variables
        if(num1 == num2) {
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }
}
