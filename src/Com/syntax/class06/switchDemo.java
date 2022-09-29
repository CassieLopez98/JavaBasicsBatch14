package Com.syntax.class06;

public class switchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		char choice='Y';
		String answer;
		
		switch(choice) {
		
		case 'Y':
			answer="Yes";
			break;
		case'N':
			answer="No";
			break;
		case'M':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;
		
			
		}
		
		System.out.println(answer);
		
		
		
		
		
		
		
	}

}
