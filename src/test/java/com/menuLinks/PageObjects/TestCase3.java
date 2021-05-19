package com.menuLinks.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class TestCase3 {

	WebDriver ldriver;
	
	public TestCase3(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[6]")
	@CacheLookup
	WebElement lnkElectronics;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"nav-xshop\"]/a[5]")
	@CacheLookup
	WebElement lnkNewReleases;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"nav-hamburger-menu\"]/i")
	@CacheLookup
	WebElement lnkAllMenu;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a")
	@CacheLookup
	WebElement lnkFireTV;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"hmenu-content\"]/ul[3]/li[5]/a")
	@CacheLookup
	WebElement lnkFireTVStick;
	
	public void clickLinkElectronics(){
		lnkElectronics.click();
	}
	
	public void clickLinkNewReleases(){
		lnkNewReleases.click();
	}
	
	public void clickLinkAllMenu(){
		lnkAllMenu.click();
	}
	
	public void clickLinkFireTV(){
		lnkFireTV.click();
	}
	
	public void clickLinkFireTVStick() {
		lnkFireTVStick.click();
	}
	
}


