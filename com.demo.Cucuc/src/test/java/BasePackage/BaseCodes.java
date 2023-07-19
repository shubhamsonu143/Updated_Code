package BasePackage;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v100.page.Page;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import X_Paths.Deposit_Summary_Page;
import X_Paths.Guardian_Pan;
import X_Paths.Landing_Page;
import X_Paths.Minor_Pan_Details_Page;
import X_Paths.SchemeDeatilsPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCodes {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browserName) {

		try {
			switch (browserName) {
			case "EDGE":
				EdgeOptions options = new EdgeOptions();
				options.addArguments("--incognito");
				DesiredCapabilities cas = new DesiredCapabilities();
				cas.setCapability(EdgeOptions.CAPABILITY, options);
				options.merge(cas);
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver(options);
				break;
			case "CHROME":
				ChromeOptions options1 = new ChromeOptions();
				options1.addArguments("--incognito");
				DesiredCapabilities cas1 = new DesiredCapabilities();
				cas1.setCapability(ChromeOptions.CAPABILITY, options1);
				options1.merge(cas1);
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(options1);
				break;
			case "FIREFOX":
				FirefoxOptions options2 = new FirefoxOptions();
				options2.addArguments("--incognito");
				DesiredCapabilities cas2 = new DesiredCapabilities();
				cas2.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options2);
				options2.merge(cas2);
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver(options2);
				break;
			default:
				EdgeOptions options3 = new EdgeOptions();
				options3.addArguments("--incognito");
				DesiredCapabilities cas3 = new DesiredCapabilities();
				cas3.setCapability(EdgeOptions.CAPABILITY, options3);
				options3.merge(cas3);
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver(options3);
				break;
			}

			driver.manage().window().maximize();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return driver;
	}

	public static String getCurrentUrl() {
		
		String CurrentUrl=null;
		
			try {
				CurrentUrl=driver.getCurrentUrl();
			} catch (Exception e) {
				e.printStackTrace();
			}
			return CurrentUrl;
			
	}
	public static String getPageTitle() {
		
		String title=null;
		
		try {
			title=driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return title;
	}
	
	public static void loadUrl(String url) {

		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void sendKeys(WebElement element, String value) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public static  void keysSendKeys(WebElement element , Keys keysToSend) {
		
		try {
			WebDriverWait wait=new WebDriverWait(driver,  Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(keysToSend);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
				
		
	}

	public static void btnClick(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
			if (enabled(until) && displayed(until)) {
				until.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void clear(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(element)).clear();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void dropDown(WebElement element, String method, String value) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(element));
			Select s = new Select(element);

			switch (method) {
			case "value":
				s.selectByValue(value);
				break;
			case "text":
				s.selectByVisibleText(value);
				break;
			case "index":
				s.selectByIndex(Integer.parseInt(value));
				break;

			default:
				System.out.println("Please choose the valid drop down options");
				break;
			}
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}

	}
	public static void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static boolean enabled(WebElement element) {
		boolean enabled = false;
		try {
			enabled = element.isEnabled();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return enabled;
	}

	public static boolean displayed(WebElement element) {
		boolean displayed = false;
		try {
			displayed = element.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return displayed;
	}

	public static boolean selected(WebElement element) {
		boolean selected = false;

		try {
			selected = element.isSelected();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return selected;
	}

	public static void scrollDown(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true)", until);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void scrollUp(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(false)", until);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void highLightWebElements(WebElement element) {
		
		try {
			JavascriptExecutor executor=(JavascriptExecutor) driver;
			executor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initWebElements() {
		
		PageFactory.initElements(driver, Landing_Page.getInstance());
		PageFactory.initElements(driver, SchemeDeatilsPage.getInstance());
		PageFactory.initElements(driver, Minor_Pan_Details_Page.getInstance());
		PageFactory.initElements(driver, Guardian_Pan.getInstance());
		PageFactory.initElements(driver, Deposit_Summary_Page.getInstance());
		
			
		
	}
	
	
	

}
