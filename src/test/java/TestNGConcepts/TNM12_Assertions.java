package TestNGConcepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TNM12_Assertions {
	@Test
	public void testAssertions() {
		// test data
		String str1 = new String("TestNG");
		String str2 = new String("TestNG");
		String str3 = null;
		String str4 = "TestNG";
		String str5 = "TestNG";
		String str6 = new String("Not_TestNG");

		int val1 = 5;
		int val2 = 6;

		// Check that two objects are equal
		Assert.assertEquals(str1, str2);
		System.out.println("Equals Assertion is successful");

		// Check that two objects are not equal
		Assert.assertNotEquals(str1, str6);
		System.out.println("NotEquals Assertion is successful");

		// Check that a condition is true
		Assert.assertTrue(val1 < val2);
		System.out.println("True Assertion is successful");

		// Check that a condition is false
		Assert.assertFalse(val1 > val2);
		System.out.println("False Assertion is successful");

		// Check that an object isn't null
		Assert.assertNotNull(str1);
		System.out.println("Not Null Assertion is successful");

		// Check that an object is null
		Assert.assertNull(str3);

		// Check if two object references point to the same object
		Assert.assertSame(str4, str5);
		System.out.println("Same Assertion is successful");

		// Check if two object references not point to the same object
		Assert.assertNotSame(str1, str3);
		System.out.println("Not Same Assertion is successful");
	}
}