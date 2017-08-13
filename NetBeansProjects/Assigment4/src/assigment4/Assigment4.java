/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment4;

/**
 *
 * @author vicentemaselli
 */
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Arrays;


public class Assigment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        
        String inf = JOptionPane.showInputDialog("Input file?");
        // Input file is src/<name of the file>
        FileReader inFile = new FileReader(inf);
        MyArray MA1 = new MyArray();
        Scanner in = new Scanner(inFile);
        String outf = JOptionPane.showInputDialog("Output file?");
        PrintWriter outFile = new PrintWriter(outf);

        outFile.println("The Size of Array MA1: " + MA1.get_Size());
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            MA1.add_Val(in.nextInt());
        }
        outFile.println("The Size of Array MA1: " + MA1.get_Size());
        outFile.println("Array 1:" + "\n" + MA1.toString());
        outFile.println("The Largest Element is: " + MA1.largestIndex());
        outFile.println("The Smallest Element is: " + MA1.smallIndex());
        outFile.println("The Sum of all the Elements is: " + MA1.sum());
        MyArray MA2 = new MyArray(MA1);
        outFile.println(MA1.equals(MA2));
        MA2.sort();
        outFile.println(MA1.equals(MA2));
        outFile.println("Array 2 after being Sorted: " + "\n" + MA2.toString());
        while (in.hasNext()) {
            outFile.println("The Element is in Position: " + MA2.search(in.nextInt()));
        }
        MA2.invert();
        outFile.println("Array 2 after inverted: " + "\n" + MA2);

        outFile.close();
    }

    // TODO code application logic here



        

}

