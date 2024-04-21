package WebDriverCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateCommands {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// Open ToolsQA web site
		String appUrl = "https://www.DemoQA.com";
		driver.get(appUrl);

		// Click on Registration link
		driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();

		// Go back to Home Page
		driver.navigate().back();

		// Go forward to Registration page
		driver.navigate().forward();

		// Go back to Home page
		driver.navigate().to(appUrl);

		// Refresh browser
		driver.navigate().refresh();
		
		WebElement cssValue= driver.findElement(By.xpath(".//*[@id='s']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('s').value='Atomation Testing'");

		// Close browser
		driver.close();
	}
}
