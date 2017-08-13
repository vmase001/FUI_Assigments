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
public class Novel extends Book {

    private String type;
    private Double markUp;
    private double actualPrice;

    public Novel(String title, double basePrice, String type, double markUp) {
        super(title, basePrice);
        this.type = type;
        this.markUp = markUp;

    }

    //overrides the object toString method and calls the super toString while 
    //returning type and mark up
    public String toString() {
        String out = super.toString();
        out += "\n\t Type: " + type + '\n' + "\n\t Mark up: " + markUp + '\n'
                + "\n\t Marked Up Price: " + markedUpPrice() + '\n';
        return out;
    }

    // overrides object equals method and compares parameter other to novel and 
    //casts it to novel if possible
    public boolean equals(Object other) {
        if (other instanceof Novel) {
            Novel abc = (Novel) other;

            if ((super.equals(abc)) && (type.equals(abc.getType()))) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }

    // accessor method that returns type
    public String getType() {
        return type;
    }

    // method that calls the super gettitle method to return title of the 
    //novel
    public String getTitle() {
        return super.getTitle();

    }

    //method that calls the super getbaseprice method to return the base 
    //price of the novel
    public double getBasePrice() {
        return super.getBasePrice();
    }

    // method that returns mark up % to user as a double
    public double getMarkUp() {
        return markUp;
    }

    // method that changes the mark up value
    public void setMarkUp(double x) {
        markUp = x / 100;
    }

    // method that calculates and returns the actual cost of the novel
    public double markedUpPrice() {
        this.actualPrice = (super.getBasePrice() * (markUp/100))
                + super.getBasePrice();
        return actualPrice;
    }

}
