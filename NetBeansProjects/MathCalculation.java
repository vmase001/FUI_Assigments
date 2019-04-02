import java.util.Scanner;
import java.lang.Math;
            
	public static void integralInteractive(){
		//scanner declaration
		Scanner keyboard = new Scanner( System.in );
		
		//variables assigned
		System.out.println("********Compute an Integral********");
		System.out.println( "Enter a, b, c, d, e: " );
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		double d = keyboard.nextDouble();
		double e = keyboard.nextDouble();
		
		//calculate the absolute value of each variable
		a = Math.abs (a);
		b = Math.abs (b);
		c = Math.abs (c);
		d = Math.abs (d);
		e = Math.abs (e);
		
		// checks for d <= e condition using min max	
		double newD = Math.min(d, e);
		double newE = Math.max(d, e);
		
		// assigns the new d and e values to old variable
		d = newD;
		e = newE;
		
		// variable that holds the answer to the integral computation, using helper method computeH passing parameters a b c x
		double integral = computeH (a, b, c, x);
		
		// print statements for variables
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
		
		// if h = 0 then its a non number from computeH, else print result 
		if (integral == 0){
			System.out.println("Integral = NaN");
		}
		else{
			System.out.println("Integral = " + integral);
		}
	}
	
	// helper method to compute the integral, method return a double
	public double computeH (double a, double b, double c, double x){
		double h;
		
		// checks if c = 0, then returns h as 0
		if (c == 0){
			h = 0;
		}	
		
		//TODO:: write the algorithm for integral and assign h to final answer

		return h;	
	}
    
    public static void main(String[] args) {
		integralInteractive();
		
	}
        