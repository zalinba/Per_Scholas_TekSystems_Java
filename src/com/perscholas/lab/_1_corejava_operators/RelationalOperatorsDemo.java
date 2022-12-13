package com.perscholas.lab._1_corejava_operators;
//Lab 303.1.2

public class RelationalOperatorsDemo {
    public static void main(String[] args) {
        int x = 10, y = 5;
        System.out.println("x > y : "+(x > y));
        //output: x > y : true

        System.out.println("x < y : "+(x < y));
        //output: x < y : false

        System.out.println("x >= y : "+(x >= y));
        //output: x >= y : true

        System.out.println("x <= y : "+(x <= y));
        //output: x <= y : true

        System.out.println("x == y : "+(x == y));
        //output: x == y : false

        System.out.println("x != y : "+(x != y));
        //output: x != y : true

        int variable1 = 50, variable2 = 100, variable3 = 50;
        System.out.println("variable1 = " + variable1);
        //output:variable1 = 50

        System.out.println("variable2 = " + variable2);
        //output:variable2 = 100

        System.out.println("variable3 = " + variable3);
        //output:variable3 = 50

        System.out.println("variable1 == variable2: "
                + (variable1 == variable2));
        //output:variable1 == variable2: false

        System.out.println("variable1 == variable3: "
                + (variable1 == variable3));
        //output:variable1 == variable3: true
    }
}


