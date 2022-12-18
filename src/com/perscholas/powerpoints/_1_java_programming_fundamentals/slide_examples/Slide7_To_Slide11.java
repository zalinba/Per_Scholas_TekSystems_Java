package com.perscholas.powerpoints._1_java_programming_fundamentals.slide_examples;
//PowerPoint 303.1.2 - Java Programming Fundamentals

public class Slide7_To_Slide11 {
    /* When we declare a variable, it's simply a variable with no value.
     * We follow the expression:
     *
     *      variable data type | variable name ;
     *
     * Variable data type can be either a primitive or non-primitive variable.
     * Primitive data type:
     *     byte, short, int, long, float, double, char and boolean
     *
     * Non-Primitive data type:
     *      String, Arrays and Classes
     */

    // Main Method
    public static void main(String[] args) {
        //Declared variable
        double radius;
                           /*      Stack memory
                                +-----------------+
                                |                 |  The variable 'radius' is declared.
                                |                 |  Variable 'radius' is allocated to
                                |                 |  stack memory with no value.
                                |radius = no value|
                                +-----------------+
                             */

        //Declared variable
        double area;
                            /*    Stack memory
                                +-----------------+
                                |                 |  The variable 'area' is declared.
                                |                 |  Variable 'area' is allocated to
                                |area = no value  |  stack memory with no value.
                                |radius = no value|
                                +-----------------+
                             */

        /* To get data into a variable, we have to assign a value to it.
         * This is done with the assignment statement. It takes this form:
         *
         *             variable name = expression;
         *
         * Expression represents anything that is a data value.
         * When the computer goes through the code and sees
         * the assignment statement, the computer will evaluate the expression
         * by making sure the expression data type is the same as the variable
         * data type. If it is, the computer will put the data value into the
         * variable. If they're not the same, the computer will not put the data
         * value into the variable and will give you a compilation error.
         */

        // Assign a radius
        radius = 20;
                             /*   Stack memory
                                +-----------------+  The variable in this assignment statement
                                |                 |  is 'radius' and the expression is the
                                |                 |  number 20. The value in the stack memory
                                |area = no value  |  for the variable 'radius' changes from no value
                                |radius = 20      |  to 20.
                                +-----------------+
                              */

        // Compute area
        area = radius * radius * 3.14159;
                             /*   Stack memory
                                +-----------------+  The equation we assigned to the variable
                                |                 |  'area' will change the variables value,
                                |                 |  to a new value of 1256.636.
                                |area = 1256.636  |
                                |radius = 20      |
                                +-----------------+
                              */

        // Display results and print a message to the console
        System.out.println("The area for the circle of radius " +
                radius + " is " + area);

        /* Output:
           The area for the circle of radius 20 is 1256.636

         */
    }
}

