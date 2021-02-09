package com.codewithchang;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {

        // casting - double into int
        int num1 = (int) (number1 * 100);
        int num2 = (int) (number2 * 100);


        // compare our variables
        if(num1 == num2) {
            System.out.println("True");
            return true;
        } else if ()
        System.out.println("False");
        return false;
    }
}
