package Com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

System.out.println("Please enter height");

	int height=scan.nextInt();
	
	if (height<=60) {
		System.out.println("You are short");
	}else if(height>60 && height<72)
	{
	System.out.println("You are average");
	}else if(height>72) {
		System.out.println("You are tall");
	}
	}
}
