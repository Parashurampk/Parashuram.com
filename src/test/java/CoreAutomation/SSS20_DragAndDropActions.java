package CoreAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSS20_DragAndDropActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");

		WebElement sourceElement = driver.findElement(By.id("source-element"));// Find the source and target elements
																				// for drag and drop
		WebElement targetElement = driver.findElement(By.id("target-element"));

		Actions actions = new Actions(driver);// Perform drag and drop action

		actions.dragAndDrop(sourceElement, targetElement).build().perform();

		driver.quit();
	}
}
