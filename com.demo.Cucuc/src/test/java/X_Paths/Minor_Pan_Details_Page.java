package X_Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Minor_Pan_Details_Page {

	private static Minor_Pan_Details_Page minor;
	
	private Minor_Pan_Details_Page() {
		
	}
	public static Minor_Pan_Details_Page getInstance() {
		
		if(minor==null) {
			
			minor=new Minor_Pan_Details_Page();
			
		}
		return minor;
	}
	
	@CacheLookup
	@FindBy(id="s1_depositorPAN")
	private WebElement s1_depositorPAN;

	public WebElement getS1_depositorPAN() {
		return s1_depositorPAN;
	}
	@FindBy(xpath="//span[@class='edit-btn s1_editbtn editallbtn']")
	private WebElement editBtn;

	public WebElement getEditBtn() {
		return editBtn;
	}
	@FindBy(id="s1_depositortitle")
	private WebElement s1_depositortitle;
	
	public WebElement getS1_depositortitle() {
		return s1_depositortitle;
	}

	@FindBy(id="s1_depositorFName")
	private WebElement s1_depositorFName;

	public WebElement getS1_depositorFName() {
		return s1_depositorFName;
	}
	
	@FindBy(id="s1_depositorMName")
	private WebElement s1_depositorMName;

	public WebElement getS1_depositorMName() {
		return s1_depositorMName;
	}
	
	@FindBy(id="s1_depositorLName")
	private WebElement s1_depositorLName;

	public WebElement getS1_depositorLName() {
		return s1_depositorLName;
	}
	
	@FindBy(id="s1_depositorDOB")
	private WebElement s1_depositorDOB;

	public WebElement getS1_depositorDOB() {
		return s1_depositorDOB;
	}
	@FindBy(id="s1_depositorEmail")
	private WebElement s1_depositorEmail;

	public WebElement getS1_depositorEmail() {
		return s1_depositorEmail;
	}
	
	@FindBy(xpath="//button[@class='step-btn-1 primary-btn form-btn-g']")
	private WebElement Minor_Proceed;

	public WebElement getMinor_Proceed() {
		return Minor_Proceed;
	}
}
