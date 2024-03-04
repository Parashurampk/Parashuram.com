package GenericScenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PilpkartSortPriceNameAndPrice {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Mobiles");		
		driver.findElement(By.xpath("(//*[name()='svg'])[1]")).click();

		Thread.sleep(5000);

		// Find all elements for product names and prices
		List<WebElement> name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));

		// Print product names and prices
		for (int i = 0; i < name.size(); i++) {
			WebElement nameElement = name.get(i);
			WebElement priceElement = price.get(i);

			String productName = nameElement.getText();
			String productPrice = priceElement.getText();
			String newPrice = productPrice.replaceAll("[^0-9]", "");

			System.out.println("Product:-- " + productName + "_____ Price:-- " + newPrice);
		}

		// Close the browser
		driver.quit();
	}
}