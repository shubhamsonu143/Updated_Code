package fd_runner_package;

import java.time.Duration;
import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xpaths.fd_xpaths_revamped;

public class fd_pre_executions extends BaseClass {

	public static void sfl_website(String INDEX) throws Exception {

		loadUrl("https://sitsfl.stfc.in/revamp-fixed-deposit");

		getPageUrl();
	}

	public static void fd_landing(String mobile, String pincode, String otp_code) throws Exception {

		sendKeys(fd_xpaths_revamped.getInstance().getMobileNum(), mobile);
		sendKeys(fd_xpaths_revamped.getInstance().getPincode(), pincode);

		Thread.sleep(2000);
		btnClick(fd_xpaths_revamped.getInstance().getInvestNow());
		Thread.sleep(2000);
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='input_field']"));
		for (int j = 0; j < findElements.size(); ++j) {

			WebElement checkbox = findElements.get(j).findElement(By.xpath("./input"));

			sendKeys(checkbox, otp_code);
		}

		btnClick(fd_xpaths_revamped.getInstance().getOtpVerifyBtn());

		Thread.sleep(5000);
	}

	public static void Scheme_selectionscreen(String investAmount, String choosepayout, String PAN_No, String FName,
			String LName, String Email) throws Exception {

		Thread.sleep(1000);

		System.out.println(fd_xpaths_revamped.getInstance().getPAN());

		btnClick(fd_xpaths_revamped.getInstance().getInvestAmt());
		clear(fd_xpaths_revamped.getInstance().getInvestAmt());
		sendKeys(fd_xpaths_revamped.getInstance().getInvestAmt(), investAmount);
		btnClick(fd_xpaths_revamped.getInstance().getChooseTenure());
		Select payout = new Select(fd_xpaths_revamped.getInstance().getSelectPayout());
		payout.selectByVisibleText(choosepayout);
		Thread.sleep(1000);
		btnClick(fd_xpaths_revamped.getInstance().getPAN());
		sendKeys(fd_xpaths_revamped.getInstance().getPAN(), PAN_No);
		Thread.sleep(1000);
		btnClick(fd_xpaths_revamped.getInstance().getNameEditClick());
		Thread.sleep(2000);
		btnClick(fd_xpaths_revamped.getInstance().getFName());
		Thread.sleep(2000);
		clear(fd_xpaths_revamped.getInstance().getFName());
		Thread.sleep(2000);
		sendKeys(fd_xpaths_revamped.getInstance().getFName(), FName);
		Thread.sleep(1000);
		clear(fd_xpaths_revamped.getInstance().getLName());
		Thread.sleep(2000);
		sendKeys(fd_xpaths_revamped.getInstance().getLName(), LName);
		Thread.sleep(1000);
		btnClick(fd_xpaths_revamped.getInstance().getEditEmail());
		Thread.sleep(1000);
		sendKeys(fd_xpaths_revamped.getInstance().getEmail(), Email);

		Thread.sleep(1000);
		btnClick(fd_xpaths_revamped.getInstance().getDOB());
		Thread.sleep(1000);
		btnClick(fd_xpaths_revamped.getInstance().getCalenderElobration());
		Thread.sleep(1000);
		btnClick(driver.findElement((By.xpath("//*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[2]"))));
		Thread.sleep(1000);
		WebElement ul = driver.findElement(By.xpath("//*[@id='mat-datepicker-0']/div"));// xpath of ul
		Thread.sleep(1000);
		List<WebElement> allOptions = ul.findElements(By.tagName("div"));
		for (WebElement selectLi : allOptions) {

			String text = selectLi.getText();

			if (text.equals("1996")) {
				btnClick(selectLi);
				break;
			}

		}

		System.out.println("working");

		List<WebElement> allOptions1 = ul.findElements(By.tagName("div"));
		for (WebElement selectLi : allOptions1) {
			System.out.println(selectLi.getText());

			if (selectLi.getText().equals("MAR")) {
				System.out.println("MAR");
				System.out.println(selectLi.getText());
				btnClick(selectLi);
				break;

			}

		}

		List<WebElement> allOptions2 = ul.findElements(By.tagName("div"));
		for (WebElement selectLi : allOptions2) {

			if (selectLi.getText().equals("5")) {
				btnClick(selectLi);
				break;

			}

		}
		Thread.sleep(2000);
		btnClick(fd_xpaths_revamped.getInstance().getTermsandconditions());
		Thread.sleep(2000);
//		btnClick(fd_xpaths_revamped.getInstance().getTcDoneButton());
		Thread.sleep(2000);
		scrollDown(fd_xpaths_revamped.getInstance().getPaySecurelyButton());
		Thread.sleep(2000);
		btnClick(fd_xpaths_revamped.getInstance().getPaySecurelyButton());

	}

	public static void Paymentscreen() throws Exception {

		Thread.sleep(10000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"bdy\"]/div/iframe")));

		Thread.sleep(5000);

		driver.findElement(By.xpath("(//button[@class='instrument slotted-option svelte-sps7l1'])[1]")).click();
		Thread.sleep(2000);
		btnClick(fd_xpaths_revamped.getInstance().getChooseBank());
		Thread.sleep(2000);
		btnClick(fd_xpaths_revamped.getInstance().getClickPaynowButton());
		btnClick(fd_xpaths_revamped.getInstance().getPaymentsuccessButton());
		driver.switchTo().defaultContent();
		System.out.println("switched to parent frame");
		Thread.sleep(2000);
		btnClick(fd_xpaths_revamped.getInstance().getRatings());
		Thread.sleep(2000);
		btnClick(fd_xpaths_revamped.getInstance().getCongratulationsProceedbutton());
	}

	public static void ckycManualscreen(String DocumentNo, String frontimg, String backimg) throws Exception {

		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOfAllElements(fd_xpaths_revamped.getInstance().getDocumenttype()));
//		wait.until(ExpectedConditions.visibilityOfAllElementLocatedBy(fd_xpaths_revamped.getInstance().getDocumenttype())));
//		btnClick(fd_xpaths_revamped.getInstance().getDocumenttype());
		Thread.sleep(3000);
		btnClick(fd_xpaths_revamped.getInstance().getAdhaarDoc());
		Thread.sleep(3000);
		sendKeys(fd_xpaths_revamped.getInstance().getDocNo(), DocumentNo);
		Thread.sleep(4000);
		btnClick(fd_xpaths_revamped.getInstance().getOutclick());
		Thread.sleep(8000);
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//				"/html/body/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-upload-ckyc/section/form/div[2]/div/div[1]/div/div[1]/div/div[2]/label\r\n"
//						+ "")))
//				.sendKeys("C:\\Users\\m1077\\Desktop\\4.JPG");
//		System.out.println(wait1 + "Clicked image1");
//		Thread.sleep(6000);
//		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(50));
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
//				"/html/body/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-upload-ckyc/section/form/div[2]/div/div[2]/div/div[1]/div/div[2]/label\r\n"
//						+ "")))
//				.sendKeys("C:\\Users\\m1077\\Desktop\\Adhaar Link.JPG");
//		System.out.println(wait2 + "Clicked image2");
		driver.findElement(By.id("uploadFrontImg")).sendKeys(frontimg);
		Thread.sleep(5000);
		driver.findElement(By.id("uploadBackImg")).sendKeys(backimg);
		Thread.sleep(5000);
//		driver.navigate().refresh();
		System.out.println(fd_xpaths_revamped.getInstance().getCkyccontinuebutton());
		scrollDown(fd_xpaths_revamped.getInstance().getCkyccontinuebutton());
		btnClick(fd_xpaths_revamped.getInstance().getCkyccontinuebutton());
	}

	public static void personalDetailsScren(String investorphoto, String address1, String address2) throws Exception {

		Thread.sleep(5000);
//		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
//		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath(
//				"//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-personal-details/section/form/div[1]/div/div/div[2]/div/div[2]/div[2]/div/label")));
		driver.findElement(By.id("depositor_profile")).sendKeys(investorphoto);
		Thread.sleep(3000);
		sendKeys(fd_xpaths_revamped.getInstance().getAddress1(), address1);
		Thread.sleep(3000);
		sendKeys(fd_xpaths_revamped.getInstance().getAddress2(), address2);
		Thread.sleep(3000);
		sendKeys(fd_xpaths_revamped.getInstance().getPersonalPincode(), "603211");
		Thread.sleep(3000);
		btnClick(fd_xpaths_revamped.getInstance().getChoosePinList());
		Thread.sleep(3000);
		btnClick(fd_xpaths_revamped.getInstance().getProceedpersonal());

	}

	public static void bankDetailsScreen(String accNo, String confirmacc, String ifscode, String accountType,
			String accName, String cheque) throws Exception {

		Thread.sleep(3000);
		sendKeys(fd_xpaths_revamped.getInstance().getAccountNo(), accNo);
		Thread.sleep(3000);
		sendKeys(fd_xpaths_revamped.getInstance().getConfirmaccNo(), confirmacc);
		Thread.sleep(3000);
		sendKeys(fd_xpaths_revamped.getInstance().getIfsccode(), ifscode);
		Thread.sleep(5000);
		Select acctype = new Select(fd_xpaths_revamped.getInstance().getAccType());
		acctype.selectByVisibleText(accountType);
		Thread.sleep(3000);
		sendKeys(fd_xpaths_revamped.getInstance().getAccHolderName(), accName);
		Thread.sleep(5000);
		driver.findElement(By.id("upload2")).sendKeys(cheque);
		Thread.sleep(5000);
		btnClick(fd_xpaths_revamped.getInstance().getProceedBank());
	}

	public static void additionalDetailsScreen(String OccupationType, String maritalstatus, String fathername)
			throws Exception {

		Thread.sleep(3000);
		Select occupation = new Select(fd_xpaths_revamped.getInstance().getOccupation());
		occupation.selectByVisibleText(OccupationType);
		Thread.sleep(3000);
		Select marital = new Select(fd_xpaths_revamped.getInstance().getMaritalstatus());
		marital.selectByVisibleText(maritalstatus);
		Select maturity = new Select(fd_xpaths_revamped.getInstance().getMaturityinstructions());
		maturity.selectByVisibleText(" Redeem on Maturity");
		Thread.sleep(3000);
		sendKeys(fd_xpaths_revamped.getInstance().getFatherName(), fathername);
		Thread.sleep(3000);
		btnClick(fd_xpaths_revamped.getInstance().getFinalsubmit());

	}

}
