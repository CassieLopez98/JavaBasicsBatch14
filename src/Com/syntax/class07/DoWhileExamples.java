package Com.syntax.class07;

import java.util.Scanner;

public class DoWhileExamples {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		String answer=scan.next();
		
		do {
		System.out.println("Did u get a job?");
		}while(!answer.equals("yes"));
		
		System.out.println("Congrats");
		}

}
