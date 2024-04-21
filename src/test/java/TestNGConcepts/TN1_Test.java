package TestNGConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TN1_Test {
	WebDriver driver;

	@Test
	public void Test() {

		String baseUrl = "https://www.toolsqa.com/";
		System.out.println("Launching Google Chrome browser");
		driver = new ChromeDriver();
		driver.get(baseUrl);
		String actTitle = "Tools QA";
		String expTitle = driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
		System.out.println("Finished Test On Chrome Browser");
	}
}