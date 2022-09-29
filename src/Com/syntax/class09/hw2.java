package Com.syntax.class09;

public class hw2 {

	public static void main(String[] args) {
		//From an array of integer elements find the largest number.
		int[] num = {0,30000,-90,10,20,30,40,50};
        int largestnum = num[0];

        for (int i=1 ; i<num.length ; i++ ) {
            if (num[i]>largestnum) {
              largestnum=num[i];
            }

        }
        System.out.println(largestnum);
	}

}
