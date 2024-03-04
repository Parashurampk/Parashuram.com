package Generics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileUsingSendkeys {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		WebElement chooseFile = driver.findElement(By.id("fileupload1"));
		act.moveToElement(chooseFile).perform();
		Thread.sleep(1000);
		chooseFile.sendKeys("C:\\Users\\Hitendra\\Desktop\\TestFile.txt");
	}
}
