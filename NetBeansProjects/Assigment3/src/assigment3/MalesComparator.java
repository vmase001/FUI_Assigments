/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment3;
import java.util.Comparator;

/**
 *
 * @author vicentemaselli
 */
public class MalesComparator implements Comparator <Male> {
    // comparator that compares males height by parsing to int 
    public int compare(Male o1, Male o2) {

        int x = (int)o1.getHeight();
        int y = (int)o2.getHeight();

       return x - y;
    }
}
