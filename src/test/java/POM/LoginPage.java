package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	 
	public LoginPage(WebDriver driver)
	
	 {
		PageFactory.initElements(driver, this);

	}
	
	//declaration
	@FindBy(id="username")
	private WebElement userTextField;
	
	@FindBy(name="pwd")
	private WebElement passwordTextField;
	
	@FindBy(css="a.initial")
	private WebElement loginButton;
	
	
	//getter method
	public WebElement getUserTextField() {
		return userTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	
	//Business Logic: create a method
	
	public void LoginToApplication(String UN,String PW)
	{
		
		userTextField.sendKeys(UN);
		passwordTextField.sendKeys(PW);
		loginButton.click();
		
		
	}
	
	
	
	

}
