package com.perscholas.lab.corejava_operators;
//Lab 303.1.2

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        int age = 18;
        String result = age < 100 ? "Less than 100" : "Greater than 100";

        System.out.println(result);
        //output:Less than 100
    }
}
