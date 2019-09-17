import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;
public class GoogleSearchTest {
	 //WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		//String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","D:\\Tools\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//goto google.com
		driver.get("https://www.google.com/");
		
		
		//enter text in search textbox
		
		//driver.findElement(By.name("q")).sendKeys("Automation step by step");;
		GoogleSearchPage.textBoxSearch(driver).sendKeys("Automation step by step");;
		//click on search button
		
		//driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		GoogleSearchPage.buttonSearch(driver).sendKeys(Keys.RETURN);
		//close browser
		
		driver.close();
	}

}
