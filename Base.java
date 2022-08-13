package net.timeandtraining.automation;

import java.time.Duration;
//import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Base{
public static WebDriver getdriver() {
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

return driver;

}

 
	}

