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
public class LLS implements set {

    private class Node {

        private int data;
        private Node next;

        private Node() {

            next = null;

        }
        public int getData(){
        return data;
    }
    }

    private Node first;

// constructor
    public LLS() {
        first = null;

    }

    // check if set is empty
    public boolean isEmpty() {
        return first == null;
    }
    
    

    // makes the set empty
    public void makeEmpty() {
        first = null;
    }

    // recursive call that checks if int is in set
    public boolean isMember(int x) {
        return isMember(x, first);
    }

    // helper method
    private boolean isMember(int x, Node p) {
        if (p == null) {
            return false;
        }
        if (p.data == x) {
            return true;
        } else {
            return isMember(x, p.next);
        }
    }

    //recursive method that adds an int to the set
    public void add(int x) {
        if (isEmpty()) {
            Node p = new Node();
            p.data = x;
            p.next = null;
            first = p;
        } // returns if the number is repeated
        else if (isMember(x)) {
            return;
        } else {
            add(x, first);
        }

    }
// helper method

    private void add(int x, Node p) {
        if (p.next == null) {
            Node q = new Node();
            q.data = x;
            q.next = null;
            p.next = q;

        } else {
            add(x, p.next);
        }
    }

    // removes the item in the set
    public void remove(int y) {

        Node q = findPrev(y);
        if (q == null) {
            first = first.next;
            return;
        }
        if (q.next == null) {
            return;
        }
        q.next = q.next.next;

    }
// helper method for finding the previous node 

    public Node findPrev(int x) {
        if (isEmpty()) {
            throw new NoSuchElementException("element does not exist");
        }
        if (first.data == x) {
            return null;
        }
        Node r = first;
        while ((r.next != null) && (r.next.data != x)) {
            r = r.next;
        }
        return r;
    }

    // combines two sets and returns the union in result
    public void union(set other, set result) {
        Node p = this.first;
        LLS q = (LLS) other;
        Node r = q.first;

        while (p != null) {
            result.add(p.data);
            p = p.next;
        }
        while (r != null) {
            result.add(r.data);
            r = r.next;
        }
    }

    // recursive method that returns the intersection of two sets
    public void intersection(set other, set result) {
        intersection(first, result, other);
    }

    // helper method
    private void intersection(Node p, set result, set other) {
        if (isEmpty()) {
            throw new NoSuchElementException("The set is empty, therefore no "
                    + "intersection possible");
        }
        if (p == null) {
            return;
        } else if (other.isMember(p.data)) {
            result.add(p.data);
        }
        intersection(p.next, result, other);
    }

    // difference method that adds item that is not member of other set
    public void difference(set other, set result) {
        Node p = this.first;
        if (isEmpty()) {
            throw new NoSuchElementException("The set is empty, therefore no "
                    + "difference possible");
        }
        while (p != null) {
            if (!other.isMember(p.data)) {
                result.add(p.data);
            }
            p = p.next;
        }
    }

    public String toString() {
        Node p = first;
        char o3 = '}';
        String out = "\n\t { ";
        while (p != null) {
            out += Integer.toString(p.data) + "  ";
            p = p.next;
        }
        return out + o3;
    }

    // equals method that compares two sets
    public boolean equals(Object other) {
        LLS a = (LLS) other;
        LLS b = new LLS();
        int x = this.getSize();
        int y = a.getSize();
        // if the sets are not equal in size then they are not equal
        if (x != y) {
            return false;
        } else {
            // if the size of the intersection of set a and b equals the size 
            //of set a and set b then both sets are equal
            this.intersection(a, b);
            int z = b.getSize();
            if (z == x && z == y) {
                return true;
            }
            return false;
        }
    }

    public int getSize() {
        Node p = first;
        int size = 0;
        while (p != null) {
            p = p.next;
            size++;
        }
        return size;
    }

    
    

}
