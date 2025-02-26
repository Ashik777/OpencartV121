package testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyaccountPage;
import utilities.Dataproviders;

public class TC003_LoginDDT extends BaseClass {
	
	
	@Test(dataProvider="LoginData", dataProviderClass=Dataproviders.class,groups="sanity")
	public void verify_loginDDT(String email, String pwd, String exp) {
		logger.info("Test started");
		try {
	
		HomePage h= new HomePage(driver);
		h.clickMyAccount();
		h.clickLogin();
		LoginPage aclog= new LoginPage(driver);
		//aclog.clickLoginButton();
		aclog.setupEmail(email);
		aclog.setupPassword(pwd);
		aclog.clickLoginButton();
		MyaccountPage myac=new MyaccountPage(driver);
		boolean status=myac.isMyAccountPageExists();
		if(exp.equalsIgnoreCase("Valid")) {
			if(status==true)
			{
			myac.clickLogout();
			Assert.assertTrue(true);
		}
			else {
				Assert.assertTrue(false);
			}
}
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(status==true)
			{
				myac.clickLogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
}catch(Exception e) {
	Assert.fail(e.getMessage());
}
		logger.info("Test finished******");
}
}