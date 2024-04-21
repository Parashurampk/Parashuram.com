package Strings;

public class String_Reverse {
    //1)Converting string to a character array.
	public static void main(String[] args) {
		String str = "Hello";
		int length = str.length() - 1;
		for (int i = length; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}













//    //2)By Using String Buffer
//	public static void main(String[] args) {
//
//		StringReverse("automationqahub");
//	}
//	public static void StringReverse(String str) {
//
//		StringBuffer bf = new StringBuffer(str);
//		System.out.println(bf.reverse());
//
//	}