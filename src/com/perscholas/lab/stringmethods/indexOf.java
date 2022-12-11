package com.perscholas.lab.stringmethods;
//Lab 303.2.1

public class indexOf {
    /* The indexOf() method returns the index of
     * the first occurrence of the specified
     * character/substring within the string.
     */
    public static void main(String[] args) {
        String str1 = "Java is fun";
        int result;

        //getting index of character 's'
        result = str1.indexOf('s');
        System.out.println(result);
        //output: 6

        //getting index of character 'j'
        result = str1.lastIndexOf('J');
        System.out.println(result);
        //output: 0

        //getting index of character 'a'
        result = str1.lastIndexOf('a');
        System.out.println(result);
        //output: 3

        //character not in the string
        result = str1.lastIndexOf('j');
        System.out.println(result);
        //output: -1

        //getting the last occurrence of "ava"
        result = str1.lastIndexOf("ava");
        System.out.println(result);
        //output: 1

        //substring not in the string
        result = str1.lastIndexOf("java");
        System.out.println(result);
        //output: -1

    }
}
