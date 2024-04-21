package GenericScenario;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionsHeadless_Demo {
	public static void main(String[] args) {

		/// WebDriverManager downloads chrome browser executables or binaries.
        WebDriverManager.chromedriver().setup();
 
        // Create an object of Chrome Options class
        ChromeOptions options = new ChromeOptions();
 
        // pass the argument –headless to Chrome Options class.
        options.addArguments("--headless");
 
        // Create an object of Chrome Driver class and pass the Chrome Options object as
        // an argument
        ChromeDriver driver = new ChromeDriver(options);
 
        System.out.println("Executing Chrome Driver in Headless mode..");
        driver.get("https://duckduckgo.com/");
 
        System.out.println("Title of Page :" + driver.getTitle());
        System.out.println("Page URL  : " + driver.getCurrentUrl());
 
        // Close the driver
        driver.quit();
 
    }
 
}