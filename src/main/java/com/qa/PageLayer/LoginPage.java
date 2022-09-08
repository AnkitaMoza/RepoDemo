package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.TestBase.TestBase;

public class LoginPage extends TestBase {

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement Username;
	
	public void enterUsername()
	{
		Username.sendKeys("Admin");
	}
	
	@FindBy(id = "password")
	private WebElement Passwrd;
	
	public void enterPassword()
	{
		Passwrd.sendKeys("Admin123");
	}
	
	
	@FindBy(id = "Registration Desk")
	private WebElement Regstion_Desk;
	
	public void clickOnRegistratonDesk()
	{
		Regstion_Desk.click();
	}
	

	@FindBy(id = "loginButton")
	private WebElement Login_Button;
	
	public void clickOnLogin()
	{
		Login_Button.click();
	}
	
}
