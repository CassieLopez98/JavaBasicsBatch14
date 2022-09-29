package Com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// +, -, *, /, %(remainder)
		int a=900;
		int b=100;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		
		int c=10;
		int d=3;
		
		
		
		int sum=c+d;
		int sub=c-d;
		int remainder=c%d;//10%3=1
		int div=c/d; //10/3=3
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(remainder);
		
	
		int e=10;
		int f=5;
		
		System.out.println(e/f);// 2
		System.out.println(e%f);//0
		
		double num1=10.0;
		double num2=3.0;
		
		System.out.println("division of double=" +num1/num2);
		System.out.println(num1%num2);
		//up to 15 decimal points 
		
		float  number1=10.0F;
		float number2=3.0F;
		
		System.out.println("division of float = "+ number1/number2);
		//less decimal points 
		System.out.println(number1%number2);
		
		System.out.println("  remainder examples    ");
		// remainder-%- mod operator 
System.out.println(16%4);
System.out.println(6%3);
System.out.println(16%13);
System.out.println("   what is the output");
System.out.println(10+10/10);
System.out.println ((10+10)/10);


	
	}

}
