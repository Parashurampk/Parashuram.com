package Arrays;

public class Array_Max_MIn {
	public static void main(String[] args) {
		int[] arr = {21,9,5,10,25,58 };
		int max = arr[0];
		int min = arr[0];
		int smax = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				smax = max;
				max = arr[i];
			} else if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		System.out.println(smax);
	}
}
