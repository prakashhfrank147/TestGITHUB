package pom.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class Login1 extends BaseClass{
	
	public Login1() {
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="username")
	private WebElement uname;
	@FindBy(id="password")
	private WebElement pword;
	@FindBy(id="login")
	private WebElement loclick;
	public WebElement getUname() {
		return uname;
	}
	public WebElement getPword() {
		return pword;
	}
	public WebElement getLoclick() {
		return loclick;
	}
	
	public void firstPage(String username, String password) {
		getUname().sendKeys(username);
		getPword().sendKeys(password);
		getLoclick().click();
		
		
	}
	
	
	
	
	
	
	
	

}
