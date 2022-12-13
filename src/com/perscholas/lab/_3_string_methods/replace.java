package com.perscholas.lab._3_string_methods;
//Lab 303.2.1

public class replace {
    /* The replace() method replaces each matching
     * occurrence of the old character/text in the
     * string with the new character/text.
     *
     * The syntax of the replace() method is either:
     *
     *      stringobj.replace(char oldChar, char newChar) or
     *      stringobj.replace(CharSequence oldText, CharSequence newText)
     *
     * Here, stringobj is an object of the String class.
     */
    public static void main(String[] args) {
        String str1 = "abc cba";

        //all occurrences of a 'a' is replaced with 'z'
        System.out.println(str1.replace('a' , 'z'));
        //output: zbc cbz

        //all occurrences of 'L' is replaced with 'J'
        System.out.println("Lava".replace('L' , 'J'));
        //output: Java

        //character not in the string
        System.out.println("Hello".replace('4' , 'J'));
        //output:Hello

        //all occurrences of "C++ is replaced with "Java"
        System.out.println(str1.replace("C++" , "Java"));
        //output:abc cba

        //all occurrences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa" , "zz"));
        //output:zz bb zz zz

        //substring not in the string
        System.out.println("Java".replace("C++" , "C"));
        //output:Java

        /* Note: If the substring to be replaced is not in the string,
         * replace() returns the original string.
         */





    }
}
