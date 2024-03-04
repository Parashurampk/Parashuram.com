package TInterview;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,2,3,4,4,5};
		arr=Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(arr));	
	
		String str="Hello@$%^";
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
		
		String str1="Hello@$%^";
		String[]parts=str1.split("[^a-zA-Z]");
		System.out.println(Arrays.toString(parts));
		
		String str2="Hello how are you";
		String[] words = str2.split("");
		int wordcount = words.length;
		System.out.println(wordcount);
	}

}
