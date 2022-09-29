package Com.syntax.class13;

public class StringDemo03 {

	public static void main(String[] args) {
		String str="sfksKAFBDAJKF11493!@#%$%$%*$";
		System.out.println(str.replaceAll("[0-9]","@"));// removes all numbers from 0 to 9 and @ symbol
		System.out.println(str.replaceAll("[0-9]",""));// removes all numbers from 0 to 9
		System.out.println(str.replaceAll("[a-z]",""));// removes all letters from a to z (refer the asci table to range info)
		System.out.println(str.replaceAll("[A-Z]",""));// removes all upper case letters
		System.out.println(str.replaceAll("[^A-Z]","")); //will only see upper case letters "^" is the not symbol
		System.out.println(str.replaceAll("[^a-zA-Z]",""));// will show lower case and upper case letters
		System.out.println(str.replaceAll("[^a-zA-Z0-9]","")); //will show lower case and upper case letters and numbers

	}

}
