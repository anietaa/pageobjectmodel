

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.GoogleSearchPageObject;
@Test
public class GoogleSearchPageTest {
	
	
	public void main(String[] args) {
		
		googleSearchTest();
		
	}
	
	
	public static void googleSearchTest() {
		System.setProperty("webdriver.chrome.driver","D:\\Tools\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		GoogleSearchPageObject searchPageObj = new GoogleSearchPageObject(driver);
		driver.get("https://google.com/");
		searchPageObj.setTextInSearchBox("How to do automation Testing");
        searchPageObj.clickSearchButton();
        //driver.manage().window().maximize();
        
		
		
	}

}
