package TestPackages;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTesting {

	static WebDriver driver;

	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(dataProvider = "LoginData")
	public void loginTest(String user, String pwd, String exp) throws InterruptedException {

		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
		Thread.sleep(3000);
		
		String exp_title = "My account - My Store";
		String act_title = driver.getTitle();
		System.out.println(act_title);

		if (exp.equals("valid")) {
			if (exp_title.equals(act_title)) {
				driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		} else if (exp.equals("Invalid")) {
			if (exp_title.equals(act_title)) {
				driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")).click();
				Assert.assertTrue(false);
			}
		} else {
			Assert.assertTrue(true);
		}

	}

	@DataProvider(name = "LoginData")
	public Object[][] getData() {

		Object loginData[][] = {

				{ "software99testing@gmail.com", "7019679975", "valid" }, 
				{ "admin1", "abcbd1", "invalid" },
				{ "admin123", "abcbd23", "invalid" }, 
				{ "admin345", "abcbd34", "invalid" },
				};
		return loginData;
	}

	@AfterClass
	public void tearDown() {
		driver.close();
	}
}