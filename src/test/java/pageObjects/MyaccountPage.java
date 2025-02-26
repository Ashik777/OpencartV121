package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyaccountPage extends BasePage{

	public MyaccountPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//h2[text()='My Account']") WebElement msgheading;
	@FindBy(xpath="//a[@class='list-group-item' and text()='Logout']") WebElement logout;
	public boolean isMyAccountPageExists()
	{
		try {
			
		return(msgheading.isDisplayed());
	}catch(Exception e)
		{
		return false;
		}
	

}
	public void clickLogout() {
		logout.click();
	}
}
