package TInterView;

public class CaseConversion {
	public static void main(String[] args) {
		String str = "Manjunath";
		String rstr = reverseCase(str);
		System.out.println(rstr);
	}
	public static String reverseCase(String str) {
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
			} else {
				c = Character.toUpperCase(c);
			}
			sb.append(c);
		}
		return sb.toString();
	}
}
