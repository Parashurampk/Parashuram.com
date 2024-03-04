package InterviewPGMS;

import java.util.Arrays;

public class Non_repeating_Element {
	
	public static void countFreq(int arr[], int n)
	   {
	         boolean visited[] = new boolean[n];
	         Arrays.fill(visited, false);       // Traverse through array elements and count frequencies
	         for (int i = 0; i < n; i++) {
	        	 
	            if (visited[i] == true) // Skip this element if already processed
	             continue;
	            int count = 1;     // Count frequency
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                   visited[j] = true;
	                   count++;
	                }
	            }
	            if(count==1)   
	              System.out.println(arr[i]);
	   }
	} 

	public static void main(String []args) 
	{ 
	int arr[] = new int[]{10, 30, 40, 20, 10, 20, 50, 10}; 
	int n = arr.length;
	 countFreq(arr, n); 
	}
}
