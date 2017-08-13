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
public class UsedNovel extends Novel {

    private int howOld;
    private double actualPrice;

    // constructor for used novels that calls the super book and novel classes
    public UsedNovel(String title, double basePrice, String type, double markUp,
            int howOld) {
        super(title, basePrice, type, markUp);
        this.howOld = howOld;

    }

    //overrides the object toString method and calls the super toString while 
    //returning how old
    public String toString() {
        String out = super.toString();
        out += "\n\t Age: " + howOld + " year(s) old" + "\n"
                + "\n\t Discounted Price: " + discountedPrice() + '\n';
        return out;
    }

    // overrides object equals method and compares parameter other to used novel 
    // and casts it to used novel if possible
    public boolean equals(Object other) {
        if (other instanceof UsedNovel) {
            UsedNovel abc = (UsedNovel) other;

            if ((super.equals(abc)) && (Math.abs(actualPrice - abc.actualPrice)
                    < 1.0)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }

    // method that returns book age
    public int getAge() {
        return howOld;
    }

    // method that calls the super and returns used novel title
    public String getTitle() {
        return super.getTitle();
    }

    // method that calls the super and returns base price
    public double getBasePrice() {
        return super.getBasePrice();
    }

    // method that sets the used novels age
    public void setAge(int x) {
        howOld = x;
    }

    // method that returns the discounted price of the used novel with the age 
    // discount calculated inside the method
    public double discountedPrice() {
        double discount;
        if (getAge() < 5) {
            discount = 0.05;
        } else if ((getAge() >= 5) && (getAge() < 10)) {
            discount = 0.10;
        } else {
            discount = 0.15;
        }
        actualPrice = super.getBasePrice() - (super.getBasePrice() * discount);
        return actualPrice;
    }
}
