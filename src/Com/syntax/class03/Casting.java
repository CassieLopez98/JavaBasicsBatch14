package Com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 
 * type casting=> converting one value from one date type to another data type
 * We can convert the contents of a smaller box to a larger box or vice versa
 */
		
		byte box1=127; //smallest box 8 bits
		short box2=3333; //double the size of box1 in terms of bits- slightly larger
		int box3=45454545; //32 bits-large box most commonly used 
		long box4=67676767; //largest box 64 bits
		float box5=46287472; // larger box 
		double box6=565274614; //largest box
		
		int number=(int)15.2; // we can't store the decimal number in a box type int
		System.out.println(number);
		
		byte smallerBox=(byte)box2; 
	System.out.println(smallerBox);
	
	short biggerBox=box1; 
	System.out.println(biggerBox);
	
	long box7=box1; // we can do this because box 7 is larger than box1
	
	float box8=(float)box6; // as boz 6 is larger, it is double, we need type casting to assign the value
	
	char a=(char)67;
	System.out.println(a);
	
	int box9=(int)box4;
	System.out.println(box9);
	
	}

}
