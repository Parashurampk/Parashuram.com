package Generics;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException {

		Date currentdate = new Date(0);
		String screenshotfile = currentdate.toString().replace("", "-").replace(":", "-");
		System.out.println(screenshotfile);

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com.au/");
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//ScreenShots//" + screenshotfile + ".png"));
	}

}

/*
 * public static void screenShot(WebDriver driver, String filename) {
 * TakesScreenshot takesScreenshot = (TakesScreenshot) driver; File source =
 * takesScreenshot.getScreenshotAs(OutputType.FILE); try {
 * FileUtils.copyFile(source, new File(System.getProperty("user.dir") +
 * "\\ScreenShot\\" + filename + ".png")); } catch (Exception e) { // TODO
 * Auto-generated catch block e.getMessage(); } } }
 * 
 * 
 * TakesScreenshot screenshot = (TakesScreenshot)driver; File source =
 * screenshot.getScreenshotAs(OutputType.FILE); //Saving the screenshot in
 * desired location FileUtils.copyFile(source, new
 * File("./SeleniumScreenshots/Screen.png")); //Path to the location to save
 * screenshot
 */
