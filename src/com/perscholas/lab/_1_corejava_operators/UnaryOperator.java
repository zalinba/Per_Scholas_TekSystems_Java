package com.perscholas.lab._1_corejava_operators;
//Lab 303.1.2

public class UnaryOperator {
    public static void main(String[] args) {
        int sum = +1;
        // sum is now 1

        System.out.println(sum);
        //output: 1

        sum--;
        // sum is now 0

        System.out.println(sum);
        //output: 0

        sum++;
        // sum is now 1

        System.out.println(sum);
        //output: 1

        sum = -sum;
        // sum is now -1

        System.out.println(sum);
        //output: -1

        boolean result = false;
        // false

        System.out.println(result);
        // output: false

        System.out.println(!result);
        //output: true


    }
}
