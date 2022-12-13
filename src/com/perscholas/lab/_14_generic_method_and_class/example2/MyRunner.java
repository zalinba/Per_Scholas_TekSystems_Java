package com.perscholas.lab._14_generic_method_and_class.example2;
//Lab 303.7.1 Generic Method and Class

/* Create a class named MyRunner
 */
public class MyRunner {
    public static void main(String[] args) {
        // initialize generic class
        // with String and Integer data

        GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype("Per Scholas", 11025);

        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        // initialize generic class
        // with String and String data
        GMultipleDatatype<String, String> mobj2 = new GMultipleDatatype("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());

        /*Output:
        Per Scholas
        11025
        Per Scholas
        Non profit
         */

    }
}
