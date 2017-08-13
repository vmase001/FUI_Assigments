/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment4;

import java.io.Serializable;
import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 *
 * @author vicentemaselli
 */
public class MyArray {

    private int[] arr1;
    private int numOfItems;

    //default constructor
    public MyArray(){
        this.numOfItems = 10;
        int arr1[] = new int[10];
        this.arr1 = arr1;
        
        for (int i =0; i < arr1.length; i++){
            arr1[i] = 0;
        }
    }
    
    // constructor with designated size
    public MyArray(int numOfItems) {

        this.numOfItems = numOfItems;
        int arr1[] = new int[numOfItems];
        this.arr1 = arr1;

        // initializes the array elements to 0
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 0;
        }
    }
    
    public MyArray(MyArray other){
        this.arr1 = other.arr1;
        
    }

    //returns size of the array
    public int get_Size() {
        int size = 0;
        for (int i= 0; i < arr1.length; i++){
            if (arr1[i] != 0){
                size++;
            }
        }
        return size;
    }

    // returns the element of the array if the input is less than or equal the
    //array length, if not the element does not exist and exception is thrown
    public int get_i(int i) {
        if (i >= arr1.length) {
            throw new NoSuchElementException("The element does not exist");
        } else {
            return arr1[i];
        }
    }

    // adds elemets to the end of the array 
    public void add_Val(int x) {
        int y = 0;
        //int lastIndex = arr1.length - 1;

        for (int i = 0; i <arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = x;
                break;
            }
            else{
                y++;
            }
            

        }
        if (y == arr1.length) {
            
            int [] arr2 = new int [arr1.length * 2];
            System.arraycopy(arr1, 0, arr2, 0, arr1.length);
            arr1 = arr2;
            arr1[y] = x;
        }

    }

    

// recursive method to find the sum of the array
    public int sum() {
        return sum(arr1, 0);
    }

    // helper method for sum method
    private int sum(int[] arr1, int st) {
        if (st == arr1.length - 1) {
            return arr1[st];
        }
        return arr1[st] + sum(arr1, st + 1);
    }

//recursive method to find smallest index
    public int smallIndex() {
        return arr1[smallIndex(arr1, 0)];
    }

    //helper method for recurisve method
    private int smallIndex(int[] arr1, int st) {
        if (st == this.get_Size() - 1) {
            return st;
        }
        int sim = smallIndex(arr1, st + 1);
        int cmp = Integer.compare(arr1[st], arr1[sim]);
        if (cmp < 0) {
            return st;
        } else {
            return sim;
        }

    }

//recursive method to find largest index
    public int largestIndex() {
        return arr1[largestIndex(arr1, 0)];
    }

    //helper method for recurisve method
    private int largestIndex(int[] arr1, int st) {
        if (st == this.get_Size() - 1) {
            return st;
        }
        int lim = largestIndex(arr1, st + 1);
        int cmp = Integer.compare(arr1[st], arr1[lim]);
        if (cmp > 0) {
            return st;
        } else {
            return lim;
        }

    }

    //recursive method for inverting array
    public int invert() {
        return invert(arr1, 0, arr1.length - 1);
    }

    // helper method that inverts the array swapping last 
    private int invert(int[] arr1, int st, int last) {
        int tmp = arr1[st];
        if (st < last) {

            arr1[st] = arr1[last];
            arr1[last] = tmp;
            invert(arr1, st + 1, last - 1);
        }

        return tmp;
    }

    // recursive method to search for an integer in the array returns the index
    public int search(int value) {
        return search(arr1, 0, arr1.length - 1, value);
    }

    private int search(int[] arr1, int st, int end, int value) {
        int middle = (st + end) / 2;
        if (end < st) {
            return -1;
        }

        if (value == arr1[middle]) {
            return middle;
        } else if (value < arr1[middle]) {
            return search(arr1, st, middle - 1, value);
        } else {
            return search(arr1, middle + 1, end, value);
        }

    }

    // recursive method that returns true if two arrays are equal
    // overrides the object default method
    public boolean equals(Object other) {
        MyArray abc = (MyArray) other;
        // checks to see if the arrays have the same size first
        if (this.get_Size() != abc.get_Size()) {
            return false;
        }
        return equals(this, abc, 0);
    }

    // helper method that inputs starting postion of both arrays 
    private boolean equals(MyArray a1, MyArray a2, int st) {
        // if the starting position reaches the last index then the arrays are 
        //equal
        if (st == a1.get_Size()) {
            return true;
        } else if (a1.get_i(st) != a2.get_i(st)) {
            return false;
        }
        // calls the helper to move to the next element 
        return equals(a1, a2, st + 1);
    }

    // sorting method using the bubble method
    public int[] sort() {
        return sort(arr1, arr1.length);
    }

    // helper method that uses the array length
    private int[] sort(int[] arr1, int n) {
        if (n == 1) {
            return arr1;
        }

        int x;
        for (int i = 0; i < n - 1; i++) {
            if (arr1[i + 1] < arr1[i]) {
                x = arr1[i];
                arr1[i] = arr1[i + 1];
                arr1[i + 1] = x;

            }
        }
        return sort(arr1, n - 1);
    }

    public String toString() {
        String out;
        out = getClass().getName();
        out += "\n\t The Array contains: " + this.get_Size() + " Items " + '\n'
                + "\n\t The Array: " + Arrays.toString(arr1);

        return out;
    }

}
