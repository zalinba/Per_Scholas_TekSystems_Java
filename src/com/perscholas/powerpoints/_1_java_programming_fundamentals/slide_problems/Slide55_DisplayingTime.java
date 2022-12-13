package com.perscholas.powerpoints._1_java_programming_fundamentals.slide_problems;
//303.1.2 - Java Programming Fundamentals

/* Write a Java program to convert a total amount of
 * seconds to the hour, minute, and seconds.
 *
 *      Example case:
 *      Input seconds: 86399
 *      Output: 23:59:59
 */
public class Slide55_DisplayingTime {
    public static void main(String[] args) {
        /* 1 hour = 60 minutes or 3600 seconds
         * 1 minute = 60 seconds
         * one earth rotation cycle is 24 hours
         * or 1,440 minutes (24 * 60)
         * or 86400 seconds (1440 * 60).
         */
        int inputSeconds = 86399;
        int clockSeconds = inputSeconds % 60; //value is 59
        int part1ConvertingSecToMin = inputSeconds / 60; //value is 1439
        int part2ConvertingSecToMin =  part1ConvertingSecToMin % 60; //value is 59
        int clockHours = part1ConvertingSecToMin / 60; //value is 23

        System.out.println("PowerPoints solution to the " +
                "Display time problem. " + "\nSeconds: " + inputSeconds +
                "\n" + clockHours + ":" + part2ConvertingSecToMin + ":" + clockSeconds);

        int totalSecs = 86399;
        int hours = totalSecs / 3600; //converting seconds to hours
        int minutes = (totalSecs / 60) % 60 ; //converting seconds to minutes and
        //modulus gives us the remaining minutes
        int seconds = totalSecs % 60; //modulus gives us the remaining seconds

        System.out.println("\nAnother simple solution to the Display time problem"
                + "\nSeconds: " + totalSecs + "\n" + hours + ":" + minutes +
                ":" + seconds);

        /*

         */



    }
}
