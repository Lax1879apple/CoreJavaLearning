package com.JavaLearning;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("My Minimum Float Value = " + myMinFloatValue);
        System.out.println("My Maximum Float Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("My Minimum Double Value = " + myMinDoubleValue);
        System.out.println("My Maximum Double Value = " + myMaxDoubleValue);


        int myIntValue = 5; // if we divide the myIntValue by 2, result will be 2 instead 2.5 because it is an integer, a whole number so don't accept the reminder.
        float myFloatValue = 5f; // if divided by 2, will show result 2.5 since it handles reminder
        double myDoubleValue = 5d; // if divided by 2, will show result 2.5 since it handles reminder
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        int myIntDividedValue = 5 / 2; // if we divide the myIntValue by 2, result will be 2 instead 2.5 because it is an integer, a whole number so don't accept the reminder.
        float myFloatDividedValue = 5f / 2f; // if divided by 2, will show result 2.5 since it handles reminder
        double myDoubleDividedValue = 5d / 2d; // if divided by 2, will show result 2.5 since it handles reminder
        System.out.println("MyIntDividedValue = " + myIntDividedValue);
        System.out.println("myFloatDividedValue = " + myFloatDividedValue);
        System.out.println("myDoubleDividedValue = " + myDoubleDividedValue);


    }
}
