package pom.task;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class Login3 extends BaseClass {
	// static WebDriver driver;

	public Login3() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "radiobutton_0")
	private WebElement radio;

	@FindBy(name = "continue")
	private WebElement continuebtn;

	@FindBy(name = "first_name")
	private WebElement fname;

	@FindBy(name = "last_name")
	private WebElement lname;

	@FindBy(name = "address")
	private WebElement address;

	@FindBy(name = "cc_num")
	private WebElement ccnum;

	@FindBy(name = "cc_type")
	private WebElement cctype;

	@FindBy(name = "cc_exp_month")
	private WebElement expmonth;

	@FindBy(name = "cc_exp_year")
	private WebElement expyear;

	@FindBy(name = "cc_cvv")
	private WebElement cvv;

	@FindBy(name = "book_now")
	private WebElement booknow;
	
	@FindBy(id="order_no")
	private WebElement orderId;

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getOrderId() {
		return orderId;
	}

	public void setOrderId(WebElement orderId) {
		this.orderId = orderId;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getExpmonth() {
		return expmonth;
	}

	public WebElement getExpyear() {
		return expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public void thirdPage() throws InterruptedException, IOException {
		getRadio().click();
		getContinuebtn().click();
		Thread.sleep(5000);
		WebElement fname2 = getFname();
		String firstname = getDataFromCell("Sheet1", 1, 10);
		elementSendKeys(fname2, firstname);

		String lastname = getDataFromCell("Sheet1", 1, 11);
		getLname().sendKeys(lastname);

		String address = getDataFromCell("Sheet1", 1, 12);
		getAddress().sendKeys(address);

		String ccnum = getDataFromCell("Sheet1", 1, 13);
		getCcnum().sendKeys(ccnum);

		WebElement cctype2 = getCctype();
		String cctype = getDataFromCell("Sheet1", 1, 14);
		selectOptionByText(cctype2, cctype);

		WebElement expmonth2 = getExpmonth();
		String expm = getDataFromCell("Sheet1", 1, 15);
		System.out.println(expm);
		selectOptionByText(expmonth2, expm);

		WebElement expyear2 = getExpyear();
		String expy ="2022";
//				getDataFromCell("Sheet1", 1, 16);
		System.out.println(expy);
		selectOptionByText(expyear2, expy);

		String cvv = getDataFromCell("Sheet1", 1, 17);
		getCvv().sendKeys(cvv);
		
		getBooknow().click();
		
		Thread.sleep(7000);
		
		WebElement orderId2 = getOrderId();
		String data = getAttributevalue(orderId2);
		
		insertCellData("Sheet1", 1, 18, data);
		
		driver.close();
		
		
		
	}

}
