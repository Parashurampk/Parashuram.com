package Arrays;

import java.util.Arrays;

public class Array_Largest {
	public static void main(String[] args) {
		int[] array = { 1, 99, 4, 6, 10, 100, 101, 5, 77, 66 };
		int Largest = findLargest(array);
		System.out.println(Largest);
	}

	public static int findLargest(int[] array) {
		Arrays.sort(array);// Sort the array in descending order
		return array[array.length - 1];// Return the third largest number from the sorted array
	}
}

