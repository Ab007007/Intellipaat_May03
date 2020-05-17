package com.intellipaat.selenium.java.access;

public class AccessDemo {

	private int privateVariable = 10;
	int defaultVariable = 20;
	protected int protectedVariable = 30;
	public int publicVariable = 40;
	
	public static void main(String[] args)
	{
		AccessDemo ad = new AccessDemo();
		
		System.out.println(ad.privateVariable);
		System.out.println(ad.defaultVariable);
		System.out.println(ad.protectedVariable);
		System.out.println(ad.publicVariable);
		
		
	}
}
