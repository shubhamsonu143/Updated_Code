package com.demo.Cucuc;

import BasePackage.BaseCodes;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class InitializationClass extends BaseCodes {

	@Before
	public static void launchBr() {
		
		
		ReaderClass.loadProperties();
		browserLaunch(Constants.BROWSER);
		loadUrl(Constants.APP_URL);
		initWebElements();
		
		
	}
	
	@After
	public static void tearDown() throws Exception {
		
		
		Thread.sleep(5000);
//		quitBrowser();
	}
	
	
}
