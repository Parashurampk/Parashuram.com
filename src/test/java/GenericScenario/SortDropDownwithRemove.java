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

public class SortDropDownwithRemove {

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

		List<WebElement> allOptionsElement = select.getOptions();	// Get all options

		List<String> options = new ArrayList<String>();// Creating a list to store drop down options

		for (WebElement optionElement : allOptionsElement) {
			options.add(optionElement.getText());
		}
		
		options.remove("All Categories");// Removing "Please select" option as it is not actual option

		System.out.println("Options in dropdown with Default order :" + options);

		// Creating a temp list to sort
		List<String> tempList = new ArrayList<String>(options);

		Collections.sort(tempList);
		System.out.println("Sorted List " + tempList);

		boolean ifSortedAscending = options.equals(tempList);

		if (ifSortedAscending) {
			System.out.println("List is sorted");
		} else
			System.out.println("List is not sorted.");

		driver.quit();

	}
}
