package Arrays;

import java.util.HashSet;

public class Array_UniqueElements {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		HashSet<Integer> s = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (s.add(arr[i])) {
				System.out.println(arr[i]);
			}
		}
	}
}
