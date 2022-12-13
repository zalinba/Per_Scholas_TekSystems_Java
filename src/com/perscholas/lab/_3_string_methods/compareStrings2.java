package com.perscholas.lab._3_string_methods;
//Lab 303.2.1

public class compareStrings2 {
    /* By Using == operator: The == operator compares
     * references, not values.
     *
     * It is used in sorting (by compareTo() method
     *
     * There are three ways to compare String in Java:
     * 1.	By Using equals() Method
     * 2.	By Using == Operator
     * 3.	By compareTo() Method
     */
    public static void main(String[] args) {
        String s1 = "Perscholas";
        String s2 = "Perscholas";
        String s3 = new String("Perscholas");

        System.out.println(s1 == s2);
        //output:true
        //Because both refer to same instance in the String pool

        System.out.println(s1 == s3);
        //output:false
        //Because s1 refers to the instance in the String pool
        //and s2 refers to the instance created in the heap

        /* The above code demonstrates the use of == operator
         * used for comparing two String objects.
         */

    }
}
