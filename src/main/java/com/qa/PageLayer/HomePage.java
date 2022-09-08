package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class HomePage extends TestBase{

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")
	private WebElement Register_patient;
	
	public void clickOnRegisterPatient()
	{
		Register_patient.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
