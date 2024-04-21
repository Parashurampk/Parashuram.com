package TInterView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortArrayList {
	public static void main(String args[]) {

		//ArrayList<String> arraylist = new ArrayList<String>();
		

//		arraylist.add("India");
//		arraylist.add("Nepal");
//		arraylist.add("Newzeland");
//		arraylist.add("Bhutan");
		ArrayList<String> arraylist = new ArrayList<>(Arrays.asList("India", "Nepal", "Newzeland", "Bhutan"));
		System.out.println("ArrayList Before Sorting:");
		for (String str : arraylist) {
			System.out.println(str);
		}

		Collections.sort(arraylist, Collections.reverseOrder());

		System.out.println("ArrayList in descending order:");
		for (String str : arraylist) {
			System.out.println(str);
		}
	}
}