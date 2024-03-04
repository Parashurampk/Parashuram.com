package Basics;

public class J6_JavaArray {

	public static void main(String[] args) {

		//Single Dimensional
		int[] arr;        // Declaration
		arr = new int[3]; // Initialization
		arr[0] = 10;      // store values
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr[2]);  // utilization
		System.out.println(arr.length);//length
		int[] abb=arr;
		System.out.println(abb[2]); //copy to another array
		
		
		int[] arr2 = new int[5]; // initialized with a specific length, and its elements are set to default
									// values
		arr2[0] = 10;
		arr2[1] = 10;
		arr2[2] = 10;
		arr2[3] = 10;
		System.out.println(2);
		

		// directly allocated values to the arr2
		int[] arr3 = { 10, 20, 30, 40, 50 }; // initialized with specific values, and its length is determined by the
												// number of elements provided in the initialization.
		System.out.println(arr3[3]);
		int n = arr3.length;
		System.out.println(n);
		
		
		//MultiDimensional
		int[][] arrr=new int[2][3];
		arrr[0][0]=2;
		arrr[0][1]=3;
		arrr[0][2]=4;
		
		arrr[1][0]=4;
		arrr[1][0]=5;
		arrr[1][2]=6;
		
		System.out.println(arrr[1][0]);
		
		int[][] arrrr= {{2,3,4},{5,6,7}};
		
		System.out.println(arrrr[1][0]);

	}
}
