package testng.test;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.baseclass.BaseClass;

public class Hotel extends BaseClass{
	
	@Parameters({ "username", "password"})
	@Test
	private void tc01(String uname, String pass) throws InterruptedException {
		getDrive();
		maximizeWindow();
		getUrl("https://adactinhotelapp.com/");
		Thread.sleep(2000);
		WebElement username = findElementByName("username");
		elementSendKeys(username, uname);

		WebElement password = findElementById("password");
		elementSendKeys(password, pass);

		WebElement login = findElementById("login");
		elementClick(login);
		Thread.sleep(2000);

	}
	@Parameters({"location","hotels","room_type","room_nos","datepick_in",
		"datepick_out","adult_room","child_room"
	})
	@Test
	private void tc02(String loc, String hotelname, String romtype
			,String roomnos, String checkin,String checkout, String adult, String child) throws InterruptedException {
		WebElement location = findElementByName("location");
		selectOptionByText(location, loc);

		WebElement hotel = findElementByName("hotels");
		selectOptionByText(hotel, hotelname);

		WebElement roomtype = findElementByName("room_type");
		selectOptionByText(roomtype, romtype);

		WebElement noroom = findElementByName("room_nos");
		selectOptionByText(noroom, roomnos);

		WebElement checkInDate = findElementByName("datepick_in");
		clearTextBox(checkInDate);
		clickButtonByJs(checkInDate);
		elementSendKeys(checkInDate, checkin);

		WebElement checkoutDate = findElementByName("datepick_out");
		clearTextBox(checkoutDate);
		clickButtonByJs(checkoutDate);
		elementSendKeys(checkoutDate, checkout);

		WebElement adults = findElementByName("adult_room");
		selectOptionByText(adults, adult);

		WebElement childs = findElementByName("child_room");
		selectOptionByText(childs, child);

		WebElement search = findElementByName("Submit");
		clickButtonByJs(search);
		Thread.sleep(2000);

	}
	@Parameters({"first_name","last_name","address",
	"cc_num", "cc_type", "cc_exp_month"	,"cc_exp_year",
	"cc_cvv" })
	@Test
	private void tc03(String fname, String lname,
			String adress,String cnum, String ctype,
			String emonth, String eyear,String cvnum) throws IOException, InterruptedException {
		WebElement button = findElementByName("radiobutton_0");
		elementClick(button);
		WebElement continuebtn = findElementByName("continue");
		elementClick(continuebtn);

		WebElement firstname = findElementByName("first_name");
		elementSendKeys(firstname, fname);

		WebElement lastname = findElementByName("last_name");
		elementSendKeys(lastname, lname);

		WebElement address = findElementByName("address");
		elementSendKeys(address, adress);

		WebElement ccnum = findElementByName("cc_num");
		elementSendKeys(ccnum, cnum);

		WebElement cctype = findElementByName("cc_type");
		selectOptionByText(cctype, ctype);

		WebElement expmonth = findElementByName("cc_exp_month");
		selectOptionByText(expmonth, emonth);

		WebElement expyear = findElementByName("cc_exp_year");
		selectOptionByText(expyear, eyear);

		WebElement cvv = findElementByName("cc_cvv");
		elementSendKeys(cvv, cvnum);

		WebElement book = findElementByName("book_now");
		elementClick(book);
		Thread.sleep(7000);

		WebElement orderid = findElementById("order_no");
		String value = getAttributeValue(orderid, "value");

		takeScreenshot("C:\\Users\\User\\Desktop\\screenshots\\bookingTestNGxml.png");
		System.out.println(value);

		// insertCellData("sheet1", 2, 10, value);
		closeWindow();


	}

}
