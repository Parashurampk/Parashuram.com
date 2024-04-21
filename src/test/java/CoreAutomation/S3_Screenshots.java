package CoreAutomation;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S3_Screenshots {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		// Generate timestamp
		LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
        String timestamp = now.format(formatter);

		// Take the screenshot
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// Define the destination file path including file name and extension
		File destFile = new File("./Screenshots/screenshot" +timestamp+ ".png");

		// Copy the screenshot to the destination file
		FileUtils.copyFile(scrFile, destFile);

		driver.quit();
	}
}

//************For entire page
//File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(scrFile, new File("./Screenshots/screenshot1.png"));

//************For specific element
//File scrFile = email.getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(scrFile, new File("./Screenshots/screenshot1.png"));
