package testng.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.internal.annotations.*;

import com.baseclass.BaseClass;

public class Dataprovider extends BaseClass {
	
	@DataProvider(name="credentials")
	private Object[][] getdata() {
		return new Object[][] {{"qwerty","12345678"},
			{"wedrfghjk","12345678"}
		};
	
	}
	@Test(dataProvider="credentials")
	private void login(String u, String p) throws InterruptedException {
		getDrive();
		
		maximizeWindow();
		Thread.sleep(6000);
		getUrl("https://www.facebook.com/");
		findElementById("email").sendKeys(u);
		Thread.sleep(6000);
		findElementById("pass").sendKeys(p);
		findElementByName("login").click();
		closeWindow();
		
		
		
	}
	
	@Test(dataProvider="credentials")
	private void loginInsta(String u, String p) throws InterruptedException {
		getDrive();
		
		maximizeWindow();
		getUrl("https://www.instagram.com/");
		Thread.sleep(6000);
		findElementByName("username").sendKeys(u);
		
		findElementByName("password").sendKeys(p);
		findElementByXpath("//*[@id=\"loginForm\"]/div/div[3]/button/div").click();
		closeWindow();
		
		
	}
	@Test(dataProvider="credentials")
	private void logintwiter(String u, String p) throws InterruptedException {
		getDrive();
		
		maximizeWindow();
		getUrl("https://twitter.com/i/flow/login");
//		Thread.sleep(6000);
		findElementByName("text").sendKeys(u);
		Thread.sleep(2000);
		findElementByXpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div/div/div/div[6]/div/span/span").click();

		WebElement pass = findElementByXpath("//*[@id=\"layers\"]/div/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[2]/label/div/div[2]");
		
		
		System.out.println(getAttributevalue(pass));
		closeWindow();
		
		
	}


					
				
}
		
		
		
		


