package InterviewPGMS;

import java.util.ArrayList;
import java.util.List;

public class ReplaceSecondElement_of_ArrayList {
	public static void replaceSecElement() {

	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(15);
		list.add(15);
		list.add(20);
		System.out.println("Original list: " + list);
		list.set(1, 10);
		System.out.println("Modified list: " + list);
	}
}