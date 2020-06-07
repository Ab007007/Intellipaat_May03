package com.intellipaat.selenium.java.exceptions;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		System.out.println("--- main started ---");
		try {
			myNPE();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("exception thrown");
			e.printStackTrace();
		}
		System.out.println("--- main ended ---");
		
	}
	
	public static void myNPE() throws Exception
	{
		String str = "";
		System.out.println(str.length());
	}
}
