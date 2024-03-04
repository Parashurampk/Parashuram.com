package TestPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HasMapUses {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php ");
		driver.manage().window().maximize();
		
		String	adminCredentials=Data.getUserInfo().get("user");
		String adminInfo[]	=adminCredentials.split("_");
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(adminInfo[0]);
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(adminInfo[1]);
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).submit();
	}

}
