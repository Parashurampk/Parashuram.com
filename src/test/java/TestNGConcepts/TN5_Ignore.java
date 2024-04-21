package TestNGConcepts;

import org.testng.annotations.Test;

public class TN5_Ignore {
	
	
	@Test(enabled = false)
	public void printClass2() {
		System.out.println("This is Test Case 2");
	}
	
	@Test(enabled = true)
	public void printClass3() {
		System.out.println("This is Test Case 3");
	}
}