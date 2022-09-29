package Com.syntax.class05;

import java.util.Scanner;

public class Recapscanner01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

		System.out.println("Please enter your name");
		
		//to capture different values we need to use different options
		String name=scan.next();// here we capture String
		System.out.println("Nice to meet you " +name);
		
		System.out.println("Please enter your age");
		int age=scan.nextInt(); // capturing int
		System.out.println(name+" is "+age+" years old");
		
		System.out.println("How much money do you have " + name+ "?");
		
		double money=scan.nextDouble();
		
		System.out.println(name+" has "+ money);
		
		System.out.println(name+" what is your grade for math?");
		char grade=scan.next().charAt(0); //character
		System.out.println(name+ " has a math grade of "+grade);
		
		
		
		System.out.println("End");
		
	}

}
