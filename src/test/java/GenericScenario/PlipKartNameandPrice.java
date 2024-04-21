package GenericScenario;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlipKartNameandPrice {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/search?q=tshirts&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		List<WebElement> pName = driver.findElements(By.xpath("//div[@class='_2B099V']//a[1]"));
		System.out.println("pCount : " + pName.size());
		
		for (int i = 0; i < pName.size(); i++) {

			String text = pName.get(i).getText();
			String str = text.replaceAll("[^a-zA-Z0-9]", " ");
			System.out.println(str);
		}
		
		List<WebElement> pPrice = driver.findElements(By.xpath("//div[@class='_30jeq3']"));
		System.out.println("pCount : " + pPrice.size());

		for (int i = 0; i < pPrice.size(); i++) {

			String text = pPrice.get(i).getText();
			String str = text.replaceAll("[^a-zA-Z0-9]","");
			System.out.println(str);
		}
	}
}
