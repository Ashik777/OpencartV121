package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyaccountPage;

public class TC02_LoginTest extends BaseClass{
	@Test(groups="sanity")
	public void LoginTest() {
		logger.info("Test started");
		try
		{
		HomePage h= new HomePage(driver);
		h.clickMyAccount();
		h.clickLogin();
		LoginPage aclog= new LoginPage(driver);
		aclog.clickLoginButton();
		aclog.setupEmail(p.getProperty("email"));
		aclog.setupPassword(p.getProperty("password"));
		aclog.clickLoginButton();
		MyaccountPage myac=new MyaccountPage(driver);
		boolean status=myac.isMyAccountPageExists();
		Assert.assertTrue(status);
	}catch(Exception e) {
		Assert.fail();
	}

}
}
