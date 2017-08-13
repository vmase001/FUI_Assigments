/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktester;

/**
 *
 * @author vicentemaselli
 */
public class Book {

    private String title;
    private double basePrice;

    //constructor for book class uses parameters title and base price
    public Book(String title, double basePrice) {
        this.title = title;
        this.basePrice = basePrice;
    }

    // overrides object toString method and returns book title and base price
    public String toString() {
        String out = getClass().getName();
        out += ":\n\t Title: " + title + '\n' + "\n\t Base price: " + basePrice
                + '\n';
        return out;
    }

    // overrides object equals method and compares parameter other to book and 
    //casts it to book if possible
    public boolean equals(Object other) {
        if (other instanceof Book) {
            Book abc = (Book) other;

            if (!title.equals(abc.getTitle())) {
                return false;
            } else {
                return true;
            }

        } else {
            return false;
        }

    }

    // accessor method to get title of book
    public String getTitle() {
        return title;

    }

    // accessor method to return base price of book
    public double getBasePrice() {
        return basePrice;
    }

    // method that allows user to alter the base price
    public void setBasePrice(double x) {
        basePrice = x;
    }
}
