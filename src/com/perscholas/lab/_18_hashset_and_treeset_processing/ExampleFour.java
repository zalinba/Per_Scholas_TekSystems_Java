package com.perscholas.lab._18_hashset_and_treeset_processing;
import java.util.HashSet;

//Lab 303.8.2 HashSet and TreeSet Processing

/* Example Four: Enhanced for() Loop
 * Create a new Class named “examplefour,”
 */
public class ExampleFour {
    public static void main(String args[]) {
        // HashSet declaration
        HashSet<String> hset =         new HashSet<String>();

        // Adding elements to the HashSet
        hset.add("Apple");
        hset.add("Mango");
        hset.add("Grapes");
        hset.add("Orange");
        hset.add("Fig");
        //Addition of duplicate elements
        hset.add("Apple");
        hset.add("Mango");
        //Addition of null values
        hset.add(null);
        hset.add(null);

// Using advanced for loop
        for (String str : hset) {
            System.out.println(" ---> " + str);

            /*Output:
            ---> null
            ---> Apple
            ---> Grapes
            ---> Fig
            ---> Mango
            ---> Orange
             */

            /* Remember: HashSet DOES NOT  maintain any order,
             * so this order might be change if you run your
             * code a second time.
             */
        }

    }

}
