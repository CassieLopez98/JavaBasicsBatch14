package Com.syntax.class05;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

System.out.println("Please enter a number");

double number=scan.nextDouble();

if (number<=10) {
	System.out.println("The number is small");
}else if (number>=11 && number<=100) {
	System.out.println("The number is medium");
}else if(number>=101 && number<=1000) {
	System.out.println("The number is large");
}

	}

}
