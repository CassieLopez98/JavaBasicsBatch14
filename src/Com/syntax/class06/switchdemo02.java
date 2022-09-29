package Com.syntax.class06;

import java.util.Scanner;

public class switchdemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * we need to ask a user where he/she is from
 * based on the country-> define favorite food
 */
	Scanner scan=new Scanner(System.in);
	System.out.println("Please tell me where you are from?");
	String country=scan.nextLine();
	String favoriteFood;
	
	switch(country) {
	
	case "USA":
		favoriteFood="burgers and fries";
		break;
	case"Kazakhstan":
		favoriteFood="beshparmak";
		break;
	case "Turkey":
		favoriteFood="adana kebab";
		break;
	case"Venezuela":
		favoriteFood="Arepa";
	case "India":
		favoriteFood="chicken curry";
		break;
	case "Yemen":
		favoriteFood="Mandi";
		break;
	case "Afghanistan":
		favoriteFood="Quaboli Palow";
		break;
	default:
		favoriteFood="Unknown";
		
			}
	System.out.println("You are from "+ country+ " and your favorite food is "+ favoriteFood);
	
	
	
	
	}

}
