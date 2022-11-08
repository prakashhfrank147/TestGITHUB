package com.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("hello prakash...........  ");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sdfghjk@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		driver.findElement(By.name("login")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[text()='Not you?']")).click();
		driver.findElement(By.id("email")).sendKeys("sdfghjk@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		driver.findElement(By.name("login")).click();
		Thread.sleep(7000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File save = new File("C:\\\\Users\\\\User\\\\Desktop\\\\screenshots\\\\mavenday1.png");
		FileUtils.copyFile(file, save);
		
		driver.close();

		
		
	}

}
