package org.run;

import org.baseclass.BaseClass;
import org.testng.annotations.Test;

public class Browser extends BaseClass {

	@Test
	private void browserLaunch() {

		browserLaunch("CHROME");
		
		driver.manage().window().maximize();
	
	}
	
	
}
