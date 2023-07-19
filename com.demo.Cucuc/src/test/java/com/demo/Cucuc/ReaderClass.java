package com.demo.Cucuc;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class ReaderClass {

	public static void loadProperties() {
		
		FileReader reader=null;
		
		try {
			reader=new FileReader("C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\com.demo.Cucuc\\src\\test\\resources\\Read.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Properties prop=new Properties();
			prop.load(reader);
			Constants.BROWSER=prop.getProperty("BROWSER");
			Constants.APP_URL=prop.getProperty("APP_URL");
			Constants.URL_VERIFY=prop.getProperty("URL_VERIFY");
			Constants.MOBILE_NUMBER_ERROR_MSG=prop.getProperty("MOBILE_NUMBER_ERROR_MSG");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
