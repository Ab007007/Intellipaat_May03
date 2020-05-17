package com.intellipaat.selenium.java.access;

import java.security.PublicKey;

class Person {
	
	String name;
	int age;

	public Person(String name, int age) {
		System.out.println("Constructor is called....");
		this.name = name;
		this.age = age;
		
	}
	
	public Person()
	{
		System.out.println(" Default constructor called");
	}
	
	public String toString() {
		String personDetails = "The Object contains " + this.name + " and " + this.age ;
		return personDetails;
	}
	
}

public class PersonManager {
	
	public static void main(String[] args) {
		System.out.println("--- Person Manager Class started ----");
		
		Person p1 = new Person("aravinda",36);	
		Person p2 = new Person("AHB",36);	
		Person p3 = new Person();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println("--- Person Manager Class ended ----");
	}
}