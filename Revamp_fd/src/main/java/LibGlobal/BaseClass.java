package LibGlobal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
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
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public static WebDriver driver;

    public static  WebDriver launchBrowser(String browserName) {
        try {
            if (browserName.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--incognito");
                DesiredCapabilities cas = new DesiredCapabilities();
                cas.setCapability(ChromeOptions.CAPABILITY, options);
                options.merge(cas);
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
                //driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                FirefoxOptions options = new FirefoxOptions();
                options.addArguments("---incognito");
                DesiredCapabilities cas = new DesiredCapabilities();
                cas.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
                options.merge(cas);
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(options);
//				driver = new FirefoxDriver();

            } else if (browserName.equalsIgnoreCase("ie")) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
            } else if (browserName.equalsIgnoreCase("edge")) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }

            driver.manage().window().maximize();
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

    public static void waitSendKeys(WebElement element, String value){

        try {
            WebDriverWait wait =new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(value);
        } catch (Exception e) {
            System.out.println(e);
        }

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
        WebDriverWait wait =new WebDriverWait(driver,20);
        WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
        try {
            if (enabled(until) && displayed(until)) {
                until.click();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void waitClear(WebElement element){

        try {
            WebDriverWait wait =new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.visibilityOf(element)).clear();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void quitBrowser() {
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

    public static  void closeBrowser() {
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

    public Alert switchToAlert() {
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

    public void sendKeys(String data) {
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

    public  static void selectOptionByText(WebElement element, String text) {
        WebDriverWait wait =new WebDriverWait(driver,20);
        WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
        try {
            Select s = new Select(until);
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

    public WebDriver.TargetLocator switchToTargetElement() {
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

    public void Click(WebElement e) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click()", e);
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

    public static void scrollUp(WebElement e) {
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
                    "C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\FD\\ExcelReader\\Happy_Flow_TD.xlsx");
            FileInputStream stream = new FileInputStream(excelLoc);
            XSSFWorkbook w = new XSSFWorkbook(stream);
            XSSFSheet s = w.getSheet(sheet);
            XSSFRow r = s.getRow(row);
            XSSFCell c = r.getCell(cell);
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
            File excelLoc = new File(
                    "C:\\Users\\s2605\\eclipse-workspace\\stfc-fd-automation\\FD\\ExcelReader\\Happy_Flow_TD.xlsx");
            FileInputStream stream = new FileInputStream(excelLoc);
            XSSFWorkbook w = new XSSFWorkbook(stream);
            XSSFSheet s = w.getSheet(sheet);
            XSSFRow r = s.getRow(row);
            XSSFCell c = r.createCell(cell);
            c.setCellValue(value);
            FileOutputStream outputstream = new FileOutputStream(excelLoc);
            w.write(outputstream);

        } catch (Exception e) {
            System.out.println(e.getMessage());
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

    public static  void emailSend() {
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

                new javax.mail.Authenticator(){

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
