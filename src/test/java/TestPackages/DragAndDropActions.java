package TestPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable/");

		Thread.sleep(1000);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);

		// act.dragAndDrop(from, to).perform();
		// act.dragAndDropBy(from, 133, 22).perform();

		act.clickAndHold(from).moveToElement(to).release().build().perform();
		WebElement droppedMsg = driver.findElement(By.xpath("//div/p[text()='Dropped!']"));

		if (droppedMsg.isDisplayed()) {

			System.out.println("Success");

			System.out.println("Message is: " + droppedMsg.getText());

		} else {

			System.out.println("Failed");
		}
		Thread.sleep(1000);

		// driver.close();

	}

}
