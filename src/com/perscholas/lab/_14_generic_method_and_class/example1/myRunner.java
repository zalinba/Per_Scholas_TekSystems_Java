package com.perscholas.lab._14_generic_method_and_class.example1;
//Lab 303.7.1 Generic Method and Class

/* Create a class named myRunner. In this class,
 * we will invoke the generic method.
 */
public class myRunner {
    public static void main(String[] args) {
        // initialize the class with Integer data
        DemoClass dObj = new DemoClass();
        dObj.genericsMethod(25); // passing int
        dObj.genericsMethod("Per Scholas"); // passing String
        dObj.genericsMethod(2563.5); // passing float
        dObj.genericsMethod('H'); // passing Char

        /* Output:
        Generics Method:
        Data Passed: 25
        Generics Method:
        Data Passed: Per Scholas
        Generics Method:
        Data Passed: 2563.5
        Generics Method:
        Data Passed: H
         */

        /* In the above example, we have created a generic
         * method named genericsMethod.
         *
         *      public <T> void genericMethod(T data) {...}
         *
         * Here, the type parameter <T> is inserted after the
         * public modifier and before the return type void.
         *
         * We can call the generics method by placing the actual
         * type <String> and <Integer> inside the bracket before
         * the method name.
         */

    }
}
