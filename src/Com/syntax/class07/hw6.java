package Com.syntax.class07;

import java.util.Scanner;

public class hw6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Declare a variable to store a price for a coffee. Ask the user to pay for a coffee. 
 * Keep asking to pay for coffee until the user enters the EXACT amount . 
 * If the user gives more than coffee price --> ask them to give less, 
 * if the user gives less money then ask to give more. 
 * Once user give EXACT amount print “Please enjoy your coffee
 */
		Scanner scan=new Scanner(System.in);
		
		double price=5.90;
        double payer;
        System.out.println("Please pay for your coffee");
        do {
            payer=scan.nextDouble();
            if(payer>price) {
                System.out.println("Please give less");
            }else if(payer<price) {
                System.out.println("Please give more");
            }
        }while(price != payer);
        System.out.println("Please enjoy your coffee");
   }
}
		
		
