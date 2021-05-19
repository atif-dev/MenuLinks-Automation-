package com.menuLinks.testCases;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.menuLinks.PageObjects.TestCase1;
import com.menuLinks.Utilities.ReadConfig;


public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) throws InterruptedException
	{
		logger = Logger.getLogger("MenuLinks");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome"))
		{
		
		  System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
		  driver = new ChromeDriver();
			
		 
		}else if(br.equals("firefox")) { 
			System.setProperty("webdriver.gecko.driver",
		  readconfig.getFirefoxPath()); driver = new FirefoxDriver(); 
		  
		}
		 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseURL);
		//driver.manage().window().maximize();
		logger.info("URL is Opened");
	
		Dimension d = new Dimension(1477,729);
		//Dimension d = new Dimension(1477,830);
        //Resize current window to the set dimension
        driver.manage().window().setSize(d);
        Thread.sleep(2000);
        logger.info("Window size has been set");
        
        String title = driver.getTitle();
        System.out.println("Homepage Title: " + title);
        Thread.sleep(2000);
        logger.info("Homepage Title is fetched");
        
        Thread.sleep(2000);
        
        TestCase1 tc1 = new TestCase1(driver);
        tc1.clickAmazonPay();
        Thread.sleep(5000);
        logger.info("We are on Amazon pay Page.");
        Thread.sleep(2000);
        
        
       
	}
	
	
	
	@AfterClass
	public void tearDown()
	{
		
		driver.quit();
	}
	
	
	
}