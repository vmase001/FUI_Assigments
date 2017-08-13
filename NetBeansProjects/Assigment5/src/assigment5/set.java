/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment5;



/**
 *
 * @author vicentemaselli
 */
public interface set {

    public boolean isEmpty();	// Is the set empty?

    public void makeEmpty();	// Make this set empty.

    public boolean isMember(int x); // Is x a member of this set?

    public void add(int x); 	// Insert an element x in this set.

    public void remove(int y); 	// Delete an element y from this set.

    public void union(set other, set result); // result = "this" UNION other

    public void intersection(set other, set result); // result = "this" INTERSECTION other

    public void difference(set other, set result); // result = "this" - other

    public String toString(); // Overridden toString method that returns the set description as
    // a String.

    public boolean equals(Object other); // Overridden equals method to check equality of two sets.}

}
