package com.day1;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube {
	
	
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.youtube.com/watch?v=DL2QPmdAuPU");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();
		Thread.sleep(12000);
		driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']")).click();
		driver.findElement(By.xpath("//*[@id=\"movie_player\"]/div[1]/video")).click();
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		WebElement rc = driver.findElement(By.xpath("//span[@id='video-title']"));
		ac.contextClick(rc).perform();
		Robot robot = new Robot();
		ac.keyDown(Keys.DOWN).perform();
		ac.keyUp(Keys.DOWN).perform();
		ac.keyDown(Keys.DOWN).perform();
		ac.keyUp(Keys.DOWN).perform();
		ac.keyDown(Keys.ENTER).perform();
		ac.keyUp(Keys.ENTER).perform();

		
		
		
		Thread.sleep(15000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\\\Users\\\\User\\\\Desktop\\\\screenshots\\\\mavenwindow1.png");
		FileUtils.copyFile(temp, file);

	}

}
