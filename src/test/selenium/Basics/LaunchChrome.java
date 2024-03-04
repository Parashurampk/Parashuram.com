package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {
	public static void main(String[] args) {

		// chrome 111.x
		// selenium 4.8.2--> 4.8.3

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://naveenautomationlabs.com");

		System.out.println(driver.getTitle());
		driver.quit();

	}

}
