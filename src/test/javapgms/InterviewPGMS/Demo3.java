package InterviewPGMS;

import java.util.HashMap;
import java.util.Map;

public class Demo3 {

	public static void main(String[] args) {
		String result = frequencyOfChar("success");
		System.out.println(result);
	}

	public static String frequencyOfChar(String str) {
		Map<Character, Integer> frequency = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (frequency.containsKey(str.charAt(i))) {
				frequency.put(str.charAt(i), frequency.get(str.charAt(i)) + 1);
			} else {
				frequency.put(str.charAt(i), 1);
			}
		}
		return frequency.toString();
	}
}