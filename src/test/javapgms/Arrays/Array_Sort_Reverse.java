package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Array_Sort_Reverse {

	public static void main(String[] args) {

			Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };
			Arrays.sort(arr, Collections.reverseOrder());
			System.out.println("Modified arr[] : " + Arrays.toString(arr));
		}
	}



//		int[] arr = { 90, 23, 5, 109, 12, 22, 67, 34 };
//		Arrays.sort(arr);
//		for (int i = 0; i < arr.length; i++) {    
//			System.out.println(arr[i]);
