package net.timeandtraining.automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;

public class Multiple_window_handler {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=Base.getdriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String Handle1=driver.getWindowHandle();
		System.out.println("parent page -"+ Handle1);
		WebElement element=driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		element.click();
		Set<String> Handles=driver.getWindowHandles();
		for (String Handle : Handles) {
			if(!Handle.equals(Handle1)) {
				//if (driver.getTitle().contains("XPath Practice- H Y R Tutorials")){
				driver.switchTo().window(Handle);
				System.out.println(Handle);
				driver.findElement(By.xpath("//input[@class='firstName']")).sendKeys("misu");
				//System.out.println(Handle);
				Thread.sleep(5000);
				driver.close();
				}
			}
		
		driver.switchTo().window(Handle1);
		
		//driver.switchTo().newWindow(WindowType.TAB);
	    Thread.sleep(10000);
		driver.close();
		}
		
		//Thread.sleep(2000);
		//driver.quit();
}
 