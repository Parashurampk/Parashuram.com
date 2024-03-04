package InterviewPGMS;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int nums[] = { 10, 4, 3, 5, 6 };
		if (containsDuplicate(nums))
			System.out.println("true");
		else
			System.out.println("false");
	}

	public static boolean containsDuplicate(int[] nums) {
		 Set<Integer> numset = new HashSet<Integer>();
		 for(int num : nums) {
		 if(!numset.add(num)) {
		 return true;
		 }
		 }
		 return false;
		 }
}