package Com.syntax.class09;

public class hw1 {

	public static void main(String[] args) {
	//Create an array on integers and calculate the sum of all elements in an array
		int[] numbers= {10,20,30,40,50,60,70,80,90,100};
        int sum=0;
        System.out.print("Sum Of numbers in this array is:= ");
        for(int i=0;i<numbers.length;i++)
        {
            sum=sum+numbers[i];

        }
        System.out.print(sum);
    }
	}

