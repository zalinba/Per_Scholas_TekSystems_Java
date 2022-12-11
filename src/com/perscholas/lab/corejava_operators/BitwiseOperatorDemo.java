package com.perscholas.lab.corejava_operators;
//Lab 303.1.2

public class BitwiseOperatorDemo {
    public static void main(String[] args) {
        int x = 58; //111010
        int y =13; //1101

        System.out.println("x & y : " + (x & y)); //returns 8 = 1000
        //output: x & y : 8

        System.out.println("x | y : " + (x | y)); //63=111111
        //output: x | y : 63

        System.out.println("x ^ y : " + (x ^ y)); //55=11011
        //output: x ^ y : 55

        System.out.println("~x : " + (~x));  //-59
        //output: ~x : -59

        System.out.println("x << y : " + (x << y));
        //output: x << y : 475136

        System.out.println("x >> y : " + (x >> y));
        //output: x >> y : 0

    }
}
