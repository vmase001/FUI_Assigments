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
public class NotHumanBeingException extends RuntimeException {
    // exception that shows message when invalid human is created
    public NotHumanBeingException(){
        
    }
    
    public NotHumanBeingException(String message){
        super(message);
    }
}
