package com.test.SoftwareTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BrowserTesting {
	
	/*@BeforeTest
	public void browserTesting() {
		System.out.println("We have to check whether browser is invoking or not");
		
	}*/
	@Test
	public void invokeBrowser() {
		 
		System.setProperty("webdriver.chrome.driver","D:\\Tools\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","D:\\Tools\\eclipse\\geckodriver.exe");
	    
		
		
		 //driver = new FirefoxDriver();
		//driver = new InternetExplorerDriver();
		
		//driver.get("https://tutorialsninja.com/demo/");
		 driver.get("https://www.guru99.com/selenium-tutorial.html");
		driver.get("https://omayo.blogspot.com/");
		//driver.get("https://www.seleniumeasy.com/test/");
		driver.manage().window().maximize();
		
	}
	
	/*@AfterTest
	public void tearDown() {
		driver.close();
	}*/

}
