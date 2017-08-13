/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author vicentemaselli
 */
public class DoorTester {
    public static void main(String[] args){
        door frontDoor = new door("front", "open");
        System.out.println("The front door is " + frontDoor.getState());
        System.out.println("Expected: open");
        door backDoor = new door("Back", "closed");
        System.out.println("The back door is " + backDoor.getState());
        System.out.println("Expected: closed");
        // use mutator to change the state variable
        backDoor.setState("open");
        System.out.println("the back door is " + backDoor.getState());
        System.out.println("Expected: open");
        // add code to test the setName mutator here
        door sideDoor = new door("side", "close");
        System.out.println("The side door is "+ sideDoor.getState());
        System.out.println("Expected: close");
        sideDoor.setState("open");
        System.out.println("The side door is "+ sideDoor.getState());
        System.out.println("Expected: open");

        
    }
}
