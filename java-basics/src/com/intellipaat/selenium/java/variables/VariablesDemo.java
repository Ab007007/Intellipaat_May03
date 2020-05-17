package com.intellipaat.selenium.java.variables;

public class VariablesDemo 
{
	int a,b;
	public static int z = 100;
	public static void main(String[] args) 
	{
		System.out.println("hi");
		VariablesDemo vd = new VariablesDemo();
		vd.a = 10;
		vd.b = 20;
		System.out.println("the value of static variable is :  " +  z);
		vd.sum();
		vd.sub();
		
	}
	
	void sum()
	{
		int c  = a + b;
		System.out.println(z);
		System.out.println("Sum of two numbers : " + c);
	}
	
	void sub()
	{
		int c  = a - b;
		System.out.println("Substraction of two numbers : " + c);
	}
	
	
	
	
	
	
	

}
