package GenericScenario;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://vditoolbox.com/manage/wyse-management-suite/");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		List<WebElement> elements = driver.findElements(By.tagName("a"));

		List<String> links = new ArrayList<>();
		for (WebElement element : elements) {

			String href = element.getAttribute("href");
			// If href is not null and not empty, add it to the list
			if (href != null && !href.isEmpty()) {
				links.add(href);
			}
		}

		// Print total number of links found
		System.out.println("Total links: " + links.size());

		// Print all the links
		for (String link : links) {
			System.out.println(link);
		}

		// Close the browser
		driver.quit();
	}
}
