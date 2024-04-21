package TInterView;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class SortHashSet {

	public static void main(String[] args) {
		sortSet();
	}

	public static void sortSet() {

//		HashSet<String> set = new HashSet<String>();
//		set.add("test");
//		set.add("practice");
//		set.add("contribute");
//		set.add("ide");
//		set.add("java");

		HashSet<String> set = new HashSet<>(Arrays.asList("test", "practice", "contribute", "ide", "java"));

		System.out.println("Original HashSet: " + set);

		TreeSet<String> treeSet = new TreeSet<String>(set);

		// Print the sorted elements of the HashSet
		System.out.println("HashSet elements in sorted order using TreeSet: " + treeSet);

	}
}