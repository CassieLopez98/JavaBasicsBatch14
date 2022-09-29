package Repls;

import java.util.Scanner;

public class repl64ForLoop {

	public static void main(String[] args) {
		
		 Scanner scanner=new Scanner(System.in);
		    int userInput=scanner.nextInt();

		    for(int i=0;i< userInput*2; i++){
		      System.out.print(i+" ");
		    }
	}

}
