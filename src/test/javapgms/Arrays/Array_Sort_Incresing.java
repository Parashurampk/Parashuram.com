package Arrays;

public class Array_Sort_Incresing {

	public static void main(String[] args) {

		int[] arr = { 78, 34, 1, 3 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			System.out.println(arr[i]);
		}
	}
}
/*
 * import java.util.Arrays;
 * 
 * int[] arr = {78, 34, 1, 3}; Arrays.sort(arr);
 * System.out.println(Arrays.toString(arr)); } }
 */
