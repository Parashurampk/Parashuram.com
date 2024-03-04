package TestPackages;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWayToIterateList {

	public static void main(String[] args) {

		List<String> courses = Arrays.asList("C", "Java", "SQL", "Spring");
		
		for (int i = 0; i < courses.size(); i++) {  // for loop
			System.out.println(courses.get(i));
		}
		
		for (String cx : courses) {   // Enhanced for each loop
			System.out.println(cx);
		}
		
		for (Iterator<String> iterator = courses.iterator(); iterator.hasNext();) { //basic loop  with iterator
			String course = (String) iterator.next();
			System.out.println(course);
		}
		
		Iterator<String> it = courses.iterator();  //Iterator with while loop
		while (it.hasNext()) {
			String course = (String) it.next();
			System.out.println(course);
			
		}
	}	
}