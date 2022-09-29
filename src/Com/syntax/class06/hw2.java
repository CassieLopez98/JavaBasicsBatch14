package Com.syntax.class06;

import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

System.out.println("Please enter a grade A,B,C,D or F");
	
	String grade=scan.nextLine();
	String explanation;
	
	switch (grade) {
	
	case "A":
		explanation="Excellent";
		break;
	case "B":
		explanation="Good";
		break;
	case "C":
		explanation="Average";
		break;
	case "D":
		explanation="Bad";
	case "F":
		explanation="Failed";
	default:
		explanation="Invalid";
	}

	System.out.println("You have a grade that means "+ explanation);
	
	}

	
	}
	
