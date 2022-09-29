package Com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; 1<5; i++) {
			System.out.println("Hello");
			if(i==3) {
			break;
			}
		}
		// break- break the loop and it usually used insude some type of condition
		
		boolean hungry=true;
		while(hungry) {
			System.out.println("Give me food");
			break;
		}
		System.out.println("end");
	}

}
