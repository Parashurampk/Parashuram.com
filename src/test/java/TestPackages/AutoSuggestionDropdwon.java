package TestPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionDropdwon {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		driver.findElement(By.name("q")).sendKeys("java tutorials");

		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));

		System.out.println("Size of auto suggestions :" + list.size());

		for (WebElement ListItems : list) {
			if (ListItems.getText().contains("java tutorial oracle"));	
			Thread.sleep(3000);
			ListItems.click();
			break;
		}
	}

}
