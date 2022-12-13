package com.perscholas.powerpoints._1_java_programming_fundamentals.slide_examples;
//PowerPoint 303.1.2 - Java Programming Fundamentals

public class Slide13_FinalVariable {
    /* Final variables also called constants, are non-modifiable
     * (immutable) variables, declared with a keyword final.
     *
     * Once we declare a variable with the final keyword, we cannot
     * change the variable’s value. If we attempt to change the value
     * (final keyword), we will get a compilation error.
     *
     * It is used to define constants:
     *      The syntax is:	 final datatype CONSTANTNAME = <expression>;
     *
     * It is a common practice to use ALL_CAPS for named constants.
     */
    public static void main(String[] args) {
        final double PI = 3.14159;
        final int SIZE = 32;
        final double RADIUS = SIZE*SIZE*PI;

        System.out.println("Radius value is equal to " + RADIUS);
        /* Output:
           Radius value is equal to 3216.98816

         */


    }
}
