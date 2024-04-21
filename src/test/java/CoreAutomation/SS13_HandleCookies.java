package CoreAutomation;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SS13_HandleCookies {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		Cookie cookie = new Cookie("cookie-name", "cookie-value");
		driver.manage().addCookie(cookie);

		Set<Cookie> cookies = driver.manage().getCookies();

		driver.manage().deleteCookie(cookie);

		driver.manage().deleteAllCookies();

	}
}
