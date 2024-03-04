package TestPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HasMapUses2 {
	
	public WebDriver driver;
	public String credentials;
	public String credentialsInfo[];
	
	@BeforeMethod
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/index.php ");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void loginWithAdminUserTest() {
		
		credentials=Data.getUserInfo().get("admin");
		credentialsInfo=credentials.split("_");
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(credentialsInfo[1]);
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).submit();
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
	}
	
	@Test(priority = 2)
	public void loginWithUserTest() {
		
		credentials=Data.getUserInfo().get("user");
		credentialsInfo=credentials.split("_");
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(credentialsInfo[1]);
		driver.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).submit();
	}
		
		
}


