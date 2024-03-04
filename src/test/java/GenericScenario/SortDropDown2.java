package GenericScenario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortDropDown2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");

		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Mac");
		driver.findElement(By.xpath("(//i[@class='fa fa-search'])[1]")).click();

		WebElement selectElement = driver.findElement(By.xpath("//select[@name='category_id']"));

		Select select = new Select(selectElement);

		List<WebElement> allOptions = select.getOptions();

		List<String> optionTexts = new ArrayList<>();
		for (WebElement option : allOptions) {
			String optionText = option.getText();
			optionTexts.add(optionText);
		}

		Collections.sort(optionTexts);

		System.out.println("Options in Ascending Order:");
		for (String optionText : optionTexts) {
			System.out.println(optionText);
		}

		driver.quit();
	}
}