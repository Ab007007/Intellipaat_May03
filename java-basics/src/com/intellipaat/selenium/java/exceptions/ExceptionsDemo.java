package com.intellipaat.selenium.java.exceptions;

public class ExceptionsDemo
{

	public static void main(String[] args) {
		
		System.out.println("---main started ---");
		try
		{
			String str = null;
			System.out.println(str.length());
		}
		catch(IndexOutOfBoundsException ex )
		{
			System.out.println("Exception : Index is not valid, please check the content " );
		}
		catch(NullPointerException np)
		{
			System.out.println("Exception : String is null, please check the content before calling length method");
		}
		catch(Exception ex)
		{
			System.out.println("Generic Handler");
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("--- main ended ---");
	}
}
