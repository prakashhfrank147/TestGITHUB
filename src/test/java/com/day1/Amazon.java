package com.day1;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.amazon.in/s?k=iphone+13&crid=XPI9SBCB5U57&sprefix=ip%2Caps%2C586&ref=nb_sb_ss_ts-doa-p_1_2");
		Thread.sleep(5000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File a1 = ts.getScreenshotAs(OutputType.FILE);
		File file = new File("C:\\\\Users\\\\User\\\\Desktop\\\\screenshots\\\\amazon1.png");
		FileUtils.copyFile(a1, file);

		WebElement click = driver.findElement(By.xpath(
				"//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
		click.click();
		String a = driver.getWindowHandle();
		System.out.println(a);
		Set<String> al = driver.getWindowHandles();
		System.out.println(al);
		for (String b : al) {
			if (!a.equals(b)) {
				driver.switchTo().window(b);
			}

		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@title='Add to Wish List']")).click();
		Thread.sleep(8000);
		// TakesScreenshot tt=(TakesScreenshot)driver;
		
		WebElement summa = driver.findElement(By.id("ap_email"));

		summa.sendKeys("7010932314");
		summa.submit();
		Thread.sleep(7000);
		File a2 = ts.getScreenshotAs(OutputType.FILE);
		File file1 = new File("C:\\\\Users\\\\User\\\\Desktop\\\\screenshots\\\\amazon3.png");
		FileUtils.copyFile(a2, file1);
		driver.quit();

	}

}
