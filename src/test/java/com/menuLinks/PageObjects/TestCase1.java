package com.menuLinks.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestCase1 {
	
	WebDriver ldriver;
	
	public TestCase1(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[9]")
	@CacheLookup
	WebElement lnkAmazonPay;
	
	public void clickAmazonPay() {
		lnkAmazonPay.click();
	}

}
