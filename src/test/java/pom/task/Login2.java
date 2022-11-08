package pom.task;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class Login2 extends BaseClass {
	public Login2() {
	PageFactory.initElements(driver, this);

	}
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement rooms;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	@FindBy(id="datepick_out")
	private WebElement checkout;
	
	@FindBy(id="adult_room")
	private WebElement adults;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement search;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRooms() {
		return rooms;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSearch() {
		return search;
	}
	
	public void secondPage(  
//			String roomtype,String room,String checkin,String checkout,String adults,String child 
			) throws IOException {
		WebElement location2 = getLocation();
		String location = getDataFromCell("Sheet1", 1, 2);
		System.out.println(location);
		selectOptionByText(location2, location);
		WebElement hotel2 = getHotel();
		String hotel = getDataFromCell("Sheet1", 1, 3);
		selectOptionByText(hotel2, hotel);
		WebElement roomType2 = getRoomType();
		String roomtype = getDataFromCell("Sheet1", 1, 4);
		selectOptionByText(roomType2, roomtype);
		WebElement rooms2 = getRooms();
		String room = getDataFromCell("Sheet1", 1, 5);
		selectOptionByText(rooms2, room);
		
		WebElement checkin2 = getCheckin();
		clearTextBox(checkin2);
		elementClick(checkin2);
		String checkin = getDataFromCell("Sheet1", 1, 6);
		elementSendKeys(checkin2, checkin);
		
		WebElement checkout2 = getCheckout();
		clearTextBox(checkout2);
		elementClick(checkout2);
		String checkout= getDataFromCell("Sheet1", 1, 7);
		elementSendKeys(checkout2, checkout);
		
		WebElement adults2 = getAdults();
		String adults = getDataFromCell("Sheet1", 1, 8);
		selectOptionByText(adults2, adults);
		
		WebElement child2 = getChild();
		String child = getDataFromCell("Sheet1", 1, 9);
		selectOptionByText(child2, child);
		
		getSearch().click();
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
