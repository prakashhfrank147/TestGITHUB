package org.loginpage;

import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class Sample extends BaseClass {
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.getDrive();
		s.maximizeWindow();
		s.getUrl("https://www.facebook.com/");
		
		LoginPage lp= new LoginPage();
//		WebElement txtusername = lp.getTxtusername();
//		txtusername.sendKeys("welcome");
//		driver.navigate().refresh();
//		txtusername.sendKeys("welcome1");
//
//		
//		WebElement textpassword = lp.getTextpassword();
//		textpassword.sendKeys("123456789");
//		WebElement login = lp.getLogin();
//		login.click();
		lp.login("welcome", "123456789");
		
		
	}
	

}
