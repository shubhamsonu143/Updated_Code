package xpaths_Lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Package.BaseClass;

public class All_Xpaths extends BaseClass {

	public All_Xpaths() {

		PageFactory.initElements(driver, this);

	}

	// -----------------------/---------------HEADER-------------------/-----------------------------------

	@FindBy(xpath = "/html/body/app-root/app-header/header/section[2]/div/div/div[2]/p/span[1]")
	private WebElement headerLoan;

	public WebElement getHeaderLoan() {
		return headerLoan;
	}

	// -----------------------/-------------GOLDLOAN---------------------/-----------------------------------

	@FindBy(xpath = "/html/body/app-root/app-header/header/section[2]/div/div/div[2]/div/div/div[1]/ul/li[2]/a")
	public WebElement GoldLoan;

	@FindBy(xpath = "//*[@id=\"cus_name\"]")
	public WebElement GoldLoan_Name;

	@FindBy(xpath = "//*[@id=\"cus_mobile\"]")
	public WebElement GoldLaon_mobile;

	@FindBy(xpath = "//*[@id=\"cus_email\"]")
	public WebElement GoldLoan_email;

	@FindBy(xpath = "//*[@id=\"pf-apply-btn\"]")
	public WebElement GoldLoan_ApplyNow;

	@FindBy(xpath = "//*[@id=\"otpCode1\"]")
	public WebElement GoldLoan_OTP1;

	@FindBy(xpath = "//*[@id=\"otpCode2\"]")
	public WebElement GoldLoan_OTP2;

	@FindBy(xpath = "//*[@id=\"otpCode3\"]")
	public WebElement GoldLoan_OTP3;

	@FindBy(xpath = "//*[@id=\"otpCode4\"]")
	public WebElement GoldLoan_OTP4;

	@FindBy(xpath = "//*[@id=\"otpCode5\"]")
	public WebElement GoldLoan_OTP5;

	@FindBy(xpath = "//*[@id=\"otpCode6\"]")
	public WebElement GoldLoan_OTP6;

	@FindBy(xpath = "//*[@id=\"pf-otp-btn\"]")
	public WebElement GoldLoan_OTPResend;

	@FindBy(xpath = "//*[@id=\"changeMobNo\"]")
	public WebElement GoldLoan_ChangeMobileNumber;

	@FindBy(xpath = "//*[@id=\"otpVerifybtn\"]")
	public WebElement GoldLoan_OTPVerify;

	@FindBy(xpath = "/html/body/div[1]/div[1]")
	public WebElement GoldLoan_DOB;

	@FindBy(xpath = "//*[@id=\"cus_pan\"]")
	public WebElement GoldLoan_PAN;

	@FindBy(xpath = "//*[@id=\"cus_loanAmount\"]")
	public WebElement GoldLoan_LoanAmount;

	@FindBy(xpath = "//*[@id=\"cus_pincode2\"]")
	public WebElement GoldLoan_Pincode2;

	@FindBy(xpath = "//*[@id=\"pf-apply-btn1\"]")
	public WebElement GoldLoan_Submit;

	// -----------------------/---------------
	// -------------------/-----------------------------------
	public WebElement getGoldLoan() {
		return GoldLoan;
	}

	public WebElement getGoldLoan_Name() {
		return GoldLoan_Name;
	}

	public WebElement getGoldLaon_mobile() {
		return GoldLaon_mobile;
	}

	public WebElement getGoldLoan_email() {
		return GoldLoan_email;
	}

	public WebElement getGoldLoan_ApplyNow() {
		return GoldLoan_ApplyNow;
	}

	public WebElement getGoldLoan_OTP1() {
		return GoldLoan_OTP1;
	}

	public WebElement getGoldLoan_OTP2() {
		return GoldLoan_OTP2;
	}

	public WebElement getGoldLoan_OTP3() {
		return GoldLoan_OTP3;
	}

	public WebElement getGoldLoan_OTP4() {
		return GoldLoan_OTP4;
	}

	public WebElement getGoldLoan_OTP5() {
		return GoldLoan_OTP5;
	}

	public WebElement getGoldLoan_OTP6() {
		return GoldLoan_OTP6;
	}

	public WebElement getGoldLoan_OTPResend() {
		return GoldLoan_OTPResend;
	}

	public WebElement getGoldLoan_ChangeMobileNumber() {
		return GoldLoan_ChangeMobileNumber;
	}

	public WebElement getGoldLoan_OTPVerify() {
		return GoldLoan_OTPVerify;
	}

	public WebElement getGoldLoan_DOB() {
		return GoldLoan_DOB;
	}

	public WebElement getGoldLoan_PAN() {
		return GoldLoan_PAN;
	}

	public WebElement getGoldLoan_LoanAmount() {
		return GoldLoan_LoanAmount;
	}

	public WebElement getGoldLoan_Pincode2() {
		return GoldLoan_Pincode2;
	}

	public WebElement getGoldLoan_Submit() {
		return GoldLoan_Submit;
	}
//------------------------------------------tw---------------------------------

	@FindBy(xpath = "(//a[@title='Two-Wheeler Loan'])[1]")
	private WebElement tw_twoWheelerLoan;

	@FindBy(id = "cus_mobile")
	private WebElement tw_cus_mobile;

	@FindBy(id = "pf-apply-btn")
	private WebElement tw_pf_apply_btn;

	@FindBy(xpath = "//div[@class='input_field']")
	private WebElement tw_input_field;

	@FindBy(id = "otpVerifybtn")
	private WebElement tw_otpVerifybtn;

	@FindBy(xpath = "//input[@formcontrolname='residence_pincode']")
	private WebElement tw_residence_pincode;

	@FindBy(id = "pan_number")
	private WebElement tw_pan_number;

	@FindBy(id = "father_name")
	private WebElement tw_father_name;

	@FindBy(id = "cust_email")
	private WebElement tw_cust_email;

	@FindBy(id = "stepbtn-1")
	private WebElement tw_stepbtn_1;

	@FindBy(id = "residence_type")
	private WebElement tw_residence_type;

	@FindBy(id = "current_residence_age")
	private WebElement tw_current_residence_age;

	@FindBy(id = "employment_type")
	private WebElement tw_employment_type;

	@FindBy(id = "net_month_salary")
	private WebElement tw_net_month_salary;

	@FindBy(id = "manufacturer_name")
	private WebElement tw_manufacturer_name;

	@FindBy(id = "model_name")
	private WebElement tw_model_name;

	@FindBy(id = "stepbtn-2")
	private WebElement tw_stepbtn_2;

	@FindBy(id = "docs-btn")
	private WebElement tw_docs_btn;

	@FindBy(id = "download-btn")
	private WebElement tw_download_btn;

	public WebElement getTw_twoWheelerLoan() {
		return tw_twoWheelerLoan;
	}

	public WebElement getTw_cus_mobile() {
		return tw_cus_mobile;
	}

	public WebElement getTw_pf_apply_btn() {
		return tw_pf_apply_btn;
	}

	public WebElement getTw_input_field() {
		return tw_input_field;
	}

	public WebElement getTw_otpVerifybtn() {
		return tw_otpVerifybtn;
	}

	public WebElement getTw_residence_pincode() {
		return tw_residence_pincode;
	}

	public WebElement getTw_pan_number() {
		return tw_pan_number;
	}

	public WebElement getTw_father_name() {
		return tw_father_name;
	}

	public WebElement getTw_cust_email() {
		return tw_cust_email;
	}

	public WebElement getTw_stepbtn_1() {
		return tw_stepbtn_1;
	}

	public WebElement getTw_residence_type() {
		return tw_residence_type;
	}

	public WebElement getTw_current_residence_age() {
		return tw_current_residence_age;
	}

	public WebElement getTw_employment_type() {
		return tw_employment_type;
	}

	public WebElement getTw_net_month_salary() {
		return tw_net_month_salary;
	}

	public WebElement getTw_manufacturer_name() {
		return tw_manufacturer_name;
	}

	public WebElement getTw_model_name() {
		return tw_model_name;
	}

	public WebElement getTw_stepbtn_2() {
		return tw_stepbtn_2;
	}

	public WebElement getTw_docs_btn() {
		return tw_docs_btn;
	}

	public WebElement getTw_download_btn() {
		return tw_download_btn;
	}
//====================================================

	@FindBy(xpath = "//*[@id=\"main_nav_pcvf\"]")
	private WebElement pcvl;

	@FindBy(xpath = "//*[@id=\"cus_name\"]")
	private WebElement pcvl_name;

	@FindBy(xpath = "//*[@id=\"cus_mobile\"]")
	private WebElement pcvl_mobile;

	@FindBy(xpath = "//*[@id=\"cus_email\"]")
	private WebElement pcvl_email;

	@FindBy(xpath = "//*[@id=\"pf-apply-btn\"]")
	private WebElement pcvl_apply1;

	@FindBy(xpath = "//*[@id=\"loan-dob\"]")
	private WebElement pcvl_dob;

	@FindBy(xpath = "//*[@id=\"cus_loanAmount\"]")
	private WebElement pcvl_loan_amt;

	@FindBy(xpath = "//*[@id=\"pf-apply-btn1\"]")
	private WebElement pcvl_apply2;

	public WebElement getPcvl_apply2() {
		return pcvl_apply2;
	}

	public WebElement getPcvl() {
		return pcvl;
	}

	public WebElement getPcvl_name() {
		return pcvl_name;
	}

	public WebElement getPcvl_mobile() {
		return pcvl_mobile;
	}

	public WebElement getPcvl_email() {
		return pcvl_email;
	}

	public WebElement getPcvl_apply1() {
		return pcvl_apply1;
	}

	public WebElement getPcvl_dob() {
		return pcvl_dob;
	}

	public WebElement getPcvl_loan_amt() {
		return pcvl_loan_amt;
	}

	public WebElement getPcvl_pincode() {
		return pcvl_pincode;
	}

	@FindBy(xpath = "//*[@id=\"cus_pincode2\"]")
	private WebElement pcvl_pincode;

}
