package org.run;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.mail.Service;

import org.baseclass.BaseClass;
import org.excel.utils.excel_Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.xpaths.xpaths_fd;

public class Pre_Execution_Fd extends BaseClass {

	public static void sfl_website(String INDEX) throws Exception {

		loadUrl("https://sitsfl.stfc.in/");

		getPageUrl();

//		if (Page_URL.contains("https://sitsfl.stfc.in/")) {
//
//			System.out.println(Page_URL + "user sucessfully landed");
//
//		} else {
//
//			System.out.println("user hit the  wrong domain");
//		}

		Thread.sleep(10000);
		Actions actions = new Actions(driver);
		WebElement deposits = xpaths_fd.getInstance().getDeposits();
		actions.moveToElement(deposits).perform();
		Thread.sleep(1000);
		btnClick(xpaths_fd.getInstance().getFixedDeposits());

	}

	public static void fd_landing(String mobile, String pincode, String otp_code) throws Exception {

		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement deposits = xpaths_fd.getInstance().getDeposits();
		actions.moveToElement(deposits).perform();
		Thread.sleep(1000);
		btnClick(xpaths_fd.getInstance().getFixedDeposits());

		sendKeys(xpaths_fd.getInstance().getMobileNum(), mobile);
		sendKeys(xpaths_fd.getInstance().getPincode(), pincode);

		Thread.sleep(2000);
		btnClick(xpaths_fd.getInstance().getInvestNow());

		Thread.sleep(2000);
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='input_field']"));
		for (int j = 0; j < findElements.size(); ++j) {

			WebElement checkbox = findElements.get(j).findElement(By.xpath("./input"));

			sendKeys(checkbox, otp_code);
		}
		btnClick(xpaths_fd.getInstance().getOtpVerifyBtn());

	
}
	public static void scheme_selection() throws Exception {

		scrollDown(xpaths_fd.getInstance().getInvestmentAmount());
		Thread.sleep(3000);
		btnClick(xpaths_fd.getInstance().getSeniorCitizenYes());
		Thread.sleep(3000);
		btnClick(xpaths_fd.getInstance().getWomendepositorYes());
		Thread.sleep(2000);
		btnClick(xpaths_fd.getInstance().getApplyInvestNowBtn());

	}

	public static void panscreen(String pan,  String year, String month,String email) throws Exception {

		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getPanNumber(), pan);
		Thread.sleep(3000);

		Select title = new Select(xpaths_fd.getInstance().getTitle());
		title.selectByVisibleText("Minor.");

//		btnClick(xpaths_fd.getInstance().getTitle());
//		Thread.sleep(2000);
//		btnClick(xpaths_fd.getInstance().getMr());
		
//		try {
//
//			Thread.sleep(3000);
//
//			System.out.println(xpaths_fd.getInstance().getDOB().getText().length());
//
//			if (xpaths_fd.getInstance().getDOB().getText().length() == 0) {
//
//				btnClick(xpaths_fd.getInstance().getDOB());
//				Thread.sleep(3000);
//				btnClick(xpaths_fd.getInstance().getCalender_Eloboration());
//
//				// List<WebElement> elements =
//				// driver.findElements(By.xpath("//*[@id=\"mat-datepicker-0\"]/div"));
//
//				Thread.sleep(2000);
//				WebElement ul = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div"));// xpath of ul
//				Thread.sleep(3000);
//				List<WebElement> allOptions = ul.findElements(By.tagName("div"));
//				for (WebElement selectLi : allOptions) {
//
//					String text = selectLi.getText();
//
//					if (text.equals(year)) {
//						selectLi.click();
//						break;
//					}
//
//				}
//
//				System.out.println("working");
//
//				List<WebElement> allOptions1 = ul.findElements(By.tagName("div"));
//				for (WebElement selectLi : allOptions1) {
//					System.out.println(selectLi.getText());
//
//					if (selectLi.getText().equals(month)) {
//						System.out.println(month);
//						System.out.println(selectLi.getText());
//						selectLi.click();
//						break;
//
//					}
//
//				}
//
//				List<WebElement> allOptions2 = ul.findElements(By.tagName("div"));
//				for (WebElement selectLi : allOptions2) {
//
//					if (selectLi.getText().equals(date)) {
//						selectLi.click();
//						break;
//
//					}
//
//				}
//
//			}
//
//		} catch (org.openqa.selenium.StaleElementReferenceException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		Thread.sleep(1000);
		btnClick(xpaths_fd.getInstance().getDOB());
		Thread.sleep(2000);
		Select year1 = new Select(xpaths_fd.getInstance().getYear());
		year1.selectByVisibleText(year);
		Thread.sleep(2000);
		Select month1 = new Select(xpaths_fd.getInstance().getMonth());
		month1.selectByVisibleText(month);
		Thread.sleep(2000);
		btnClick(xpaths_fd.getInstance().getDate());
		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getEmail(), email);
		Thread.sleep(2000);
		scrollDown(xpaths_fd.getInstance().getProceedPan());
		btnClick(xpaths_fd.getInstance().getProceedPan());

	}

	public static void Guardianpanscreen(String guardianpan, String Guardianemail) throws Exception {

		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getGuardianPan(), guardianpan);
		Thread.sleep(5000);
		Select title = new Select(xpaths_fd.getInstance().getGuardianTittle());
		title.selectByVisibleText("Mr.");

//		btnClick(xpaths_fd.getInstance().getTitle());
//		Thread.sleep(2000);
//		btnClick(xpaths_fd.getInstance().getMr());
		Thread.sleep(3000);
		btnClick(xpaths_fd.getInstance().getGaurdianDOB());
		Thread.sleep(3000);
		Select gaurdianyear = new Select(xpaths_fd.getInstance().getGuardianYear());
		gaurdianyear.selectByVisibleText("1996");
		Thread.sleep(3000);
		Select gaurdianmonth = new Select(xpaths_fd.getInstance().getGuardianMonth());
		gaurdianmonth.selectByVisibleText("Jul");
		Thread.sleep(3000);
		btnClick(xpaths_fd.getInstance().getGuardianDate());
		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getGuardianEmail(), Guardianemail);
		Thread.sleep(3000);
		scrollDown(xpaths_fd.getInstance().getGuardianproceed());
		btnClick(xpaths_fd.getInstance().getGuardianproceed());

	}

	public static void depositsummaryscreen() throws Exception {

	
		Thread.sleep(3000);
		WebElement tCbox = xpaths_fd.getInstance().getTCbox();
		scrollDown(tCbox);
		Thread.sleep(3000);
		doubleClick(tCbox);
		Thread.sleep(3000);
		btnClick(xpaths_fd.getInstance().getGotITbutton());
		Thread.sleep(3000);
		btnClick(xpaths_fd.getInstance().getPaynow());

		Thread.sleep(10000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"bdy\"]/div/iframe")));
		
		Thread.sleep(3000);
		
		sendKeys(xpaths_fd.getInstance().getRazorPayPhNo(), "8801439125");
		
		Thread.sleep(3000);
		
		btnClick(xpaths_fd.getInstance().getRazorProceed());

		driver.findElement(
				By.xpath("//*[@id=\"form-common\"]/div[1]/div/div/div/div/div/button[1]/div/div[1]/div[1]/div"))
				.click();
		

		Thread.sleep(3000);
		
		btnClick(xpaths_fd.getInstance().getChooseBank());

		Thread.sleep(3000);

		scrollDown(xpaths_fd.getInstance().getMakePayment());

		btnClick(xpaths_fd.getInstance().getMakePayment());

		Thread.sleep(3000);

		btnClick(xpaths_fd.getInstance().getSuccess_btn());

		Thread.sleep(10000);

		driver.switchTo().defaultContent();

		System.out.println("switched to parent frame");

		Thread.sleep(3000);

		btnClick(xpaths_fd.getInstance().getRatingsProceed());

	}

	public static void GuardianckycManualscreen(String GuardianDocumentNo, String Guardianfrontimg,
			String GuardianBackimg) throws Exception {

		Thread.sleep(6000);
		Select GDocType = new Select(xpaths_fd.getInstance().getGuardianDoctype());
		GDocType.selectByVisibleText("Aadhaar ID");
//		btnClick(xpaths_fd.getInstance().getGuardianDoctype());
//		Thread.sleep(3000);
//		btnClick(xpaths_fd.getInstance().getAdhaarDoc());
		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getGuardianDocNo(), GuardianDocumentNo);
		Thread.sleep(5000);
//		btnClick(xpaths_fd.getInstance());
		btnClick(xpaths_fd.getInstance().getGuardianoutclick());
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//input[@class='primary-btn-green uploadfileimg uploadcamerdiv'])[2]"))
				.sendKeys(Guardianfrontimg);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='primary-btn-green uploadfileimg uploadcamerdiv'])[3]"))
				.sendKeys(GuardianBackimg);
		Thread.sleep(5000);
//		driver.navigate().refresh();
//		System.out.println(xpaths_fd.getInstance().getGuardianCKYCContinue());
		scrollDown(xpaths_fd.getInstance().getGuardianCKYCContinue());
		btnClick(xpaths_fd.getInstance().getGuardianCKYCContinue());
	}

	public static void GuardianpersonalDetailsScren(String Gaurdianphoto, String Guardianaddress1,
			String Guardianaddress2, String GuardianPincode) throws Exception {

		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='file-btn'])[1]")).sendKeys(Gaurdianphoto);
		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getGuardianAddress1(), Guardianaddress1);
		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getGuardianAddress2(), Guardianaddress2);
		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getGuardianpincode(), GuardianPincode);
		Thread.sleep(3000);
		btnClick(xpaths_fd.getInstance().getGuardianPersonalProceed());

	}

	public static void ckycManualscreen(String DocumentNo, String frontimg, String backimg) throws Exception {

		Thread.sleep(3000);
		Select DocType = new Select(xpaths_fd.getInstance().getDocumenttype());
		DocType.selectByVisibleText("Aadhaar ID");
//		btnClick(xpaths_fd.getInstance().getDocumenttype());
//		Thread.sleep(3000);
//		btnClick(xpaths_fd.getInstance().getAdhaarDoc());
		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getDocNo(), DocumentNo);
		Thread.sleep(5000);
		btnClick(xpaths_fd.getInstance().getOutclick());
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//input[@class='primary-btn-green uploadfileimg newUpload uploadcamerdiv'])[1]"))
				.sendKeys(frontimg);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@class='primary-btn-green uploadfileimg newUpload uploadcamerdiv'])[2]"))
				.sendKeys(backimg);
		Thread.sleep(5000);
		driver.navigate().refresh();
//		System.out.println(xpaths_fd.getInstance().getCkyccontinuebutton());
		scrollDown(xpaths_fd.getInstance().getCkyccontinuebutton());
		btnClick(xpaths_fd.getInstance().getCkyccontinuebutton());
	}

	public static void personalDetailsScren(String investorphoto, String address1, String address2) throws Exception {

		Thread.sleep(5000);
		driver.findElement(By.id("investor_photo")).sendKeys(investorphoto);
		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getAddress1(), address1);
		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getAddress2(), address2);
		Thread.sleep(3000);
		btnClick(xpaths_fd.getInstance().getProceedpersonal());

	}

	public static void bankDetailsScreen(String accNo, String confirmacc, String ifscode, String accountType,
			String accName, String cheque) throws Exception {

		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getAccountNo(), accNo);
		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getConfirmaccNo(), confirmacc);
		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getIfsccode(), ifscode);
		Thread.sleep(5000);
		Select acctype = new Select(xpaths_fd.getInstance().getAccType());
		acctype.selectByVisibleText(accountType);
		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getAccHolderName(), accName);
		Thread.sleep(5000);
		driver.findElement(By.id("ocrChkUpload")).sendKeys(cheque);
		Thread.sleep(5000);
		btnClick(xpaths_fd.getInstance().getProceedBank());
	}

	public static void additionalDetailsScreen(String OccupationType, String maritalstatus, String fathername)
			throws Exception {

		Thread.sleep(3000);
		Select occupation = new Select(xpaths_fd.getInstance().getOccupation());
		occupation.selectByVisibleText(OccupationType);
		Thread.sleep(3000);
		Select marital = new Select(xpaths_fd.getInstance().getMaritalstatus());
		marital.selectByVisibleText(maritalstatus);
		Thread.sleep(3000);
		sendKeys(xpaths_fd.getInstance().getFatherName(), fathername);
		Thread.sleep(3000);
		btnClick(xpaths_fd.getInstance().getFinalsubmit());

	}

}
