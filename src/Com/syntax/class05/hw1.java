package Com.syntax.class05;

import java.util.Scanner;

public class hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("What time is it?");
		int timeofDay=scan.nextInt();
		
		if (timeofDay<=11) {
			System.out.println("Morning");
		}else if(timeofDay>=12 && timeofDay<=15) {
			System.out.println("Afternoon");
		}else if(timeofDay>=16 && timeofDay<=20) {
			System.out.println("Evening");
		}else if(timeofDay>=21 && timeofDay<=24) {
			System.out.println("Night");
		}

	}

}
