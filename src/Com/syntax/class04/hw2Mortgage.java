package Com.syntax.class04;

import java.util.Scanner;

public class hw2Mortgage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner(System.in);
System.out.println("Please enter mortgage rate");

double rate=scanner.nextDouble();

if (rate>4.5) {
	System.out.println("Buyer is no longer interested");
}else {
	System.out.println("Buyer is considering buying");
	System.out.println("Enter the price of property");
	
	double price=scanner.nextDouble();
	if (price>200000) {
		System.out.println("Buyer will accept loan");
	}else {
		System.out.println("Buyer will pay cash");
	}
}

	}

}
