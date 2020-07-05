package com.intellipaat.selenium.popup;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.intellipaat.selenium.basics.utils.ActiTimeUtils;

public class FileUploadPopUp {
	
	public static void main(String[] args) throws IOException {
		Runtime.getRuntime().exec("D:\\Intellipaat\\Intellipaat_03_May\\Eclipse_WS\\autoit\\fileupload.exe");
		WebDriver driver = ActiTimeUtils.getDriver("chrome");
		ActiTimeUtils.launchApp("http://formy-project.herokuapp.com/fileupload");
		ActiTimeUtils.click("id", "file-upload-field");
		
		
	}

}
