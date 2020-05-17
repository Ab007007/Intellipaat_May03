package com.intellipaat.selenium.java.methods;

public class MethodsDemo 
{
	/*
	 * signature - 
	 *  --> number of arguments
	 *  --> type of arguments
	 *  
	 */
	int a = 10;
	int b = 20;
	
	void sum()
	{
		int c = a + b;
		System.out.println("The sum of two numbers is : "  + c );
	}

	/*
	 * void sum(int a1 , int b1) { int c = a1 + b1 ;
	 * System.out.println("The sum of two numbers is : " + c ); }
	 */
	
	int sum(int a1, int b1)
	{
		int c =  a1 + b1 ;
		System.out.println("The sum of two numbers is : "  + c );
		return c;
		
	}

	public static void main(String[] args) {
		MethodsDemo md = new MethodsDemo();
		md.sum();
		int c = md.sum(30,50);
		System.out.println("substracting 10 from sum ");
		int substractedValue = c - 10;
		System.out.println(substractedValue);
		int mulitpliedValue = c * 10;
		System.out.println(mulitpliedValue);
		int dividedValue  = c /10;
		System.out.println(dividedValue);
		
		
		
		
		
		
		
		
		
				
	}
}
