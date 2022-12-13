package com.perscholas.lab._3_string_methods;
//Lab 303.2.1

public class concat {
    /* You can also use the + operator to concatenate
     * two or more strings. But the Java String class
     * provides the concat() method. This method combines
     * a specific string at the end of another string,
     * and ultimately returns a combined string.
     * For example:
     */
    public static void main(String[] args) {
        String str1 = "Learn ";
        String str2 = "Java";

        //concatenate str1 and str2
        System.out.println(str1.concat(str2));
        //output:Learn Java

        //concatenate str2 and str1
        System.out.println(str2.concat(str1));
        //output:JavaLearn

        //By using the + operator
        String s3 = "hello";
        String s4 = "Learners";
        String s5 = s3.concat(s4); //Same as String s5 = s3 +s4;
        String message = "Welcome " + "to" + "Java";
        String s = "Chapter" + 2;
        String s1 = "Supplement" + 'B';
    }
}
