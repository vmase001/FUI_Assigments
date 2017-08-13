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
public class FemalesComparator implements Comparator <Female>{
    //  comparator to sort females by age
    public int compare(Female f1, Female f2){
        return f1.getAge() - f2.getAge();
    }
    
}
