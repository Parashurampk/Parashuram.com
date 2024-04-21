package CoreAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class S2_Mousehover {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=common/home");
		
		WebElement LaptopsNotebooks = driver.findElement(By.xpath("//a[normalize-space()='Laptops & Notebooks']"));
		
		Actions actions= new Actions(driver);
		actions.moveToElement(LaptopsNotebooks).perform();
		
		
		WebElement windows = driver.findElement(By.xpath("//a[normalize-space()='Windows (0)']"));
		windows.click();
		
		driver.quit();

	}
}
