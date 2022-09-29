package Com.syntax.class12;

public class hw3 {

	public static void main(String[] args) {
		/*Write a program that reads two people's first name
         * if they expecting boy or girl? 
         * Based on the input suggests a name for a baby:
         * 
         * Example Output:
         * Mom’s first name? Mary
         * Dad’s first name? Daniel
         * Boy or Girl? boy
         * Suggested baby name: DANRY
         * 
         * Example Output:
         * Mom’s first name? Mary
         * Dad’s first name? Daniel
         * Boy or Girl? girl
         * Suggested baby name: MAIEL
         */

		String momName="Mary";
		String dadName="Daniel";
		boolean isBoy=true;
		
		if(isBoy) {
			String firstHalf=dadName.substring(0,dadName.length()/2);
			String secondHalf=momName.substring(momName.length()/2);
			System.out.println(firstHalf+secondHalf);
		}else {
			String firstHalf=momName.substring(0, momName.length()/2);
			String secondHalf=dadName.substring(dadName.length()/2);
			System.out.println(firstHalf+secondHalf);
			
		}


 

	}

}
