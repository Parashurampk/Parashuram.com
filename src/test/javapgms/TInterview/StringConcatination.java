package TInterview;

public class StringConcatination {

	public static void main(String[] args) {
		
		char[] input= {'a','b','c','d','e'};
		
		String output="";
		
		for (char c : input) {
			
			output+=String.valueOf(c);
		}
		
		System.out.println(output);
	}

}
