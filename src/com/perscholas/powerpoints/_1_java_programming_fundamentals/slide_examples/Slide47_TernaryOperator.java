package com.perscholas.powerpoints._1_java_programming_fundamentals.slide_examples;
//PowerPoint 303.1.2 - Java Programming Fundamentals

public class Slide47_TernaryOperator {
    /* The ternary operator is a shorthand version of the if-else statement.
     * It has three operands; hence the name ternary. The name ternary prefers
     * to the fact that the operator takes three operands.
     *
     * General format is: condition ? exprTrue : exprFalse;
     *
     * The above statement means that if the condition evaluates to true,
     * then execute the expression after the “?,” else execute the expression
     * after the “:,”
     */
    public static void main(String[] args) {
        //regular if statement
        int age = 18;
        String result;
        if(age < 100){
            result = "Less than 100";
        }else {
            result = "Greater than 100";
        }
        System.out.println(result);

        //ternary operator
        int personAge = 18;
        String sum = personAge < 100 ?
                "Less than 100" : "Greater than 100";
        System.out.println(sum); //Less than 100

    }
}
