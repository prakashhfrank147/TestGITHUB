package com.day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/search?q=vikram+&ei=zMlGY_inJMzH3LUPmqSr-Aw&ved=0ahUKEwj4vdil7tr6AhXMI7cAHRrSCs8Q4dUDCA4&uact=5&oq=vikram+&gs_lcp=Cgdnd3Mtd2l6EAMyBwguELEDEEMyCgguELEDEIMBEEMyCgguELEDENQCEEMyBAgAEEMyBwgAELEDEEMyDgguEIAEELEDEIMBENQCMgQIABBDMgoIABCxAxCDARBDMgQIABBDMgQIABBDOgoIABBHENYEELADOgcIABCwAxBDOg0IABDkAhDWBBCwAxgBOgwILhDIAxCwAxBDGAI6DwguENQCEMgDELADEEMYAjoICC4QgAQQsQM6CAgAEIAEELEDOgUIABCABDoLCAAQgAQQsQMQgwFKBAhNGAFKBAhBGABKBAhGGAFQ-R1YsCNgrCloAXABeACAAXaIAYkEkgEDMi4zmAEAoAEByAERwAEB2gEGCAEQARgJ2gEGCAIQARgI&sclient=gws-wiz");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);

		
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyPress(KeyEvent.VK_PAGE_UP);

		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(5000);
		driver.quit();


		
	}

}
