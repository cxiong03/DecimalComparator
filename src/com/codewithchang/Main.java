package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        DecimalComparator.areEqualByThreeDecimalPlaces(3.123, -3.123);
        DecimalComparator.areEqualByThreeDecimalPlaces(2.342, 2.323);
        DecimalComparator.areEqualByThreeDecimalPlaces(2.314, 2.314);
    }
}
