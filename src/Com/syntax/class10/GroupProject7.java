package Com.syntax.class10;

public class GroupProject7 {

	public static void main(String[] args) {
		//Write a java program to check whether a given number is prime or not?
		
		int num=13;
		boolean isPrime=true;
		
		if(num>1) {
			if (num>1) {
				for(int i=2;i<num;i++) {
					if(num%i==0) {
						isPrime=false;
						break;
					}
				}
			}else {
				isPrime=false;
			}
			if(isPrime) {
				System.out.println(num+ " is prime");
			}else {
				System.out.println(num+" is not prime");
			}
		}

	}

	 
	

}
