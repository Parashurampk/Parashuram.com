package TestPackages;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleCheckbox {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/Selenium-playground/checkbox-demo");
		
		List<WebElement> checkboxes = driver.findElements(By.className("cb-element mr-10"));

		// traverse through the list and select all checkboxes if they are enabled and
		// displayed.
		for (int i = 0; i < checkboxes.size(); i++) {
			if (checkboxes.get(i).isDisplayed() && checkboxes.get(i).isEnabled()) {
				System.out.println("Checkbox is displayed at index : " + i + " Clicking on it now");
				checkboxes.get(i).click();
			}
		}
	}
}
