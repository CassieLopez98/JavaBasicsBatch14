package Com.syntax.class06;

import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter what country you are from");
		String country=scan.nextLine();
		String language;
		
		switch(country) {
		
		case "USA":
			language="English";
			break;
		case"El Salvador":
			language="Spanish";
			break;
		case "Italy":
			language="Italian";
			break;
		case "Vietnam":
			language="Vietnamese";
			break;
	
		default:
			language="Unknown";
			
				}
		System.out.println("You are from "+ country+ " and you speak "+ language);
		
		
		
		
	}

}
