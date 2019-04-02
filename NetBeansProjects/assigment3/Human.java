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
public class Human extends Creatures implements Comparable <Human> {
    
    private int age;
    private String name;

    // human being constructor
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        

    }

    // setter for age
    public void setAge(int x) {
        age = x;
    }

    // setter for name
    public void setName(String x) {
        name = x;
    }

    //getter for age
    public int getAge() {
        return age;
    }

    //getter for name
    public String getName() {
        return name;
    }

    // abstract method get intelligence level implemented
    public int getIntLevel() {
        return intLevel;
    }

    // implements to string
    public String toString() {
        String out = getClass().getName();
        out += ":\n\t Name: " + name + '\n' + "\n\t Age: " + age + '\n';
        return out;
    }

    // implements equals
    public boolean equals() {
        return false;
    }
    
    // comparable implementation that compares two humans by name
    public int compareTo(Human h1) {
        
        return this.name.compareTo(h1.getName());
    }
    
}
