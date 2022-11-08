package com.baseclass;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		Test test = new Test();
		test.booking();

	}

	public void booking() throws IOException, InterruptedException {

		getDrive();
		maximizeWindow();

		getUrl("https://adactinhotelapp.com/");
		Thread.sleep(2000);

		WebElement username = findElementById("username");
		String name = getDataFromCell("sheet1", 1, 0);
		System.out.println(name);
		elementSendKeys(username, name);

		WebElement password = findElementById("password");
		String pass = getDataFromCell("sheet1", 1, 1);
		System.out.println(pass);
		elementSendKeys(password, pass);
		
		WebElement login = findElementById("login");
		elementClick(login);
		Thread.sleep(2000);
		
		WebElement location = findElementByName("location");
		selectOptionByText(location, "Sydney");
		
		WebElement hotel = findElementByName("hotels");
		selectOptionByText(hotel, "Hotel Creek");
		
		WebElement roomtype = findElementByName("room_type");
		selectOptionByText(roomtype, "Standard");
		
		WebElement noroom = findElementByName("room_nos");
		selectOptionByText(noroom, "3 - Three");
		
		WebElement checkInDate = findElementByName("datepick_in");
		clearTextBox(checkInDate);
		clickButtonByJs(checkInDate);
		elementSendKeys(checkInDate, "25/10/2022");
		
		WebElement checkoutDate = findElementByName("datepick_out");
		clearTextBox(checkoutDate);
		clickButtonByJs(checkoutDate);
		elementSendKeys(checkoutDate, "27/10/2022");
		
		WebElement adults = findElementByName("adult_room");
		selectOptionByText(adults, "3 - Three");
		
		WebElement childs = findElementByName("child_room");
		selectOptionByText(childs, "2 - Two");
		
		WebElement search = findElementByName("Submit");
		clickButtonByJs(search);
		Thread.sleep(2000);
		
		WebElement button = findElementByName("radiobutton_0");
		elementClick(button);
		WebElement continuebtn = findElementByName("continue");
		elementClick(continuebtn);
		
		WebElement firstname = findElementByName("first_name");
		elementSendKeys(firstname, "prakash");
		
		WebElement lastname = findElementByName("last_name");
		elementSendKeys(lastname, "frank");
		
		WebElement address = findElementByName("address");
		elementSendKeys(address, "chennai, india");
		
		WebElement ccnum = findElementByName("cc_num");
		elementSendKeys(ccnum, "1234567890123456");
		

		WebElement cctype = findElementByName("cc_type");
		selectOptionByText(cctype, "Master Card");

		WebElement expmonth = findElementByName("cc_exp_month");
		selectOptionByText(expmonth, "December");

		WebElement expyear = findElementByName("cc_exp_year");
		selectOptionByText(expyear, "2022");

		WebElement cvv = findElementByName("cc_cvv");
		elementSendKeys(cvv, "423");

		WebElement book = findElementByName("book_now");
		elementClick(book);
		Thread.sleep(7000);

		WebElement orderid = findElementById("order_no");
		String value = getAttributeValue(orderid, "value");
		
		takeScreenshot("C:\\Users\\User\\Desktop\\screenshots\\booking.png");
		System.out.println(value);

		insertCellData("sheet1", 1, 9, value);
		String appUrl = getAppTitle();
		System.out.println(appUrl);
		String currentUrl = getCurrentUrl();
		System.out.println();
		 closeWindow();

	}

}
