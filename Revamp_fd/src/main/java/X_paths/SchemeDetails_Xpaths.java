package X_paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SchemeDetails_Xpaths {
	
	
	private static SchemeDetails_Xpaths xpathsPageInstance;

    public SchemeDetails_Xpaths(){

    }
    public static SchemeDetails_Xpaths getInstance(){
        if (xpathsPageInstance==null){
            xpathsPageInstance=new SchemeDetails_Xpaths();
        }
        return xpathsPageInstance;
    }

    @CacheLookup
    @FindBy(xpath="//label[text()=\"Investment Amount\"]")
    private WebElement Scheme_Details_Page;

    public WebElement getScheme_Details_Page() {
        return Scheme_Details_Page;
    }

    @FindBy(id = "amount-input-fd")
    private WebElement amount_input_fd;

    public WebElement getAmount_input_fd() {
        return amount_input_fd;
    }
    @FindBy(id="tenure-input-fd")
    private WebElement tenure_input_fd;

    public WebElement getTenure_input_fd() {
        return tenure_input_fd;
    }
    @FindBy(xpath="(//span[@class=\"info_i modal-btn\"])[1]")
    private WebElement tenure_info;

    public WebElement getTenure_info() {
        return tenure_info;
    }
    @FindBy(xpath="(//button[@class=\"primary-btn modal-close-btn\"])[6]")
    private WebElement tenure_info_done;

    public WebElement getTenure_info_done() {
        return tenure_info_done;
    }

    @FindBy(xpath="(//button[@class=\"primary-btn modal-close-btn\"])[9]")
    private WebElement Select_Interest_Payout_Info_done;

    public WebElement getSelect_Interest_Payout_Info_done() {
        return Select_Interest_Payout_Info_done;
    }

    @FindBy(xpath="(//span[@class=\"info_i modal-btn\"])[2]")
    private WebElement Select_Interest_Payout_Info;

    public WebElement getSelect_Interest_Payout_Info() {
        return Select_Interest_Payout_Info;
    }

    @FindBy(id="intPayout")
    private WebElement Select_Interest_Payout;

    public WebElement getSelect_Interest_Payout() {
        return Select_Interest_Payout;
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
    @FindBy(xpath="(//span[@class=\"info_i white_i modal-btn\"])[1]")
    private WebElement Senior_citizen_info;

    public WebElement getSenior_citizen_info() {
        return Senior_citizen_info;
    }
    @FindBy(xpath="(//button[@class='primary-btn modal-close-btn'])[13]")
    private WebElement Senior_citizen_info_done;

    public WebElement getSenior_citizen_info_done() {
        return Senior_citizen_info_done;
    }

    @FindBy(xpath="(//span[@class='info_i white_i modal-btn'])[2]")
    private WebElement maturity_info;

    public WebElement getMaturity_info() {
        return maturity_info;
    }
    @FindBy(xpath="(//button[@class='primary-btn modal-close-btn'])[11]")
    private WebElement maturity_info_done;

    public WebElement getMaturity_info_done() {
        return maturity_info_done;
    }

    @FindBy(xpath="(//span[@class='info_i white_i modal-btn'])[3]")
    private WebElement Poppular_picks_info;
    public WebElement getPoppular_picks_info() {
        return Poppular_picks_info;
    }
    @FindBy(xpath="(//button[@class='primary-btn modal-close-btn'])[10]")
    private WebElement Poppular_picks_info_done;

    public WebElement getPoppular_picks_info_done() {
        return Poppular_picks_info_done;
    }
    @FindBy(id="apply_investbtn2")
    private WebElement apply_investbtn2;

    public WebElement getApply_investbtn2() {
        return apply_investbtn2;
    }

}
