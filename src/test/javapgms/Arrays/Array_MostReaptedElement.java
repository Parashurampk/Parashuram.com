package Arrays;

import java.util.HashMap;
import java.util.Map;

public class Array_MostReaptedElement {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 23, 1, 4, 4, 4, 4, 4 };
		int n = arr.length;
		int maxCount = 0;
		int repeatEmt = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count > maxCount) {
				maxCount = count;
				repeatEmt = arr[i];
			}	
		}
		System.out.println("Count: " + maxCount);
		System.out.println("Most repeated emt: " + repeatEmt);	
	}
}

//		int[] arr = { 1, 2, 9, 3, 4, 3, 3, 1, 2, 4, 5, 3, 8, 3, 9, 0, 3, 2 };
//		Map<Integer, Integer> map = new HashMap<>();
//		int max = 1;
//		int maxKey = arr[0];
//		for (int k : arr) {
//			map.put(k, map.getOrDefault(k, 0) + 1);
//			if (map.get(k) > max) {
//				max = map.get(k);
//				maxKey = k;
//			}
//		}
//		System.out.println("Most repeated element : " + maxKey + " and it's occurrences: " + max);
//	}
//}
