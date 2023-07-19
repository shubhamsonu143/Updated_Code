package X_Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SchemeDeatilsPage {

	private static SchemeDeatilsPage scheme;

	private SchemeDeatilsPage() {

	}
	public static SchemeDeatilsPage getInstance() {

		if (scheme == null) {

			scheme = new SchemeDeatilsPage();

		}
		return scheme;
	}
	
	@CacheLookup
	@FindBy(xpath="//label[text()='Investment Amount']")
	private WebElement Scheme_Details_Page;
	
	public WebElement getScheme_Details_Page() {
		return Scheme_Details_Page;
	}

	@FindBy(id="amount-input-fd")
	private WebElement amount_input_fd;

	public WebElement getAmount_input_fd() {
		return amount_input_fd;
	}
	
	@FindBy(xpath="(//span[@class='info_i modal-btn'])[1]")
	private WebElement tenure_info;

	public WebElement getTenure_info() {
		return tenure_info;
	}
	
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn'])[6]")
	private WebElement info_Done;
	
	public WebElement getInfo_Done() {
		return info_Done;
	}

	@FindBy(id="tenure-input-fd")
	private WebElement tenure_input_fd;

	public WebElement getTenure_input_fd() {
		return tenure_input_fd;
	}
	@FindBy(xpath="(//span[@class='info_i modal-btn'])[2]")
	private WebElement interest_info;

	public WebElement getInterest_info() {
		return interest_info;
	}
	@FindBy(xpath="(//button[@class='primary-btn modal-close-btn'])[9]")
	private WebElement interest_Done;

	public WebElement getInterest_Done() {
		return interest_Done;
	}
	@FindBy(id="intPayout")
	private WebElement intPayout;

	public WebElement getIntPayout() {
		return intPayout;
	}
	@FindBy(id="citizenyes")
	private WebElement citizenyes;

	public WebElement getCitizenyes() {
		return citizenyes;
	}
	@FindBy(id="apply_investbtn")
	private WebElement apply_investbtn;

	public WebElement getApply_investbtn() {
		return apply_investbtn;
	}
	@FindBy(xpath="//h3[text()='Enter your PAN details']")
	private WebElement Minor_Pan_Page;

	public WebElement getMinor_Pan_Page() {
		return Minor_Pan_Page;
	}
	
}
