package X_paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Bank_Details_Xpaths {
	
	 private static Bank_Details_Xpaths xpathsPageInstance;

	    public Bank_Details_Xpaths(){

	    }
	    public static Bank_Details_Xpaths getInstance(){
	        if (xpathsPageInstance==null){
	            xpathsPageInstance=new Bank_Details_Xpaths();
	        }
	        return xpathsPageInstance;
	    }


	    @CacheLookup
	    @FindBy(xpath ="//label[text()='Account Number']")
	    private WebElement bankDetails;

	    public WebElement getBankDetails() {
	        return bankDetails;
	    }

	    @FindBy(id = "s4_accountno")
	    private WebElement s4_accountno;

	    public WebElement getS4_accountno() {
	        return s4_accountno;
	    }

	    @FindBy(id = "s4_confaccountno")
	    private WebElement s4_confaccountno;

	    public WebElement getS4_confaccountno() {
	        return s4_confaccountno;
	    }

	    @FindBy(id ="Icon_ionic-md-eye")
	    private WebElement eyeButton;

	    public WebElement getEyeButton() {
	        return eyeButton;
	    }

	    @FindBy(xpath = "(//button[@class=\"modal-btn info-btn viewbtn\"])[1]")
	    private WebElement info_Icon;

	    public WebElement getInfo_Icon() {
	        return info_Icon;
	    }

	    @FindBy(xpath = "(//button[@class=\"primary-btn modal-close-btn\"])[3]")
	    private WebElement Info_done;

	    public WebElement getInfo_done() {
	        return Info_done;
	    }
	//
//	    @FindBy(id = "s4_ifsc")
//	    private WebElement s4_ifsc;
	//
//	    public WebElement getS4_ifsc() {
//	        return s4_ifsc;
//	    }

	    @FindBy(xpath = "//button[@class='modal-btn dont-ifsc']")
	    private WebElement dont_Know_IFSC;

	    public WebElement getDont_Know_IFSC() {
	        return dont_Know_IFSC;
	    }


	    @FindBy(id = "bank_name")
	    private WebElement banknn;

	    public WebElement getBanknn() {
	        return banknn;
	    }

	    @FindBy(id ="bank_branch")
	    private WebElement bal;

	    public WebElement getBal() {
	        return bal;
	    }

	    @FindBy(id ="ifscCodeSearch")
	    private WebElement ifsc_code_search;

	    public WebElement getIfsc_code_search() {
	        return ifsc_code_search;
	    }
	    @FindBy(id="ifsccodes")
	    private WebElement ifsccodes;

	    public WebElement getIfsccodes() {
	        return ifsccodes;
	    }

	    @FindBy(id ="s4_acctype")
	    private WebElement s4_acctype;

	    public WebElement getS4_acctype() {
	        return s4_acctype;
	    }

	    @FindBy(xpath = "//label[@for='s4_accholdername']")
	    private  WebElement label_Click;

	    public WebElement getLabel_Click() {
	        return label_Click;
	    }

	    @FindBy(xpath="//label[@for='s4_accholdername']")
	    private WebElement labelAccName;

	    public WebElement getLabelAccName() {
	        return labelAccName;
	    }

	    @FindBy(xpath = "//*[@id=\"s4_accholdername\"]")
	    private WebElement s4_accholdername;

	    public WebElement getS4_accholdername() {
	        return s4_accholdername;
	    }



}
