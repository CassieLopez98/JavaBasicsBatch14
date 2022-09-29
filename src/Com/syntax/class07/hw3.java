package Com.syntax.class07;

public class hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Print even numbers from 20 to 1 (2 ways)
		
		int b=1;
		
		while(b<=20) {
			
			if (b%2==0) {
				System.out.print(b+" ");
			}
			b++;
		}
		System.out.println("Second Way");
		
		 int c = 2;

	        while (c <= 20) {
	            System.out.print(c + " ");
	            c += 2;
	        }
		
	}

}
