package Com.syntax.class05;

import java.util.Scanner;

public class hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

System.out.println("What month were you born in?");

String month=scan.next();

if (month.equals("December") || month.equals("January")|| month.equals("Feburary")){
	System.out.println("Winter");
} else if (month.equals("March")|| month.equals("April")|| month.equals("May")) {
	System.out.println("Spring");
}else if(month.equals("June")|| month.equals("July") || month.equals("August")) {
	System.out.println("Summer");
}else if(month.equals("September")|| month.equals("October")|| month.equals("November")) {
	System.out.println("Autumn");
}else {
	System.out.println("Invalid month");
}


	}

}
