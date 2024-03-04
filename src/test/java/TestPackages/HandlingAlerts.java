package TestPackages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
		driver.findElement(By.xpath("//body/div[@id='page']/div[2]"
				+ "/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/fieldset[1]/input[1]")).sendKeys("Parashuram");
		driver.findElement(By.xpath("//*[@id=\"alertbtn\"]" )).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();	
	}
}
