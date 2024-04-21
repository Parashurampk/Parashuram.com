package CoreAutomation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SS19_HandleFileDownloads {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		// Set download directory
		options.addArguments("--download.default_directory=/path/to/download/directory");
		// Launch Chrome browser with options
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		Cookie cookie = new Cookie("cookie-name", "cookie-value");
		driver.manage().addCookie(cookie);

		// Switch to iframe
		driver.switchTo().frame("iframeResult");

		// Wait for the prompt to appear
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert element = wait.until(ExpectedConditions.alertIsPresent());

		// Handle the prompt
		driver.switchTo().alert().accept();

		// Switch back to default content
		driver.switchTo().defaultContent();

		// Perform actions that trigger file download
		WebElement downloadButton = driver.findElement(By.id("download-button"));
		downloadButton.click();
	}
}
