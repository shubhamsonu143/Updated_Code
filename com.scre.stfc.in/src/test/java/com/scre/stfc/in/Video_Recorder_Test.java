package com.scre.stfc.in;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import X_Paths.Home_Page;

public class Video_Recorder_Test extends BaseClass {
	


	@BeforeClass
	void setup() {
		
		launchBrowser("CHROME");
		loadUrl("https://uatfd.stfc.in/");
		initElements();
	}

	@Test
	void verifyLinks() throws Exception {
		Screen_Utils.startRecord("GoogleTestRecording");//Starting point of video recording
		
		sendKeys(Home_Page.getInstance().getMobileNo(), "9488712093");
		sendKeys(Home_Page.getInstance().getPincode(), "606201");
		 	
		Thread.sleep(5000);
         Screen_Utils.stopRecord();//End point of video recording
	}

	@AfterClass
	void tearDown() throws Exception
	{
		
		closeBrowser();
		
		
	}
	

}
