package com.intellipaat.selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormyAutoSuggestion {

 public static void main(String[] args) {
  
  System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  
  driver.get("https://formy-project.herokuapp.com/");
  driver.findElement(By.xpath("//a[@class='btn btn-lg' and text()='Autocomplete']")).click();
  driver.findElement(By.xpath("//input[@class='form-control pac-target-input']"));
  
  
  driver.close();
  driver=null;
  

 }

}