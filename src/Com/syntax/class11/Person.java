package Com.syntax.class11;

public class Person {

	String name;
	int age;
	double weight;
	boolean isFunny;
	double height;
	boolean losingHair;
	
	void study() {
		if (name.equals("Anna")) {
			System.out.println("I will keep on deleting the messages and will not let anyone study");
		}else if(name.equals("Roman")) {
			System.out.println("I study hard");
		}else {
			System.out.println("I try to study but things don't make much sense");
		}
	}
	public static void main(String[] args) {
		Person person1=new Person();
		person1.name="Anna";
		person1.study();
	}
}
