package Com.syntax.class04;

import java.util.Scanner;

public class hw3Loan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);

System.out.println("Please enter loan amount needed");

int loan=scanner.nextInt();

if (loan<=2000000) {
	System.out.println("We will be able to process this loan");
}else {
	System.out.println("We will not be able to process this loan");
}






	}

}
