package Arrays;

public class Array_LeftRotate {
	public static void main(String[] args) {
		int[] num = { 7, 5, 1, 0, 9 };
		LeftRotate(num);
	}

	public static void LeftRotate(int[] num) {
		int temp = num[0];
		for (int i = 1; i < num.length; i++) {
			num[i - 1] = num[i];
		}
		num[num.length - 1] = temp;
		for (int i : num) {
			System.out.print(" ");
			System.out.print(i);
		}
	}
}