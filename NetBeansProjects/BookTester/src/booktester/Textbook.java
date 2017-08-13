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
public class Textbook extends Book {

    private String field;
    private double discount;
    private double actualPrice;

    // constructor for textbook class that calls the constructor of the super 
    //class
    public Textbook(String title, double basePrice, String field, double 
            discount) {
        super(title, basePrice);
        this.field = field;
        this.discount = discount;

    }

    //overrides the object toString method and calls the super method while 
    //returning field and discount
    public String toString() {
        String out = super.toString();
        out += "\n\t Field: " + field + '\n' + "\n\t Discount: " + discount
                + '\n' + "\n\t Actual Price: " + actualPrice() + '\n';
        return out;
    }

    // overrides object equals method and compares parameter other to textbook 
    //and casts it to textbook if possible
    public boolean equals(Object other) {
        if (other instanceof Textbook) {
            Textbook abc = (Textbook) other;

            if ((super.equals(abc)) && field.equals(abc.getField())) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }

    // method that returns the field
    public String getField() {
        return field;

    }

    // method that calls the super and returns the textbook title
    public String getTitle() {
        return super.getTitle();
    }

    // method that returns the discount amount
    public double getDiscount() {
        return discount;
    }

    // method that sets the discount
    public void setDiscount(double x) {
        discount = x / 100;
    }

    // method that returns the actual price of the textbook with the discount
    public double actualPrice() {
        actualPrice = super.getBasePrice() - ((super.getBasePrice() * 
                (discount/100)));
        return actualPrice;
    }

}
