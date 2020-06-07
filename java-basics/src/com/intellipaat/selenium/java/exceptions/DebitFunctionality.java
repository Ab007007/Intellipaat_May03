package com.intellipaat.selenium.java.exceptions;

import java.util.Scanner;

public class DebitFunctionality {

	static int balance = 5000;
	public static void main(String[] args) {
		System.out.println("--- main started ---");
		Scanner sc = new Scanner(System.in);
		int amount;
		String choice;
		int tempBalance;
		do
		{
			System.out.println("--- Welcome to Amount Withdraw");
			System.out.println("Enter the amount ???");
			amount = sc.nextInt();
			tempBalance = balance - amount;
			if(tempBalance<0)
			{
				try 
				{
					throw new Exception();
				} catch (Exception e)
				{
					System.out.println("Transaction can not be performed, your balance is " + balance);
				}
			}
			else
			{
				balance = tempBalance;
				System.out.println("your balace is " + balance);
			}
			System.out.println("do you want to continueee?????");
			choice = sc.next();
				
		}while(choice.equalsIgnoreCase("yes"));
			
		
		
		
		
		
		System.out.println("--- main ended ----");
	}
	
}
