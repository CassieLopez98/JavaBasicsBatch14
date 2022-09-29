package Com.syntax.class04;

import java.util.Scanner;

public class scannerdemoReviewClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
Scanner scanner=new Scanner(System.in);

System.out.println("Please Enter your age");
int age=scanner.nextInt();

System.out.println("Please Enter your name");
scanner.nextLine(); //nextLine is a special method that can capture spaces and enters as well 
/*
 * when we use any method like nextInt( or nextBoolean(, nextDouble() and after that if we use
 * nextLine() we need to discard that enter by using an extre nextLine() call
 */

String name=scanner.nextLine();


System.out.println(name+" is "+age+" years old");



	}

}

