
package TInterview;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, 
 * and return false if every element is distinct.
 */
import java.util.HashSet;
import java.util.Set;

public class AnyNumTwiceTrue {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 1 };
		System.out.println(Duplicate(nums));
	}

	public static boolean Duplicate(int[] nums) {
		Set<Integer> ref = new HashSet<Integer>();

		for (int num : nums) {
			if (ref.contains(num)) {
				return true; // Found a duplicate
			}
			ref.add(num);
		}
		return false; // No duplicates found
	}

}
