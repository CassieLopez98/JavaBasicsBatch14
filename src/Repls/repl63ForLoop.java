package Repls;

import java.util.Scanner;

public class repl63ForLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number");
		   int userInput=scan.nextInt();

				    for(int i=0;i< userInput; i++){
				      System.out.print(i+" ");
				    }
		

	}

}
