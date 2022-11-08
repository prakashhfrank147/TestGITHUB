package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STIconSetType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;

	// 1 open driver and chromedriver
	public static void getDrive() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	// 2 launch url
	public void getUrl(String url) {
		driver.get(url);

	}

	// 3 maximize
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	// 4 sendkeys
	public void elementSendKeys(WebElement element, String data) {
		element.sendKeys(data);

	}

	// 5 sendkeys by javascript
	public void elementSendkeysJs(WebElement element, String data) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0],setAttribute('value'," + data + "')", element);
	}

	// 6 click webelement
	public void elementClick(WebElement element) {
		element.click();

	}

	// 7 getAppTitle
	public String getAppTitle() {
		String title = driver.getTitle();

		return title;

	}

	// 8 locator by id
	public WebElement findElementById(String id) {
		WebElement element = driver.findElement(By.id(id));

		return element;

	}

	// 9 locator by name
	public WebElement findElementByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));

 		return element;

	}

	// 10 locator by classname
	public WebElement findElementByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));

		return element;

	}

	// 11 locator by xpath
	public WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));

		return element;

	}

	// 12 close window
	public void closeWindow() {
		driver.close();

	}

	// 13 quit window
	public void quitWindow() {
		driver.quit();

	}

	// 14 get app url


	// 15 get text from element
	public String elementGetText(WebElement element) {
		String text = element.getText();
		return text;

	}

	// 16 99% get attribute vale
	public String getAttributevalue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	// 17 1% get attribute vale
	public String getAttributeValue(WebElement element, String attributename) {
		String attribute = element.getAttribute(attributename);

		return attribute;

	}

	// 18 select by vissible text
	public void selectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
 
	}

	// 19 select by value
	public void selectOptionByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);

	}

	// 20 select by index
	public void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	// 21 get current url
	public String getCurrentUrl() {
		String text = driver.getCurrentUrl();
		return text;
	}

	// 22 alert ok
	public void alertAccept() {
		driver.switchTo().alert().accept();
	}

	// 23 alert cancel
	public void alertDismiss() {
		driver.switchTo().alert().dismiss();

	}

	// 24 click button js
	public void clickButtonByJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);

	}

	// 25 switchto frame by index
	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	// 26 switch to frame by index
	public void switchToFrameById(String id) {
		driver.switchTo().frame(id);
	}

	// 27 switch to frame by index
	public void switchToFrameByElement(String elementref) {
		driver.switchTo().frame(elementref);
	}

	// 28 switch to parent frame
	public void switchToParentFrame() {
		driver.switchTo().defaultContent();
	}

	// 29 dropdown multiple
	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;

	}
	// 30 getOptions

	public void getOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (int i = 0; i < options.size(); i++) {

			System.out.println(i);

		}

	}

	// 30 getDataFromCell
	public String getDataFromCell(String sheetName, int rownum, int cellnum) throws IOException {

		String res = "";
		File file = new File("C:\\Users\\User\\eclipse-workspace\\TestMaven\\framework\\howtodoinjava_demo.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		switch (cellType) {

		case STRING:
			res = cell.getStringCellValue();
			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
				res = dateFormat.format(dateCellValue);
			} else {
//				double numericCellValue = cell.getNumericCellValue();
//				BigDecimal valueOff = BigDecimal.valueOf(numericCellValue);
//				res = valueOff.toString();
				
				double value = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(value);
				String num = valueOf.toString();
				res=num;
			}
			break;
		default:
		}

		return res;

	}

	// 31 update cell data
	public void updateCellData(String sheetName, int rownum, int cellnum, String oldvalue, String newvalue)
			throws IOException {

		File file = new File("C:\\Users\\User\\eclipse-workspace\\TestMaven\\framework\\howtodoinjava_demo.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		if (value.equals(oldvalue)) {
			cell.setCellValue(newvalue);
		}
		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

	// 32 insertcell vale
	public void insertCellData(String sheetName, int rownum, int cellnum, String data) throws IOException {

		File file = new File("C:\\Users\\User\\eclipse-workspace\\TestMaven\\framework\\howtodoinjava_demo.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);

		FileOutputStream out = new FileOutputStream(file);
		workbook.write(out);

	}

	// 33 clearTextBox
	public void clearTextBox(WebElement element) {
		element.clear();
	}

	// 34 screenShot
	public void takeScreenshot(String desfile) throws IOException {
		File file = new File(desfile);
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
		File screenshotAs = takeScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File(desfile));

	}

	// 35 mouseoveraction
	public void moveToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();

	}

	// 36 doubleClick
	public void doubleClickOnElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();

	}

	// 37 doubleClick
	public void doubleClick() {
		Actions actions = new Actions(driver);
		actions.doubleClick().perform();

	}

	// 38 RightClick
	public void contextClick(WebElement element) {
		Actions actions = new Actions(driver); 
		actions.contextClick().perform();
	}

	// 39 dragAndDrop
	public void dragAndDrop(WebElement drag, WebElement drop) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(drag, drop).perform();
	}

	// 40 deSelectByindex
	public void deSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);

	}

	// 41 deSelectbyVissibleText
	public void deSelectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);

	}

	// 42 deSelectByValue
	public void deSelectByValue(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByValue(text);
	}

	// 43 deSelectAll
	public void deSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	// 44 refresh
	public void refresh() {
		driver.navigate().refresh();
	}

	// 45 forward
	public void forward() {
		driver.navigate().forward();
	}

	// 46 backward
	public void backward() {
		driver.navigate().back();
	}

}
