package TInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// Create a List
		List<String> stringList = new ArrayList<>();
		stringList.add("Java");
		stringList.add("Python");
		stringList.add("JavaScript");

		// Convert the List to an array
		String[] stringArray = convertListToArray(stringList);

		// Print the elements of the array
		System.out.println(Arrays.toString(stringArray));
	}

	private static <T> T[] convertListToArray(List<T> list) {
		// Create an array of the same type as the elements in the List
		// and with the same size as the List
		T[] array = (T[]) new Object[list.size()];

		// Use the toArray method to populate the array
		list.toArray(array);

		return array;
	}
}
