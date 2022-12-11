package com.perscholas.lab.corejava_operators;
//Lab 303.1.2

public class AssignmentOperatorsDemo {
    public static void main(String[] args) {

        //Assigning primitive values
        int j, k; //Declaring primitive variables j and k
        j = 10; //Initializing j variable with the value 10
        j = 5;  //j gets the value 5. The previous value is overwritten
        k = j; //Initializing k variable and gets the value 5

        System.out.println("j is : " + j);
        //output: j is : 5

        System.out.println("k is : " + k);
        //output: k is : 5

        //Multiple Assignments
        k = j = 10; //(k = (j = 10))

        System.out.println("j is : " + j);
        //output: j is : 10

        System.out.println("k is : " + k);
        //output: k is 10



    }

}
