package Generics;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartScenario {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"))
				.sendKeys("iphone 13");
		driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();

		List<WebElement> iPhone_title = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> iPhone_price = driver.findElements(By.xpath("//div[@class='_25b18c']"));
		System.out.println(iPhone_price.size());

		Map<String, Long> products_map = new HashMap<>();

		for (int i = 0; i < iPhone_title.size(); i++) {
			String title = iPhone_title.get(i).getText();
			String priceText = iPhone_price.get(i).getText();
			long price = parsePrice(priceText);

			products_map.put(title, price);
		}

		for (Entry<String, Long> entry : products_map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		System.out.println("*************************************************");
		
        // Print sorted prices
        System.out.println("Sorted Prices:");
        for (Long price : products_map.values()) {
            System.out.println(price);
        }

		// Find and print the highest and lowest prices
		long highestPrice = Collections.max(products_map.values());
		long lowestPrice = Collections.min(products_map.values());

		System.out.println("Highest Price: " + highestPrice);
		System.out.println("Lowest Price: " + lowestPrice);

		driver.quit();
	}

	private static long parsePrice(String priceText) {
		String cleanedPriceText = priceText.replaceAll("[^0-9]", ""); // Remove non-numeric characters and parse as a
																		// long
		try {
			return Long.parseLong(cleanedPriceText);
		} catch (NumberFormatException e) {
			System.err.println("Error parsing price: " + e.getMessage());
			return 0L; // Default value or throw a more informative exception
		}
	}
}
