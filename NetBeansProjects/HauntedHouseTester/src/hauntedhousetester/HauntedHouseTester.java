// PANTHERID:  3914385
// CLASS: COP 2210 – [fall 2016]
// ASSIGNMENT # [3]
// DATE: [10/31/16]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************
package hauntedhousetester;

import javax.swing.*;

/**
 *
 * @author vicentemaselli
 */
public class HauntedHouseTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tester class ask user for name and uses methods in the class HauntedHouse

        ImageIcon house = new ImageIcon("/Users/vicentemaselli/NetBeansProjects/HauntedHouseTester/src/hauntedhousetester/IMages/American-Horror-Story-Roanoke-car.jpg");
        JOptionPane.showMessageDialog(null, "Welcome to the Roanoake Mansion", "House",
                JOptionPane.INFORMATION_MESSAGE, house);
        String userName = JOptionPane.showInputDialog(null, "What is your name?");
        ImageIcon intro = new ImageIcon("/Users/vicentemaselli/NetBeansProjects/"
                + "HauntedHouseTester/src/hauntedhousetester/IMages/Entrance .png");
        JOptionPane.showMessageDialog(null, "You are here", "Intro",
                JOptionPane.INFORMATION_MESSAGE, intro);
        int userInput = Integer.parseInt(JOptionPane.showInputDialog(userName
                + " enter 1 if you would like to explore living room, 2 for dinning "
                + "room or 3 for upstairs"));
        HauntedHouse house1 = new HauntedHouse(userInput);
        house1.setLocation();
        house1.getLocation();
        JOptionPane.showMessageDialog(null, "Thank You for playing " + userName);

    }

}
