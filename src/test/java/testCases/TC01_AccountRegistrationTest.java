package testCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testCases.BaseClass;

public class TC01_AccountRegistrationTest extends BaseClass {

	@Test(groups="regression")
	public void testAccountRegistration() {
		try{
		logger.info("Test started");
		HomePage hp= new HomePage(driver);
		System.out.println("Driver is: " + (driver == null ? "null" : "initialized"));
		hp.clickMyAccount();
		//.info("**clicked on my account button");
		hp.clickRegistration();
		//Log.info("clicked on rehistration button");
		
		AccountRegistrationPage acp= new AccountRegistrationPage(driver);
		acp.setupFirstName(randomeString().toUpperCase());
		acp.setupLastName(randomeString().toUpperCase());
		acp.setupEmail(randomeString()+"@gmail.com");
		acp.setupTelephone(randomeNumber());
		String password= RandomAlphaNumeric();
		acp.setupPassword(password);
		acp.setConfirmPassword(password);
		acp.setupPlolicy();
		acp.clickSubmit();
		String configmessage=acp.getConfirmation();
		if(configmessage.equals("Your Account Has Been Created!")) {
			AssertJUnit.assertTrue(true);
		}
		else
		{
			logger.error("Test failed");
			logger.debug("Debug logs");
			AssertJUnit.assertTrue(false);
		}

	}catch (Exception e) {
		Assert.fail();
	}
	
	
	
}

	private String RandomAlphaNumeric() {
		// TODO Auto-generated method stub
		return null;
	}}
