package xpaths_Lib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common_Package.BaseClass;

public class Four_Wheeler_Xpaths extends BaseClass{

	public Four_Wheeler_Xpaths() {
		
		PageFactory.initElements(driver, this);
		
	}
	@CacheLookup
	@FindBy(xpath="/html/body/section[1]/div/div/div/h2/span")
	private WebElement fw_content;
	
	@FindBy(id="mobile")
	private WebElement fw_mobile;
	
	@FindBy(id="send-otp-submit")
	private WebElement fw_send_otp_submit;
	
	@FindBy(xpath="//div[@class='input_field']")
	private WebElement fw_otp;
	
	@FindBy(id="otpVerifybtn")
	private WebElement fw_otpVerifybtn;
	
	public WebElement getFw_otpVerifybtn() {
		return fw_otpVerifybtn;
	}
	@FindBy(id="residence_pincode")
	private WebElement fw_residence_pincode;
	
	@FindBy(id="cus_pan")
	private WebElement fw_cus_pan;

	@FindBy(id="father_name")
	private WebElement fw_father_name;

	@FindBy(id="cus_email")
	private WebElement fw_cus_email;
	
	@FindBy(id="customer-details-form-submit")
	private WebElement fw_customer_details_form_submit;
	
	@FindBy(id="residence_type")
	private WebElement fw_residence_type;
	
	@FindBy(id="residence_type_list")
	private WebElement fw_residence_type_list;
	
	@FindBy(id="current_residence_age")
	private WebElement fw_current_residence_age;
	
	@FindBy(id="current_residence_age_list")
	private WebElement fw_current_residence_age_list;
	
	@FindBy(id="employment_type")
	private WebElement fw_employment_type;
	
	@FindBy(id="cus_net")
	private WebElement fw_cus_net;
	
	@FindBy(id="cus_cara")
	private WebElement fw_purposeOf_Loan;
	
	@FindBy(xpath="(//div[@class='select-wrap'])[4]")
	private WebElement fw_purposeof_loan_list;
	
	@FindBy(xpath="//span[@class='webBrowse-notification-title-safari']")
	private WebElement fw_notification_text;
	
	@FindBy(id="__st_bpn_no")
	private WebElement __st_bpn_no;
	
	public WebElement getFw_notification_text() {
		return fw_notification_text;
	}

	public WebElement get__st_bpn_no() {
		return __st_bpn_no;
	}

	public WebElement getFw_content() {
		return fw_content;
	}

	public WebElement getFw_mobile() {
		return fw_mobile;
	}

	public WebElement getFw_send_otp_submit() {
		return fw_send_otp_submit;
	}

	public WebElement getFw_otp() {
		return fw_otp;
	}

	public WebElement getFw_residence_pincode() {
		return fw_residence_pincode;
	}

	public WebElement getFw_cus_pan() {
		return fw_cus_pan;
	}

	public WebElement getFw_father_name() {
		return fw_father_name;
	}

	public WebElement getFw_cus_email() {
		return fw_cus_email;
	}

	public WebElement getFw_customer_details_form_submit() {
		return fw_customer_details_form_submit;
	}

	public WebElement getFw_residence_type() {
		return fw_residence_type;
	}

	public WebElement getFw_residence_type_list() {
		return fw_residence_type_list;
	}

	public WebElement getFw_current_residence_age() {
		return fw_current_residence_age;
	}

	public WebElement getFw_current_residence_age_list() {
		return fw_current_residence_age_list;
	}

	public WebElement getFw_employment_type() {
		return fw_employment_type;
	}

	public WebElement getFw_cus_net() {
		return fw_cus_net;
	}

	public WebElement getFw_purposeOf_Loan() {
		return fw_purposeOf_Loan;
	}

	public WebElement getFw_purposeof_loan_list() {
		return fw_purposeof_loan_list;
	}

	public WebElement getFw_reg_number() {
		return fw_reg_number;
	}

	public WebElement getFw_cus_man() {
		return fw_cus_man;
	}

	public WebElement getFw_cus_model() {
		return fw_cus_model;
	}

	public WebElement getFw_cus_fuel() {
		return fw_cus_fuel;
	}

	public WebElement getFw_dateofreg() {
		return fw_dateofreg;
	}

	public WebElement getFw_year() {
		return fw_year;
	}

	public WebElement getFw_month() {
		return fw_month;
	}

	public WebElement getFw_date() {
		return fw_date;
	}

	public WebElement getFw_insexpdate() {
		return fw_insexpdate;
	}

	public WebElement getFw_exp_year() {
		return fw_exp_year;
	}

	public WebElement getFw_exp_month() {
		return fw_exp_month;
	}

	public WebElement getFw_exp_date() {
		return fw_exp_date;
	}

	public WebElement getFw_additional_details_form_submit() {
		return fw_additional_details_form_submit;
	}

	public WebElement getFw_cus_inr() {
		return fw_cus_inr;
	}

	public WebElement getFw_cus_mon() {
		return fw_cus_mon;
	}

	public WebElement getFw_loan_info_form_submit() {
		return fw_loan_info_form_submit;
	}
	@FindBy(id="reg_number")
	private WebElement fw_reg_number;
	
	@FindBy(id="cus_man")
	private WebElement fw_cus_man;
	
	@FindBy(id="cus_model")
	private WebElement fw_cus_model;
	
	@FindBy(id="cus_fuel")
	private WebElement fw_cus_fuel;
	
	@FindBy(id="dateofreg")
	private WebElement fw_dateofreg;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement fw_year;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement fw_month;
	
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody")
	private WebElement fw_date;
	
	@FindBy(id="insexpdate")
	private WebElement fw_insexpdate;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement fw_exp_year;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement fw_exp_month;
	
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody")
	private WebElement fw_exp_date;
	
	@FindBy(id="additional-details-form-submit")
	private WebElement fw_additional_details_form_submit;
	
	@FindBy(id="cus_inr")
	private WebElement fw_cus_inr;

	@FindBy(id="cus_mon")
	private WebElement fw_cus_mon;
	
	@FindBy(id="loan-info-form-submit")
	private WebElement fw_loan_info_form_submit;
}

