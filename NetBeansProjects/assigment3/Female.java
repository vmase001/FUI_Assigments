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
public class Female extends Human {

    private String lastDegree;

    public Female(String name, int age, String lastDegree) {
        super(name, age);
        this.lastDegree = lastDegree;

        // throws exception for female
        if (age > 110.0) {
            throw new NotHumanBeingException("This Female is invalid");
        }
    }

    // abstract method get intelligence level implemented
    // method that calculates intelligence level for female
    public int getIntLevel() {
        String x = getLastDegree();
        switch (x) {
            case "Ph.D.":
                intLevel = 5;
                break;

            case "MS":
                intLevel = 4;
                break;

            case "BS":
                intLevel = 3;
                break;

            case "AA":
                intLevel = 2;
                break;

            default:
                intLevel = 1;
                break;
        }
        return intLevel;
    }

    // implements to string
    public String toString() {
        String out = super.toString();
        out += "\n\t Last Degree: " + lastDegree + '\n'
                + "\n\t Intelligence Level: " + getIntLevel() + '\n';
        return out;
    }

    // implements equals
    public boolean equals() {
        return false;
    }

    // getter for last degree
    public String getLastDegree() {
        return lastDegree;
    }

    // setter for last degree
    public void setLastDegree(String x) {
        lastDegree = x;
    }

}
