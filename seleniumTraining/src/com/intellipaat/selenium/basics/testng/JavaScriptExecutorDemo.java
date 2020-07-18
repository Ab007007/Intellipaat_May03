package com.intellipaat.selenium.basics.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class JavaScriptExecutorDemo {
	
	@Test
	public void javaScriptTest()
	{
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("http://formy-project.herokuapp.com/scroll");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	//	js.executeScript("window.scrollTo(0, 1000);");
		
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("name")));
	}

}
