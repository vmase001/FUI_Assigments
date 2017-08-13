/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment5;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vicentemaselli
 */
public class Assigment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
// TODO code application logic here
        String inf = JOptionPane.showInputDialog("Input file?");
        // Input file is src/<name of the file>
        FileReader inFile = new FileReader(inf);
        Scanner in = new Scanner(inFile);
        LLS[] arr1 = new LLS[in.nextInt()];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new LLS();
        }
        String outf = JOptionPane.showInputDialog("Output file?");
        PrintWriter outFile = new PrintWriter(outf);
        while (in.hasNext()) {
            String line = in.next();

            switch (line) {

                case "A":
                    int x = in.nextInt();
                    int y = in.nextInt();
                    arr1[y].add(x);
                    break;

                case "R":
                    int t = in.nextInt();
                    int r = in.nextInt();
                    arr1[r].remove(t);
                    break;

                case "U":
                    arr1[in.nextInt()].union(arr1[in.nextInt()], arr1[in.nextInt()]);
                    break;

                case "N":
                    arr1[in.nextInt()].intersection(arr1[in.nextInt()], arr1[in.nextInt()]);
                    break;

                case "D":
                    try {
                        arr1[in.nextInt()].difference(arr1[in.nextInt()], arr1[in.nextInt()]);
                    } catch (NoSuchElementException e) {
                        String msg = e.getMessage();
                        outFile.println(msg);
                    }
                    break;

                case "B":
                    int h = in.nextInt();
                    int g = in.nextInt();
                    outFile.println(arr1[g].isMember(h));
                    break;

                case "O":
                    int m = in.nextInt();
                    outFile.println("Set  " + m + " contains: \n\t " + arr1[m].
                            toString());
                    break;

                case "E":
                    outFile.println(arr1[in.nextInt()].isEmpty());
                    break;

                case "Q":
                    outFile.println(arr1[in.nextInt()].equals(arr1[in.nextInt()]));
                    break;

                default:
                    break;
            }

        }
        outFile.close();



    }

}
