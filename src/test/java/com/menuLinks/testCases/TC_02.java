package com.menuLinks.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.menuLinks.PageObjects.TestCase2;

public class TC_02 {
	
	public static Logger logger;
	public static WebDriver driver;
	static int count =0;
	static int expectedCount = 4;
	
	@Parameters("browser")
	@Test
	 public static void TC2(String br) throws InterruptedException {//this was default main method. It's name is changed to TC2 so that we can see TC2 in extent report
		
		logger = Logger.getLogger("MenuLinks");
		PropertyConfigurator.configure("Log4j.properties");
		  
		  if(br.equals("chrome")) {

		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
		   driver = new ChromeDriver();
		  
		  }else if(br.equals("firefox	")) {

			  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//geckodriver.exe");
			  driver = new FirefoxDriver();
		  
		  }
		  
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  // Open URL of Website
		  driver.get("https://www.techlistic.com");

		//driver.manage().window().maximize();
			logger.info("URL is Opened");
		
			Dimension d = new Dimension(1477,729);
			//Dimension d = new Dimension(1477,830);
	        //Resize current window to the set dimension
	        driver.manage().window().setSize(d);
	        Thread.sleep(2000);
	        logger.info("Window size has been set");
	       
	        Thread.sleep(2000);
	        
	        TestCase2 tc2 = new TestCase2(driver);
	        
	        tc2.clickJavaTutorial();
	        Thread.sleep(3000);
	        
	        logger.info("Validating Java Tutorial page title...");
	        String actualTitle = "Techlistic";
	        String expectedTitle = driver.getTitle();
	        if(actualTitle.equals(expectedTitle)) {
	        	count++;
	        	logger.info("Java Tutorial page title is validated.");
	        }else {
	        	Assert.assertTrue(false);
	        	logger.info("Java Tutorial page title is not validated.");
	        }
	        
	        Thread.sleep(2000);
	        driver.navigate().back();
			Thread.sleep(3000);
			
			tc2.clickSeleniumTutorial();
			Thread.sleep(3000);
			
			logger.info("Validating Selenium Tutorial page title...");
			actualTitle = "Selenium Webdriver Tutorial - Techlistic";
			expectedTitle = driver.getTitle();
			 if(actualTitle.equals(expectedTitle)) {
		        	count++;
		        	logger.info("Selenium Tutorial page title is validated.");
		        }else {
		        	Assert.assertTrue(false);
		        	logger.info("Selenium Tutorial page title is not validated.");
		        }
			 
			 Thread.sleep(3000);
			 driver.navigate().back();
			 Thread.sleep(3000);
			
			 tc2.clickSeleniumBlogs();
			 Thread.sleep(3000);
			 
			 logger.info("Validating Selenium Blogs page title...");
			 actualTitle = "Best Selenium Blogs";
			 expectedTitle = driver.getTitle();
			 if(actualTitle.equals(expectedTitle)){
				 count++;
				 logger.info("Selenium Blogs page title is validated.");
			 }else {
				 logger.info("Selenium Blogs page title is not validated.");
			 }
			 
			 Thread.sleep(3000);
			 driver.navigate().back();
			 Thread.sleep(3000);
			 
			 tc2.clickTestNGBlogs();
			 Thread.sleep(3000);
			 
			 logger.info("Validating TestNG Blogs page title...");
			 actualTitle = "Selenium-TestNG Framework Tutorial";
			 expectedTitle = driver.getTitle();
			 if(actualTitle.equals(expectedTitle)){
				 count++;
				 logger.info("TestNG Blogs page title is validated.");
			 }else {
				 logger.info("TestNG Blogs page title is not validated.");
			 }
			 
			 Thread.sleep(3000);
			 
			 if(count == expectedCount) {
				 logger.info("Validations Successful");
				 Assert.assertTrue(true);
				 logger.info("Test Case Passed.");
			 }
			 
			 Thread.sleep(3000);
	        
	        
		  
		  // Close Browser
		  driver.close();
		  
		 }
	
	
	
}