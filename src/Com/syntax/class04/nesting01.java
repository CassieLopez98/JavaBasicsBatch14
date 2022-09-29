package Com.syntax.class04;

public class nesting01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//nested if condition ex
		int time=5;
		String day="Monday";
		/*
		 * outer "if-condition" if it is true then only inner conditions will be checked.
		 * if it is false, nothing from the inner "if conditions" will be executed. It is like the main door
		 * if the main door is closed, we can't enter the building
		 */
		//outer if-condition
		if(day.equals("Monday")) {  // as string is non-primitive, we can't use == sign, we have to use .equals
			
			if(time>7) {
			//inner			
			System.out.println("Let's go to office");
			}
			if(time<6) {
				System.out.println("let's sleep more");
			}
		}
		
		double moneyInMyAccount=100000;
		String season="Spring";
		// if changed to "winter" you will not recieve an output bc main door is closed
		if(season.equals("Spring")) {
			
			if (moneyInMyAccount>30000) {
				System.out.println("lets go on vacation");
			}
			else {
				System.out.println("I need to save more");
			}
			
			
			
		}
	}

}
