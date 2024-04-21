package Arrays;

import java.util.Arrays;

public class Array_Rearrange {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 0, 1, 1, 0, 1, 1, 1 };
		rearrangeArray(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void rearrangeArray(int[] arr) {
		int n = arr.length;
		int count = 0;
		for (int i = 0; i < n; i++) {   // Move zero elements to the front
			if (arr[i] == 0) {
				int temp = arr[count];// Swap zero element with the first non-zero element (if any)
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
			}
		}
	}
}