package Com.syntax.class05;

public class Recap2nested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // to format code use cmd
		boolean allergy=true;
		
		String allergyType="pollen";
		
		if(allergy) {
			System.out.println("Let's check what allergy you have");
			
			if(allergyType.equalsIgnoreCase("Pollen")) {
				System.out.println("Try to stay indoors when trees are blooming");
			}else if(allergyType.equals("Peanut")) {
				System.out.println("Stay away from peanuts");
			}else if(allergyType.equals("Dairy")) {
				System.out.println("Stay away from dairy products");
			}else {
				System.out.println("We need to do some tests");
			}
		}else {
			System.out.println("You are lucky");
		}
	}

}
