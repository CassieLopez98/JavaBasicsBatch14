package Com.syntax.class06;

import java.util.Scanner;

public class hw2Enhanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		System.out.println("What month were you born in?");

		String month=scan.next();
		
		String season=null;

		if (month.equals("December") || month.equals("January")|| month.equals("Feburary")){
			season="Winter";
		} else if (month.equals("March")|| month.equals("April")|| month.equals("May")) {
			season="Spring";
		}else if(month.equals("June")|| month.equals("July") || month.equals("August")) {
			season="Summer";
		}else if(month.equals("September")|| month.equals("October")|| month.equals("November")) {
			season="Autumn";
		}else {
			season="Invalid month";
		}
		System.out.println(season);

		
		
		
		
		
		
		
	}

}
