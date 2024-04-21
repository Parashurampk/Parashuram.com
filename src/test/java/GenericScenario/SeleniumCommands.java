package GenericScenario;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumCommands {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		/***************Browser Specific Commands*******************/
		
		driver.manage().window().maximize();// 1. Maximize window:
		driver.manage().deleteAllCookies(); // 2. Delete cookies
		driver.get("www.google.com");// 3. Enter url:
		String title = driver.getTitle();// 4. GetTitle:
		driver.getCurrentUrl();// 5. GetCurrentUrl:
		boolean result = driver.getPageSource().contains("String to find");// 6. GetPageCource:
		driver.close();// 7. Close:
		driver.quit();// 8. Quit
		driver.manage().deleteAllCookies(); // deleteCookies
		driver.manage().deleteCookieNamed("CookieName");
		driver.manage().deleteCookie(null);

		/***************Browser Navigation Commands*******************/
		
		driver.get("https://www.example.com");
		driver.navigate().to("www.google.com"); //1.Navigate To:
		driver.navigate().back(); // 2. Backward:
		driver.navigate().forward();// 3. Forward:
		driver.navigate().refresh();// 4. Refresh:

		// Element Specific Commands:
		driver.findElement(By.id("userName")).sendKeys("Admin");// 1. Clear:
		driver.findElement(By.id("button")).click();// 2. Click:
		String elementText = driver.findElement(By.id("Text")).getText();// 3. getText:
		boolean ele = driver.findElement(By.id("button")).isSelected();// 4. IsSelected:
		boolean ele1 = driver.findElement(By.id("button")).isEnabled();// 5. IsEnabled:
		boolean ele11 = driver.findElement(By.id("button")).isDisplayed();// 6. IsDisplayed:
		driver.findElement(By.id("findID")).getAttribute("value");// 7. getAttribute:
		driver.findElement(By.id("userName")).sendKeys("Admin");// 8. sendkeys:
		
		//9. Submit:
		//10. getSize:	
		//11. getCssValue: fetches the value of a CSS property of an web element.	
		//12. getLocation: which returns point, containing location of top left hand corner of the element. Let's say, it returns (x, y).
		//13. getTagname: This method gets the tag name of this element. This accepts nothing as a parameter and returns a String value. Command – element.getTagName();
		
		// Print the Title of the Page
		System.out.println("Page Title: " + driver.getTitle());

		// Get text
		WebElement getTextElement = driver.findElement(By.id("getTextElementId"));
		String elementText1 = getTextElement.getText();
		
		// Get attribute
		String attributeValue = getTextElement.getAttribute("attributeName");
		System.out.println("Attribute Value: " + attributeValue);

		// pageLoadTimeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		/****************************Waits*******************************/
		// implicitlyWait:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// ExplicitlyWait:
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Element = wait.until(ExpectedConditions.elementToBeClickable(By.id("DropDwon")));
		Element.click();


		// FluentWait:
		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).withMessage("This is custom messages")
				.ignoring(NoSuchElementException.class);
		WebElement Element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("DropDwon")));
		Element1.click();
		
		/****************************Assert*******************************/
		Assert.assertEquals(true, false);
		SoftAssert softAssert = new SoftAssert();

		/****************************switchTo Frame*******************************/
		driver.switchTo().frame(0);
		driver.switchTo().defaultContent();
		Alert alert = driver.switchTo().alert();

		/****************************JavascriptExecutor*******************************/
		// Scroll up or down by pixel
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(1000,0)");

		// Scroll down by Visibility of Element
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		WebElement ele111 = driver.findElement(By.id("simpleAlert"));
		js1.executeScript("arguments[0].scrollIntoView()", ele);

		// Visibility by wait
		WebElement visibleElement = driver.findElement(By.id("visibleElementId"));
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait1.until(ExpectedConditions.visibilityOf(visibleElement));

		// Scroll down by end of the page
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		/******************WindowHandle**********************/
		String handlers = driver.getWindowHandle(); // parent window id
		Set<String> handlers1 = driver.getWindowHandles(); // all the window id

		// Disable a Field
		WebElement disableField = driver.findElement(By.id("disableFieldId"));
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('disabled','disabled');", disableField);

		// Enable a Field
		WebElement enableField = driver.findElement(By.id("enableFieldId"));
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('disabled');", enableField);

		/****************** Screenshot**********************/
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("path/to/screenshot.png"));

		// Input some text
		WebElement inputText = driver.findElement(By.id("textInputId"));
		inputText.sendKeys("Hello, Selenium!");

		// Send keyboard actions - press `Ctrl+A` and `Backspace`
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		/**************** Get the select element and get all options***************************/
		
		WebElement selectElement = driver.findElement(By.id("selectElementId"));
		Select dropdown = new Select(selectElement);
		List<WebElement> options = dropdown.getOptions();

		// Print all options
		for (WebElement option : options) {
			System.out.println("Option: " + option.getText());
		}

		driver.findElement(By.id("input-firstname"));
		driver.findElement(By.name("firstname"));
		driver.findElement(By.linkText("login page"));
		driver.findElement(By.partialLinkText("login pa"));
		driver.findElement(By.className("list-group mb-3"));
		driver.findElement(By.tagName("div"));
		driver.findElement(By.cssSelector("#input-firstname"));
		driver.findElement(By.xpath("//input[@id='input-firstname']"));

		// Xpath by attributes : //tag[@AN='AV']
		driver.findElement(By.xpath("//input[@id='input-firstname']"));

		// Xpath by multiple attributes : //tag[@AN='AV' and @AN='AV']
		driver.findElement(By.xpath("//input[@id='input-firstname' and @name='firstname']"));

		// Using text() : //tag[text()='tv']
		driver.findElement(By.xpath("//label[text()='Subscribe']"));

		// Partial dynamic Elements : //tag[contains(text,'tv')]
		driver.findElement(By.xpath("//label[contains(text,'Subscribe')]"));

		// Partial dynamic attributes : //tag[contains(@AN,'AV')]
		driver.findElement(By.xpath("//input[contains(@id='input-firstname')]"));
		
		// Sibling functions (c-c) elements : //tagname[@AN='AV']//following::tagname
		// tagname[@AN='AV']//preceding::tagname
		// tagname[@AN='AV']//preceding-sibling ::tagname
		// Xpath by grop by index : (//tag[@AN='AV'])[2]

		// normalize : //a[normalize-space()='Order Now']
		
		 driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		    WebElement revealed = driver.findElement(By.id("revealed"));
		    driver.findElement(By.id("reveal")).click();

		    Wait<WebDriver> wait11 = new WebDriverWait(driver, Duration.ofSeconds(2));
		    wait11.until(d -> revealed.isDisplayed());
		    
		    driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		    WebElement revealed1 = driver.findElement(By.id("revealed"));
		    driver.findElement(By.id("reveal")).click();

		    Wait<WebDriver> wait111 =
		        new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(2))
		            .pollingEvery(Duration.ofMillis(300))
		            .ignoring(ElementNotInteractableException.class);

		    wait111.until(
		        d -> {
		          revealed1.sendKeys("Displayed");
		          return true;
		        });

		    driver.get("https://the-internet.herokuapp.com/upload");
		    File uploadFile = new File("src/test/resources/selenium-snapshot.png");

		    WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
		    fileInput.sendKeys(uploadFile.getAbsolutePath());
		    driver.findElement(By.id("file-submit")).click();

		    WebElement fileName = driver.findElement(By.id("uploaded-files"));
		    //Assertions.assertEquals("selenium-snapshot.png", fileName.getText());
		    
		    //How to input text into the text box fields without calling the sendKeys()?
		    JavascriptExecutor executor = (JavascriptExecutor) driver;
		    executor.executeScript("document.getElementById('textbox_id').value = 'new value';");
		    

	}
}
