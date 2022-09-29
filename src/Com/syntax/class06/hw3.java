package Com.syntax.class06;

import java.util.Scanner;

public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner (System.in);


System.out.println("Enter 1st Number");
double num1 = scan.nextInt();
System.out.println("Enter 2nd Number");
double num2 = scan.nextInt();
System.out.println("Enter the operator");
String oper=scan.nextLine();
char op = scan.next().charAt(0);
double result=0 ;


switch (op) {

case '+':
    result = (num1 + num2);
    break;
case '-':
    result = (num1 - num2);
    break;
case '*':
    result = (num1* num2);
    break;
case '/':
    result = (num1 / num2);
    break;

default:
	
    break;
	}
			System.out.println(result);
}
}
