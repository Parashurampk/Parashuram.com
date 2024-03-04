package TestPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingWebTable {
	
	@Test
	public void verifyTable() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		
		List<WebElement>allHeaders=driver.findElements(By.xpath("//table[@id='product']//th"));
		System.out.println("WebTable header size is :" +allHeaders.size());
    	Assert.assertEquals(allHeaders.size(),3,"Cloumn count is not matching");
		
		for (WebElement value : allHeaders) {
			System.out.println(value.getText());
			
			}
	}
}


























