package Generics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QulityInterview {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

		WebElement searchElement = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		searchElement.sendKeys("Mac");
		searchElement.submit();
		
		WebElement clickBtn = driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']"));
		clickBtn.click();

		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='category_id']"));
		Select select = new Select(dropdownElement);

		List<WebElement> values = select.getOptions();

		// Extracting text from dropdown options before sorting
		System.out.println("Before sorting:");
		for (WebElement e : values) {
			System.out.println(e.getText());
		}

		// Sorting the dropdown options
		values.sort((a, b) -> a.getText().compareToIgnoreCase(b.getText()));

		// Extracting text from dropdown options after sorting
		System.out.println("After sorting:");
		for (WebElement e : values) {
			System.out.println(e.getText());
		}

		driver.quit();
	}
}
