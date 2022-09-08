package com.qa.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.PageLayer.HomePage;
import com.qa.PageLayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static HomePage home;
	
	public static LoginPage page;
	public static WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
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
