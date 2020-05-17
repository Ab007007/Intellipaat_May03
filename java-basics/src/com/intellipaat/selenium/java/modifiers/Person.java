package com.intellipaat.selenium.java.modifiers;

public abstract class Person {
	
	String name;
	int age;
	
	public abstract void getName();
	
	public abstract void getAge();
	
	public final void printFamily()
	{
		System.out.println("Human Beings");
	}
	

}
