/**
 * 
 */
package Generics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Parashuram
 * Browser Specific Commands
 * Browser Navigation Commands and,
 * Element Specific Commands
 */
public class WebDriverCommands {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		/*********Browser Specific Commands:*******/
		driver.manage().window().maximize();//1. Maximize window:
		driver.manage().deleteAllCookies();	//2. Delete cookies	
		driver.get("https://en.wikipedia.org/wiki/Cognizant");//3. Enter url:
		String title = driver.getTitle();//4. GetTitle:
		driver.getCurrentUrl();//5. GetCurrentUrl:	
		boolean result = driver.getPageSource().contains("String to find");//6. GetPageCource:	
		driver.close();//7. Close:
		driver.quit();//8. Quit
		/*********Browser Navigation Commands:*******/
		driver.navigate().to("www.automationtestinginsider.com"); //1. Navigate To:	
		driver.navigate().back(); //2. Backward:
		driver.navigate().forward();//3. Forward:
		driver.navigate().refresh();//4. Refresh:

		/*************Element Specific Commands:***********/
		driver.findElement(By.id("userName")).sendKeys("Admin");//1. Clear:
		driver.findElement(By.id("button")).click();//2. Click:	
		String elementText = driver.findElement(By.id("Text")).getText();//3. getText:
		boolean ele= driver.findElement(By.id("button")).isSelected();//4. IsSelected:
		boolean ele1= driver.findElement(By.id("button")).isEnabled();//5. IsEnabled:
		boolean ele11= driver.findElement(By.id("button")).isDisplayed();//6. IsDisplayed:	
		driver.findElement(By.id("findID")).getAttribute("value");//7. getAttribute:
		driver.findElement(By.id("userName")).sendKeys("Admin");//8. sendkeys:
		//9. Submit:
		//10. getSize:	
		//11. getCssValue: - getCssValue method in selenium fetches the value of a CSS property of an web element.	
		//12. getLocation: In Selenium WebDriver APIs, there is a method getLocation() which returns point, containing location of top left hand corner of the element. Let's say, it returns (x, y).
		//13. getTagname: This method gets the tag name of this element. This accepts nothing as a parameter and returns a String value. Command – element.getTagName();
		/*************Waits:***********/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //implicitlyWait
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));//Explicit Wait
		WebElement	Element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("DropDwon")));
		Element.click();
		
		Wait<WebDriver>wait2=new FluentWait<WebDriver>(driver)//FluentWait
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.withMessage("This is custom messages")
				.ignoring(NoSuchElementException.class);
	}
}
