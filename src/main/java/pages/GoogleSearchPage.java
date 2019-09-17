package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	
	 //static WebElement element = null;
	public static WebElement textBoxSearch(WebDriver driver) {
		
	WebElement element=driver.findElement(By.name("q"));
	return element;
		
	}
	
	public static WebElement buttonSearch(WebDriver driver) {
		WebElement element = driver.findElement(By.name("btnK"));
		return element;
		
	}

}
