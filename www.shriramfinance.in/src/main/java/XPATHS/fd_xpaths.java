package XPATHS;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.BaseClass;

public class fd_xpaths extends BaseClass  {
	
	public fd_xpaths() {

        PageFactory.initElements(driver, this);
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
	@FindBy(id="cus_mobile")
	private WebElement MobileNum;

	public WebElement getMobileNum() {
		return MobileNum;
	}
	@FindBy(id = "cus_pincode")
	private WebElement Pincode;

	public WebElement getPincode() {
		return Pincode;
	}
	@FindBy(id = "pf-apply-btn")
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
	

}
