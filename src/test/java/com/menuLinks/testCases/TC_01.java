package com.menuLinks.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01 extends BaseClass {
	
	@Test
	public void TC1() throws InterruptedException{
		
		logger.info("Fetching Amazon Pay page title...");
		String expectedTitle = driver.getTitle();
		System.out.println("Amazon Pay Page title: " + expectedTitle);
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		
		logger.info("We are on Homepage....");
		Thread.sleep(3000);
		
		logger.info("Validating Homepage title...");
		expectedTitle = driver.getTitle();
		
		String actualTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if(expectedTitle.equals(actualTitle)) {
			Assert.assertTrue(true);
			logger.info("Test Case passed");
			Thread.sleep(3000);
		}else {
			Assert.assertTrue(false);
			logger.info("Test Case Failed");
		}
		
		
		
		
	}

}
