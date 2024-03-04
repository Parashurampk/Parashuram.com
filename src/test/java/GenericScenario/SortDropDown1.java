package GenericScenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortDropDown1 {

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

		System.out.println(allOptions.size());

		// Extracting text from dropdown options before sorting
		System.out.println("Before sorting:");
		for (WebElement e : allOptions) {
			System.out.println(e.getText());
		}

		// Sorting the dropdown options in ascending order
		allOptions.sort((a, b) -> a.getText().compareToIgnoreCase(b.getText()));
		
		// Sorting the dropdown options in descending order
		allOptions.sort((a, b) -> b.getText().compareToIgnoreCase(a.getText()));


		// Extracting text from dropdown options after sorting
		System.out.println("After sorting:");
		for (WebElement e : allOptions) {
			System.out.println(e.getText());
		}

		driver.quit();
	}
}