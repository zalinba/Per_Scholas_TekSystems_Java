package com.perscholas.lab.corejava_operators;
//Lab 303.1.2

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {

        int x, y = 10, z = 5; //Declaring and initializing variables

        x = y + z; //(x = (y + z)) --> (x = (10 + 5))
        System.out.println("+ operator resulted in " + x);
        //output: + operator resulted in 15

        x = y - z; //(x = (y - z)) --> (x = (10 - 5))
        System.out.println("- operator resulted in " + x );
        //output: - operator resulted in 5

        x = y * z; //(x = (y* z)) --> (x = (10 * 5))
        System.out.println("* operator resulted in " + x );
        //output: * operator resulted in 50

        x = y / z; //(x = (y / z)) --> (x = (10 / 5))
        System.out.println("/ operator resulted in " + x );
        //output: / operator resulted in 2

        x = y % z; //(x = (y % z)) --> (x = (10 % 5))
        System.out.println(" % operator resulted in " + x);
        //output: % operator resulted in 0

        x = y++;
        System.out.println("Postfix ++ operator resulted in " + x);
        //output: Postfix ++ operator resulted in 10

        x = ++z;
        System.out.println("Prefix ++ operator resulted in " + x);
        //output: Prefix ++ operator resulted in 6

        x = -y; //x = -11
        System.out.println("Unary operator resulted in " + x);
        //output: Unary operator resulted in -11

        // Some examples of special Cases
        int tooBig = Integer.MAX_VALUE + 1;
        // -2147483648 which is Integer.MIN_VALUE.

        int tooSmall = Integer.MIN_VALUE - 1;
        // 2147483647 which is Integer.MAX_VALUE.

        System.out.println("tooBig becomes " + tooBig);
        //output: tooBig becomes -2147483648

        System.out.println("tooSmall becomes " + tooSmall);
        //output: tooSmall becomes 2147483647

        System.out.println(4.0 / 0.0);
        //output: Infinity

        System.out.println(-4.0 / 0.0);
        //output: -Infinity

        System.out.println(0.0 / 0.0);
        //output: NaN

        double d1 = 12 / 8; // result: 1 by integer division. d1 gets the value
        // 1.0.
        double d2 = 12.0F / 8; // result: 1.5

        System.out.println("d1 is " + d1);
        //output: d1 is 1.0

        System.out.println("d2 iss " + d2);
        //output: iss 1.5


    }
}
