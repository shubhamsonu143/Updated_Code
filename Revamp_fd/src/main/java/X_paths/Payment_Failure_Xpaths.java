package X_paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import LibGlobal.BaseClass;

public class Payment_Failure_Xpaths extends BaseClass {

    public Payment_Failure_Xpaths(){
        PageFactory.initElements(driver,this);
    }

    @CacheLookup
    @FindBy(xpath="//h2[text()='Transaction failed']")
    private WebElement PF_Screen;

    public WebElement getPF_Screen() {
        return PF_Screen;
    }
    @FindBy(id="trans-error-pop")
    private WebElement trans_error_pop;

    public WebElement getTrans_error_pop() {
        return trans_error_pop;
    }

    @FindBy(id="modalerror-btn")
    private WebElement modalerror_btn;

    public WebElement getModalerror_btn() {
        return modalerror_btn;
    }

    @FindBy(id="retrypopkyc")
    private WebElement retrypopkyc;

    public WebElement getRetrypopkyc() {
        return retrypopkyc;
    }
}
