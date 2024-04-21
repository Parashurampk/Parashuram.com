package TestNGConcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TNM10_DataProviderClass {

	@Test(dataProvider = "getData")
	public void loginTest(String Uid, String Pwd) {
		System.out.println("UserName is " + Uid);
		System.out.println("Password is " + Pwd);
	}

	@DataProvider(name = "getData")
	public Object[][] getData() {
		Object[][] data = new Object[2][2];

		data[0][0] = "FirstUid";
		data[0][1] = "FirstPWD";

		data[1][0] = "SecondUid";
		data[1][1] = "SecondPWD";

		return data;

	}
}