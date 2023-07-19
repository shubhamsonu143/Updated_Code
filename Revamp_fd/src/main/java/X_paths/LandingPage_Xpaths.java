package X_paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibGlobal.BaseClass;

public class LandingPage_Xpaths extends BaseClass {
	
	
	public LandingPage_Xpaths(){
        PageFactory.initElements(driver,this);

    }
    @CacheLookup
    @FindBy(xpath = "//p[text()='Invest within ']")
    private WebElement LandingReference;

    public WebElement getLandingReference() {
        return LandingReference;
    }

    @FindBy(xpath="//label[@for='MobileNo']")
    private WebElement label_Mobile;

    public WebElement getLabel_Mobile() {
        return label_Mobile;
    }

    @FindBy(id="MobileNo")
    private WebElement MobileNo;

    public WebElement getMobileNo() {
        return MobileNo;
    }

    @FindBy(xpath="//label[@for='pincode']")
    private WebElement label_pin;

    public WebElement getLabel_pin() {
        return label_pin;
    }

    @FindBy(id="pinCode")
    private WebElement pinCode;

    public WebElement getPinCode() {
        return pinCode;
    }

    @FindBy(xpath="//label[@for='EmailID']")
    private WebElement label_email;

    public WebElement getLabel_email() {
        return label_email;
    }

    @FindBy(id="EmailID")
    private WebElement EmailID;

    public WebElement getEmailID() {
        return EmailID;
    }
    @FindBy(xpath="//a[text()=\"Terms & Conditions.\"]")
    private WebElement TermsandConditons;

    public WebElement getTermsandConditons() {
        return TermsandConditons;
    }
    @FindBy(id="invest_now_button")
    private WebElement invest_now_button;

    public WebElement getInvest_now_button() {
        return invest_now_button;
    }
    @FindBy(id="amount-input-fd")
    private WebElement amount_input_fd;

    public WebElement getAmount_input_fd() {
        return amount_input_fd;
    }
    @FindBy(id="tenure-input-fd")
    private WebElement tenure_input_fd;

    public WebElement getTenure_input_fd() {
        return tenure_input_fd;
    }

    @FindBy(xpath="//label[@for=\"citizenyes\"]")
    private WebElement citizenyes;

    public WebElement getCitizenyes() {
        return citizenyes;
    }
    @FindBy(xpath="//a[text()=\"INVEST NOW\"]")
    private WebElement Invest_now_Bottom;

    public WebElement getInvest_now_Bottom() {
        return Invest_now_Bottom;
    }
    @FindBy(id="verifyOtp")
    private WebElement verifyOtp;

    public WebElement getVerifyOtp() {
        return verifyOtp;
    }
    @FindBy(xpath="//*[@id=\"verifyOtpSubmit\"]")
    private WebElement verifyOtpSubmit;

    public WebElement getVerifyOtpSubmit() {
        return verifyOtpSubmit;
    }

    @FindBy(id="getNewCustomer")
    private  WebElement getNewCustomer;

    public WebElement getGetNewCustomer() {
        return getNewCustomer;
    }
	
	

}
