package TestPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchToIframe {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement frame=driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Parashuram");
		
		driver.switchTo().defaultContent();
		
		WebElement SecondTab=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
		SecondTab.click();
	}

}
