package X_Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Landing_Page {

	private static Landing_Page lp;
	private Landing_Page() {
	}
	public static Landing_Page getInstance() {
		if (lp == null) {

			lp = new Landing_Page();
		}
		return lp;
	}
	@CacheLookup
	@FindBy(id = "MobileNo")
	private WebElement MobileNumber;

	public WebElement getMobileNumber() {
		return MobileNumber;
	}

	@FindBy(id = "pincode")
	private WebElement pincode;

	public WebElement getPincode() {
		return pincode;
	}

	@FindBy(id = "EmailID")
	private WebElement emailId;

	public WebElement getEmailId() {
		return emailId;
	}
	public WebElement getInvest_now_button() {
		return invest_now_button;
	}
	@FindBy(id="invest_now_button")
	private WebElement invest_now_button;
	

	@FindBy(id="verifyOtp")
	private WebElement verifyOtp;
	public WebElement getVerifyOtp() {
		return verifyOtp;
	}
	
	@FindBy(xpath="//span[text()='Invalid Mobile Number']")
	private WebElement Mobile_Error;
	public WebElement getMobile_Error() {
		return Mobile_Error;
	}

}




