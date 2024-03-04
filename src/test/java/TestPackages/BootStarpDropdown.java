package TestPackages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


/*The bootstrap dropdown is an enhanced part of the dropdown where you will deal with UL, LI, DIV, SPAN etc tag of HTML. 
 * An example of Bootstrap dropdown is below. To handle this kind of drop-down we have to use findElements method 
 * and then we can run a for loop to get specific elements.
 *
 */
public class BootStarpDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationtestinginsider.com/2019/12/bootstrap-dropdown-example_12.html");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,500)");

		driver.findElement(By.xpath("//button[@id='bootstrapmenu']")).click();
		List<WebElement> dropdwonoptions = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li//a"));

		for (WebElement ele : dropdwonoptions) 
		{
			String value = ele.getText();
			System.out.println(value);

			if (value.equalsIgnoreCase("contact us"))
			{
				ele.click();
				break;
			}
		}	
		Thread.sleep(2000);
		driver.close();
	}
}
