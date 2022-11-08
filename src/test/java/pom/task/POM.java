package pom.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class POM extends BaseClass{
	
	public POM() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement username;
	public WebElement getUsername() {
		return username;
	}
	@CacheLookup
	@FindBy(id="email")
	private WebElement catchusername;
	public WebElement getCatchusername() {
		return catchusername;
	}
	
	public void withoutCatch() {
		WebElement username2 = getUsername();
		username2.sendKeys("asdfghjk");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1001; i++) {
			String string = username2.getAttribute("value");
		}
		long end = System.currentTimeMillis();
		Long duration=(end-start);
		System.out.println(duration);
		refresh();
		
	}
	public void withtCatch() {
		WebElement username2 = getUsername();
		username2.sendKeys("asdfghjk");
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1001; i++) {
			String string = username2.getAttribute("value");
		}
		long end = System.currentTimeMillis();
		Long duration=(end-start);
		System.out.println(duration);
		refresh();
		
	}
	

}
