package com.perscholas.lab._1_corejava_operators;
//Lab 303.1.2

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        System.out.println("x & y : " + (x & y));
        //output: x & y : false

        System.out.println("x && y : " + (x && y));
        //output: x && y : false

        System.out.println("x | y : " + (x | y));
        //output: x | y : true

        System.out.println("x || y: " + (x || y));
        //output: x || y : true

        System.out.println("x ^ y : " + (x ^ y));
        //output: x ^ y : true

        System.out.println("!x : " + (!x));
        //output: !x : false

    }
}
