package TInterView;

public class StringImmutable {
	public static void main(String[] args) {

		String str1 = new String("hello");
		String str2 = new String("hello");

		boolean isEqual = str1.equals(str2); // Using equals for content comparison
		System.out.println(isEqual); // Returns true

		boolean isSameReference = (str1 == str2); // Using == for reference comparison
		System.out.println(isSameReference); // Returns false
	}

}