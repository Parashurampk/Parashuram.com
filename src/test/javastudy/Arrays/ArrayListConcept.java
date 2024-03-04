package Arrays;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		int a[]=new int[3]; //static array--Size iSize fixed

		ArrayList al= new ArrayList(); //dynamic array
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al.size());
		
		//to print all the values from ArrayList (1. for loop 2.Using iterator)
		
		for (int i = 0; i < al.size(); i++) {   
			System.out.println(al.get(i));
		}
		
		//generic
		ArrayList <Integer>al1= new ArrayList<Integer>(); // for Integer
		ArrayList <String>al2= new ArrayList<String>();  // for string
		ArrayList <Object>al3= new ArrayList<Object>(); // For mix
		
		
		
	}

}
