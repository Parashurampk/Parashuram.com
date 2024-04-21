package TInterView;

public class NumberCountinString {
	
	public static void main(String[] args) {
		String str="bshaxb4567skhxb";
		System.out.println(countInt(str));
	}
	public static int countInt(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}