package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Array_UniqueElements {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 1, 7, 8, 3 };
		HashSet<Integer> s = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (s.add(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}
} 








//		int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
//		arr = Arrays.stream(arr).distinct().toArray();
//		System.out.println(Arrays.toString(arr));
//	}
//}
