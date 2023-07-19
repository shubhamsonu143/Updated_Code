package X_Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Guardian_Pan {
	
	private static  Guardian_Pan guard;
	
	private Guardian_Pan() {
		
	}
	public static Guardian_Pan getInstance() {
		
		if(guard==null) {
			
			guard=new Guardian_Pan();
			
		}
		
		return guard;
		
	}
	@CacheLookup
	@FindBy(xpath="//p[text()='The depositor is Minor, Please enter your guardian details.']")
	private WebElement Guardian_Page;

	public WebElement getGuardian_Page() {
		return Guardian_Page;
	}
	
	@FindBy(id="s1_depositorGuardianPAN")
	private WebElement s1_depositorGuardianPAN;

	public WebElement getS1_depositorGuardianPAN() {
		return s1_depositorGuardianPAN;
	}
	@FindBy(xpath="//span[@class='edit-btn s1_gar_editbtn editallbtn']")
	private WebElement edit_Gurad;
	
	public WebElement getEdit_Gurad() {
		return edit_Gurad;
	}
	@FindBy(id="s1_depositorGuardiantitle")
	private WebElement s1_depositorGuardiantitle;

	public WebElement getS1_depositorGuardiantitle() {
		return s1_depositorGuardiantitle;
	}
	@FindBy(id="s1_depositorGuardianFName")
	private WebElement s1_depositorGuardianFName;

	public WebElement getS1_depositorGuardianFName() {
		return s1_depositorGuardianFName;
	}
	@FindBy(id="s1_depositorGuardianMName")
	private WebElement s1_depositorGuardianMName;

	public WebElement getS1_depositorGuardianMName() {
		return s1_depositorGuardianMName;
	}
	@FindBy(id="s1_depositorGuardianLName")
	private WebElement s1_depositorGuardianLName;

	public WebElement getS1_depositorGuardianLName() {
		return s1_depositorGuardianLName;
	}
	@FindBy(id="s1_depositorGuardianDOB")
	private WebElement s1_depositorGuardianDOB;

	public WebElement getS1_depositorGuardianDOB() {
		return s1_depositorGuardianDOB;
	}
	@FindBy(id="s1_depositorGuardianEmail")
	private WebElement s1_depositorGuardianEmail;

	public WebElement getS1_depositorGuardianEmail() {
		return s1_depositorGuardianEmail;
	}
	@FindBy(id="step-gar-btn-1")
	private WebElement step_gar_btn_1;

	public WebElement getStep_gar_btn_1() {
		return step_gar_btn_1;
	}
	
	@FindBy(xpath="//h3[text()='Your Deposit Summary']")
	private WebElement deposit_Summary_Page;

	public WebElement getDeposit_Summary_Page() {
		return deposit_Summary_Page;
	}
}
