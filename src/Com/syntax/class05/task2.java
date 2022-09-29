package Com.syntax.class05;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan=new Scanner(System.in);

	System.out.println("Please enter what day it is");
	
	int day=scan.nextInt();
	
	if (day<=5) {
	System.out.println("It is a weekday");
	
	}else if(day==6 || day==7) {
		System.out.println("It is a weekend");
	} else {
		System.out.println("Invalid day");
	}
	
	 
	
	}	

}
