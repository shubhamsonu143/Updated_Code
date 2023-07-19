package org.xpaths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class xpaths_fd {

	private static xpaths_fd xpathsPageInstance;

	private xpaths_fd() {

	}

	public static xpaths_fd getInstance() {
		if (xpathsPageInstance == null) {
			xpathsPageInstance = new xpaths_fd();
		}
		return xpathsPageInstance;
	}

	@FindBy(xpath = "(//div[@class='head-link'])[1]")
	private WebElement Deposits;

	public WebElement getDeposits() {
		return Deposits;
	}

	@FindBy(id = "main_nav_fd")
	private WebElement FixedDeposits;

	public WebElement getFixedDeposits() {
		return FixedDeposits;
	}

	@FindBy(id = "cus_mobile")
	private WebElement MobileNum;

	public WebElement getMobileNum() {
		return MobileNum;
	}

	@FindBy(id = "cus_pincode")
	private WebElement Pincode;

	public WebElement getPincode() {
		return Pincode;
	}

	@FindBy(xpath = "(//button[@class='primary-btn w-100 pro-apply'])[2]")
	private WebElement InvestNow;

	public WebElement getInvestNow() {
		return InvestNow;
	}

//	@FindBy(xpath = "otpCode1")
//	private WebElement EnterOTP;
//
//	public WebElement getEnterOTP() {
//		return EnterOTP;
//	}
	@FindBy(id = "otpVerifybtn")
	private WebElement OtpVerifyBtn;

	public WebElement getOtpVerifyBtn() {
		return OtpVerifyBtn;
	}

	@FindBy(id = "amount-input-fd")
	private WebElement InvestmentAmount;

	public WebElement getInvestmentAmount() {
		return InvestmentAmount;
	}

	@FindBy(id = "tenure-input-fd")
	private WebElement TenureMonth;

	public WebElement getTenureMonth() {
		return TenureMonth;
	}

	@FindBy(xpath = "(//div[@class='form-b p-relative select-c no-search addDeatails focused'])[1]")
	private WebElement InterestPayout;

	public WebElement getInterestPayout() {
		return InterestPayout;
	}

	@FindBy(xpath = "//div[@class='check-b p-relative d-flex align-item-center citizenyesCheckBox']")
	private WebElement SeniorCitizenYes;

	public WebElement getSeniorCitizenYes() {
		return SeniorCitizenYes;
	}

	@FindBy(xpath = "//div[@class='check-b p-relative d-flex align-item-center womenCheckBox']")
	private WebElement WomendepositorYes;

	public WebElement getWomendepositorYes() {
		return WomendepositorYes;
	}

	@FindBy(id = "apply_investbtn")
	private WebElement ApplyInvestNowBtn;

	public WebElement getApplyInvestNowBtn() {
		return ApplyInvestNowBtn;
	}

	@FindBy(id = "s1_depositorPAN")
	private WebElement PanNumber;

	public WebElement getPanNumber() {
		return PanNumber;
	}

	@FindBy(xpath = "(//select[@class='js-example-basic-single form-box select2-hidden-accessible'])[1]")
	private WebElement Title;

	public WebElement getTitle() {
		return Title;
	}

	@FindBy(xpath = "(//li[@class='select2-results__option select2-results__option--selectable'])[2]")
	private WebElement Mr;

	public WebElement getMr() {
		return Mr;
	}

	@FindBy(id = "s1_depositorDOB")
	private WebElement DOB;

	public WebElement getDOB() {
		return DOB;
	}

	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	private WebElement year;

	public WebElement getYear() {
		return year;
	}

	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
	private WebElement month;

	public WebElement getMonth() {
		return month;
	}

	@FindBy(xpath = "(//a[@class='ui-state-default'])[5]")
	private WebElement date;

	public WebElement getDate() {
		return date;
	}

	@FindBy(id = "s1_depositorEmail")
	private WebElement Email;

	public WebElement getEmail() {
		return Email;
	}

	@FindBy(xpath = "//*[@id=\"step1_personaldet_show\"]/button")
	private WebElement proceedPan;

	public WebElement getProceedPan() {
		return proceedPan;
	}

	@FindBy(id = "depositorTC")
	private WebElement TCbox;

	public WebElement getTCbox() {
		return TCbox;
	}

	@FindBy(xpath = "(//div[@class='overlay'])[2]")
	private WebElement overlay;

	public WebElement getOverlay() {
		return overlay;
	}

	@FindBy(xpath = "(//button[text()='Got It'])[9]")
	private WebElement GotITbutton;

	public WebElement getGotITbutton() {
		return GotITbutton;
	}

	@FindBy(xpath = "//button[@class='primary-btn m-0 form-btn-g dis-btn']")
	private WebElement paynow;

	public WebElement getPaynow() {
		return paynow;
	}

	@FindBy(xpath = "//*[@id=\"form-common\"]/div[1]/div/div/div/div/div/button[1]/div/div[1]/div[1]")
	private WebElement Netbanking;

	public WebElement getNetbanking() {
		return Netbanking;
	}

	@FindBy(id = "bank-item-HDFC")
	private WebElement ChooseBank;

	public WebElement getChooseBank() {
		return ChooseBank;
	}

	@FindBy(xpath = "//*[@id=\"redesign-v15-cta\"]")
	private WebElement MakePayment;

	public WebElement getMakePayment() {
		return MakePayment;
	}

	public WebElement getSuccess_btn() {
		return success_btn;
	}

	@FindBy(xpath = "/html/body/form/button[1]")
	private WebElement success_btn;

	@FindBy(xpath = "//*[@id=\"star10\"]")
	private WebElement ratings;

	public WebElement getRatings() {
		return ratings;
	}

	@FindBy(xpath = "//button[@class='success']")
	private WebElement PaymentProceed;

	public WebElement getPaymentProceed() {
		return PaymentProceed;
	}

	@FindBy(id = "paymentSuccess")
	private WebElement RatingsProceed;

	public WebElement getRatingsProceed() {
		return RatingsProceed;
	}

	@FindBy(xpath = "(//div[@class='form-b p-relative select-c no-search addDeatails focused'])[10]")
	private WebElement Documenttype;

	public WebElement getDocumenttype() {
		return Documenttype;
	}

	@FindBy(xpath = "(//li[text()='Aadhaar ID'])[1]")
	private WebElement AdhaarDoc;

	public WebElement getAdhaarDoc() {
		return AdhaarDoc;
	}

	@FindBy(id = "DocumentNo")
	private WebElement DocNo;

	public WebElement getDocNo() {
		return DocNo;
	}

	@FindBy(xpath = "(//div[@class='col-md-4 col-lg-3'])[54]")
	private WebElement outclick;

	public WebElement getOutclick() {
		return outclick;
	}

	@FindBy(xpath = "//div[@class='upload_newimgcls front_page_depositor']")
	private WebElement uploadfrontimg;

	public WebElement getUploadfrontimg() {
		return uploadfrontimg;
	}

	@FindBy(xpath = "//div[@class='upload_newimgcls back_page_depositor']")
	private WebElement uploadbackimg;

	public WebElement getUploadbackimg() {
		return uploadbackimg;
	}

	@FindBy(xpath = "(//button[text()='Continue'])[1]")
	private WebElement ckyccontinuebutton;

	public WebElement getCkyccontinuebutton() {
		return ckyccontinuebutton;
	}

	@FindBy(id = "s3_addrline1")
	private WebElement address1;

	public WebElement getAddress1() {
		return address1;
	}

	@FindBy(id = "s3_addrline2")
	private WebElement address2;

	public WebElement getAddress2() {
		return address2;
	}

	@FindBy(xpath = "//*[@id=\"step-btn-3\"]")
	private WebElement proceedpersonal;

	public WebElement getProceedpersonal() {
		return proceedpersonal;
	}

	@FindBy(id = "s4_accountno")
	private WebElement accountNo;

	public WebElement getAccountNo() {
		return accountNo;
	}

	@FindBy(id = "s4_confaccountno")
	private WebElement confirmaccNo;

	public WebElement getConfirmaccNo() {
		return confirmaccNo;
	}

	@FindBy(id = "s4_ifsc")
	private WebElement ifsccode;

	public WebElement getIfsccode() {
		return ifsccode;
	}

	@FindBy(id = "s4_acctype")
	private WebElement accType;

	public WebElement getAccType() {
		return accType;
	}

	@FindBy(id = "s4_accholdername")
	private WebElement accHolderName;

	public WebElement getAccHolderName() {
		return accHolderName;
	}

	@FindBy(id = "ocrChkUpload")
	private WebElement ChequeOCR;

	public WebElement getChequeOCR() {
		return ChequeOCR;
	}

	@FindBy(xpath = "(//button[text()='Proceed '])[1]")
	private WebElement ProceedBank;

	public WebElement getProceedBank() {
		return ProceedBank;
	}

	@FindBy(id = "s5_Occupation")
	private WebElement occupation;

	public WebElement getOccupation() {
		return occupation;
	}

	@FindBy(id = "s5_Marital")
	private WebElement maritalstatus;

	public WebElement getMaritalstatus() {
		return maritalstatus;
	}

	@FindBy(id = "s5_fatherName")
	private WebElement fatherName;

	public WebElement getFatherName() {
		return fatherName;
	}

	@FindBy(id = "step-btn-6")
	private WebElement finalsubmit;

	public WebElement getFinalsubmit() {
		return finalsubmit;
	}
}
