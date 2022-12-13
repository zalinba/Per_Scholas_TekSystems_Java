package com.perscholas.lab._18_hashset_and_treeset_processing;
import java.util.HashSet;

//Lab 303.8.2 HashSet and TreeSet Processing

/* Example three: Difference of Sets.
 * To calculate the difference between
 * the two sets, we can use the removeAll() method:
 *
 * Create a new Class named “examplethree,”
 */
public class ExampleThree {
    public static void main(String[] args) {
        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> oddNumbers = new HashSet<>();
        oddNumbers.add(1);
        oddNumbers.add(3);
        oddNumbers.add(5);
        System.out.println("HashSet2: " + oddNumbers);

        // Difference between HashSet1 and HashSet2
        primeNumbers.removeAll(oddNumbers);
        System.out.println("Difference : " + primeNumbers);

        /*Output:
        HashSet1: [2, 3, 5]
        HashSet2: [1, 3, 5]
        Difference: [2]
         */
    }

}
