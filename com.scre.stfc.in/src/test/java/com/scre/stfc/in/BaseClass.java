package com.scre.stfc.in;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import X_Paths.Home_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver launchBrowser(String browserName) {

		switch (browserName) {
		case "CHROME":

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "EDGE":

			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.addArguments("--incognito");
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability(ChromeOptions.CAPABILITY, edgeOptions);
			edgeOptions.merge(cap);
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--incognito");
			DesiredCapabilities cas = new DesiredCapabilities();
			cas.setCapability(ChromeOptions.CAPABILITY, opt);
			opt.merge(cas);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}

		driver.manage().window().maximize();
		return driver;

	}

	public static void loadUrl(String url) {

		try {
			driver.get(url);
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

	public static void sendKeys(WebElement element, String value) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
			until.sendKeys(value);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void clear(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
			until.clear();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void dropDownOptions(WebElement element, String options, String value) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
		Select s = new Select(until);

		switch (options) {
		case "value":
			s.selectByValue(value);
			break;
		case "text":
			s.selectByVisibleText(value);
			break;
		case "index":
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
			break;
		default:
			System.out.println("Please choose the valid DropDown options");
			break;
		}

	}

	public static void scrollDown(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			WebElement until = wait.until(ExpectedConditions.visibilityOf(element));

			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollintoview(true)", until);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void scrollUp(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollintoview(false)", until);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void btnClick(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
			until.click();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void actionsMethods() {
		
		try {
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
			Actions ac=new Actions((WebDriver) wait);
			ac.doubleClick().perform();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	public static void highLightedWebElements(WebElement element) {
		
		try {
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
			WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
			JavascriptExecutor executor=(JavascriptExecutor) driver;
			executor.executeScript("arguments[0].style.border='2px solid blue'", until);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void initElements() {

		PageFactory.initElements(driver, Home_Page.getInstance());

	}

}
