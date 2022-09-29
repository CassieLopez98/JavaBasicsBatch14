package Com.syntax.class06;

import java.util.Scanner;

public class task01Enhace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner (System.in);


	System.out.println("Please enter your quiz score");
	int quiz=scan.nextInt();
	
	System.out.println("Please enter your midterm score");
	int midTerm=scan.nextInt();
	
	System.out.println("Please enter your final score");
	int finalGrade=scan.nextInt();
	int average;
	
	average=(quiz+midTerm+finalGrade)/3;
	
	String grade;
	
	if (average>=90) {
		grade="A";
	}else if (average>=70 && average<90) {
		grade="B";
	}else if (average>=50 && average<70) {
		grade="C";
	}else if (average<50) {
		grade="F";
	}else {
		System.out.println("Please enter valid score!");
		grade="None";
	}
	System.out.println("Your final grade is "+ grade);










	}

	}


