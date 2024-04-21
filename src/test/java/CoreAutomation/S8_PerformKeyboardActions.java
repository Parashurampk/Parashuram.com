package CoreAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class S8_PerformKeyboardActions {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");

		WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		driver.switchTo().frame(frame);

		WebElement inputField = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		
		// Type text with keyboard actions
		inputField.sendKeys("Parashuram Walikindi");
		
		// Press Enter key
		inputField.sendKeys(Keys.ENTER);
		
		// Type special characters with keyboard actions
		 inputField.sendKeys(Keys.CONTROL, "a");
		 inputField.sendKeys(Keys.BACK_SPACE);
		
		 driver.close();
	}
}
