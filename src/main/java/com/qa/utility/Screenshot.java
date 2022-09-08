package com.qa.utility;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.TestBase.TestBase;

public class Screenshot extends TestBase {
	
		
		public static String path = "C:\\Users\\LENOVO\\eclipse-workspace\\Framework-2\\ScreenShot\\";

	  public static void SS(String filename ) 
	  {
		 
		  try
		  {
		
		  
		  TakesScreenshot t = (TakesScreenshot) driver;
		  
		 File Src = t.getScreenshotAs(OutputType.FILE);
		  
		 File desc = new File(path + filename+ ".png");
		 
		FileHandler.copy(Src, desc);
		 
		  }
		  
		  catch(IOException e)
		  
		  {
			  
			  System.out.println("please provide correct path");
			  e.printStackTrace();
		  }
		  
		  
		  
		  
	  }
}
