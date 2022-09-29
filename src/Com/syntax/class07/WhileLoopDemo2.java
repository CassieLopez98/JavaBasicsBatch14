package Com.syntax.class07;

public class WhileLoopDemo2 {

	public static void main(String[] args) {
		
		//print all numbers from 1 to 10
		
		int num=1;
		
		while(num<=10) {
			System.out.println(num+" ");
			num++;
		}
		
		System.out.println("-----------------");
		
		//print all numbers from 10 to 15 
		
		int a=10;
		
		while(a<=25) {
			a++;
			System.out.println(a+" ");
		}
		
		System.out.println("---------------");
		
		//print all numbers from 10 to 1 
		
		int b=10;
		
		while(b>=1) {
		System.out.println(b);	
		b--;
		}
		
		System.out.println("--------------");
		// print all numbers fron 50 to 20 
		
		
		
		int c=50;
		
		while(c>=20) {
			System.out.println(c);
			c--;
		}
		
		System.out.println("----------------");
		
		//print all even numbers from 1 to 20
		
		int d=2;
		
		while (d>=20) {
			System.out.println(d+" ");
			d+=2;
		}
		
		System.out.println("Another way");
		
		int i=1;
		
		while(i<=20) {
			
			if (i%2==0) {
				System.out.println(i+" ");
			}
			i++;
		}
		
		
		
	}

}
