package GenericScenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SDETPrintAllLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (WebElement link : links) {
			System.out.println(link.getText());
		}

		// Printing linkTexts using lambda expression
		links.forEach(link -> System.out.println(link.getText()));

		// Processing elements using stream -> filter
		long workingLinks = links.stream().filter(link -> link.getAttribute("href") != null).count();

		System.out.println("Working link:" + workingLinks);

		driver.close();

	}

}
