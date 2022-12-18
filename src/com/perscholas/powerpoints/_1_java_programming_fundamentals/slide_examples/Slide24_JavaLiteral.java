package com.perscholas.powerpoints._1_java_programming_fundamentals.slide_examples;
//PowerPoint 303.1.2 - Java Programming Fundamentals

public class Slide24_JavaLiteral {
    /* A literal is a number, text, or other information
     * that directly represents a value.
     *      - A literal is not a value of any type that we read
     *        from the console, a file, or any other information source.
     *
     * Literal is a programming term that essentially means that
     * what we type is what we get. The following assignment statement uses a literal:
     *
     *          int radius = 20;
     *
     * The literal is 20, because it directly represents the integer value 20.
     * Numbers, characters, and strings can all be represented as literals.
     */
    public static void main(String[] args) {
        int radius = 20;
        System.out.println("The int variable \'radius\' is an example of a literal."
                            + "\nIt has a literal value of " + radius +
                            ", \nbecause it directly represents the integer value "
                            + radius);

    }
}
