package com.perscholas.lab._14_generic_method_and_class.example1;
//Lab 303.7.1 Generic Method and Class

/* Java Generics Method
 * We can create a method that can be used with
 * any type of data. That method is known as
 * the Generics Method.
 *
 * Create a class named DemoClass.
 */
public class DemoClass {
    // create a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }

}
