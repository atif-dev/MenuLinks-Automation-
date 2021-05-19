package com.menuLinks.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.menuLinks.PageObjects.TestCase3;

public class TC_03 extends BaseClass {
	
	String actualTitle;
	String expectedTitle;
	int actualCount = 7;
	int validationCount = 0;
	
	@Test
	public void TC3() throws InterruptedException {
		
		actualTitle = "Amazon Pay";
		expectedTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			logger.info("Amazon Pay title is validated.");
			validationCount++;
		}else {
			logger.info("Amazon Pay title is not validated.");
		}
		
		HomePageTitleValidate();
		
		
		TestCase3 tc3 = new TestCase3(driver);
		tc3.clickLinkElectronics();
		
		actualTitle = "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
		expectedTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			logger.info("Electronics page title is validated");
			validationCount++;
		}else {
			logger.info("Electronics page title is not validated");
		}
		Thread.sleep(3000);
		
		HomePageTitleValidate();
		
		tc3.clickLinkNewReleases();
		
		actualTitle = "Amazon.in Hot New Releases: The bestselling new and future releases on Amazon";
		expectedTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			logger.info("New Releases page title is validated.");
			validationCount++;
		}else {
			logger.info("New Releases page title is not validated.");
		}
		
		HomePageTitleValidate();
		
		
		tc3.clickLinkAllMenu();
		Thread.sleep(2000);
		
		tc3.clickLinkFireTV();
		Thread.sleep(2000);
		
		tc3.clickLinkFireTVStick();
		
		actualTitle = "Fire TV Stick 4K with Alexa Voice Remote | Stream in 4K resolution: Amazon.in: Kindle Store";
		expectedTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			logger.info("Fire TV stick page title is validated.");
			validationCount++;
		}else {
			logger.info("Fire Tv stick page title is not validated");
		}
		Thread.sleep(3000);
		
		if(actualCount == validationCount) {
			Assert.assertTrue(true);
			logger.info("All Validations Successful");
			logger.info("Test Case passed");
		}else {
			Assert.assertTrue(false);
			logger.info("Test Case Failed");
		}
		
	}
	
	//DRY Principle based function
	public void HomePageTitleValidate() throws InterruptedException {
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		actualTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		expectedTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle)){
			logger.info("Homepage title is validated.");
			validationCount++;
		}else {
			logger.info("Homepage title is not validated.");
		}
		Thread.sleep(3000);
	}

}
