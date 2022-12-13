package com.perscholas.assignments._1_core_java_variables;
import java.text.DecimalFormat;

//Lab 303.1.2 Practice Assignment Core Java Variables

/*                  Problem 8
 * Write a program where you create 3 variables that
 * represent products at a café. The products could
 * be beverages like coffee, cappuccino, espresso,
 * green tea, etc. Assign prices to each product.
 * Create 2 more variables called subtotal and totalSale
 * and complete an “order” for 3 items of the first product,
 * 4 items of the second product, and 2 items of the third
 * product. Add them all together to calculate the subtotal.
 * Create a constant called SALES_TAX and add sales tax to
 * the subtotal to obtain the totalSale amount. Be sure to
 * format the results to 2 decimal places.
 */
public class Problem8 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("'$'0.00");
        double coffee, water, tea, subtotal, totalSale;
        final double SALES_TAX;

        coffee = 1.00;
        water = 1.00;
        tea = 1.00;

        subtotal = coffee * 3 + water * 4 + tea * 2;
        SALES_TAX = 0.10 * subtotal;
        totalSale = subtotal + SALES_TAX;

        System.out.println("The total sale amount is " + df.format(totalSale));
    }
}
