package CoreAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S6_ScrollingActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		// Scroll vertically by pixel
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");

		// Scroll horizontally by pixel
		js.executeScript("window.scrollBy(500, 0)");

		// Scroll vertically to an element
		WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Facebook']"));
		js.executeScript("arguments[0].scrollIntoView();", element);

		// driver.quit();
	}

}
