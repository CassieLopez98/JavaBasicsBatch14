package Com.syntax.class04;

import java.util.Scanner;

public class hw1Diploma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner=new Scanner (System.in);
System.out.println("Do you have a diploma? Please choose true or false");
boolean diploma=scanner.nextBoolean();
if (diploma) {
	System.out.println("Congratulations");
	System.out.println("What was your gpa?");
	
	double gpa=scanner.nextDouble();
	if (gpa>=3.5) {
		System.out.println("You are eligible for a scholarship");
	}else {
		System.out.println("You should have studied harder");
	}
			


}else {
	System.out.println("You should get a degree");
}





	}

}
