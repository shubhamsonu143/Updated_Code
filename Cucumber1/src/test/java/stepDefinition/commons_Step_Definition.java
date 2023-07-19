package stepDefinition;

import org.junit.After;
import org.junit.Before;

import commonPackage.BaseClass;
import utilities.CommonUtils;

public class commons_Step_Definition extends BaseClass{
	
	
	   @Before
	    public void beforeScenario() {

	        try {
	            CommonUtils.loadProperties();
	            launchBrowser();
	            loadUrl();
	            initElementsOfAllPage();
	        } catch (Exception e) {

	            System.out.println(e);
	        }
	    }

	    @After
	    public void afterScenario() {

	        quitBrowser();

	    }


}
