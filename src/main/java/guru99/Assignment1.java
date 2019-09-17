package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment1 {
	private static WebDriver driver;
	 @Test
	public static void verifyLoginSection() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Tools\\eclipse\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("http://www.demo.guru99.com/V4/");
		
		 driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr223279");;;
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vatujUq");;
	     driver.findElement(By.xpath("//input[@name='btnLogin']")).click();;
		
	}

}
