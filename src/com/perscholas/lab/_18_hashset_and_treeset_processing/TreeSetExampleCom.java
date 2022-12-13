package com.perscholas.lab._18_hashset_and_treeset_processing;
import java.util.TreeSet;

//Lab 303.8.2 HashSet and TreeSet Processing

/* Create a class named “TreeSetExampleCom.”
 */
public class TreeSetExampleCom {
    public static void main(String[] args) {
        // Create a TreeSet with user-defined comparator
        TreeSet<String> cities = new TreeSet<>(new Cities_Comparator());
        //add elements to the comparator
        cities.add("UAE");
        cities.add("Mumbai");
        cities.add("NewYork");
        cities.add("Hyderabad");
        cities.add("Karachi");
        cities.add("Xanadu");
        cities.add("Lahore");
        cities.add("Zagazig");
        cities.add("Yingkou");

        //print the contents of TreeSet
        System.out.println("TreeSet: " + cities);

        /*Output:
        Output:
        TreeSet: [Zagazig, Yingkou, Xanadu, UAE, NewYork,
        Mumbai, Lahore, Karachi, Hyderabad]
         */
    }

}
