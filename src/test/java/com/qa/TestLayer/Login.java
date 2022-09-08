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
			logger.info("userame entered");
			page.enterPassword();
			logger.info("password entered");
			page.clickOnRegistratonDesk();
	        page.clickOnLogin();
	        logger.info("page login succesflly");
		}
		
		
		
		
		
	}
}
