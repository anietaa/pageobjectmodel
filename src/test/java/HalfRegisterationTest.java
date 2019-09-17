import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.HalfComRegisteration;

@Test
public class HalfRegisterationTest {
	
	
	public static void main(String[] args) {
		 registerationVerification();
	}

	public static void registerationVerification() {
		System.setProperty("webdriver.chrome.driver","D:\\Tools\\eclipse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		HalfComRegisteration hcReg = new HalfComRegisteration(driver);
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		hcReg.setInputFirstNmae("Anita");
		hcReg.setInputLastName("Pal");
		hcReg.setStreetAddress1("Anderson");
		hcReg.setStreetAddress2("Henry Township");
		hcReg.setCityName("Indianapolis");
		hcReg.selectState("Indiana");
		hcReg.setZipCode("46011");
		hcReg.setPrimaryTelephoneNumber1("317");
		hcReg.setPrimaryTelephoneNumber2("555");
		hcReg.setPrimaryTelephoneNumber3("0133");
		hcReg.setPrimaryTelephoneNumberExtension("219");
		hcReg.setEmailAddress("er.anitapal@gmail.com");
		hcReg.reEnterEmailAddress("er.anitapal@gmail.com");
		hcReg.createUserId("anita");
		hcReg.clickOnPickGreatUid();
		hcReg.createYourPass("test123");
		hcReg.clickOnLearnAboutSecurePwd();
		hcReg.reEnterYourPass("test123");
		hcReg.selectSecretQuestion("What is your pet's name?");
		hcReg.enterYourSecretAns("Rocky");
		hcReg.selectBirthMonth("May");
		hcReg.selectBirthDay("15");
		hcReg.selectBirthYear("1988");
		hcReg.clickOnAgree();
		hcReg.clickOnCont();
		
		
		
	}

}
