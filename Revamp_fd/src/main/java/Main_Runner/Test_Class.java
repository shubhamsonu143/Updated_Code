package Main_Runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class Test_Class {
	
	
	public static void main(String[] args) {
	               	
		
		
		  TestNG runner = new TestNG();

	        // Create a list of String
	        List<String> suitefiles = new ArrayList<String>();

	        // Add xml file which you have to execute
	        suitefiles.add("C:\\Users\\S2605\\GIT_HUB\\SFL_TESTING\\Revamp_fd\\testng.xml");

	        // now set xml file for execution
	        runner.setTestSuites(suitefiles);

	        // finally execute the runner using run method
	        runner.run();


	    }
	

}
