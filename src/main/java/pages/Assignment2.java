package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Assignment2 {
	WebDriver driver = null;
	By input_message = By.id("user-message");
	By show_message = By.xpath("//*[@id=\'get-input\']//button");
	//By show_enteredmessage = By.id("user-message");
	By enter_a = By.id("sum1");
	By enter_b = By.id("sum2");
	By get_total = By.xpath("//button[contains(text(),'Get Total')]");
	By show_total = By.xpath("//label[contains(text(),'Total a + b =')]");
	
	public Assignment2(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setInputMessage(String text) {
		driver.findElement(input_message).sendKeys(text);
	}
	
	public void clickShowMessage() {
		driver.findElement(show_message).sendKeys(Keys.RETURN);
	}
	
	/*public void showEnteredMessage() {
		driver.findElement(show_enteredmessage).click();
		//System.out.println(s);
	}*/
	
	public void enterFirstValue(String a) {
		driver.findElement(enter_a).sendKeys(a);
	}
	public void enterSecondValue(String b) {
		driver.findElement(enter_b).sendKeys(b);
	}
	
	public void clickOnGetTotal() {
		driver.findElement(get_total).sendKeys(Keys.RETURN);
	}
	
}
