package com.intellipaat.selenium.java.loops;

public class Tables {
	static int i=1;
	static int num = 6;
	public static void main(String[] args) {
		
		printTablesUsingDoWhileLoop(3,2);
		System.out.println("Ended");
	}
	
	public static void printTablesUsingDoWhileLoop(int num, int limit)
	{
		do
		{
			System.out.println("---By Default prining  tables for " + num);
			while (i <= 10) 
			{
				System.out.println(num + " * " + i + " = " + (num * i));
				i++;
			}
			limit++;
		}while(limit<=3);
	}
	public static void pritnTablesUsingWhileLoop(int num)
	{
		System.out.println("---Prininting tables for " + num);
		while (i <= 10) 
		{
			System.out.println(num + " * " + i + " = " + (num * i));
			i++;
		}
	}
	
	public static void printTablesUsingForLoop(int num)
	{
		System.out.println("---Prininting tables for " + num);
		for (int i = 1; i <=20; i++)
		{
			
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}
