package Com.syntax.class04;

import java.util.Scanner;

public class hw5Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan=new Scanner(System.in);

System.out.println("Please enter the name of your city");
String city=scan.nextLine();

System.out.println("What is the temperature in "+city+" ?");

float tempF=scan.nextFloat();

float tempC=(tempF-32)*5/9;
System.out.println("The temperature in my "+ city + " is " +tempC+ "Celcius" );


	}

}
