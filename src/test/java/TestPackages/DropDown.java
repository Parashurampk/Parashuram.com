package TestPackages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.opencart.com/index.php?route=account/register");

		WebElement dropdown = driver.findElement(By.id("input-country"));

		Select select = new Select(dropdown);
		List<WebElement>allDpdwn=select.getAllSelectedOptions();
		for(WebElement alloption:allDpdwn)
		{
			if (alloption.equals("Cuba")) 
			{
				alloption.click();
				break;
			}
		}
		

	}
}