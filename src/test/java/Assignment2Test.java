import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.Assignment2;

@Test
public class Assignment2Test {
	public void main(String[] args) {
	Verification(); 
	}
	
	
	
	public static void  Verification() {
		System.setProperty("webdriver.chrome.driver","D:\\Tools\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Assignment2 assign2 = new Assignment2(driver);
		driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
		assign2.setInputMessage("I am executing Test Cases");
		assign2.clickShowMessage();
		assign2.enterFirstValue("2");
		assign2.enterSecondValue("4");
		assign2.clickOnGetTotal();
		
		
		
	}



	public static void verification(WebDriver driver) {
		
	}
	


}
