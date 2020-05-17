package com.intellipaat.selenium.java.blocks;

public class StaticBlocksDemo {

	static int count ;
	
	
	{
		count++; // count = count + 1;
		System.out.println("Total objects created for the class is " + count);
		
	}
	static {
		System.out.println("I'm executing before Main!!!");
	}
	
	public static void main(String[] args) {
		System.out.println("-- main started---");
		StaticBlocksDemo xd = new StaticBlocksDemo();
		StaticBlocksDemo xd1 = new StaticBlocksDemo();
		StaticBlocksDemo xd2 = new StaticBlocksDemo();
		StaticBlocksDemo xd3 = new StaticBlocksDemo();
	}
}
