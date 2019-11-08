package com.company;

public class CastingPractice {
    public static void main(String[] args) {
//        int myValue = 10000;
//
//        int myMinValue = Integer.MIN_VALUE;
//        int myMaxIntValue = Integer.MAX_VALUE;
//        System.out.println("Integer Min value = " + myMinValue);
//        System.out.println("Integer Max value = " + myMaxIntValue);
//        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
//
//        byte myminByteValue = Byte.MIN_VALUE;
//        byte myMaxByteValue = Byte.MAX_VALUE;
//
//        System.out.println("Byte min value = "  + myminByteValue);
//        System.out.println("Byte max value = "  + myMaxByteValue);
//
//        short myminShortValue = Short.MIN_VALUE;
//        short myMaxShortValue = Short.MAX_VALUE;
//
//        System.out.println("Short min value = "  + myminShortValue);
//        System.out.println("Short max value = "  + myMaxShortValue);
//
//        long myLongValue = 100L;
//        long myminLongValue = Long.MIN_VALUE;
//        long myMaxLongValue = Long.MAX_VALUE;
//
//        System.out.println("Long min value = "  + myminLongValue);
//        System.out.println("Long max value = "  + myMaxLongValue);
//
//        int myTotal = (myMinValue / 2);
//
//        byte myNewbyteValue = (byte)(myminByteValue / 2);
//
//        short myNewShortValue = (short)(myminShortValue /2 );


        // primitive types challenge
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long total = (50000L + (10 * (byteValue + shortValue + intValue)));
        System.out.println(total);
    }
}
