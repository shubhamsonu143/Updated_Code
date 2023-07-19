package commonPackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import pojo.Additional_Details_Xpaths;
import pojo.Bank_Details_Xpaths;
import pojo.Ckyc_Xpaths;
import pojo.Guardian_Ckyc_xpaths;
import pojo.Guardian_Personal_Details_Xpaths;
import pojo.Minor_Pan_Xpaths;
import pojo.Pan_Details_Xpaths;
import pojo.PennyDrop_Xpaths;
import pojo.Personal_Details_Xpaths;
import pojo.SchemeDetails_Xpaths;
import pojo.Star_Xpaths;
import pojo.X_Paths;

public class BaseClass {
	
	
	 public static WebDriver driver;

	    public static void launchBrowser() {

	        try {
	            switch (Constants.BROWSER) {
	                case "Firefox":
	                    WebDriverManager.firefoxdriver().setup();
	                    driver = new FirefoxDriver();
	                    break;
	                case "EDGE":
	                    WebDriverManager.edgedriver().setup();
	                    driver = new EdgeDriver();
	                    break;
	                default:
	                    WebDriverManager.chromedriver().setup();
	                    driver = new ChromeDriver();
	                    break;

	            }
	            driver.manage().window().maximize();
	        } catch (Exception e) {
	            System.out.println(e);
	        }


	    }

	    public static void loadUrl() {

	        try {
	            switch (Constants.APP_URL) {
	                case "https://uatonlinefd.stfc.in/fixed-deposit-online/":
	                    driver.get("https://uatonlinefd.stfc.in/fixed-deposit-online/");
	                    break;
	                default:
	                    driver.get("https://uatfd.stfc.in/fixed-deposit-online/");
	                    break;


	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }

	    }

	    public static String browser(String s) {

	        try {
	            switch (s) {
	                case "Firefox":
	                    WebDriverManager.firefoxdriver().setup();
	                    driver = new FirefoxDriver();
	                    break;
	                case "EDGE":
	                    WebDriverManager.edgedriver().setup();
	                    driver = new EdgeDriver();
	                    break;
	                default:
	                    WebDriverManager.chromedriver().setup();
	                    driver = new ChromeDriver();
	                    break;

	            }
	            driver.manage().window().maximize();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        return s;
	    }


	    public static void urlVerification(String url) {

	        try {
	            driver.get(url);
	        } catch (Exception e) {
	            System.out.println(e);
	        }

	    }

	    public static void waitSendKeys(WebElement element, String value) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	            wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(value);
	        } catch (Exception e) {
	            System.out.println(e);
	        }


	    }

	    public static void btnClick(WebElement element) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	            WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
	            JavascriptExecutor executor = (JavascriptExecutor) driver;
	            executor.executeScript("arguments[0].click()", until);

	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	    public static void clear(WebElement element) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	            wait.until(ExpectedConditions.visibilityOf(element)).clear();
	        } catch (Exception e) {
	            System.out.println(e);
	        }

	    }

	    public static void closeBrowser() {

	        try {
	            driver.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	    public static void quitBrowser() {

	        try {
	            driver.quit();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	    public static String takeScreenShotFail(String Value) {
	        String s = Value;
	        try {
	            Date d = new Date();
	            System.out.println(d.toString());
	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(scrFile,
	                    new File("C:\\Users\\s2605\\IdeaProjects\\stfc-fd-automation\\Cucumber1\\ScreenShots\\Screenshot.png"));

	        } catch (IOException e) {
	            System.out.println(e);
	        }
	        return Value;
	    }

	    public static String takeScreenShotPass(String Value) {
	        String s = Value;
	        try {
	            Date d = new Date();
	            System.out.println(d.toString());
	            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
	            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            FileUtils.copyFile(scrFile,
	                    new File("C:\\Users\\s2605\\IdeaProjects\\stfc-fd-automation\\Cucumber1\\ScreenShots\\Screenshot1.png"));

	        } catch (IOException e) {
	            System.out.println(e);
	        }
	        return Value;
	    }

	    public static void highlightWebElement(WebElement element) {

	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	            WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
	            JavascriptExecutor executor = (JavascriptExecutor) driver;
	            executor.executeScript("arguments[0].style.border='2px solid blue'", until);
	        } catch (Exception e) {
	            System.out.println(e);
	        }

	    }

	    public static void doubleClick(WebElement element) {

	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	            WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
	            Actions ac = new Actions(driver);
	            ac.doubleClick(until).perform();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	}

	    public static void scrollDown(WebElement element) {

	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	            WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
	            JavascriptExecutor executor = (JavascriptExecutor) driver;
	            executor.executeScript("arguments[0].scrollIntoView(true)", until);
	        } catch (Exception e) {
	            System.out.println(e);
	        }


	    }

	    public static void scrollUp(WebElement element) {

	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	            WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
	            JavascriptExecutor executor = (JavascriptExecutor) driver;
	            executor.executeScript("arguments[0].scrollIntoView(false)", until);
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }


	    public static void initElementsOfAllPage() {
	        PageFactory.initElements(driver, X_Paths.getInstance());
	        PageFactory.initElements(driver, Additional_Details_Xpaths.getInstance());
	        PageFactory.initElements(driver, Bank_Details_Xpaths.getInstance());
	        PageFactory.initElements(driver, Ckyc_Xpaths.getInstance());
	        PageFactory.initElements(driver, Guardian_Ckyc_xpaths.getInstance());
	        PageFactory.initElements(driver, Guardian_Personal_Details_Xpaths.getInstance());
	        PageFactory.initElements(driver, Minor_Pan_Xpaths.getInstance());
	        PageFactory.initElements(driver, Pan_Details_Xpaths.getInstance());
	        PageFactory.initElements(driver, PennyDrop_Xpaths.getInstance());
	        PageFactory.initElements(driver, Personal_Details_Xpaths.getInstance());
	        PageFactory.initElements(driver, SchemeDetails_Xpaths.getInstance());
	        PageFactory.initElements(driver, Star_Xpaths.getInstance());

	    }

	    public static void dropDowns(WebElement element, String type, String value) {

	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	            WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
	            Select s = new Select(until);

	            switch (type) {

	                case "value":

	                    s.selectByValue(value);

	                    break;

	                case "text":

	                    s.selectByVisibleText(value);
	                    break;

	                case "Index":

	                    s.selectByIndex(Integer.parseInt(value));
	                    break;

	                default:

	                    System.out.println("Please select the valid dropdown options" + value);
	                    break;

	            }
	        } catch (NumberFormatException e) {

	            System.out.println(e);

	        }

	    }

	    public static String writeInPropertiesFile(String Validation, String value) {


	        try {
	            File file = new File("C:\\Users\\s2605\\IdeaProjects\\stfc-fd-automation\\Cucumber1\\src\\test\\resources\\writeInProperties.properties");
	            try {
	                file.createNewFile();
	            } catch (IOException e) {
	                throw new RuntimeException(e);
	            }
	            Properties prop = new Properties();
	            prop.setProperty(Validation, value);
	            prop.setProperty(Validation, value);




	            FileOutputStream fis = new FileOutputStream(file);
	            prop.store(fis, "Test Data");
	            fis.close();
	        } catch (IOException e) {
	            throw new RuntimeException(e);
	        }


	        return Validation;
	    }

}
