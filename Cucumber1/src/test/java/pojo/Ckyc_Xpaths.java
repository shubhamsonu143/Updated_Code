package pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Ckyc_Xpaths {
	
	private static Ckyc_Xpaths xpathsPageInstance;

    private Ckyc_Xpaths(){

    }
    public static Ckyc_Xpaths getInstance(){
        if (xpathsPageInstance==null){
            xpathsPageInstance=new Ckyc_Xpaths();
        }
        return xpathsPageInstance;
    }

    @CacheLookup
    @FindBy(xpath = "//p[text()='We are unable to verify depositor details with C-KYC']")
    private WebElement CKYC_fail;

    public WebElement getCKYC_fail() {
        return CKYC_fail;
    }

    @FindBy(id = "Documenttype")
    private WebElement Documenttype;

    public WebElement getDocumenttype() {
        return Documenttype;
    }

    @FindBy(xpath = "(//a[@class='uploada'])[2]")
    private WebElement Document_Field;

    public WebElement getDocument_Field() {
        return Document_Field;
    }

    @FindBy(id ="DocumentNo")
    private WebElement DocumentNo;

    public WebElement getDocumentNo() {
        return DocumentNo;
    }

    @FindBy(id ="up_ckyc_frontpic")
    private WebElement up_ckyc_frontpic;

    public WebElement getUp_ckyc_frontpic() {
        return up_ckyc_frontpic;
    }

    @FindBy(id ="up_ckyc_backpic")
    private WebElement up_ckyc_backpic;

    public WebElement getUp_ckyc_backpic() {
        return up_ckyc_backpic;
    }

    @FindBy(id ="step-btn-2")
    private WebElement step_btn_2;

    public WebElement getStep_btn_2() {
        return step_btn_2;
    }

}
