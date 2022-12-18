package com.perscholas.powerpoints._1_java_programming_fundamentals.slide_examples;
//PowerPoint 303.1.2 - Java Programming Fundamentals

public class Slide61_TypeCasting {
    public static void main(String[] args) {
        byte i = 40;
        // No casting needed for below conversion
        short j = i;
        int k = j;
        long l = k;
        float m = l;
        double n = m;
        System.out.println("byte value : "+i);
        System.out.println("short value : "+j);
        System.out.println("int value : "+k);
        System.out.println("long value : "+l);
        System.out.println("float value : "+m);
        System.out.println("double value : "+n);

       short s = (short) k;
        System.out.println(s);
        char c = (char)(k);
        System.out.println(c);
        float f = 1.5e3f;
        k = (int)f; // Explicit - ok
       // k = f  Not Allowed - narrowing

        byte b = 50;
        //b = (byte) b*2;
        b = (byte) ((byte) b*2);

    }
}
