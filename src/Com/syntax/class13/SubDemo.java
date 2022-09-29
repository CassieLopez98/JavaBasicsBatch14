package Com.syntax.class13;

import java.util.Arrays;

public class SubDemo {

	public static void main(String[] args) {
		String str="Today is Sunday";
		String day=str.substring(9);
		System.out.println(day);
		System.out.println(str.substring(6,8));
		char c=str.charAt(4);
		System.out.println();
		
		char[] charArr=str.toCharArray();
		System.out.println(Arrays.toString(charArr));
		//System.out.println(charArr);
		
		
		
		
		
	}

}
