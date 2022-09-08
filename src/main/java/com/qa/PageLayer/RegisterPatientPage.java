package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;

public class RegisterPatientPage extends TestBase{

	
public RegisterPatientPage()
{
	PageFactory.initElements(driver, this);
}

@FindBy(xpath = "//input[@id='fr1382-field']")
	private WebElement Given_Name;

public void enterGivenName()
{
	Given_Name.sendKeys("Ankita");
}
	
@FindBy(xpath = "//input[@id='fr3271-field']")
private WebElement Middle_Name;

public void enterMiddleName()
{
	Middle_Name.sendKeys("Sanjay");
}









}
