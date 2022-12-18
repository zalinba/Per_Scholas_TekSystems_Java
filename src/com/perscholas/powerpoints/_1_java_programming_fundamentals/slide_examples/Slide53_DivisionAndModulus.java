package com.perscholas.powerpoints._1_java_programming_fundamentals.slide_examples;
//PowerPoint 303.1.2 - Java Programming Fundamentals

public class Slide53_DivisionAndModulus {
    public static void main(String[] args) {
        int a = 5 / 2;
        System.out.println("int a 5 / 2 is equal to " + a);
        //output: 2

        double b = 5.0 / 2;
        System.out.println("double b 5.0 / 2 is equal to " + b);
        //output: 2.5

        double c = 5.0 / 2.0;
        System.out.println("double c 5.0 / 2.0 is equal to " + c);
        //output: 2.5

        int d = 5 % 2;
        System.out.println("int d 5 % 2 is equal to " + d);
        //output: 1

        double e = 3.6 % 0.55;
        System.out.println("double e 3.6 % 0.55 is equal to " + e);
        //output: 0.2999999999999998
    }
}
