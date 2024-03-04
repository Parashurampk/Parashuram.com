package Strings;

public class String_ReverseSentence {

	public static void main(String[] args) {
		String str = "Hello I am Japneet";
		reverseSentence(str);
	}

	private static void reverseSentence(String str) {
		String[] strSplit = str.split("\\s");

		for (int i = strSplit.length - 1; i >= 0; i--) {
			System.out.print(strSplit[i] + " ");
		}
	}
}


	



/*

reverse the position of words in the String using Collections

public class Demo {

        public static void main(String[] args) {
              
              String str = "This is a statement one";
              
              String[] words = str.split(" ");
              
              List<String> list = Arrays.asList(words);
              
              Collections.reverse(list);
              
               for(String word : list) {
                     
                     System.out.print(word +" ");
                     
              }      
              
       }

}


*/