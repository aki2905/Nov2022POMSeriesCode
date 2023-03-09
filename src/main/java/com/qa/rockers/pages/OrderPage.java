package com.qa.rockers.pages;

import org.openqa.selenium.By;

public class OrderPage {

	By price = By.className("price");
	By orderCart = By.id("order123");
	
	public void getOrder() {
		System.out.println("get order");
	}
	
	public void getPrice() {
		System.out.println("getPrice");
	}
	
}
