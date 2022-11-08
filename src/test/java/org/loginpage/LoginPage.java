package org.loginpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class LoginPage  extends BaseClass{
	
	// constructor
	public LoginPage() {
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="email")
	private WebElement txtusername;
	@FindBy(id="pass")
	private WebElement textpassword;
	@FindBy(name="login")
	private WebElement login;
	
	
	public WebElement getLogin() {
		return login;
	}
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTextpassword() {
		return textpassword;
	}
	
	public void login(String username, String password) {
//		WebElement txtusername2 =
				getTxtusername().sendKeys(username);
				getTextpassword().sendKeys(password);
				getLogin().click();
//		elementSendKeys(txtusername2, "Welcome");
		
	}
	
	
	
	
	

}
