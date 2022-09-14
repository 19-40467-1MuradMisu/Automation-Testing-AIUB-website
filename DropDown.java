package net.timeandtraining.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver=Base.getdriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement courseNameElement = driver.findElement(By.id("ide"));
		Select course_dd = new Select(courseNameElement);
		course_dd.selectByIndex(0);
		Thread.sleep(2000);
		course_dd.selectByValue("ij");
		Thread.sleep(2000);
		course_dd.selectByVisibleText("Visual Studio");
		Thread.sleep(2000);
		driver.close();
	}

}
