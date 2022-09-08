package com.qa.TestLayer;

import org.testng.annotations.Test;

import com.qa.PageLayer.LoginPage;
import com.qa.TestBase.TestBase;

public class Login {
	public class LoginTest extends TestBase {

		@Test
		public void verifyLogin()
		{
			LoginPage page = new LoginPage();
			page.enterUsername();
			page.enterPassword();
			page.clickOnRegistratonDesk();
	        page.clickOnLogin();
		}
		
		
		
		
		
	}
}
