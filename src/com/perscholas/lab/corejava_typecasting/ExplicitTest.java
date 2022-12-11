package com.perscholas.lab.corejava_typecasting;
//Lab 303.1.3

public class ExplicitTest {
    public static void main(String[] args) {
        double d = 100.04;
        // explicit type casting
        long l = (long)d;
        int i = (int)l;
        System.out.println("Double value "+d); // fractional part lost.
        //output: Double value

        System.out.println("Long value "+l); // fractional part lost.
        //output: Long value

        System.out.println("Int value "+i);
        //output: Int value

        byte b;
        int z = 257;
        double dou = 323.142;
        System.out.println("Conversion of int to byte.");
        //output: Conversion of int to byte

        b = (byte) z;
        System.out.println("i = " + z + " b = " + b);
        //output:i = 257 b = 1

        System.out.println("Conversion of double to int.");
        //output: Conversion of double to int.

        z = (int) dou;

        System.out.println("d = " + dou + " b = " + z);
        //output:d = 323.142 b = 323

        System.out.println("Conversion of double to byte.");
        //output:Conversion of double to byte.

        b = (byte) dou;
        System.out.println("d = " + dou + " b = " + b);
        //output:d = 323.142 b = 67


    }
}
