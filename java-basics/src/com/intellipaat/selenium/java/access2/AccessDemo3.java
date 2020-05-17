package com.intellipaat.selenium.java.access2;

import com.intellipaat.selenium.java.access.AccessDemo;

public class AccessDemo3 extends AccessDemo
{

	public static void main(String[] args) {
		AccessDemo3 ad3 = new AccessDemo3();
		System.out.println(ad3.protectedVariable);
		System.out.println(ad3.publicVariable);

	}
}
