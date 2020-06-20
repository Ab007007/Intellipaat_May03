package com.intellipaat.selenium.basics.waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class FluentWaitDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///D:/Intellipaat/Intellipaat_08_June/html/tiimeout.html");
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		FluentWait<WebElement> wait = new FluentWait<WebElement>(driver.findElement(By.id("demo")))
				.pollingEvery(Duration.ofMillis(1000))
				.withTimeout(Duration.ofSeconds(10))
				.ignoring(NoSuchElementException.class)
				.ignoring(Exception.class);
		
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {

			@Override
			public Boolean apply(WebElement ele) {
				boolean flag = false;
				String txt  = null;
				txt = ele.getText();
				//System.out.println("txt" + txt);
				if(txt.equals("Hello") )
				{
					System.out.println("Element Found...!!!!");
					flag = true;
				}
				else
				{
					System.out.println("Waiting!!!!!!");
					flag = false;
				}
				
				return flag;
			}
		};
		
		
		
		wait.until(fun);
		
		System.out.println("End");

	}

}
