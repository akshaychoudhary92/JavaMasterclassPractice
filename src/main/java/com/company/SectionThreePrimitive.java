package com.company;

public class SectionThreePrimitive {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min value = " + myMinValue);
        System.out.println("Integer Max value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
    }
}
