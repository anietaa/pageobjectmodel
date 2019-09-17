package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

public class HalfComRegisteration {
	
	WebDriver driver = null;
	By input_firstNmae = By.id("firstname");
	By input_lastName = By.id("lastname");
	By street_address1 = By.id("address1");
	By street_address2 = By.id("address2");
	By city_name = By.id("city");
	Select select = new Select(driver.findElement(By.id("state")));
	By zip_code = By.id("zip");
	By primary_telephone_number1 = By.xpath("//*[@id=\'dayphone1\']");
	By primary_telephone_number2 = By.name("dayphone2");
	By primary_telephone_number3 = By.name("dayphone3");
	By telephone_extension = By.name("dayphone4");
	By enter_email = By.name("email");
	By reEnter_email = By.name("retype_email");
	By create_urid = By.name("userid");
	By pick_great_uid = By.partialLinkText("How to pick");
	By create_ur_pwd = By.id("PASSWORD");
	By create_secure_pwd = By.partialLinkText("Learn about secure");
	By reEnter_pwd = By.id("rpass");
	Select select1 = new Select(driver.findElement(By.id("SECRET_QUESTION")));
	By enter_secretAns = By.name("myanswer");
	Select select2 = new Select(driver.findElement(By.id("birthdate2")));
	Select select3 = new Select(driver.findElement(By.id("birthdate1")));
	Select select4 = new Select(driver.findElement(By.id("birthdate3")));
	By agree = By.id("acceptq1");
	By click_continue = By.className("btn");
	
	
	
	
	
	
	
	
	
	
	
	public HalfComRegisteration(WebDriver driver) {
    	this.driver = driver; 
    }
	 
	public void setInputFirstNmae(String text) {
		driver.findElement(input_firstNmae).sendKeys(text);
	}
	
	public void setInputLastName(String text) {
		driver.findElement(input_lastName).sendKeys(text);
	}
	
	public void setStreetAddress1(String text) {
		driver.findElement(street_address1).sendKeys(text);
	}
	 public void setStreetAddress2(String text) {
		 driver.findElement(street_address2).sendKeys(text);
	 }
	 
	 public void setCityName(String text) {
		 driver.findElement(city_name).sendKeys(text);
	 }
	 
	
	public void selectState(String text) {
		select.selectByVisibleText(text);
	}
	
	public void setZipCode(String text) {
		driver.findElement(zip_code).sendKeys(text);
		
	}
	
	public void setPrimaryTelephoneNumber1(String text) {
		driver.findElement(primary_telephone_number1).sendKeys(text);
	}
	
	
	public void setPrimaryTelephoneNumber2(String text) {
		driver.findElement(primary_telephone_number2).sendKeys(text);
	}
	
	public void setPrimaryTelephoneNumber3(String text) {
		driver.findElement(primary_telephone_number3).sendKeys(text);
	}
	
	public void setPrimaryTelephoneNumberExtension(String text) {
		driver.findElement(telephone_extension).sendKeys(text);
	}
	
	public void setEmailAddress(String text) {
		driver.findElement(enter_email).sendKeys(text);
	}
	public void reEnterEmailAddress(String text) {
		driver.findElement(reEnter_email).sendKeys(text);
	}
	
	public void createUserId(String text) {
		driver.findElement(create_urid).sendKeys(text);
		
	}
	 public void clickOnPickGreatUid() {
		 driver.findElement(pick_great_uid).sendKeys(Keys.RETURN);
	 }
	 
	 public void createYourPass(String text) {
		 driver.findElement(create_ur_pwd).sendKeys(text);
	 }
	 
	 public void clickOnLearnAboutSecurePwd() {
		 driver.findElement(create_secure_pwd).sendKeys(Keys.RETURN);
	 }
	 
	 public void reEnterYourPass(String text) {
		 driver.findElement(reEnter_pwd).sendKeys(text);
	 }
	 
	 public void selectSecretQuestion(String text) {
			select.selectByVisibleText(text);
		}
	 
	 public void enterYourSecretAns(String text) {
		 driver.findElement(enter_secretAns).sendKeys(text);
	 }
	 
	
	public void selectBirthMonth(String text) {
		select.selectByVisibleText(text);
	}
	
	public void selectBirthDay(String text) {
		select.selectByVisibleText(text);
	}
	public void selectBirthYear(String text) {
		select.selectByVisibleText(text);
	}
	
	public void clickOnAgree() {
		driver.findElement(agree).sendKeys(Keys.RETURN);
	}
	
	public void clickOnCont() {
		driver.findElement(click_continue).sendKeys(Keys.RETURN);
	}


}
