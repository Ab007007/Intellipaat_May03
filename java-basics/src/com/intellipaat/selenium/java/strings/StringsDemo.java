package com.intellipaat.selenium.java.strings;

public class StringsDemo {

	public static void main(String[] args) {
		String str  = "abc";
		System.out.println(str);
		System.out.println(str.hashCode());
		
		str = str.concat("123");
		System.out.println(str);
		System.out.println(str.hashCode());
		
	}
}
