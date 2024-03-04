package TestPackages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tables {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://en.wikipedia.org/wiki/Cognizant");
		driver.manage().window().maximize();

//		JavascriptExecutor jse = (JavascriptExecutor) driver;
//		jse.executeScript("window.scrollBy(0,2000);");

		List<WebElement> allheader = driver
				.findElements(By.xpath("//th[contains(text(),'Company acquired')]//following::tbody[1]/tr/td[1]"));
		
		System.out.println("Total number of header size :" +allheader.size());
		
		for(int i=1;i<allheader.size();i++)
		{														//Get the Company acquired column full data
			String dataString=driver.findElement(By.xpath("//th[contains(text(),'Company acquired')]//following::tbody[1]/tr["+i+"]/td[1]")).getText();
			System.out.println(dataString);
		}

		//System.out.println("Total number of header size :" +allheader.size());

		for (WebElement ele : allheader) {
			String value = ele.getText();
			System.out.println(value);
		}

		System.out.println("************************************************************************");

		List<WebElement> allrows = driver
				.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']//td"));
		System.out.println("Total number of rows :" +allrows.size());

		for (WebElement ele : allrows) {
			String value = ele.getText();
			System.out.println(value);
		}
		
		System.out.println("************************************************************************");
	}
}
















