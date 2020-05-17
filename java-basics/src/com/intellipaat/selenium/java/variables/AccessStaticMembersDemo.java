package com.intellipaat.selenium.java.variables;

public class AccessStaticMembersDemo {

	
	public static void main(String[] args) {
		System.out.println(VariablesDemo.z);
		VariablesDemo vd = new VariablesDemo();
		vd.a =1000;
		vd.b = 2000;
		
		vd.sum();
		vd.sub();
		
	}
}
