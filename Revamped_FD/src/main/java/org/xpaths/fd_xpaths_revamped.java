package org.xpaths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class fd_xpaths_revamped {

	private static fd_xpaths_revamped xpathsPageInstance;

	private fd_xpaths_revamped() {

	}

	public static fd_xpaths_revamped getInstance() {
		if (xpathsPageInstance == null) {
			xpathsPageInstance = new fd_xpaths_revamped();
		}
		return xpathsPageInstance;
	}

	@FindBy(id = "mobileNumber")
	private WebElement MobileNum;

	public WebElement getMobileNum() {
		return MobileNum;
	}

	@FindBy(id = "pinCode")
	private WebElement Pincode;

	public WebElement getPincode() {
		return Pincode;
	}

	@FindBy(xpath = "//button[@class='primary-btn w-100 pro-apply']")
	private WebElement InvestNow;

	public WebElement getInvestNow() {
		return InvestNow;
	}

	@FindBy(id = "otpVerifybtn")
	private WebElement OtpVerifyBtn;

	public WebElement getOtpVerifyBtn() {
		return OtpVerifyBtn;
	}

	@FindBy(xpath = "/html/body/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-fixed-deposit-online-apply/section/app-calculator/section/div[2]/div/div[1]/div/div[1]/div[1]/div/div[2]/input")
	private WebElement InvestAmt;

	public WebElement getInvestAmt() {
		return InvestAmt;
	}

	@FindBy(xpath = "/html/body/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-fixed-deposit-online-apply/section/app-calculator/section/div[2]/div/div[2]/form/div/div[1]/div/input	")
	private WebElement PAN;

	public WebElement getPAN() {
		return PAN;
	}

	@FindBy(xpath = "/html/body/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-fixed-deposit-online-apply/section/app-calculator/section/div[2]/div/div[1]/div/div[1]/div[2]/div[2]/div[4]/label")
	private WebElement chooseTenure;

	public WebElement getChooseTenure() {
		return chooseTenure;
	}

	@FindBy(xpath = "/html/body/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-fixed-deposit-online-apply/section/app-calculator/section/div[2]/div/div[1]/div/div[1]/div[3]/div/div[2]/select\r\n"
			+ "")
	private WebElement selectPayout;

	public WebElement getSelectPayout() {
		return selectPayout;
	}

	@FindBy(xpath = "/html/body/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-fixed-deposit-online-apply/section/app-calculator/section/div[2]/div/div[2]/form/div/div[2]/div/div[1]/div/h5/button/i\r\n"
			+ "")
	private WebElement nameEditClick;

	public WebElement getNameEditClick() {
		return nameEditClick;
	}

	@FindBy(xpath = "/html/body/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-fixed-deposit-online-apply/section/app-calculator/section/div[2]/div/div[2]/form/div/div[2]/div/div[2]/div/input\r\n"
			+ "")
	private WebElement FName;

	public WebElement getFName() {
		return FName;
	}

	@FindBy(xpath = "/html/body/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-fixed-deposit-online-apply/section/app-calculator/section/div[2]/div/div[2]/form/div/div[2]/div/div[4]/div/input\r\n"
			+ "")
	private WebElement LName;

	public WebElement getLName() {
		return LName;
	}

	@FindBy(xpath = "/html/body/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-fixed-deposit-online-apply/section/app-calculator/section/div[2]/div/div[2]/form/div/div[2]/div/div[5]/div/h5/button/i\r\n"
			+ "")
	private WebElement editEmail;

	public WebElement getEditEmail() {
		return editEmail;
	}

	@FindBy(xpath = "/html/body/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-fixed-deposit-online-apply/section/app-calculator/section/div[2]/div/div[2]/form/div/div[2]/div/div[5]/div/input\r\n"
			+ "")
	private WebElement Email;

	public WebElement getEmail() {
		return Email;
	}

	@FindBy(xpath = "/html/body/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-fixed-deposit-online-apply/section/app-calculator/section/div[2]/div/div[2]/form/div/div[2]/div/div[6]/div/select\r\n"
			+ "")
	private WebElement SelectGender;

	public WebElement getSelectGender() {
		return SelectGender;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-fixed-deposit-online-apply/section/app-calculator/section/div[2]/div/div[2]/form/div/div[2]/div/div[7]/div/input")
	private WebElement DOB;

	public WebElement getDOB() {
		return DOB;
	}

	@FindBy(xpath = "//*[@id=\"mat-datepicker-0\"]/mat-calendar-header/div/div/button[1]")
	private WebElement calenderElobration;

	public WebElement getCalenderElobration() {
		return calenderElobration;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-fixed-deposit-online-apply/section/app-calculator/section/div[2]/div/div[2]/form/div/ul/li/label")
	private WebElement termsandconditions;

	public WebElement getTermsandconditions() {
		return termsandconditions;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-fixed-deposit-online-apply/section/app-calculator/section/div[2]/div/div[2]/form/div/div[6]/button")
	private WebElement paySecurelyButton;

	public WebElement getPaySecurelyButton() {
		return paySecurelyButton;
	}

	@FindBy(xpath = "//*[@id=\"payment_agree_refund\"]/div/div/div[2]/div/button")
	private WebElement TcDoneButton;

	public WebElement getTcDoneButton() {
		return TcDoneButton;
	}

//	Payment screen

	@FindBy(xpath = "//a[@data-tab-id='net-banking']")
	private WebElement NetBanking;

	public WebElement getNetBanking() {
		return NetBanking;
	}

	@FindBy(xpath = "//*[@id=\"bank-item-HDFC\"]/label")
	private WebElement chooseBank;

	public WebElement getChooseBank() {
		return chooseBank;
	}

	@FindBy(xpath = "//*[@id=\"redesign-v15-cta\"]")
	private WebElement ClickPaynowButton;

	public WebElement getClickPaynowButton() {
		return ClickPaynowButton;
	}

	@FindBy(xpath = "/html/body/form/button[1]")
	private WebElement PaymentsuccessButton;

	public WebElement getPaymentsuccessButton() {
		return PaymentsuccessButton;
	}

	@FindBy(xpath = "//*[@id=\"star4\"]/div")
	private WebElement Ratings;

	public WebElement getRatings() {
		return Ratings;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-payment-confirmation/section/div/div/div[3]/button")
	private WebElement congratulationsProceedbutton;

	public WebElement getCongratulationsProceedbutton() {
		return congratulationsProceedbutton;
	}
	
	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-upload-ckyc/section/form/div[1]/div/div[1]/div/label")
	private WebElement Documenttype;
	
	public WebElement getDocumenttype() {
		return Documenttype;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-upload-ckyc/section/form/div[1]/div/div[1]/div/select/option[2]")
	private WebElement AdhaarDoc;

	public WebElement getAdhaarDoc() {
		return AdhaarDoc;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-upload-ckyc/section/form/div[1]/div/div[2]/div/input")
	private WebElement DocNo;

	public WebElement getDocNo() {
		return DocNo;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-upload-ckyc/section/form")
	private WebElement outclick;

	public WebElement getOutclick() {
		return outclick;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-upload-ckyc/section/form/div[2]/div/div[1]/div/div[1]/div/div[2]/label")
	private WebElement uploadfrontimg;

	public WebElement getUploadfrontimg() {
		return uploadfrontimg;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-upload-ckyc/section/form/div[2]/div/div[2]/div/div[1]/div/div[2]/label")
	private WebElement uploadbackimg;

	public WebElement getUploadbackimg() {
		return uploadbackimg;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-upload-ckyc/section/form/div[3]/button")
	private WebElement ckyccontinuebutton;

	public WebElement getCkyccontinuebutton() {
		return ckyccontinuebutton;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-personal-details/section/form/div[1]/div/div/div[2]/div/div[2]/div[2]/div[1]/label")
	private WebElement profilePicture;

	public WebElement getProfilePicture() {
		return profilePicture;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-personal-details/section/form/div[3]/div/div[1]/div/input")
	private WebElement address1;

	public WebElement getAddress1() {
		return address1;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-personal-details/section/form/div[3]/div/div[2]/div/input")
	private WebElement address2;

	public WebElement getAddress2() {
		return address2;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-personal-details/section/form/div[3]/div/div[3]/div/input")
	private WebElement personalPincode;

	public WebElement getPersonalPincode() {
		return personalPincode;
	}

	@FindBy(id = "mat-option-0")
	private WebElement ChoosePinList;

	public WebElement getChoosePinList() {
		return ChoosePinList;
	}

	@FindBy(xpath = "(//button[@class='button button--yellow button--small'])[2]")
	private WebElement proceedpersonal;

	public WebElement getProceedpersonal() {
		return proceedpersonal;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-bank-details/section/form/div[1]/div[1]/div[1]/div/input")
	private WebElement accountNo;

	public WebElement getAccountNo() {
		return accountNo;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-bank-details/section/form/div[1]/div[1]/div[2]/div/input")
	private WebElement confirmaccNo;

	public WebElement getConfirmaccNo() {
		return confirmaccNo;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-bank-details/section/form/div[1]/div[1]/div[3]/div/input")
	private WebElement ifsccode;

	public WebElement getIfsccode() {
		return ifsccode;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-bank-details/section/form/div[1]/div[2]/div[3]/div/select")
	private WebElement accType;

	public WebElement getAccType() {
		return accType;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-bank-details/section/form/div[1]/div[2]/div[4]/div/input")
	private WebElement accHolderName;

	public WebElement getAccHolderName() {
		return accHolderName;
	}

	@FindBy(xpath = "//*[@id=\"body\"]/app-root/section/div/div/div/app-fixed-deposit-cutomer-main/app-bank-details/section/form/div[1]/div[2]/div[5]/div/div/div[1]/div/div/label")
	private WebElement ChequeOCR;

	public WebElement getChequeOCR() {
		return ChequeOCR;
	}

	@FindBy(xpath = "(//button[@class='button button--yellow button--small'])[2]")
	private WebElement ProceedBank;

	public WebElement getProceedBank() {
		return ProceedBank;
	}

	@FindBy(xpath = "(//select[@class='form__control ng-untouched ng-pristine ng-invalid'])[1]")
	private WebElement occupation;

	public WebElement getOccupation() {
		return occupation;
	}

	@FindBy(xpath = "(//select[@class='form__control ng-dirty ng-valid ng-touched'])[2]")
	private WebElement maritalstatus;

	public WebElement getMaritalstatus() {
		return maritalstatus;
	}
	@FindBy(xpath = "//select[@class='form__control ng-untouched ng-pristine ng-invalid']")
	private WebElement maturityinstructions;

	
	public WebElement getMaturityinstructions() {
		return maturityinstructions;
	}

	@FindBy(xpath = "//input[@class='form__control ng-untouched ng-pristine ng-invalid']")
	private WebElement fatherName;

	public WebElement getFatherName() {
		return fatherName;
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement TaxDeductNo;

	public WebElement getTaxDeductNo() {
		return TaxDeductNo;
	}

	@FindBy(xpath = "(//button[@class='button button--yellow button--small'])[2]")
	private WebElement finalsubmit;

	public WebElement getFinalsubmit() {
		return finalsubmit;
	}

}
