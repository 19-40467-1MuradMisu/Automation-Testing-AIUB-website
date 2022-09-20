package net.timeandtraining.automation;

//import net.timeandtraining.automation.FileReaderDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {

	public static void main(String[] args) {
		 FileReaderDemo fr = new FileReaderDemo("C:\\Users\\Misu\\eclipse-workspace\\LearningSelenium\\src\\net\\timeandtraining\\automation\\forinput.txt");
	        String username=fr.getData(0)[0];
	        String password=fr.getData(0)[1];
	 
	WebDriver driver=Base.getdriver();
	driver.get("https://www.aiub.edu/");
	WebElement element=driver.findElement(By.xpath("//span[@class='d-none d-md-inline d-xs-none']"));
	element.click();
	// for clicking any object
	
	element=driver.findElement(By.xpath("//input[@id='username']"));
	element.sendKeys(username);
	element=driver.findElement(By.xpath("//input[@id='password']"));
	element.sendKeys(password);
	element=driver.findElement(By.xpath("//button[@type='submit']"));
	element.click();
	driver.quit();
	
	//element=driver.findElement(By.xpath("//span[@class='fa fa-sign-out']"));
	//element.click();
	
	WebElement text=driver.findElement(By.xpath( "//div[@class='alert alert-danger text-center']"));
	text.getText();
	
	
    String header_text=text.getText();
 
    System.out.println(header_text);
	
    element=driver.findElement(By.xpath("//span[@class='fa fa-sign-out']"));
	element.click();
 
 
	
	
}
}
