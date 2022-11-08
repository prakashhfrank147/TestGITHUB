package com.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandlingDemo {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");

		driver.findElement(
				By.xpath("//*[@id=\"content\"]/article/div/div/section[3]/div/div[1]/div/div/div/center/button"))
				.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		driver.findElement(
				By.xpath("//*[@id=\"content\"]/article/div/div/section[3]/div/div[2]/div/div/div/center/button"))
				.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		// driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/section[3]/div/div[2]/div/div/div/center/button")).click();
		// Thread.sleep(1000);
		// driver.switchTo().alert().accept();
		WebElement prmt = driver.findElement(By.xpath("//button[text()='Prompt Alert Box']"));
		prmt.click();
		Thread.sleep(3000);
		String text = driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("hello");
		driver.switchTo().alert().accept();

		System.out.println(text);

		driver.quit();
	}
}
