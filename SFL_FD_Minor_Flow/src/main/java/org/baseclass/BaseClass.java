package org.baseclass;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver launchBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.silentOutput", "true");
				WebDriverManager.chromedriver().setup();
				ChromeOptions chromeOptions =new ChromeOptions();
				chromeOptions.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(chromeOptions);
			} else if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.firefox.silentOutput", "true");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();

			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.silentOutput", "true");
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.silentOutput", "true");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}

//            driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return driver;

	}

	public static WebDriver headless(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				ChromeDriverManager cmd = new ChromeDriverManager();
				cmd.setup();
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--headless");
				chromeOptions.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(chromeOptions);
			} else if (browserName.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				FirefoxOptions firefox = new FirefoxOptions();
				firefox.addArguments("--headless");
				driver = new FirefoxDriver(firefox);

			} else if (browserName.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.silentOutput", "true");
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				EdgeOptions edgeOptions = new EdgeOptions();
				edgeOptions.addArguments("--headless");
				driver = new EdgeDriver(edgeOptions);
			}

//            driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return driver;

	}

	public static void loadUrl(String Url) {
		try {
			driver.get(Url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void highLightWebElement(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].style.border='2px solid blue'", element);
	}

	public String getPageText(WebElement e) {
		String txt = null;
		try {
			txt = e.getText();
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		return txt;
	}

	public String getAttributeValue(WebElement e) {
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

	public static void wait_Sendkeys(WebElement element, String value) {

		try {
			WebDriverWait wait_sendkeys = new WebDriverWait(driver, Duration.ofSeconds(30));

			wait_sendkeys.until(ExpectedConditions.visibilityOf(element)).sendKeys(value);

			hold(0500);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void hold(long millis) {

		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}

	public static void wait_CClick(WebElement element) {

		try {
			WebDriverWait waitclick = new WebDriverWait(driver, Duration.ofSeconds(30));

			waitclick.until(ExpectedConditions.visibilityOf(element)).click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void wait_SelectByText(WebElement element, String Value) {

		try {
			WebDriverWait waitclick = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement until = waitclick.until(ExpectedConditions.visibilityOf(element));
			Select s = new Select(until);
			s.selectByVisibleText(Value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void wait_SelectByIndex(WebElement element, int index) {

		try {
			WebDriverWait waitclick = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement until = waitclick.until(ExpectedConditions.visibilityOf(element));
			Select s = new Select(until);
			s.selectByIndex(index);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void wait_SelectByValue(WebElement element, String Value) {

		try {
			WebDriverWait waitclick = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement until = waitclick.until(ExpectedConditions.visibilityOf(element));
			Select s = new Select(until);
			s.selectByValue(Value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void dropDowns(WebElement element, String type, String value) {
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

		case "index":

			s.selectByIndex(Integer.parseInt(value));
			break;
		}

	}

	public void wait_ScrollDown(WebElement e) {

		try {
			WebDriverWait waitclick = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement until = waitclick.until(ExpectedConditions.visibilityOf(e));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", until);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

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

	public boolean selected(WebElement text) {
		boolean selected = false;
		try {
			selected = text.isSelected();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return selected;

	}

	public void setText(WebElement e, String data) {
		try {
			if (enabled(e) && displayed(e)) {
				e.sendKeys(data);
			}

		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

	}

	public static void btnClick(WebElement element) {
		try {
			if (enabled(element) && displayed(element)) {
				element.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void wait_BtnClick(WebElement element) {

		WebDriverWait waitclick = new WebDriverWait(driver, Duration.ofSeconds(30));

		WebElement until = waitclick.until(ExpectedConditions.visibilityOf(element));

		try {
			if (enabled(until) && displayed(until)) {
				until.click();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public String getPageUrl() {
		String Url = null;
		try {
			Url = driver.getCurrentUrl();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return Url;

	}

	public String getPageTitle() {
		String title = null;
		try {
			title = driver.getTitle();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return title;

	}

	public void closeBrowser() {
		try {
			driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void manageNavigate() {
		try {
			driver.navigate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void manageWindow() {
		try {
			driver.manage();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String getWindowHandle() {
		String next = null;
		try {
			next = driver.getWindowHandle();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return next;
	}

	public Set<String> getWindowHandles() {
		Set<String> allWindow = null;
		try {
			allWindow = driver.getWindowHandles();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return allWindow;

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

	public void acceptAlert() {
		try {
			Alert al = switchToAlert();
			al.accept();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void dismissAlert() {
		try {
			Alert al = switchToAlert();
			al.dismiss();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public String setValue() {
		String text = null;
		try {
			Alert al = switchToAlert();
			text = al.getText();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return text;
	}

	public static void sendKeys(String data) {
		try {

			Alert al = switchToAlert();
			al.sendKeys(data);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void mouseOver(WebElement e) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(e).perform();
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
	}

	public void dragAndDropAction(WebElement src, WebElement dest) {
		try {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(src, dest).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void rightClick(WebElement gmail) {
		try {
			Actions ac = new Actions(driver);
			ac.contextClick(gmail).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void doubleClick(WebElement page) {
		try {
			Actions ac = new Actions(driver);
			ac.doubleClick(page).perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void performAction() {
		try {
			Actions ac = new Actions(driver);
			ac.perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void selectOptionByIndex(WebElement ele, int index) {
		try {
			Select s = new Select(ele);
			s.selectByIndex(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void selectOptionByValue(WebElement ele, int value) {
		try {
			Select s = new Select(ele);
			s.selectByIndex(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void selectOptionByText(WebElement ele, String text) {
		try {
			Select s = new Select(ele);
			s.selectByVisibleText(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void deselectOptionByIndex(WebElement ele, int index) {
		try {
			Select s = new Select(ele);
			s.deselectByIndex(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void deselectOptionByValue(WebElement ele, int value) {
		try {
			Select s = new Select(ele);
			s.deselectByIndex(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void deselectOptionByVisibleText(WebElement ele, String text) {
		try {
			Select s = new Select(ele);
			s.deselectByVisibleText(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public List<WebElement> getOptionsFromDropDown(WebElement ele) {
		List<WebElement> options = null;
		try {
			Select s = new Select(ele);
			options = s.getOptions();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return options;
	}

	public void getFirstSelectedOption(WebElement ele) {
		Select s = new Select(ele);
		s.getFirstSelectedOption();
	}

	public List<WebElement> getAllSlectedOptions(WebElement ele) {
		List<WebElement> option = null;
		try {
			Select s = new Select(ele);
			option = s.getAllSelectedOptions();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return option;
	}

	public void deselectAllOptions(WebElement ele) {
		try {
			Select s = new Select(ele);
			s.deselectAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public boolean isMultipleSelect(WebElement mulSelect) {
		boolean multiple = false;
		try {
			Select s = new Select(mulSelect);
			multiple = s.isMultiple();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return multiple;
	}

	public WebDriver.Navigation navigate() {
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

	public void navigateForward() {
		try {
			navigate().forward();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
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

	public void switchTopParentFrame() {
		try {
			switchToTargetElement().parentFrame();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void switchToDirectWebPage() {
		try {
			switchToTargetElement().defaultContent();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void switchToFrameById(String id) {
		try {
			switchToTargetElement().frame(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void switchToFrameByName(String name) {
		try {
			switchToTargetElement().frame(name);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void switchToFrameByIndex(int index) {
		try {
			switchToTargetElement().frame(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void switchToFrameByWebElement(WebElement frame1) {
		try {
			switchToTargetElement().frame(frame1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public void jsSetText(String data, WebElement e) {
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

	public static void wait_Click(WebElement e) {
		try {
			hold(1000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(e));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", e);
			hold(0500);

		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

	}

	public void getAttribute(String s) {
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

	public void scrollUp(WebElement e) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(false)", e);
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}

	}

	public String getDataFromExcel(String sheet, int row, int cell) throws IOException {
		String value = null;
		try {
			File excelLoc = new File(
					"C:\\Users\\a1354\\eclipse-workspace\\sgi-automation\\New_SGI\\Excel\\sathish.xlsx");
			FileInputStream stream = new FileInputStream(excelLoc);
			XSSFWorkbook w = new XSSFWorkbook(stream);
			XSSFSheet s = w.getSheet(sheet);
			Row r = s.getRow(row);
			Cell c = r.getCell(cell);
			int type = c.getCellType();
			if (type == 1) {
				value = c.getStringCellValue();

			}
			if (type == 0) {
				boolean b = DateUtil.isCellDateFormatted(c);
				if (b) {
					Date d = c.getDateCellValue();
					SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
					value = sim.format(d);

				} else {
					double d = c.getNumericCellValue();
					long l = (long) d;
					value = String.valueOf(l);

				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return value;

	}

	public void updateDataInExcel(String sheet, int row, int cell, String value) throws IOException {
		try {
			File excelLoc = new File("C:\\Users\\a1354\\eclipse-workspace\\GoldLoan\\Excel\\Book1.xlsx");
			FileInputStream stream = new FileInputStream(excelLoc);
			XSSFWorkbook w = new XSSFWorkbook(stream);
			XSSFSheet s = w.getSheet(sheet);
			s.getRow(row).createCell(cell).setCellValue(value);
			FileOutputStream outputstream = new FileOutputStream(excelLoc);
			w.write(outputstream);
			// w.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void passScreenCapture() throws IOException {
		Date d = new Date();
		System.out.println(d.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\a1354\\eclipse-workspace\\GoldLoan\\Passed_Screenshots\\" + sdf.format(d) + ".png"));
	}

	public void failScreenCapture() throws IOException {
		Date d = new Date();
		System.out.println(d.toString());

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HHmmss");
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File(
				"C:\\Users\\a1354\\eclipse-workspace\\GoldLoan\\Failed_Screenshots\\" + sdf.format(d) + ".png"));

	}

	public void pindropselect() throws AWTException, InterruptedException {
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1500);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

	public void pindropselectSingleClick() throws AWTException {
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

	public void pindropselect1() throws AWTException {
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

	public void pindropselect4() throws AWTException {
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

	public void emailSent() {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		LocalDateTime now = LocalDateTime.now();

		String dte = dtf.format(now);

		// Create object of Property file
		Properties props = new Properties();

		// this will set host of server- you can change based on your requirement
		props.put("mail.smtp.host", "smtp.gmail.com");

		// set the port of socket factory
		props.put("mail.smtp.socketFactory.port", "587");

		// set socket factory
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		// set the authentication to true
		props.put("mail.smtp.auth", "true");

		// set the port of SMTP server
		props.put("mail.smtp.port", "587");

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
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("aravindhan.g@novactech.in"));
			// message.setRecipients(Message.RecipientType.CC,InternetAddress.parse("raja.s@benseron.com"));
			// message.setRecipients(Message.RecipientType.CC,InternetAddress.parse("ragavanp@benseron.com"));

			// Add the subject link
			message.setSubject("GL_Automation Extent Report" + dte);

			// Create object to add multimedia type content
			BodyPart messageBodyPart1 = new MimeBodyPart();

			// Set the body of email
			messageBodyPart1.setText("Hi Team, PFB Attached Report for Gold Loan");

			// Create another object to add another content
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();

			// Mention the file which you want to send
			String filename = "C:\\Users\\a1354\\eclipse-workspace\\Shriram_Gold_Loan\\test-output.html";

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
