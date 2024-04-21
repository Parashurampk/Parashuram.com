package CoreAutomation;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SS12_PopupAndChildWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/nlogin/login?URL=https://www.naukri.com/mnjuser/homepage");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("walikindi@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("3ae12ec048");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[normalize-space()='Services']")).click();

		String parentWinID = driver.getWindowHandle();
		Set<String> allWinID = driver.getWindowHandles();
		for (String allIDs : allWinID) {
			System.out.println(allIDs);
		}
		Iterator<String> itr = allWinID.iterator();
		while (itr.hasNext()) {
			String newTab = itr.next();
			if (!parentWinID.equalsIgnoreCase(newTab)) {
				driver.switchTo().window(newTab);
				System.out.println("newTab Win Title is:" + driver.getTitle());
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(parentWinID);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}
