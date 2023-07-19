package utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constants.Constants;

public class CommonUtils {
	
	public static void loadProperties() {

        FileReader reader = null;
        try {
            reader = new FileReader("C:\\Users\\s2605\\IdeaProjects\\stfc-fd-automation\\Cucumber1\\src\\test\\resources\\config.properties");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Properties prop = new Properties();

        try {
            prop.load(reader);

        } catch (IOException e) {

            e.printStackTrace();
        }
        Constants.APP_URL = prop.getProperty("APP_URL");
        Constants.BROWSER = prop.getProperty("BROWSER");
        Constants.UrlChecking = prop.getProperty("UrlChecking");

    }

}
