package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//input[@name='firstname']") WebElement fisrtName;
    @FindBy(xpath="//input[@name='lastname']") WebElement LastName;
    @FindBy(xpath="//input[@name='email']") WebElement email;
    @FindBy(xpath="//input[@name='telephone']") WebElement telephone;
    @FindBy(xpath="//input[@name='password']") WebElement password;
    @FindBy(xpath="//input[@name='confirm']") WebElement confirmPassword;
    @FindBy(xpath="//input[@name='agree']") WebElement chkpolicy;
    @FindBy(xpath="//input[@type='submit']") WebElement continueButton;
    @FindBy(xpath="//h1[text()='Your Account Has Been Created!']") WebElement messageConfirmation;
    
    public void setupFirstName(String fName) {
    	fisrtName.sendKeys(fName);
    }
    
    public void setupLastName(String Lname) {
    	LastName.sendKeys(Lname);
    }
    
    public void setupEmail(String emai) {
    	email.sendKeys(emai);
    	
    	
    }
    
    public void setupTelephone(String telephoneNumber) {
    	telephone.sendKeys(telephoneNumber);
    	
    }
    public void setupPassword(String pwd)
    {
    	password.sendKeys(pwd);
    }
    public void setConfirmPassword(String pwd) {
    	confirmPassword.sendKeys(pwd);
    	
    }
    public void setupPlolicy()
    {
    	chkpolicy.click();
    	
    }
    public void clickSubmit() {
    	continueButton.click();
    }
    
    public String getConfirmation() {
    	try {
    String messageConf=	messageConfirmation.getText();
    	return messageConf;
    }catch (Exception e) {
    	return e.getMessage();
    }
    

}
}
