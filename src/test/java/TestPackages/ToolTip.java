package TestPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/");
		driver.manage().window().maximize();

		Thread.sleep(1000);

		WebElement searchBox = driver.findElement(By.xpath("//input[@class='gsc-input']"));

		String ExpectedtooltipText = searchBox.getAttribute("title");

		System.out.println("Tooltip text is: " + ExpectedtooltipText);

		String expectedTooltip = "search";

		if (ExpectedtooltipText.equals(expectedTooltip)) {
			System.out.println("test passed");
		} else {
			System.out.println("test failed");
		}
	}

}
