package CoreAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SS15_HandleSynchronizationIssuesWith_AjaxCalls {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.ebay.com.au/");

		// Wait for the Ajax call to complete
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.jsReturnsValue("return jQuery.active == 0"));

		WebElement electronics = driver
				.findElement(By.xpath("//li[@class='vl-flyout-nav__js-tab']//a[contains(text(),'Electronics')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(electronics).perform();

		driver.quit();
	}
}
