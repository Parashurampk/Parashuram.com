package CoreAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class S5_HandleFrames {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");

        // Switch to the iframe
        WebElement frame1 = driver.findElement(By.id("iframeResult"));
        driver.switchTo().frame(frame1);

        // Perform actions within the iframe
        driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();

        // Handle alert
        String alertText = driver.switchTo().alert().getText();
        System.out.println(alertText);
        Thread.sleep(1000); // Added a sleep to give time to see the alert
        driver.switchTo().alert().accept();

        // Switch back to the parent frame
        driver.switchTo().parentFrame();

        // Print title of the page outside the frame
        System.out.println(driver.getTitle());

        // Close the browser
        driver.quit();
    }
}















