package Runclass;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Baseclass.LibGlobal;
import ExcelClass.ExcelUtil;
import Excelclass.ExcelUtiles;

public class Execution extends LibGlobal {

	@BeforeSuite
	public void startTest() {
		launchBrowser("chrome");
		loadUrl("https://uat.shriramcity.in/two-wheeler-loan");
		System.out.println("Application is ready to run");
	}

	@DataProvider
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testdata = ExcelUtiles.getDataFromexcel();
		return testdata.iterator();
	}

	@Test(dataProvider = "getTestData")
	public void testcase(String mobNo, String otp1, String otp2, String otp3, String otp4, String otp5, String otp6,
			String pincode, String panNo, String Username, String Years, String Months, String Gender,
			String TWFatherName, String TWEmailId, String residentType, String duration, String employmentType,
			String monthSalary, String VehicalMaf, String VehicalMod) throws Exception {

		System.out.println(Username);

		// Mobile No Input Field
		driver.findElement(By.xpath("//label[@for='TWMobile']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("TWMobile")));
		driver.findElement(By.id("TWMobile")).click();
		driver.findElement(By.id("TWMobile")).sendKeys(mobNo);
		Thread.sleep(2000);

		// Get OTP Button
		driver.findElement(By.id("g-otp")).click();
		Thread.sleep(3000);

		// OTP Input Fields
		driver.findElement(By.id("codeBox1")).sendKeys(otp1);
		driver.findElement(By.id("codeBox2")).sendKeys(otp2);
		driver.findElement(By.id("codeBox3")).sendKeys(otp3);
		driver.findElement(By.id("codeBox4")).sendKeys(otp4);
		driver.findElement(By.id("codeBox5")).sendKeys(otp5);
		driver.findElement(By.id("codeBox6")).sendKeys(otp6);
		Thread.sleep(3000);

		// OTP Verify Button
		driver.findElement(By.className("btnTwOtpVerify")).click();
		Thread.sleep(2000);

		// Pincode Input Field
		driver.findElement(By.id("TWPincode")).sendKeys(pincode);
		Thread.sleep(2000);
//			WebElement pincode = driver.findElement(By.xpath("//*[@id=\"pcode\"]"));
//			List<WebElement> areapincode = pincode.findElements(By.tagName("li"));
//			for (WebElement li : areapincode) {
//				if (li.getText().equals("600001, GOVT STANLEY HOSPITAL S.O, CHENNAI")) {
//					li.click();
//				}
//			}

		// PAN
		driver.findElement(By.name("pan_number")).sendKeys(panNo);
		Thread.sleep(2000);

		// Name
		driver.findElement(By.xpath("//label[@for='Name']")).click();
//		WebDriverWait wait2 = new WebDriverWait(driver, 30);
//		wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='form-group form-group-material two-wheel-form'])[1]")));
	//	driver.findElement(By.xpath("(//div[@class='form-group form-group-material two-wheel-form'])[1]")).click();
		driver.findElement(By.id("TWCustomerName")).sendKeys(Username);
		Thread.sleep(2000);
 
//		     Date of Birth
		driver.findElement(By.id("datepicker")).click();
		WebElement Year = driver.findElement(By.xpath("(//select[@class='ui-datepicker-year'])"));
		Year.click();
		selectOptionByText(Year, Years);
		WebElement Month = driver.findElement(By.xpath("(//select[@class='ui-datepicker-month'])"));
		Month.click();
		selectOptionByText(Month, Months);
		WebElement Date = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[20]"));
		Date.click();

//			driver.findElement(By.id("datepicker")).click();
//			Select month = new Select(driver.findElement(By.className("ui-datepicker-month")));
//			month.selectByVisibleText("Aug");
//			Thread.sleep(5000);
//			Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
//			year.selectByValue("1980");
//			Thread.sleep(5000);
//			driver.findElement(By.xpath("/html/body/div[14]/table/tbody/tr[3]/td[6]/a")).click();

		Thread.sleep(2000);
		WebElement tWGdr = driver.findElement(By.id("TWGdr"));
		// tWGdr.click();
		selectOptionByText(tWGdr, Gender);

//			Father Name
//			driver.findElement(By.id("TWFatherName")).clear();
		driver.findElement(By.id("TWFatherName")).sendKeys(TWFatherName);
		Thread.sleep(2000);

//			Email Id
//			driver.findElement(By.id("TWEmailId")).clear();
		driver.findElement(By.id("TWEmailId")).sendKeys(TWEmailId);
		Thread.sleep(2000);

//			Residential Information 
//			Residence Type
//			driver.findElement(By.id("TWRestType")).clear();
		Select s4 = new Select(driver.findElement(By.id("TWRestType")));
		s4.selectByVisibleText(residentType);
		Thread.sleep(2000);

//			Age of the Current Stay
//			driver.findElement(By.id("TWDurMonth")).clear();
		Select s5 = new Select(driver.findElement(By.id("TWDurMonth")));
		s5.selectByVisibleText(duration);
		Thread.sleep(2000);

//			 		  Work Information
//			 		  driver.findElement(By.id("TWEmpType")).clear();
		Select s6 = new Select(driver.findElement(By.id("TWEmpType")));
		s6.selectByVisibleText(employmentType);
		Thread.sleep(2000);

		// Annual Turnover
		driver.findElement(By.id("TWMonthSalary")).clear();
		driver.findElement(By.id("TWMonthSalary")).sendKeys(monthSalary);
		Thread.sleep(2000);

// Vehicle Type not available
//			Select s66 = new Select(driver.findElement(By.id("TWManFac")));
//			s66.selectByVisibleText("HERO MOTOR CORP");
//			Thread.sleep(2000);

//			Select s8 = new Select(driver.findElement(By.id("TWModeL")));
//			s8.selectByVisibleText("X PULSE 200 / 4V BS6");
//			Thread.sleep(2000);
//			driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-covered btn-info']")).click();

//	      Vehicle Type
//			driver.findElement(By.id("TWManFac")).clear();
		Select s7 = new Select(driver.findElement(By.id("TWManFac")));
		s7.selectByVisibleText(VehicalMaf);
		Thread.sleep(2000);

//			Vehicle Model
//			driver.findElement(By.id("TWModeL")).clear();
		Select s8 = new Select(driver.findElement(By.id("TWModeL")));
		driver.findElement(By.id("TWModeL")).click();
		s8.selectByVisibleText(VehicalMod);
		Thread.sleep(2000);

		// Submit Button
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='tw-form-sub']")).click();

		// Smile
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='smile-buton active']")).click();

		// Feedback-Box
		Thread.sleep(3000);
		WebElement findElement = driver.findElement(By.id("exampleFormControlTextarea1"));
		findElement.click();
		findElement.sendKeys("Good Service");

		// Final Submit-button
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='submit-button'])[3]")).click();
	}

	@AfterTest
	public void closeBrowser() {
		closeBrowser();
	}
}
