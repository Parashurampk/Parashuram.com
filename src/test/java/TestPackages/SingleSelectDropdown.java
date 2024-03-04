package TestPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");

		WebElement ele = driver.findElement(By.xpath("//select[@id='Skills']"));

		Select sel = new Select(ele);
		sel.selectByVisibleText("Android");

		WebElement firstEle = sel.getFirstSelectedOption();
		System.out.println("First element is :"+firstEle.getText());

		List<WebElement> listOption = sel.getOptions();
		for (WebElement allElement : listOption) {
			System.out.println(allElement.getText());

		}

	}

}
