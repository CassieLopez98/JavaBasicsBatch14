package Com.syntax.class05;

public class logicalORdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day="Sunday";
		
		if(day.equals("Saturday")|| day.equals("Sunday")) {
			System.out.println("I have Java class at Syntax");
		}
		System.out.println("-----");
		
		double money=120000;
		
		String title="Automation Tester";
		
		if (title.equals("Automation Tester")|| money==120000) {
			System.out.println("Happy");
		}
				
	}

}
