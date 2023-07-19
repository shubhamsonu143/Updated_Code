package X_paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PennyDrop_Xpaths {
	
	
	 private static PennyDrop_Xpaths xpathsPageInstance;

	    public PennyDrop_Xpaths(){

	    }
	    public static PennyDrop_Xpaths getInstance(){
	        if (xpathsPageInstance==null){
	            xpathsPageInstance=new PennyDrop_Xpaths();
	        }
	        return xpathsPageInstance;
	    }
	    @CacheLookup
	    @FindBy(xpath = "//p[text()='Failed to validate your account, Please upload the \"front image\" of your cheque or Passbook.']")
	    private WebElement Ocr_Page;


	    public WebElement getOcr_Page() {
	        return Ocr_Page;
	    }

	    @FindBy(id ="ocrChkUpload")
	    private WebElement ocrChkUpload;

	    public WebElement getOcrChkUpload() {
	        return ocrChkUpload;
	    }

	    @FindBy(id ="step-btn-5")
	    private WebElement step_btn_5;

	    public WebElement getStep_btn_5() {
	        return step_btn_5;
	    }

}
