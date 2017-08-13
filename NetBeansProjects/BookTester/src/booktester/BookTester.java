/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktester;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author vicentemaselli
 */
public class BookTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        // TODO code application logic here
        String inf = JOptionPane.showInputDialog("Input file?");
        // Input file is src/<name of the file>
        FileReader inFile = new FileReader(inf);
        Scanner in = new Scanner(inFile);
        int z = in.nextInt();
        ArrayList<Book> library = new ArrayList<>(z);
        
        String outf = JOptionPane.showInputDialog("Output file?");
        PrintWriter outFile = new PrintWriter(outf);
       

        while (in.hasNext()) {
            String line = in.next();
            if (line.startsWith("/")) {
                in.nextLine();
            }
            // switch statement for transactions

            switch (line) {
                case "Book":

                    library.add(new Book(in.next(), in.nextDouble()));
                    
                    break;

                case "Novel":

                    library.add(new Novel(in.next(), in.nextDouble(),
                            in.next(), in.nextDouble()));
                    
                    break;

                case "UsedNovel":

                    library.add(new UsedNovel(in.next(), in.nextDouble(),
                            in.next(), in.nextDouble(), in.nextInt()));
                    
                    break;

                case "TextBook":

                    library.add(new Textbook(in.next(), in.nextDouble(),
                            in.next(), in.nextDouble()));
                    
                    break;

                case "E":

                    outFile.println(library.get(in.nextInt()).equals(library.
                            get(in.nextInt())));
                    
                    break;

                case "M":

                    ((Novel) library.get(in.nextInt())).setMarkUp(in.
                            nextDouble());
                    
                    break;

                case "C":

                    outFile.println(library.get(in.nextInt()).getBasePrice());
                    
                    break;

                case "O":

                    outFile.println(library.get(in.nextInt()).toString());
                    
                    break;

                case "D":

                    ((Textbook) library.get(in.nextInt())).setDiscount(in.
                            nextDouble());
                    
                    break;

                default:
                    break;

            }
            
           
        }
         
         outFile.close();
    }
}
