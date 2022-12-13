package com.perscholas.powerpoints._1_java_programming_fundamentals.slide_examples;
//PowerPoint 303.1.2 - Java Programming Fundamentals

public class Slide20_PrimitiveDataType {
    /* In this example, it will demonstrate how
     * we are declaring variables
     * and also initializing the variables with
     * primitive data types.
     */
    public static void main(String[] args) {
        byte num; //declared byte variable
        num = 113; //initialized byte variable
        System.out.println(num);
        /* Output:
         * 113
         *
         * Note: The byte data type can hold whole
         * numbers between:
         * -128 to 127.
         */

        short shortNum; //declared short variable
        shortNum = 150; //initialized short variable
        System.out.println(shortNum);
        /* Output:
         * 150
         *
         * Note: The short data type can hold whole
         * numbers between:
         * -32,768 to 32,767.
         */


        long longNum = -12332252626L; //declared and initialized long variable at the same time
        System.out.println(longNum);
        /* Output:
         * -12332252626
         *
         * Note: The long data type can hold whole
         * numbers between:
         * -9,223,372,036,854,775,808  to 9,223,372,036,854,775,807
         */

        double doubleNum = -42937737.9d; //declared and initialized double variable at the same time
        System.out.println(doubleNum);
        /* Output:
         * -4.29377379E7
         *
         * Note: The double data type can hold fractional
         * numbers up to 15 decimal places
         */

        float floatNum = 19.98f; //declared and initialized float variable at the same time
        System.out.println(floatNum);
        /* Output:
         * 19.98
         *
         * Note: The float data type can hold fractional
         * numbers up to 7 decimal places.
         */

        boolean b = false; //declared and initialized boolean variable at the same time
        System.out.println(b);
        /* Output:
         * false
         *
         * Note: The boolean data type hold either a
         * true or false value.
         */

        char ch = 'Z'; //declared and initialized char variable at the same time
        System.out.println(ch);
        /* Output:
         * Z
         *
         * Note: The char data type can hold a single character.
         */

    }
}
