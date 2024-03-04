/**
 * 
 */
package TestPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Parashuram
 *
 */
public class FlipkartNameAndPrice {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/ ");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]")).click();
		
		Thread.sleep(3000);
		List<WebElement>allProductsName=driver.findElements(By.xpath("/html[1]/body/div/div/div/div/div/div/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]"));
		System.out.println(allProductsName.size());
		
		for (WebElement webElement : allProductsName) {
			System.out.println("Products name : "+webElement.getText());
		}
		
		List<WebElement>allProductsPrice=driver.findElements(By.xpath("//*[@id=\"container\"]/div/div/div/div/div/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div[1]"));
		System.out.println(allProductsPrice.size());
		
		for (WebElement webElement : allProductsPrice) {
//			System.out.println("Product Prices :"+ webElement.getText());
			
			
		}
	}

}
