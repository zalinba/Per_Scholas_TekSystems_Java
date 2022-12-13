package com.perscholas.lab._18_hashset_and_treeset_processing;
import java.util.HashSet;

//Lab 303.8.2 HashSet and TreeSet Processing

/* Example two: Union of Sets.
 * To perform the union between two sets,
 * we can use the addAll() method.
 *
 * Create a new Class named “ExampleTwo.”
 */
public class ExampleTwo {
    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet1: " + evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        System.out.println("HashSet2: " + numbers);

        // Union of two set
        numbers.addAll(evenNumbers);
        System.out.println("Union is: " + numbers);

        /*Output:
        HashSet1: [2, 4]
        HashSet2: [1, 3]
        Union is: [1, 2, 3, 4]
         */
    }

}
