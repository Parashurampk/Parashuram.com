package TestPackages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		
		//implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String ExpectedDay = "25";
		String ExpectedMonth = "July";
		String ExpectedYear = "2023";

		driver.switchTo().frame(0);

		WebElement datepicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
		datepicker.click();

		while (true) {
			String calenderMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String calenderYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (calenderMonth.equals(ExpectedMonth) && calenderYear.equals(ExpectedYear)) 
			{
				List<WebElement> DaysList = driver.findElements(By.xpath("//table/tbody/tr/td"));
				for (WebElement e : DaysList) 
				{
					String calenderday = e.getText();
					if (calenderday.equals(ExpectedDay)) 
					{
						e.click();
						break;
					}
				}

				break;
			} else
			{
				driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
			}
		}

	}

}
