package Arrays;

import java.util.Arrays;

public class Array_Negative_Positive {
	public static void main(String[] args) {
		int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
		splitNumbers(arr);
		for (int e : arr)
			System.out.print(e + " ");
	}

	public static void splitNumbers(int[] arr) {

		Arrays.sort(arr);
	}
}