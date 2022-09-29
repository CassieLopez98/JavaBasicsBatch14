package Com.syntax.class08;

import java.util.Scanner;

public class reviewTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		
		int secret=1234;
		int guess;
		
		do {
			System.out.println("Please guess the secret number");
			guess=scan.nextInt();
			
		}while(guess !=secret);
		System.out.println("You won!");
	}

}
