package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Array_DuplicateElements {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 2, 7, 8, 8, 3 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}
}

//public static void main(String[] args) {
//
//	int[] num = { 5, 2, 4, 0, 1, 2, 5, 7 };
//	Duplicates(num);
//}
//public static void Duplicates(int[] array){
//	Set<Integer> dupnumber = new HashSet<>();
//	for (Integer number : array) {
//		if (!dupnumber.add(number)) {
//			System.out.println("Duplicate elem is:" + number);
//		}
//	}
//}
//}
