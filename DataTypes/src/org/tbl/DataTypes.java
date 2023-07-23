package org.tbl;

import java.util.List;

public class DataTypes {
    public static void main(String[] args) {
        boolean isValid = false; // This is stored as a single bit
        System.out.println("first isValid value = " + isValid);

        isValid = true;
        System.out.println("second isValid value = " + isValid);

        char myChar = '\uffff'; //This is unicode representation which take 2 bytes of memory, all chars are represented
        //as 16 bit unicode representation, and to represent each hex chars we need 4 bits
        //and we need 4 hex digits to represent a single char, hence total 16 bits
        System.out.println(myChar);
        System.out.println("Char max = " + Character.MAX_VALUE);
        System.out.println("Char min = " + Character.MIN_VALUE);

        System.out.println("Byte max = " + Byte.MAX_VALUE);
        System.out.println("Byte min = " + Byte.MIN_VALUE);

        System.out.println("Short max = " + Short.MAX_VALUE);
        System.out.println("Short min = " + Short.MIN_VALUE);

        System.out.println("Integer max = " + Integer.MAX_VALUE);
        System.out.println("Integer min = " + Integer.MIN_VALUE);

        System.out.println("Long max = " + Long.MAX_VALUE);
        System.out.println("Long min = " + Long.MIN_VALUE);

        System.out.println("Float max = " + Float.MAX_VALUE);
        System.out.println("Float min = " + Float.MIN_VALUE);

        System.out.println("Double max = " + Double.MAX_VALUE);
        System.out.println("Double min = " + Double.MIN_VALUE);

        //Derived Data Type
        char[] myName = {'b','i','n','a','r','y'};

        String myStringName = "binary";

        Integer[] myBasicNumbers = {0,1,2,3,4,5,6,7,8,9};

        System.out.println(myName);

        System.out.println(myStringName);

        System.out.println(myBasicNumbers);
    }

    class Cube{
        float length;
        float breadth;
        float height;
        double surfaceArea;
        double volume;
        double mass;
        String surfaceColor;
    }
}
