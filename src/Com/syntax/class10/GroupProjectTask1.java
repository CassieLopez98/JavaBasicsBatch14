package Com.syntax.class10;

import java.util.Arrays;
import java.util.Scanner;

public class GroupProjectTask1 {

	public static void main(String[] args) {
		/*
		 * Using Scanner create an array of integer values.
		 *  After the array is created, calculate the sum of all stored
		 *  elements in that array.
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter the size of the array");
		int size=scan.nextInt();
		int[] array= new int [size];
		int sum=0;
		
		for(int i=0; i<size;i++) {
			System.out.println("Please enter an int number");
			array[i]=scan.nextInt();
			
		}
		System.out.println(Arrays.toString(array));

		System.out.println("Sum of numbers are: ");
		
		for (int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		System.out.println(sum);		
	}

}
