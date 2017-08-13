/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hauntedhousetester;

import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author vicentemaselli
 */
public class HauntedHouse {
// variables are declared and initialized to a designated integer
    private int livingRoom = 1;
    private int diningRoom = 2;
    private int upStairs = 3;
    private int bathroomDown = 4;
    private int kitchen = 5;
    private int fridge = 6;
    private int pantry= 7;
    private int bedroom1 = 8;
    private int bedroom2 = 9;
    private int masterBedroom = 10;
    private int bathroomUp = 11;
    private int masterBathroom = 12;
    private int refrigerator = 13;
    private int cabinet = 14;
    private int recipeBox = 15;
    private int broom = 16;
    private int bathroomMirror = 17;
    private int bathroomShower = 18;
    private int rockingChair = 19;
    private int window = 20;
    private int dollHouse = 21;
    private int dresser = 22;
    private int jewelryBox = 23;
    private int oilLamp = 24;
    private int masterShower = 25;
    private int candelabra = 26;
    private int chest = 27;
    
    
    private String location = "downstairs";
    private int userInput;

    // 
    public HauntedHouse(int userNum)  {
        this.userInput = userNum;
    
    }
    
    public HauntedHouse(String userLocation){
        this.location = userLocation;
    }
    

    HauntedHouse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //images of ending map location
    ImageIcon bloodFace = new ImageIcon("/Users/vicentemaselli/NetBeansProjects/"
            + "HauntedHouseTester/src/hauntedhousetester/IMages/bathroom scary face.jpg");
    ImageIcon shower = new ImageIcon("/Users/vicentemaselli/NetBeans"
                                + "Projects/HauntedHouseTester/src/hauntedhousetester/IMages/steam.jpg");
    ImageIcon livingEnd = new ImageIcon("/Users/vicentemaselli/NetBeansProjects/"
            + "HauntedHouseTester/src/hauntedhousetester/IMages/LivingRoomEnd.png");
    ImageIcon diningEnd = new ImageIcon("/Users/vicentemaselli/NetBeansProjects/"
            + "HauntedHouseTester/src/hauntedhousetester/IMages/DiningEnd .png");
    ImageIcon kitchenEnd = new ImageIcon("/Users/vicentemaselli/NetBeansProjects/"
            + "HauntedHouseTester/src/hauntedhousetester/IMages/KitchenEnd.png");
    ImageIcon bed1 = new ImageIcon("/Users/vicentemaselli/NetBeansProjects/"
            + "HauntedHouseTester/src/hauntedhousetester/IMages/Bed1End.png");
    ImageIcon bathUp = new ImageIcon("/Users/vicentemaselli/NetBeansProjects/"
            + "HauntedHouseTester/src/hauntedhousetester/IMages/Bathroom 2.png");
    ImageIcon bed2 = new ImageIcon("/Users/vicentemaselli/NetBeansProjects/"
            + "HauntedHouseTester/src/hauntedhousetester/IMages/Bed 2End.png");
    ImageIcon masterbed = new ImageIcon("/Users/vicentemaselli/NetBeansProjects/"
            + "HauntedHouseTester/src/hauntedhousetester/IMages/MasterBedEnd.png");
    ImageIcon masterbath = new ImageIcon("/Users/vicentemaselli/NetBeansProjects/"
            + "HauntedHouseTester/src/hauntedhousetester/IMages/MasterBATHEnd.png");
    ImageIcon bathDown = new ImageIcon("/Users/vicentemaselli/NetBeansProjects/"
            + "HauntedHouseTester/src/hauntedhousetester/IMages/Bathroom1 End.png");
    ImageIcon pantryend = new ImageIcon("/Users/vicentemaselli/NetBeansProjects/"
            + "HauntedHouseTester/src/hauntedhousetester/IMages/Pantry.png");
    
    // setter to set location of user based user input
    public void setLocation() {
        // nested if staments based on if users chooses to stay downstairs or upstairs
        if (userInput == 1) {
            location = "living Room";
            userInput = Integer.parseInt(JOptionPane.showInputDialog("where do "
                    + "you want to go? enter 27 to view the chest or 4 for "
                    + "bathroom mirror"));
 
           
            if (userInput == 27){
                location = "living Room chest";
                
                ImageIcon chest = new ImageIcon("/Users/vicentemaselli/NetBeans"
                        + "Projects/HauntedHouseTester/src/hauntedhousetester/IMages/chest.jpg");
                JOptionPane.showMessageDialog(null,"You opened the chest and a "
                        + "ghost scared you death!","chest",
                JOptionPane.INFORMATION_MESSAGE,chest);
                JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","living room",
                JOptionPane.INFORMATION_MESSAGE,livingEnd);
            }
            if (userInput == 4) {
                location = "Bathroom downstairs mirror";
                
                JOptionPane.showMessageDialog(null,"The mirror unveils a scary "
                        + "face that kills you to death","bloodyFace",
                JOptionPane.INFORMATION_MESSAGE,bloodFace);
                JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","bathroom 1",
                JOptionPane.INFORMATION_MESSAGE,bathDown);
                
            }
        }
        if (userInput == 2) {
            location = "Dining Room";
            userInput = Integer.parseInt(JOptionPane.showInputDialog("where do "
                    + "you want to go? enter 26 to view the Candelabra or 5 to go "
                    + "to the kitchen"));
             
        
            if (userInput == 26){
                location = "Dining Room Candelabra";
                ImageIcon candelabra1 = new ImageIcon("/Users/vicentemaselli/"
                        + "NetBeansProjects/HauntedHouseTester/src/hauntedhousetester/IMages/candelabra.jpg");
                JOptionPane.showMessageDialog(null,"The Candelabra lights up and "
                        + "scares you to death!","Candelabra",
                JOptionPane.INFORMATION_MESSAGE,candelabra1);
                JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","dining room",
                JOptionPane.INFORMATION_MESSAGE,diningEnd);
            }
            if (userInput == 5){
                location = "Kitchen";
                userInput = Integer.parseInt(JOptionPane.showInputDialog("where "
                        + "do you explore? "
                    + "enter 13 to view the fridge, 14 to view the cabinet or 7 "
                    + "to check the pantry"));
            
                if (userInput == 13){
                    location = "Fridge";
                    ImageIcon food = new ImageIcon("/Users/vicentemaselli/NetBeans"
                            + "Projects/HauntedHouseTester/src/hauntedhousetester/IMages/sould food.jpg");
                     JOptionPane.showMessageDialog(null,"you found a delicious "
                             + "plate of chicken unfortunately it was poisonous","Food",
                    JOptionPane.INFORMATION_MESSAGE,food);
                     JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","kitchen room",
                JOptionPane.INFORMATION_MESSAGE,kitchenEnd);
                }
                if (userInput == 14){
                    location = "Cabinet";
                    ImageIcon dishes = new ImageIcon("/Users/vicentemaselli/NetBeans"
                            + "Projects/HauntedHouseTester/src/hauntedhousetester/IMages/creepy plates.jpg");
                     JOptionPane.showMessageDialog(null,"The plates are flying "
                             + "off the walls and one hits you in the head and kills you","Dishes",
                JOptionPane.INFORMATION_MESSAGE,dishes);
                     JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","kitchen room",
                JOptionPane.INFORMATION_MESSAGE,kitchenEnd);
                }
                if (userInput == 7){
                    location = "Pantry";
                    userInput = Integer.parseInt(JOptionPane.showInputDialog("which one "
                    + "do you wanna view? enter 16 for the broom or 15 for the recipe "
                    + "box"));
                 
                    if (userInput == 16){
                        location = "Pantry Broom";
                        ImageIcon broom = new ImageIcon("/Users/vicentemaselli/NetBeans"
                                + "Projects/HauntedHouseTester/src/hauntedhousetester/IMages/broom.jpg");
                         JOptionPane.showMessageDialog(null,"The broom levetated and"
                                 + " hit you in the head and killed you","Broom",
                JOptionPane.INFORMATION_MESSAGE,broom);
                         JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","pantry",
                JOptionPane.INFORMATION_MESSAGE,pantryend);
                    }
                    if (userInput == 15){
                        location = "Recipe Box";
                        ImageIcon cake = new ImageIcon("/Users/vicentemaselli/NetBeans"
                                + "Projects/HauntedHouseTester/src/hauntedhousetester/IMages/chocolate cake.jpeg");
                         JOptionPane.showMessageDialog(null,"A devilish cake pops out and eats you!","Cake",
                JOptionPane.INFORMATION_MESSAGE,cake);
                         JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","pantry",
                JOptionPane.INFORMATION_MESSAGE,pantryend);
                    }
                }
            }
        }            
        if (userInput == 3){
            location = "Upstairs";
            userInput = Integer.parseInt(JOptionPane.showInputDialog("you chose "
                    + "to go upstairs, enter 8 to check out bedroom 1, enter 9 for bedroom 2, "
                    + "or 10 to go to the master bedroom"));
        
            if (userInput == 8){
                location = "Bedroom 1";
                userInput = Integer.parseInt(JOptionPane.showInputDialog("this is bedroom 1 "
                    + "enter 20 to look out the window, 19 to view the rocking chair, "
                    + "or 15 to check out the bathroom"));
            
                if (userInput == 20){
                    location = "Bedroom window";
                    ImageIcon swing = new ImageIcon("/Users/vicentemaselli/NetBeans"
                            + "Projects/HauntedHouseTester/src/hauntedhousetester/IMages/swing.jpg");
                    JOptionPane.showMessageDialog(null,"A girl in a swing disappears "
                            + "and scares you to death","Swing",
                JOptionPane.INFORMATION_MESSAGE,swing);
                    JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","bedroom 1",
                JOptionPane.INFORMATION_MESSAGE,bed1);
                    
                }
                if (userInput == 19){
                    location = "Rocking Chair";
                    ImageIcon chair = new ImageIcon("/Users/vicentemaselli/NetBeans"
                            + "Projects/HauntedHouseTester/src/hauntedhousetester/IMages/rocking chair.jpg");
                     JOptionPane.showMessageDialog(null,"A rocking chair rocking "
                             + "on its own scares you to death!","Chair",
                JOptionPane.INFORMATION_MESSAGE,chair);
                     JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","bedroom 1",
                JOptionPane.INFORMATION_MESSAGE,bed1);
                }
                if (userInput == 15){
                    location = "Upstairs Bathroom";
                    userInput = Integer.parseInt(JOptionPane.showInputDialog("you chose "
                    + "the bathroom, enter 17 to look at the mirror or 18 to check "
                    + "the shower"));
                
                    if (userInput == 17){
                        location = "Bathroom Mirror";
                        JOptionPane.showMessageDialog(null,"The mirror unveils a scary "
                        + "face that kills you to death","bloodyFace",
                JOptionPane.INFORMATION_MESSAGE,bloodFace);
                        JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","bathroom 2",
                JOptionPane.INFORMATION_MESSAGE,bathUp);
                        
                         
                    }
                    if (userInput == 18){
                        location = "Bathroom Shower";
                        
                         JOptionPane.showMessageDialog(null,"The bathroom suddenly "
                                 + "steams up and the words Help Me appear in the "
                                 + "mirror which causes you a heart attack","Shower",
                JOptionPane.INFORMATION_MESSAGE,shower);
                          JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","bathroom 2",
                JOptionPane.INFORMATION_MESSAGE,bathUp);
                    }
                }
            }
        
            if (userInput == 9){
                location = "Bedroom 2";
                userInput = Integer.parseInt(JOptionPane.showInputDialog("you chose "
                    + "bedroom 2, enter 22 to check the dresser, 21 to check the "
                    + "dollhouse, or 11 to check the bathroom"));
            
                if (userInput == 22){
                    location = "Bedroom Dresser";
                    ImageIcon ghost = new ImageIcon("/Users/vicentemaselli/NetBeans"
                            + "Projects/HauntedHouseTester/src/hauntedhousetester/IMages/ghost flying.jpg");
                     JOptionPane.showMessageDialog(null,"A ghost flies out the dresser and scares you to death","Ghost",
                JOptionPane.INFORMATION_MESSAGE,ghost);
                     JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","bedroom 2",
                JOptionPane.INFORMATION_MESSAGE,bed2);
                }
                if (userInput == 21){
                    location = "Bedroom Dollhouse";
                    ImageIcon dolls = new ImageIcon("/Users/vicentemaselli/NetBeans"
                            + "Projects/HauntedHouseTester/src/hauntedhousetester/IMages/dolls.jpg");
                     JOptionPane.showMessageDialog(null,"Dolls start dancing on their own and then stab you to death","Dolls",
                JOptionPane.INFORMATION_MESSAGE,dolls);
                     JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","bedroom 2",
                JOptionPane.INFORMATION_MESSAGE,bed2);
                }
                if (userInput == 11){
                    location = "Upstairs Bathroom";
                    userInput = Integer.parseInt(JOptionPane.showInputDialog("this "
                    + "is the bathroom, enter 17 to view the mirror or 18 to "
                    + "check the shower"));
                
                    if (userInput == 17){
                        location = "Bathroom Mirror";
                        JOptionPane.showMessageDialog(null,"The mirror unveils a scary "
                        + "face that kills you to death","bloodyFace",
                JOptionPane.INFORMATION_MESSAGE,bloodFace);
                        JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","bathroom 2",
                JOptionPane.INFORMATION_MESSAGE,bathUp);
                        
                    }
                    if (userInput == 18){
                        location = "Bathroom Shower";
                        JOptionPane.showMessageDialog(null,"The bathroom suddenly "
                                 + "steams up and the words Help Me appear in the "
                                 + "mirror which causes you a heart attack","Shower",
                JOptionPane.INFORMATION_MESSAGE,shower);
                        JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","bathroom 2",
                JOptionPane.INFORMATION_MESSAGE,bathUp);
                    } 
                }
            }
            if(userInput == 10){
                location = "Master bedroom";
                userInput = Integer.parseInt(JOptionPane.showInputDialog("welcome "
                    + "to the master bedroom, enter 23 to view the jewlery box or "
                    + "12 to enter the master bathroom"));
            
                if (userInput == 23){
                    location = "Jewelery Box";
                    ImageIcon jewel = new ImageIcon("/Users/vicentemaselli/NetBeans"
                            + "Projects/HauntedHouseTester/src/hauntedhousetester/IMages/diamond.jpeg");
                    JOptionPane.showMessageDialog(null,"You found the diamond! congrats you won!","jewel",
                JOptionPane.INFORMATION_MESSAGE,jewel);
                    JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","master bedroom",
                JOptionPane.INFORMATION_MESSAGE,masterbed);
                }
                if (userInput == 12){
                    location = "Master Bathroom";
                    userInput = Integer.parseInt(JOptionPane.showInputDialog("this "
                    + "is the master bathroom enter 25 to check the shower or 24 "
                    + "to view the lamp"));
                
                    if (userInput == 25){
                        location = "Shower";
                        ImageIcon music = new ImageIcon("/Users/vicentemaselli/NetBeans"
                                + "Projects/HauntedHouseTester/src/hauntedhousetester/IMages/music.jpg");
                        JOptionPane.showMessageDialog(null,"An eerie music plays and scares you to death!","Music",
                JOptionPane.INFORMATION_MESSAGE,music);
                        JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","master bathroom",
                JOptionPane.INFORMATION_MESSAGE,masterbath);
                    }
                    if( userInput == 24){
                        location = "lamp";
                        ImageIcon lamp = new ImageIcon("/Users/vicentemaselli/NetBeans"
                                + "Projects/HauntedHouseTester/src/hauntedhousetester/IMages/genie lamp.jpg");
                        JOptionPane.showMessageDialog(null,"You summoned a genie and "
                                + "he grants you a wish but in return takes your soul","Lamp",
                JOptionPane.INFORMATION_MESSAGE,lamp);
                        JOptionPane.showMessageDialog(null,"This is where you last ended "
                        + "","master bathroom",
                JOptionPane.INFORMATION_MESSAGE,masterbath);
                    }
                }
            }
        }
    
                    

       
    }
    // getter for getting location of the user with each outcome
    public String getLocation (){
        return location;
        
    }
}
