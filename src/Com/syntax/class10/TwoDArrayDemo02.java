package Com.syntax.class10;

public class TwoDArrayDemo02 {

	public static void main(String[] args) {
		// create an array of countries
		String[][] countries= {
				{"USA","Canada"},//1st array with index 0
				{"Peru","Brazil","Colombia","Ecuador"},//2nd arrray with index 1
				{"Ethiopia","Egypt","Kenya"},//3rd array with index 2
				{"Germany","Turkiye","Moldova","Ukraine"},//4th array with index 3
				{"India","Kazakhstan","Afghanistan","Korea"}//5th array with index 4
		};
		System.out.println(countries.length); //will print "5" because we are asking the total amount of arrays or rows
		
		int elOf1stArray=countries[0].length;
		System.out.println("# of elements from 1st array= "+elOf1stArray);
		
		int elOf2ndArray=countries[1].length;
		System.out.println("# of elements from 2nd array= "+elOf2ndArray);
		
		System.out.println("----getting all values from 2d array-----");
		
		for (int r=0;r<countries.length; r++) { //loops over rows
			for(int c=0; c<countries[r].length;c++) {
				System.out.println(countries[r][c]);
			}
			
		}
	}
	

}

