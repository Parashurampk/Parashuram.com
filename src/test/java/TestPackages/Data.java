package TestPackages;

import java.util.HashMap;

public class Data {
	
	public static HashMap<String, String> getUserInfo() {
		HashMap<String, String> userMap=new HashMap<String, String>();
		userMap.put("admin", "mngr371460_abc@123");
		userMap.put("user", "mngr26593_1299guru@");
		
		return userMap;
	}

}
