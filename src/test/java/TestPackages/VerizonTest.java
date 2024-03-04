package TestPackages;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerizonTest {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.verizon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("(//ul[@class='gnav20-footer-list'])[1]/li[2]"));
		js.executeScript("arguments[0].scrollIntoView()", ele);

		List<WebElement> lists = driver.findElements(By.xpath("(//ul[@class='gnav20-footer-list'])[1]/li"));
		System.out.println(lists.size());
		
		for (WebElement names : lists) {
			System.out.println(names.getText() + " - " + names.getAttribute("href"));
		}

	}

}
