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
public class door { // door class
   
  private  String state; // private variable
  private String name; // private variable 
   
  public void open(){ // object operator
      state = "close";

  
  }
  
  public void close(){ // obejct operator 
      state = "open";
 
  }
  
  public door (String name, String state){ // door object constructor 
      
      this.name = name;
      this.state = state;
      
      
      
      
  }
  
  public String getName(){  // accessor method for name
      return name;
      
  }
  
  public String getState(){ // accessor method for state
      return state;
      
  }

  public void setName(String newName){ // mutator method for name
      name = newName;
      
  }
  
  public void setState(String newState){ // mutator method for state
      state = newState;
      
  }
 
  
  
  
     
     
 
 
 }


