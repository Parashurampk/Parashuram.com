/**
 * 
 */
package TestPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Parashuram Actions class : Mouseover- MouseRightClick- drag and
 *         drrop- slider- Resizable-
 *
 */
public class ActionClass {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php ");

		WebElement laptopNotebook = driver.findElement(By.xpath(" //div[@id='narbar-menu']/ul/li[2]/a"));
		WebElement showAll = driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[2]/div/a"));

		Actions act = new Actions(driver);
		act.moveToElement(laptopNotebook).moveToElement(showAll).click().build().perform();

		List<WebElement> allnames = driver
				.findElements(By.xpath("//*[@id=\"product-list\"]/div/form/div/div[2]/div[1]/h4/a"));
		System.out.println(allnames.size());

		for (WebElement webElement : allnames) {
			System.out.println("name of products :" + webElement.getText());
		}

		List<WebElement> alItemPrices = driver
				.findElements(By.xpath("//*[@id=\"product-list\"]/div/form/div/div[2]/div[1]/div/span[1]"));
		System.out.println(alItemPrices.size());

		for (WebElement webElement : alItemPrices) {
			System.out.println("prices of products :" + webElement.getText());
		}

	}

}
