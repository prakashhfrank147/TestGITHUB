package com.baseclass;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class AssertTest extends BaseClass {
	@Test
	public void test1() {
		String s="welcome";
		Assert.assertEquals("asdfgh", "Welcome", s);
		
		System.out.println(s);
	}
	
	@Test
	public void test2() {
		String s="goaway";
		Assert.assertEquals("asdfgh", "goaway", s);
		
		System.out.println(s);
	}
	@Test
	public void test3() {
		getDrive();
		maximizeWindow();
		getUrl("https://www.facebook.com/");
		findElementByName("email").sendKeys("234567894567");
		WebElement pass = findElementById("pass");
		pass.sendKeys("345678345678");
		WebElement login = findElementByName("login");
		boolean enabled = login.isEnabled();
		Assert.assertTrue(enabled);
		login.click();
		System.out.println(enabled);
	}

	
	@AfterClass
	public static void afterClass() {
//		driver.close();
	}

	

}
