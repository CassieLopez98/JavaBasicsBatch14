package Com.syntax.class11;

public class dog {
	//state
	//attributes/ properties/ fields
	String name;
	String color;
	String breed;
	double weight;
	
	int age;
	//these are behaviours of a dogs
	//Methods functions
	void bark() {
		System.out.println("Barking........");
	}
	void sleep() {
		System.out.println("Dog is sleeping......");
	}
	
	public void main(String[] args) {
		//creating objexts from a class
		//new dog();=> created an object of class Dog
		dog dog1=new dog();
		//calling a behavior on an object
		dog1.bark();
		dog1.sleep();
	}
}
