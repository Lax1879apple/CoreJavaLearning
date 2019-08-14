package com.company;

public class Main {

    public static void main(String[] args) {
	    byte myByteValue = (byte)300;
	    short myShortValue = 226;
	    int myIntValue = 4449;
	    long myLongValue = 50000 + 10 * (myByteValue + myShortValue + myIntValue);

        System.out.println("My Long Value = " + myLongValue);
    }
}
