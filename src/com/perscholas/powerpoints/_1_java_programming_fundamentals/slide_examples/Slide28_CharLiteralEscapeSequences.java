package com.perscholas.powerpoints._1_java_programming_fundamentals.slide_examples;
//PowerPoint 303.1.2 - Java Programming Fundamentals

/* A character preceded by a backslash (\) is an escape
 * sequence and has special meaning to the compiler.

    +--------------------------------------+
    | Escape   |      Description          |
    | Sequence |                           |
    |--------------------------------------|
    |    \t    | Tab character             |
    |    \b    | Backspace character       |
    |    \n    | Newline character         |
    |    \r    | Carriage-return character |
    |    \f    | Form feed character       |
    |    \'    | Single-quote character    |
    |    \"    | Double-quote character    |
    |    \\    | Backslash character       |
    +--------------------------------------+
 */
public class Slide28_CharLiteralEscapeSequences {
    public static void main(String[] args) {
        System.out.println("This will print on\r\ntwo lines.");
        //Output: This will print on
        //        two lines.

        System.out.println("She said \"Hello\" to me!");
        //Output: She said "Hello" to me!

        System.out.println("This will print back-slashes: \\\\");
        //Output: This will print backslashes: \\


    }
}
