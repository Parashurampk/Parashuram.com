package TestPackages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleSSLError {

		public static void main(String[] args){
			WebDriverManager.chromedriver().setup();
			
			//Global profile
			DesiredCapabilities dc=new DesiredCapabilities();
			//dc.setAcceptInsecureCerts(true);
		//	dc.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		//	dc.setCapability(CapabilityType.Accept_SSL_CERTS, true);
			
			ChromeOptions options=new ChromeOptions();
			options.merge(dc);
			
//			options.addArguments("--headless"); //headless browser
			
			ChromeDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://expired.badssl.com/");

	}

}






















