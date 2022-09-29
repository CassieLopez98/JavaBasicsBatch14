package Com.syntax.class10;

import java.util.Arrays;
import java.util.Scanner;

public class Reviewclass0502 {

	public static void main(String[] args) {
		 String[] individualsInRoom1= new String[] {"Sabej","Shah","Mina"};
	      String[] individualsInRoom2= new String[] {"Roman","Mina"};
	      String[] individualsInRoom3= new String[] {"Asad","Priyasri","Ali"};
	      // an 2D array that will store 3 single d arrays 
	      String [][] rooms=new String[3][];


	      rooms[0]=individualsInRoom1;
	      rooms[1]=individualsInRoom2;
	      rooms[2]=individualsInRoom3;

	      System.out.println(rooms[2][2]);

	      
	      System.out.println("-------------");
	      
	      System.out.println("Please Enter the number of dresses you want to buy");
	      
	      Scanner scanner=new Scanner(System.in);
	      int noOfDresses=scanner.nextInt();

	      double[] prices=new double[noOfDresses];

	      for(int i=0;i<noOfDresses;i++) {
	          System.out.println("Please enter the price of dress no "+(i+1));
	          prices[i]=scanner.nextDouble();
	      }
	      System.out.println(Arrays.toString(prices));
	}

}
