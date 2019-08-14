package com.company;

public class Main {

    public static void main(String[] args) {
	    int myValue = 10000;

	    int myMinIntValue = Integer.MIN_VALUE;
	    int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer MinimumValue = " +  myMaxIntValue);
        System.out.println("Integer Maximum Value = " +  myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value =  " + (myMinIntValue - 1));


        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println( "Byte Minimum Value = " + myMinByteValue);
        System.out.println( "Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println( "Short Minimum Value = " + myMinShortValue);
        System.out.println( "Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println( "Long Minimum Value = " + myMinLongValue);
        System.out.println( "Long Maximum Value = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);

        System.out.println("My NewByteValue = " + myNewByteValue);
        System.out.println( "My NewShortValue = " + myNewShortValue);
    }
}
