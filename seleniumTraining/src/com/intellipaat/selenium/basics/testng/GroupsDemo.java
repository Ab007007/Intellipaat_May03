package com.intellipaat.selenium.basics.testng;

import org.testng.annotations.Test;

public class GroupsDemo {

	@Test(groups = { "maruthi", "cars"} )
	public void swift() {

	}

	@Test(groups = "maruthi")
	public void ertiga() {

	}

	@Test(groups = {"mahendra" ,"cars"})
	public void xuv500() {

	}

	@Test(groups = "mahendra")
	public void xuv300() {

	}

	@Test(groups = "audi")
	public void Q1() {

	}

	@Test(groups = { "audi","cars"})
	public void Q6() {

	}

	@Test(groups = "audi")
	public void Q2() {

	}

	@Test(groups = { "bmw", "cars"})
	public void X1() {

	}

	@Test(groups = "bmw")
	public void X6() {

	}

}
