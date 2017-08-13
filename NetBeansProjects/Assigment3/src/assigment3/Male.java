/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment3;



/**
 *
 * @author vicentemaselli
 */
public class Male extends Human {

    private double height;
    private double weight;

    public Male(String name, int age, double height, double weight) {
        super(name, age);
        this.height = height;
        this.weight = weight;

        // throws exception for male
        if (weight >= 400.0 && height >= 100.0) {
            throw new NotHumanBeingException("This Male is invalid");
        }

    }

    // getter for height
    public double getHeight() {
        return height;
    }

    // getter for weight
    public double getWeight() {
        return weight;
    }

    //setter for height
    public void setHeight(double x) {
        height = x;
    }

    //setter for weight
    public void setWeight(double x) {
        weight = x;
    }

    // abstract method get intelligence level implemented
    //method that calculates intelligence level for male with 
    public int getIntLevel() {
        int z = getAge();
        double x = getWeight();
        double y = getHeight();
        if ((z > 40) || (x >= 150.0 && y > 70.0)) {
            intLevel = 5;
        } else if (z < 5) {
            intLevel = 1;
        } else if (x > 50.0 && x < 119.0) {
            intLevel = 3;
        } else if (x > 120.0 && x < 149.0 && y > 55.0 && y < 69.0) {
            intLevel = 2;
        } else if (x > 120.0 && x < 149.0 && y > 70.0) {
            intLevel = 4;
        } else {
            intLevel = 3;
        }

        return intLevel;
    }

    // implements to string
    public String toString() {
        String out = super.toString();
        out += "\n\t Height: " + height + '\n' + "\n\t Weight: " + weight + '\n'
                + "\n\t Intelligence Level: " + getIntLevel() + '\n' + '\n';
        return out;
    }

    // implements equals
    public boolean equals() {
        return false;
    }

}
