package com.perscholas.lab._14_generic_method_and_class.example2;
//Lab 303.7.1 Generic Method and Class

/* Generic Class
 * A class can have more than one type parameter.
 * In this case, the type parameters are separated
 * by a comma.
 *
 * For the demonstration, we will initialize two
 * type parameters  in the Generic class. The names
 * of the parameter types will be Datatypeone and
 * DatatypeTwo, but these are only names. You are
 * free to use “X” or “Z,” or any other identifier
 * to name parameters.
 *
 * Create a class named GMultipleDatatype
 */
public class GMultipleDatatype <Datatypeone, DatatypeTwo>  {
    Datatypeone valueOne;
    DatatypeTwo valueTwo;

    public GMultipleDatatype(Datatypeone v1, DatatypeTwo v2)
    {
        this.valueOne = v1;
        this.valueTwo = v2;
    }

    public Datatypeone getValueOne() {
        return valueOne;
    }

    public void setValueOne(Datatypeone valueOne) {
        this.valueOne = valueOne;
    }

    public DatatypeTwo getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(DatatypeTwo valueTwo) {
        this.valueTwo = valueTwo;
    }

}
