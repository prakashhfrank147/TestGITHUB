package testng.test;


import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.baseclass.BaseClass;


public class TestNGTest extends BaseClass {

@Test(groups="A", dependsOnMethods="tc02")
private void tc01() {
getDrive();
getUrl("https://www.facebook.com/");
WebElement login = findElementByName("login");
boolean enabled = login.isEnabled();
Assert.assertTrue(true);
System.out.println("enabled");
closeWindow();	
	

}
@Test(groups="B")
private void tc02() {
	getDrive();
	getUrl("https://www.facebook.com/");
	WebElement pass = findElementByName("pass");
	pass.sendKeys("7010932314");
	String string = getAttributevalue(pass);
	Assert.assertEquals(string, "7010932314");
	System.out.println(string);
	closeWindow();
	
	

	
}
@Test(groups="C",dependsOnGroups="A")
private void tc03() {
	System.out.println("Test3");

}

@Test(priority=-1,invocationCount=5,groups="A")
private void tc04() {
	System.out.println("Test4");

}
@Test(groups="B")
private void tc05() {
	System.out.println("Test5");

}


		
	
}