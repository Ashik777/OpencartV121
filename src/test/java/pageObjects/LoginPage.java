package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
public LoginPage(WebDriver driver) {
	super(driver);
	}
@FindBy(xpath="//input[@name='email']") WebElement emailid;
@FindBy(xpath="//input[@name='password']") WebElement password;
@FindBy(xpath="//input[@type='submit']") WebElement submit;

public void setupEmail(String email) {
	emailid.sendKeys(email);
	
}
public void setupPassword(String pwd) {
	password.sendKeys(pwd);
}
public void clickLoginButton() {
	submit.click();
}

}