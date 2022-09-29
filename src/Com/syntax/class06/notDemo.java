package Com.syntax.class06;

public class notDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean boo=!true;
		
		System.out.println(boo);//false

		boolean boo1=!false;
		System.out.println(boo1);// true
	
		boolean rain=false;
		
		if(!rain) {// able to enter the code so it will run bc not rain is true now even if boolean value is false
			System.out.println("I will go for a walk");
		}
		
		String day="Sunday";
		
		if(!day.equals("Sunday")) {// always put ! before your condition. This will not run as it is false
			System.out.println("Today is not Sunday");
		}
		
		System.out.println("---------------");
	
	boolean checkboxSelected=false;
	
	if(!checkboxSelected) {
		System.out.println("I will check and select is");
	}
	
	
	
	
	}

}
