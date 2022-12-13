package com.perscholas.lab._16_arraylist_of_user_defined_objects;
//Lab 303.7.3 ArrayList of User-Defined Objects

/* Since ArrayList supports generics, you can
 * create an ArrayList of any data type. It can
 * be of simple types such as Integer, String,
 * or Double, or complex types such as an ArrayList
 * of ArrayLists, an ArrayList of HashMaps, or an
 * ArrayList of any user-defined objects.
 *
 * In the following lab, you will learn how to
 * create an ArrayList of user-defined objects.
 * We will utilize Arraylist, constructors, getters,
 * and setters. This concept is very important for
 * future lectures such as DAO, Hibernate, and Spring Boot.
 *
 * Step 1: Create a new Java project and create a
 * new Class named "Book".
 */
public class Book {
    private  int number;
    private  String name;
    private String author;
    private  String category;
    // Constructor with arguments
    public Book(int number, String name, String author, String category)
    {
        this.name = name;
        this.category = category;
        this.author = author;
        this.number = number;
    }
    // Constructor without arguments
    public Book()
    {

    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

//The above is actually a POJO class for setter and getter.
}
