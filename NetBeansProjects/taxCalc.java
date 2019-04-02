package taxCalc;
import java.util.Scanner;
            
    
    public static void main(String[] args) {
		
		//scanner object created
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter household name: ");
		String family = input.next(); 
		
		System.out.println("Enter household income: ");
		public int income = input.nextInt(); 
		
		System.out.println("Enter number of people in the household: ");
		public int numOfPeople = input.nextInt(); 
		
		System.out.println("Enter educational expenses: ");
		public int edExpense = input.nextInt(); 
		
		System.out.println("Enter job-related expenses: ");
		public int jobExpense = input.nextInt(); 		
		
		
		System.out.println("Household name: " + family);
		System.out.println("Household income: " + income);
		System.out.println("Number of people in the household: " + numOfPeople);
		System.out.println("Educational expenses: " + edExpense);
		System.out.println("Job-related expenses: " + jobExpense);
		public int deductionA = numOfPeople * 3000;
		public int deductionB = int(edExpense * 0.90);
		public int deductionC = int(jobExpense * 0.80);
		public int incomeTax = income - deductionA - deductionB - deductionC;
		public int totalTax = int(incomeTax * 0.20);
		System.out.println("Deduction A = " + deductionA);
		System.out.println("Deduction B = " + deductionB);
		System.out.println("Deduction C = " + deductionC);
		System.out.println("Taxable income= " + incomeTax);
		System.out.println("For " + family + ", the tax = " + totalTax);
		
		
		
		
		
		
	}
        