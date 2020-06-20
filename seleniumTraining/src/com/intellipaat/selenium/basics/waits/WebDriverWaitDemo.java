package com.intellipaat.selenium.basics.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("file:///D:/Intellipaat/Intellipaat_08_June/html/tiimeout.html");
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		WebDriverWait wait  =  new WebDriverWait(driver, 10);
		WebElement testOnScreen = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
		
		System.out.println(testOnScreen.getText());

	}

}
