package Numbers;

public class SplitNumbers {

	public static void main(String[] args) {

		int[] arr = { 2, 0, 4, 0, 5, 0, 6, 0 };
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) { //If the current element arr[i] is not equal to 0, it is moved to the 
			if (arr[i] != 0)          //front of the array (at index count), and then count is incremented.
				arr[count++] = arr[i];
		}
		while (count < n) //It continues to fill the array with zeros until the count variable                   
			arr[count++] = 0; // reaches the length of the array
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " "); //This loop prints the elements of the modified array.
		}

	}
}
/**
  If the current element arr[i] is not equal to 0, it is moved to the front of the array (at index count),
  and then count is incremented.
  
  After the first loop, the non-zero elements are moved to the beginning of the array, and the remaining elements 
  are zeros. The program then uses a while loop to fill the remaining positions with zeros:
  
  It continues to fill the array with zeros until the count variable reaches the length of the array.
  Finally, there is another for loop to print the modified array:
 
 */
