package Com.syntax.class09;

public class example01 {

	public static void main(String[] args) {
		
		String[] week= {"Monday", "Sunday", "Friday","Saturday","Wednesday"};
		
		//if day is Sunday-> it is a fun day
		//otherwise- it is a boring day
		
		for(String day:week) {
			if(day.equals("Sunday")) {
				System.out.println(day+" is a fun day");
			}else {
				System.out.println(day+ " is a boring day");
			}
		}


	}

}
