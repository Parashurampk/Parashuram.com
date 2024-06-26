package CoreAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SS17_HandleSSLcertificate {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();// Create ChromeOptions instance

		options.addArguments("--disable-notifications");// Disable browser notifications

		options.setAcceptInsecureCerts(true); // Accept SSL certificates
		
		WebDriver driver = new ChromeDriver(options);// Launch Chrome browser with options

		driver.manage().window().maximize();

		driver.get("https://www.ebay.com.au/");
	}
}
