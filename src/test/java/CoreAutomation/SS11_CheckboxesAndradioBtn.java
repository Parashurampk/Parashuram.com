package CoreAutomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SS11_CheckboxesAndradioBtn {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");

		WebElement radioButton = driver.findElement(By.xpath("(//input[@id='vfb-7-1'])[1]"));
		if (!radioButton.isSelected()) {
			radioButton.click();
		}

		//Single checkBox
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		if (!checkbox.isSelected()) {
			checkbox.click();
		}
		
		//Multiple checkBox
		List<WebElement> checkbox2 = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox2.size());
	
		
		for(WebElement e:checkbox2) {
			e.click();
		}
	}

}
