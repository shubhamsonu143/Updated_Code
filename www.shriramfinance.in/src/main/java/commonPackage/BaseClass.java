package commonPackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Properties;
import java.util.Set;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	public static  WebDriver browserLaunch(String browserName) {

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


	public static void sendKeys(WebElement element ,String data) {

	try {
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(data);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	  public static void btnClick(WebElement element) {
		  
		  WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(15));
		  wait.until(ExpectedConditions.visibilityOf(element));
	
	        try {
	            if (enabled(element) && displayed(element)) {
	            	element.click();
	            }
	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	        }
	    }


	public static void clear(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
			until.clear();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void dropDown(WebElement element, String option, String value) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(element));

			Select s = new Select(element);

			switch (option) {
			case "text":
				s.selectByVisibleText(value);
				break;
			case "value":
				s.selectByValue(value);
				break;
			case "index":
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
				break;

			default:
				System.out.println("Please choose the valid drop down option");
				break;
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void loansRadioButton(WebElement element, String value) {
		String s = value;
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));

		if (s.equals("Yes")) {

			element.click();

		} else if (s.equals("No")) {

			element.click();

		} else {

			element.click();

		}

	}

	public static void arrowDown1(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(element));

			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void arrowDown2(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(element));

			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ARROW_DOWN);
			
			element.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	

	public static void arrowDown3(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(element));

			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public static void arrowDown4(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(element));

			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ARROW_DOWN);
			element.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public static void arrowUp1(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(element));

			element.sendKeys(Keys.ARROW_UP);
			
			element.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public static void arrowUp2(WebElement element) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			wait.until(ExpectedConditions.visibilityOf(element));

			element.sendKeys(Keys.ARROW_UP);
			element.sendKeys(Keys.ARROW_UP);
			element.sendKeys(Keys.ENTER);
		} catch (Exception e) {
			System.out.println(e);
		}

	}
	public static void mouseOver(WebElement findElement) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(findElement).perform();
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
	}

	public static void loadUrl(String Url) {
		try {
			driver.get(Url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static String getPageText(WebElement e) {
		String txt = null;
		try {
			txt = e.getText();
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		return txt;
	}

	public static String getAttributeValue(WebElement e) {
		String value = null;
		try {
			value = e.getAttribute("value");
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		return value;
	}

	public static boolean displayed(WebElement button) {
		boolean displayed = false;
		try {
			displayed = button.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return displayed;

	}

	public static boolean enabled(WebElement button) {
		boolean enabled = false;
		try {
			enabled = button.isEnabled();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return enabled;
	}

	public static boolean selected(WebElement text) {
		boolean selected = false;
		try {
			selected = text.isSelected();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return selected;

	}

	public static void setText(WebElement e, String data) {
		try {
			if (enabled(e) && displayed(e)) {
				e.sendKeys(data);
			}

		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

	}

	public static String getPageUrl() {
		String Url = null;
		try {
			Url=driver.getCurrentUrl();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return Url;

	}

	public static void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static String getPageTitle() {
		String title = null;
		try {
			title = driver.getTitle();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return title;

	}

	public static void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void manageNavigate() {
		try {
			driver.navigate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void manageWindow() {
		try {
			driver.manage();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static String getWindowHandle() {
		String next = null;
		try {
			next = driver.getWindowHandle();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return next;
	}

	public static Set<String> getWindowHandles() {
		Set<String> allWindow = null;
		try {
			allWindow = driver.getWindowHandles();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return allWindow;

	}

	public static WebDriver.TargetLocator switchToTargetElement() {
		WebDriver.TargetLocator switchTo = null;
		try {
			switchTo = driver.switchTo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return switchTo;
	}

	public static Alert switchToAlert() {
		Alert al = null;
		try {
			al = switchToTargetElement().alert();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return al;
	}

	public static void acceptAlert() {
		try {
			Alert al = switchToAlert();
			al.accept();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void dismissAlert() {
		try {
			Alert al = switchToAlert();
			al.dismiss();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static String setValue() {
		String text = null;
		try {
			Alert al = switchToAlert();
			text = al.getText();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return text;
	}

	public static void dragAndDropAction(WebElement src, WebElement dest) {
		try {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(src, dest).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void rightClick(WebElement gmail) {
		try {
			Actions ac = new Actions(driver);
			ac.contextClick(gmail).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void doubleClick(WebElement page) {
		try {
			Actions ac = new Actions(driver);
			ac.doubleClick(page).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void performAction() {
		try {
			Actions ac = new Actions(driver);
			ac.perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static WebDriver.Navigation navigate() {
		WebDriver.Navigation navigate = null;
		try {
			navigate = driver.navigate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return navigate;
	}

	public void navigateToUrl(String Url) {
		try {
			navigate().to(Url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void navigateBack() {
		try {
			navigate().back();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void navigateRefersh() {
		try {
			navigate().refresh();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void navigateForward() {
		try {
			navigate().forward();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void switchTopParentFrame() {
		try {
			switchToTargetElement().parentFrame();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void switchToDirectWebPage() {
		try {
			switchToTargetElement().defaultContent();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void switchToFrameById(String id) {
		try {
			switchToTargetElement().frame(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void switchToFrameByName(String name) {
		try {
			switchToTargetElement().frame(name);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void switchToFrameByIndex(int index) {
		try {
			switchToTargetElement().frame(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void switchToFrameByWebElement(WebElement frame1) {
		try {
			switchToTargetElement().frame(frame1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void jsSetText(String data, WebElement e) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('value','" + data + "')", e);
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

	}

	public static void Click(WebElement e) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", e);
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

	}

	public static void getAttribute(String s) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("return arguments[0].getAttribute('value')", s);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void scrollDown(WebElement e) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", e);

		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
	}

	public static void scrollUp(WebElement e) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false)", e);
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

	}

	public static void passScreenCapture() throws IOException {
		Date d = new Date();
		System.out.println(d.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile,
				new File("C:\\Users\\s2605\\IdeaProjects\\stfc-fd-automation\\untitled\\ScreenShots\\screenshots"
						+ sdf.format(d) + ".png"));
	}

	public static void failScreenCapture() throws IOException {
		Date d = new Date();
		System.out.println(d.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile,
				new File("C:\\Users\\s2605\\IdeaProjects\\stfc-fd-automation\\untitled\\ScreenShots\\screenshots"
						+ sdf.format(d) + ".png"));

	}

	public static void emailSend() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDateTime now = LocalDateTime.now();

		String dte = dtf.format(now);

		// Create object of Property file
		Properties props = new Properties();

		// this will set host of server- you can change based on your requirement
		props.put("mail.smtp.host", "smtp.gmail.com");

		// set the port of socket factory
		props.put("mail.smtp.socketFactory.port", "465");

		// set socket factory
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		// set the authentication to true
		props.put("mail.smtp.auth", "true");

		// set the port of SMTP server
		props.put("mail.smtp.port", "465");

		// This will handle the complete authentication
		Session session = Session.getDefaultInstance(props,

				new javax.mail.Authenticator() {

					protected PasswordAuthentication getPasswordAuthentication() {

						return new PasswordAuthentication("sathishperiyasamy4499@gmail.com", "8056665528");

					}

				});

		try {

			// Create object of MimeMessage class
			Message message = new MimeMessage(session);

			// Set the from address
			message.setFrom(new InternetAddress("sathishperiyasamy4499@gmail.com"));

			// Set the recipient address
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("sathishdharshini9@gmail.com"));
			// message.setRecipients(Message.RecipientType.CC,InternetAddress.parse("raja.s@benseron.com"));
			// message.setRecipients(Message.RecipientType.CC,InternetAddress.parse("ragavanp@benseron.com"));

			// Add the subject link
			message.setSubject(" Automation ExtentReport" + dte);

			// Create object to add multimedia type content
			BodyPart messageBodyPart1 = new MimeBodyPart();

			// Set the body of email
			messageBodyPart1.setText("Hi team PFB attached FileReport for CMS Flow");

			// Create another object to add another content
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();

			// Mention the file which you want to send
			String filename = "C:\\Users\\s2605\\IdeaProjects\\untitled\\ExtentReport\\report.html";

			// Create data source and pass the filename
			DataSource source = new FileDataSource(filename);

			// set the handler
			messageBodyPart2.setDataHandler(new DataHandler(source));

			// set the file
			messageBodyPart2.setFileName(filename);

			// Create object of MimeMultipart class
			Multipart multipart = new MimeMultipart();

			// add body part 1
			multipart.addBodyPart(messageBodyPart2);

			// add body part 2
			multipart.addBodyPart(messageBodyPart1);

			// set the content
			message.setContent(multipart);

			// finally send the email
			Transport.send(message);

			System.out.println("=====Email Sent=====");

		} catch (MessagingException e) {

			throw new RuntimeException(e);

		}

	}
	
	

}
