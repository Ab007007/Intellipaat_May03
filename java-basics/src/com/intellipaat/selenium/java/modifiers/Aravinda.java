package com.intellipaat.selenium.java.modifiers;

public class Aravinda extends Person {
	@Override
	public void getAge() {
		System.out.println("My age is -- 99");

	}

	@Override
	public void getName() {
		System.out.println("My Name is - Aravinda");
	}

	public static void main(String[] args) {
		Aravinda ab = new Aravinda();
		ab.getName();
		ab.getAge();
		ab.printFamily();

	}
}
