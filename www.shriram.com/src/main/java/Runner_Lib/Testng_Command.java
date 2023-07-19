package Runner_Lib;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common_Package.BaseClass;

public class Testng_Command extends BaseClass{
	
	
	@BeforeTest
	public void f1() {
		
		browserLaunch("CHROME");
		
			
		
	}
	@Test
	public void f2() {
		
		loadUrl("https://www.google.com");
		
		
	}

}
