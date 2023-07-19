package X_paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class X_Paths {
	
	private static X_Paths xpathsPageInstance;

    private X_Paths(){

    }
    public static X_Paths getInstance(){
        if (xpathsPageInstance==null){
            xpathsPageInstance=new X_Paths();
        }
        return xpathsPageInstance;
    }
    @CacheLookup
    @FindBy(xpath = "//label[@for='MobileNo']")
    private WebElement label_Mobile;
    @FindBy(id = "MobileNo")
    private WebElement MobileNo;
    @FindBy(xpath = "//label[@for='pincode']")
    private WebElement label_pin;
    @FindBy(id = "pinCode")
    private WebElement pinCode;
    @FindBy(xpath = "//label[@for='EmailID']")
    private WebElement label_email;
    @FindBy(id = "EmailID")
    private WebElement EmailID;
    @FindBy(xpath = "//a[text()=\"Terms & Conditions.\"]")
    private WebElement TermsandConditons;
    @FindBy(id = "invest_now_button")
    private WebElement invest_now_button;
    @FindBy(id = "amount-input-fd")
    private WebElement amount_input_fd;
    @FindBy(id = "tenure-input-fd")
    private WebElement tenure_input_fd;
    @FindBy(xpath = "//label[@for=\"citizenyes\"]")
    private WebElement citizenyes;
    @FindBy(xpath = "//a[text()=\"INVEST NOW\"]")
    private WebElement Invest_now_Bottom;
    @FindBy(id = "verifyOtp")
    private WebElement verifyOtp;
    @FindBy(xpath = "//*[@id=\"verifyOtpSubmit\"]")
    private WebElement verifyOtpSubmit;
    @FindBy(id = "getNewCustomer")
    private WebElement getNewCustomer;



    public WebElement getLabel_Mobile() {
        return label_Mobile;
    }

    public WebElement getMobileNo() {
        return MobileNo;
    }

    public WebElement getLabel_pin() {
        return label_pin;
    }

    public WebElement getPinCode() {
        return pinCode;
    }

    public WebElement getLabel_email() {
        return label_email;
    }

    public WebElement getEmailID() {
        return EmailID;
    }

    public WebElement getTermsandConditons() {
        return TermsandConditons;
    }				

    public WebElement getInvest_now_button() {
        return invest_now_button;
    }

    public WebElement getAmount_input_fd() {
        return amount_input_fd;
    }

    public WebElement getTenure_input_fd() {
        return tenure_input_fd;
    }

    public WebElement getCitizenyes() {
        return citizenyes;	
    }

    public WebElement getInvest_now_Bottom() {
        return Invest_now_Bottom;
    }

    public WebElement getVerifyOtp() {
        return verifyOtp;
    }

    public WebElement getVerifyOtpSubmit() {
        return verifyOtpSubmit;
    }

    public WebElement getGetNewCustomer() {
        return getNewCustomer;
    }

}
