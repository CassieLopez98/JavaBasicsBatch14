package Com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a 2D array (longer way)where you will store the following values: 
		 * Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		 * After storing values print following String:
		 * Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		 */
		String [][] name= new String[2][4];
		
		//1 row
		name[0][0]="Mr";
		name[0][1]="Mrs";
		name [0][2]="Ms";
		name[0][3]="Miss";
		
		//2 row
		name [1][0]="Smith";
		name[1][1]="Jordan";
		name [1][2]="Jackson";
		name [1][3]="Obama";
		
		
		System.out.println(name[0][0]+name[1][0]);
		System.out.println(name[0][1]+name[1][1]);
		System.out.println(name[0][2]+name[1][3]);
	}

}
