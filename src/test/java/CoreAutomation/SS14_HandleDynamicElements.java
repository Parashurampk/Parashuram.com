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

public class SS14_HandleDynamicElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.ebay.com.au/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement electronics = driver.findElement(By.xpath("//li[@class='vl-flyout-nav__js-tab']//a[contains(text(),'Electronics')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(electronics).perform();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='iPhone']")));
		element.click();

		driver.quit();
	}
}