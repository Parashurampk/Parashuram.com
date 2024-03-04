package GenericScenario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PilpkartSortPrice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Mobiles");
		driver.findElement(By.xpath("(//*[name()='svg'])[1]")).click();

		Thread.sleep(5000);

		List<WebElement> priceElements = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

		// Extract and convert prices to integers
		List<Integer> numericPrices = new ArrayList<>();
		for (WebElement priceElement : priceElements) {
			String productPrice = priceElement.getText();
			String numericPrice = productPrice.replaceAll("[^0-9]", "");
			// Add the numeric price to the list
			numericPrices.add(Integer.parseInt(numericPrice));
		}

		// Sort the prices in ascending order
		Collections.sort(numericPrices);

		// Print prices in ascending order
		System.out.println("Prices in Ascending Order:");
		for (Integer price : numericPrices) {
			System.out.println("Price: " + price);
		}

		// Close the browser
		driver.quit();
	}
}