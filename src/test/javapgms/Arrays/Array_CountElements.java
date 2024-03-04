package Arrays;

import java.util.HashMap;

public class Array_CountElements {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 23, 3, 4, 4 };

		// Create a HashMap to store the count of each element
		HashMap<Integer, Integer> h = new HashMap<>();

		// Iterate through the array and update the count in the HashMap
		for (int num : arr) {
			h.put(num, h.getOrDefault(num, 0) + 1); // is used to update the count of the current element in the HashMap
		}

		// Print the count of each element
		for (HashMap.Entry<Integer, Integer> entry : h.entrySet()) {
			System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
		}
	}
}
/**
Inside the loop, h.put(num, h.getOrDefault(num, 0) + 1) is used to update the count of the current element 
in the HashMap. getOrDefault is used to handle the case when the element is not present in the HashMap yet.

h.getOrDefault : is used to handle the case when the element is not present in the HashMap yet.

*/