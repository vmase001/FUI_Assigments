/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Random;
//********************************************************************************
// PantherID:  3914385
// CLASS: COP 2210 – fall 2016
// ASSIGNMENT # 1
// DATE: 9/14/16
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************
/**
 *
 * @author vicentemaselli
 */
public class winAMillionBucks {

    /**
     * variables are defined
     */
     
    int fant1 = 0;
    int fant2 = 0;
    int fant3 = 0;
    int fant4 = 0;
    int fant5 = 0;
    int lot1 = 0;
    int lot2 = 0;
    int lot3 = 0;
    int lot4 = 0;
    int lot5 = 0;
    int lot6 = 0;
    
    
    
            
    
    public static void main(String[] args) {
        
        // fantasy5 random generator//
        // random variable defined//
        // range of numbers is 1-36//
     Random r = new Random();    	
int fant1 = 1 + r.nextInt(35);
int fant2 = 1 + r.nextInt(35);
int fant3 = 1 + r.nextInt(35);
int fant4 = 1 + r.nextInt(35);
int fant5 = 1 + r.nextInt(35);

        // lotto numbers randomly generated//
        // range of number is 1-53//
        
int lot1 = 1 + r.nextInt(52);
int lot2 = 1 + r.nextInt(52);
int lot3 = 1 + r.nextInt(52);
int lot4 = 1 + r.nextInt(52);
int lot5 = 1 + r.nextInt(52);
int lot6 = 1 + r.nextInt(52);

// printing out the random numbers//
System.out.println("Your winning Fantasy5 numbers are: ");
System.out.println(fant1 + "," + fant2 + "," + fant3 + "," + fant4 + "," + fant5 + ".");
System.out.println("Your winning Lotto numbers are: ");
System.out.println(lot1 + "," + lot2 + "," + lot3 + "," + lot4 + "," + lot5 + "," + lot6 + ".");
System.out.println("Goodluck!");
// dialog box to show user the winning numbers//
JOptionPane.showMessageDialog(null, "Your winning Fantasy5 numbers are: " + fant1 + "," + fant2 + "," + fant3 + "," + fant4 + "," + fant5 + ".");
JOptionPane.showMessageDialog(null, "Your winning Lotto numbers are: " + lot1 + "," + lot2 + "," + lot3 + "," + lot4 + "," + lot5 + "," + lot6 + ".");        
JOptionPane.showMessageDialog(null, "May the odds be ever in your favor!");        
        
        
    }
       
    
}
