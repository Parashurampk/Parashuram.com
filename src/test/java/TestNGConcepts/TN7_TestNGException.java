package TestNGConcepts;

import org.testng.annotations.Test;

public class TN7_TestNGException {

	@Test(expectedExceptions = ArithmeticException.class)
	public void testException() {
		System.out.println("SoftwareTestingMaterial.com");
		int i = 1 / 0;
	}
}