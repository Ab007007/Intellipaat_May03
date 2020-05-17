package com.intellipaat.selenium.java.loops;

public class ConditionalStatements {

	static int age = 66;
	public static void main(String[] args) {
		String color = "blue";
		
		switch (color) 
		{
		case "while" :
			System.out.println("White color logic");
			break;
		case "black" :
			System.out.println("Black color logic");
			break;
		case "red" :
			System.out.println("Red color logic");
			break;
		case "blue" :
			System.out.println("Blue color logic");
			break;

			default:
				System.out.println("nothing is matched");
				break;
		}
		
	}
	
	public static void pringUsingIF()
	{
		
		if(age <=10)
		{
			System.out.println("babies");
		}
		else if(age>=11 && age <=65)
		{
			System.out.println("Adults");
		}
		else
		{
			System.out.println("old-age");
		}
		
	}
}
