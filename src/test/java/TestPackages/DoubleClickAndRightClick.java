package TestPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickAndRightClick {
	static WebDriver driver;
	Actions act;

	@BeforeMethod
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
	}

	@Test(priority = 1)
	public void doubleClickTest() {
		WebElement doubleclick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));

		act = new Actions(driver);
		act.doubleClick(doubleclick).perform();  //Double click

		boolean actText = driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).isDisplayed();
		Assert.assertTrue(true);

	}

	@Test(priority = 2)
	public void rightClickTest() {
		WebElement button = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act = new Actions(driver);
		act.contextClick(button).perform();  //Right click
		boolean actText = driver.findElement(By.xpath("//p[@id='rightClickMessage']")).isDisplayed();
		Assert.assertTrue(true);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
