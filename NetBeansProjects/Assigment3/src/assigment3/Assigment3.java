/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author vicentemaselli
 */
public class Assigment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        String inf = JOptionPane.showInputDialog("Input file?");
        // Input file is src/<name of the file>
        FileReader inFile = new FileReader(inf);
        Scanner in = new Scanner(inFile);
        List<Human> persons = new ArrayList<>();
        int maxMales = 0;
        int maxFemales = 0;
        Male[] males = new Male[16];
        // 16 was assigned due to no specific number given and to avoid null 
        //pointer exception when sorting array , instructed to set array length 
        //to make the program run
        Female[] females = new Female[12];
        // 12 was assigned due to no specific number given and to avoid null
        //pointer exception when sorting array, instructed to set array length 
        //to make the program run
        String outf = JOptionPane.showInputDialog("Output file?");
        PrintWriter outFile = new PrintWriter(outf);

        while (in.hasNext()) {
            String line = in.next();

            // switch statement 
            switch (line) {
                case "M":
                    // try catch statement that checks if human is valid else 
                    //sends exception
                    try {
                        Male z = new Male(in.next(), in.nextInt(),
                                in.nextDouble(), in.nextDouble());
                        persons.add(z);
                        males[maxMales] = z;
                        maxMales++;
                    } catch (NotHumanBeingException e) {
                        String msg = e.getMessage();
                        outFile.println(msg);
                    }

                    break;

                case "F":
                    // try catch statement that checks if human is valid else 
                    //sends exception
                    try {
                        Female x = new Female(in.next(), in.nextInt(),
                                in.next());
                        persons.add(x);
                        females[maxFemales] = x;
                        maxFemales++;
                    } catch (NotHumanBeingException e) {
                        String msg = e.getMessage();
                        outFile.println(msg);
                    }
                    break;

                default:
                    break;

            }

        }
        // prints the arraylist unsorted then sorted
        outFile.println("The unsorted Persons ArrayList: " + '\n' + persons.toString());
        Collections.sort(persons);
        outFile.println("The sorted Persons ArrayList: " + '\n' + persons);
        // prints male array unsorted then sorted
        outFile.println("The unsorted Males Array: " + '\n' + Arrays.toString(males));
        Arrays.sort(males, new MalesComparator());
        outFile.println("The sorted Males Array: " + '\n' + Arrays.toString(males));
        // prints out female array unsorted then sorted
        outFile.println("The unsorted Females Array: " + '\n' + Arrays.toString(females));
        Arrays.sort(females, new FemalesComparator());
        outFile.println("The sorted Females Array: " + '\n' + Arrays.toString(females));
        
        
        outFile.close();
        
    }
        
}
