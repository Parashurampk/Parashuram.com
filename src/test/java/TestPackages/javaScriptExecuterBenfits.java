package TestPackages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecuterBenfits 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.uitestpractice.com/Students/Index");
	}
	public static void drawBorder(WebElement element, WebDriver driver) { //draw broder around web element
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	public static void generateAlert(WebDriver driver, String alertMessage) { //To generate alert message
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + alertMessage + "')");

	}
	public static void refreshBrowserByJS(WebDriver driver) { //Refresh web browser
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	public static void scrollPgDown(WebDriver driver) { //Scroll  web page down till end
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void ScrollVerticallyPgUp(WebDriver driver) {	//scroll vertically page up
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}	
	public static void scrollIntoView(WebElement element, WebDriver driver) {//Scroll till visibility of web element
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public static String getDomainByJavaScript(WebDriver driver)	//get domain name
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String domain =	js.executeScript("return document.domain;").toString();
		return domain;
	}
	public static String getTitleByJavaScript(WebDriver driver)//Get Title of the web page
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title =	js.executeScript("return document.title;").toString();
		return title;
	}
	public static String getURLByJavaScript(WebDriver driver)//get URL of the web page
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String url =	js.executeScript("return document.URL;").toString();
		return url;
	}

	public static void clickElementByJavaScript(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}
	public static void flash(WebElement element, WebDriver driver) {//Flash web element
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String backcolor = element.getCssValue("backgroundColor");

		for (int i = 0; i < 300; i++) {
			changeColor("#000000", element, driver);
			changeColor(backcolor, element, driver);
		}
	}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}


}