package com.perscholas.lab._19_hashmap_and_treemap_processing;
import java.util.HashMap;

//Lab 303.9.1 HashMap and TreeMap Processing

/* Example two
 * Here, we will do multiple things. We will
 * first create a Hashmap; we will then get
 * its values one by one. After that, we will
 * copy all data of the HashMap to a brand new
 * HashMap. After that, we will remove one item
 * and get their sizes. If the size is lower by
 * one, the decrease of size by removal is confirmed.
 *
 * Create a new Class named “ExampletwoHashMap.”
 */
public class ExampleTwoHashMap {
    public static void main(String[] args) {
        HashMap<String, String> newHashMap = new HashMap<>();
// Addition of key and value
        newHashMap.put("Key1", "Lenovo");
        newHashMap.put("Key2", "Motorola");
        newHashMap.put("Key3", "Nokia");
        newHashMap.put("Key4", null);
        newHashMap.put(null, "Sony");
        System.out.println("Original map contains:" + newHashMap);
//getting size of Hashmap
        System.out.println("Size of original Map is:" + newHashMap.size());
//copy contains of one Hashmap to another
        HashMap<String, String> copyHashMap = new HashMap<>();
        copyHashMap.putAll(newHashMap);
        System.out.println("copyHashMap mappings= " + copyHashMap);
//Removal of null key
        String nullKeyValue = copyHashMap.remove(null);
        System.out.println("copyHashMap null key value = " + nullKeyValue);
        System.out.println("copyHashMap after removing null key = " + copyHashMap);
        System.out.println("Size of copyHashMap is:" + copyHashMap.size());

        /*Output:
        Original map contains:{Key2=Motorola, null=Sony,
                                Key1=Lenovo, Key4=null, Key3=Nokia}
        Size of original Map is:5
        copyHashMap mappings= {Key2=Motorola, null=Sony,
                                Key1=Lenovo, Key4=null, Key3=Nokia}
        copyHashMap null key value = Sony
        copyHashMap after removing null key = {Key2=Motorola,
                                Key1=Lenovo, Key4=null, Key3=Nokia}
        Size of copyHashMap is:4
         */
    }

}
