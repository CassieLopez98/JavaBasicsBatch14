package Com.syntax.class04;

import java.util.Scanner;

public class hw7bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner (System.in);
/*
 * Write a program to ask user to enter numbers of worked years and annual salary. 
 * If user worked for more or equals to 5 years than user is eligible for the bonus, otherwise he is not. 
 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.
 */
 System.out.println("Please enter total number of years worked");
	int totalYears=scan.nextInt();
	
	if(totalYears>=5) {
		System.out.println("Please enter amount of salary");
		
		double annualSal=scan.nextDouble();
		if (annualSal>5000) {
			System.out.println("Your bonus is 5000");
		}else {
			System.out.println("Your bonus is 3000");
		}
			
	}else {
		System.out.println("You are not eligible for a bonus");
	}
	
	
	
	
	
	
	
	
	}

}
