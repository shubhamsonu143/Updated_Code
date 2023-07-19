package X_Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Deposit_Summary_Page {
	
	private static Deposit_Summary_Page deposit;
	
	private Deposit_Summary_Page() {
		
	}
	public static Deposit_Summary_Page getInstance() {
		
		if(deposit==null) {
			
			deposit=new Deposit_Summary_Page();
		}
		return deposit;
	}

	@CacheLookup
	@FindBy(xpath="//label[text()='Investment Amount']")
	private WebElement Scheme_Details_Page;
	
	public WebElement getScheme_Details_Page() {
		return Scheme_Details_Page;
	}
	@FindBy(xpath="//a[@class='edit-btn step2calc_edit editallbtn']")
	private WebElement edit_To_Scheme;

	public WebElement getEdit_To_Scheme() {
		return edit_To_Scheme;
	}
	@FindBy(id="apply_investbtn2")
	private WebElement apply_investbtn2;

	public WebElement getApply_investbtn2() {
		return apply_investbtn2;
	} 
	
	@FindBy(xpath="//button[@class='modal-btn term-btn f-m']")
	private WebElement termsAndConditons;

	public WebElement getTermsAndConditons() {
		return termsAndConditons;
	}
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn'])[1]")
	private WebElement gotItTerms;

	public WebElement getGotItTerms() {
		return gotItTerms;
	}
	@FindBy(xpath="(//label[@for='depositorTC'])[1]")
	private WebElement acceptTerms;

	public WebElement getAcceptTerms() {
		return acceptTerms;
	}
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn'])[16]")
	private WebElement accept_GotIt;
	
	public WebElement getAccept_GotIt() {
		return accept_GotIt;
	}

	@FindBy(xpath="(//button[@class='primary-btn m-0 form-btn-g dis-btn'])[1]")
	private WebElement deposit_Proceed;

	public WebElement getDeposit_Proceed() {
		return deposit_Proceed;
	}
	@FindBy(xpath="(//section[@class='_DFYT pos-a ba-on-scroll'])[1]")
	private WebElement back_Pay;

	public WebElement getBack_Pay() {
		return back_Pay;
	}
	@FindBy(xpath="(//div[@class='_38GU btn btn-primary pos-r xs-cp-btn'])[1]")
	private WebElement cancel_Payment;

	public WebElement getCancel_Payment() {
		return cancel_Payment;
	}
	@FindBy(id="retrypopkyc")
	private WebElement retrypopkyc;

	public WebElement getRetrypopkyc() {
		return retrypopkyc;
	}
	@FindBy(xpath="//h3[text()='Your Deposit Summary']")
	private WebElement deposit_Summary_Page;

	public WebElement getDeposit_Summary_Page() {
		return deposit_Summary_Page;
	}
}
