package net.timeandtraining.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {

	public static void main(String[] args) {
	 
	WebDriver driver=Base.getdriver();
	driver.get("https://www.aiub.edu/");
	WebElement element=driver.findElement(By.xpath("//span[@class='d-none d-md-inline d-xs-none']"));
	element.click();
	// for clicking any object
	
	element=driver.findElement(By.xpath("//input[@id='username']"));
	element.sendKeys("19-40467-1");
	element=driver.findElement(By.xpath("//input[@id='password']"));
	element.sendKeys("14901150");
	element=driver.findElement(By.xpath("//button[@type='submit']"));
	element.click();
	
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
