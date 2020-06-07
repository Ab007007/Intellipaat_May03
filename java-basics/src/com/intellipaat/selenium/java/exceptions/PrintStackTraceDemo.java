package com.intellipaat.selenium.java.exceptions;

public class PrintStackTraceDemo {
	
	public static void main(String[] args) {
		System.out.println("Main started ");
		sum();
		System.out.println("Main Ended");
	}

	static void sum()
	{
		sum1();
	}
	
	static void sum1()
	{
		try
		{
			String str = null;
			System.out.println(str.length());
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
