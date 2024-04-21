package TestNGConcepts;

import org.testng.annotations.Test;

public class TN3_Groups2 {

	@Test(groups = { "SmokeTest","Sanity" })
	public void WebLoginPersonalLoan() {
		System.out.println("Web Login Personal Loan");
	}

	@Test
	public void MobileLoginPersonalLoan() {
		System.out.println("Mobile Login Personal Loan");
	}

	@Test(groups = { "SmokeTest"})
	public void APILoginPersonalLoan() {
		System.out.println("API Login Personal Loan");
	}
}