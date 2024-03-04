package TestPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectDropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");

		WebElement ele = driver.findElement(By.xpath("//select[@id='multiple-select-example']"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("Apple");
		sel.selectByVisibleText("Orange");
		
		List<WebElement>selectedDwn=sel.getAllSelectedOptions();
		for (WebElement webElement : selectedDwn) {
			System.out.println("All selected dropdwons are :"+webElement.getText());
		}
		
		List<WebElement>allDropDwns=sel.getOptions();
		for (WebElement webElement : allDropDwns) {
			System.out.println("All dropdown list elements are :"+webElement.getText());
		}
	}

}
