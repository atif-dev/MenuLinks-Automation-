package com.menuLinks.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestCase2 {
	
	WebDriver ldriver;
	
	public TestCase2(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkJavaTutorial;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[3]/a")
	@CacheLookup
	WebElement lnkSeleniumTutorial;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[9]/a")
	@CacheLookup
	WebElement lnkSeleniumBlogs;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[4]/a")
	@CacheLookup
	WebElement lnkTestNGBlogs;
	
	public void clickJavaTutorial(){
		lnkJavaTutorial.click();
	}
	
	public void clickSeleniumTutorial() {
		lnkSeleniumTutorial.click();
	}
	
	public void clickSeleniumBlogs(){
		lnkSeleniumBlogs.click();
	}
	
	public void clickTestNGBlogs(){
		lnkTestNGBlogs.click();
	}

}
