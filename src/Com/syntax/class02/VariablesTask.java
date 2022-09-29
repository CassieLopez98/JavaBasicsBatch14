package Com.syntax.class02;

public class VariablesTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Jason";
String lastname="Jones";
String grade="junior";
String city="Alexandira";
String state="Virginia";
String phonenumber="123 456 6789";

System.out.println("My name is "+ name + " and my last name is "+ lastname);

System.out.println("I am a "+ grade + " year student ");

System.out.println("I live in "+ city + state);

System.out.println("And my phone number is "+ phonenumber);

city="Fairfax";
state="California";
phonenumber= "789 654 4321";
grade="Senior";

System.out.println("My name is "+ name + " and I moved to a new city, " + city + " in "+ state);
System.out.println("My new phone number is "+ phonenumber);
System.out.println("I am now a "+ grade);

//rules of Identifiers=name (variables, methods, and classes)
//1. cannot use java keywords as identifiers 
//String new="Hello";-> error

//2.cannot have spaces in identifiers
//String last name="smith"; -> error

//3. identifiers cannot start with numbers
//int 1number=123;-> error

/*4. identifiers cannot contain any special characters 
 * except $ or _
 * double $price=9.98;-> OK
 * float _price1=1.99F;-> OK
 * char #chara='A';-> error 
 */

/* Naming Conventions
 * 
 * class should start with uppercase and follow camel casing
 * 
 * variables should start with lowercase and follow camel casing
 */

	}

}
