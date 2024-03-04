package TestPackages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiplewindowPopup2 {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		String parentWindowId = driver.getWindowHandle();

		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

		Set<String> handles = driver.getWindowHandles();
		List<String> hList = new ArrayList<String>(handles);

		if (switchToRightwindow("Facebook", hList)) {
			System.out.println(driver.getCurrentUrl() + ":" + driver.getTitle());}
		closeAllWindows(hList, parentWindowId);
		switchparentWindowId(parentWindowId);
		System.out.println(driver.getCurrentUrl() + ":" + driver.getTitle());
	}
	private static void switchparentWindowId(String parentWindowId) {
		driver.switchTo().window(parentWindowId);
	}
	public static void closeAllWindows(List<String> hList, String parentWindowId) {
		for (String e : hList) {
			if (!e.equals(parentWindowId)) {
				driver.switchTo().window(e).close();
	}}}
	public static boolean switchToRightwindow(String windowTitle, List<String> hList) {
		for (String e : hList) {

			String title = driver.switchTo().window(e).getTitle();
			if (title.contains(windowTitle)) {
				System.out.println("Found the right window...");
				return true;
			}}
		return false;
	}
}
