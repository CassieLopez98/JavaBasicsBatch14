package Com.syntax.class03;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double money=5;

		double kfcBurger=11;
		
		if(money>kfcBurger) {
		System.out.println("yayy i can enjoy a burger");
		}
		
		else 
			
		{
			System.out.println("I should make something at home");
		}
		boolean isHungry=true;
		if(isHungry) {
			System.out.println("lets eat something yummy");
			
		} else {
			System.out.println("lets watch and do some coding from Youtube");
		}
		if (3>2) // if examples
			System.out.println("there is a true statement inside parenthesis");
		
		//example of ifElse
		double myBankBalance=2000;
		double theAmountThatIwantToTransfer=250;
		
		if(myBankBalance>theAmountThatIwantToTransfer)
			System.out.println("Funds transfered successfully");
		else
			System.out.println("Please try again, not enough funds");
		//ex2 with curly brackets and more outputs 
		int money2=10000000;
		
		if(money2>100000) {
			System.out.println(" I am rich");
			System.out.println("I can go on vacation");
			System.out.println("I can build my own house now");
			System.out.println("I can buy a Tesla");
		}
		else
		{ 
			System.out.println("I need to save more");
		}
		
		//ex on other conditions (==, >=, <=,!=)
		if (money2>=65000) {
			System.out.println("I can buy a Tesla");
		}
		else 
		{
			System.out.println("I need to save more");
		}
		
		if(money2==65000) // this will fail because it is false "i need to save more" will appear
		{System.out.println("I can buy a Tesla");
		}
		else 
		{
			System.out.println("I need to save more");
			
		}
		
		//not equal to ex 
		int number=19;
		
		if(number!=18) {
			System.out.println("this number is not 18");
		}
		
		//multiple conditions ex
		int day=1;
		
		if (day==1) {
			System.out.println("Monday");
		} else if(day==2) {
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Wednesday");
		}else if (day==4) {
			System.out.println("Thursday");
		}else if (day==5) {
			System.out.println("Friday");
		}else if (day==6) {
			System.out.println("Saturday");
		}else if (day==7) {
			System.out.println("Sunday");
		}else {
			System.out.println("please enter a valid day number (1-7)");
		}
		
		//
		String name="Wahid";
		
		if(name.equals("Wahid")) {
			System.out.println("I love Mondays");
		}else {
			System.out.println("I love Weekends");
		}
		
	}

}
