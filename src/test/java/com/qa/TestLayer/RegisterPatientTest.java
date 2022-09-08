package com.qa.TestLayer;

import org.testng.annotations.Test;

import com.qa.PageLayer.HomePage;
import com.qa.TestBase.TestBase;

public class RegisterPatientTest extends TestBase{

	
	@Test
	public void verifyRegister()
	{
		page.enterUsername();
		page.enterPassword();
		page.clickOnRegistratonDesk();
		page.clickOnLogin();
		home.clickOnRegisterPatient();
		
	}
	
	
	
	
	
	
}
