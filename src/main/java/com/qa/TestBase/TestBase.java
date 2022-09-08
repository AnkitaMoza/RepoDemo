package com.qa.TestBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.qa.PageLayer.HomePage;
import com.qa.PageLayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static HomePage home;
	
	public static LoginPage page;
	public static WebDriver driver;
	public static Logger logger;
	@BeforeClass
	public void start()
	{
	   logger = Logger.getLogger("RepoDemo");
		PropertyConfigurator.configure("Log4j.properties");
	    logger.info("Execution started");
	}
	
	
	@AfterClass
	public void end()
	{
		
	    logger.info("Execution ended");
	}
	

	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		logger.info("url launched");
		driver.manage().window().maximize();
		logger.info("window maximized");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logger.info("cookies deleted + wait performed");
		
		page = new LoginPage();
		home = new HomePage();
	}
	
//	@AfterMethod
//	public void Last()
//	{
//		driver.close();
//		
//	
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
}
