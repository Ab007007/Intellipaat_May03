package com.intellipaat.selenium.java.modifiers;

import com.intellipaat.selenium.java.access.Employee;

public class AccessModifiersDemo {

	String employeeName;
	int employeeID;
	static final String company = "IBM";
	public static void main(String[] args) {
		AccessModifiersDemo aObj = new AccessModifiersDemo();
		System.out.println(aObj.employeeName);
		System.out.println(aObj.employeeID);
		//company="DDD";
		System.out.println(company);
		System.out.println(aObj.company);
		System.out.println(AccessModifiersDemo.company);
	}
}
