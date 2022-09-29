package Com.syntax.class04;

import java.util.Scanner;

public class hw6Credit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

System.out.println("Do you have a credit card?");

boolean credit=scan.nextBoolean();


if (credit) {
	System.out.println("How much is the balance on the credit card?");
	int balance=scan.nextInt();
	 
	if (balance>1000) {
		System.out.println("Pay it off immediately");
	}else {
		System.out.println("You can continue to spend");
	}
	
}else {
	System.out.println("Would you like a credit card?");
}










	}

}
