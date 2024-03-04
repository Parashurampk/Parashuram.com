package Generics;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SDETDem2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.flipkart.com/");
		driver.navigate().to("https://www.flipkart.com/");

		Set<String> windowIds = driver.getWindowHandles();

		for (String windiwid : windowIds) {
			driver.switchTo().window(windiwid);
			System.out.println("Title is : " + driver.getTitle());
			System.out.println("CurrentUrl is : " + driver.getCurrentUrl());
		}

		// Print the titles using lambda expression
		windowIds.forEach(winid -> System.out.println(driver.switchTo().window(winid).getTitle()));

		driver.quit();
	}

}
