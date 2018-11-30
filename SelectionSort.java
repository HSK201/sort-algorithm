package selectionSort;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = null;
		Scanner read = new Scanner(System.in);
		
		//Enter information 
		System.out.println("Enter a 10 random numbers: ");
		
		for(int j = 0 ; j < 11 ; j++) {
			numbers[j] = read.nextInt();
		}
		
		System.out.println("The random numbers are: ");
		
		//Print the array content
		for(int i = 0 ; i < numbers.length ; i++) {
			System.out.println(numbers[i]);
		}
		
		
	}
	
	void selection() {
		//sort array
	}

}
