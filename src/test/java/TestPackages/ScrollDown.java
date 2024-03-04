package TestPackages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Cognizant");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,2000);");
	}

}
