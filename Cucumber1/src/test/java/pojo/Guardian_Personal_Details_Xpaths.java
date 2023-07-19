package pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Guardian_Personal_Details_Xpaths {
	
	
	   private static Guardian_Personal_Details_Xpaths xpathsPageInstance;

	    private Guardian_Personal_Details_Xpaths(){

	    }
	    public static Guardian_Personal_Details_Xpaths getInstance(){
	        if (xpathsPageInstance==null){
	            xpathsPageInstance=new Guardian_Personal_Details_Xpaths();
	        }
	        return xpathsPageInstance;
	    }
	    @CacheLookup
	    @FindBy(xpath = "//h3[text()='Guardian KYC Details']")
	    private WebElement gaurdian_Pd_Page;

	    public WebElement getGaurdian_Pd_Page() {
	        return gaurdian_Pd_Page;
	    }

	    @FindBy(id ="guardreuploaddiv")
	    private WebElement Gd_reference;

	    public WebElement getGd_reference() {
	        return Gd_reference;
	    }
	    @FindBy(id ="guard-img-preview")
	    private WebElement  guard_img_preview;

	    public WebElement getGuard_img_preview() {
	        return guard_img_preview;
	    }
	    @FindBy(id ="step-btn-upload-guardian")
	    private WebElement  step_btn_upload_guardian;

	    public WebElement getStep_btn_upload_guardian() {
	        return step_btn_upload_guardian;
	    }

	    @FindBy(id ="preview-img-done")
	    private WebElement  preview_img_done;

	    public WebElement getPreview_img_done() {
	        return preview_img_done;
	    }

	    @FindBy(id ="Icon_feather-edit")
	    private WebElement gdAddress_Edit;

	    public WebElement getGdAddress_Edit() {
	        return gdAddress_Edit;
	    }

	    @FindBy(id = "s3_guard_addrline1")
	    private WebElement s3_guard_addrline1;

	    public WebElement getS3_guard_addrline1() {
	        return s3_guard_addrline1;
	    }

	    @FindBy(id = "s3_guard_addrline2")
	    private WebElement s3_guard_addrline2;

	    public WebElement getS3_guard_addrline2() {
	        return s3_guard_addrline2;
	    }

	    @FindBy(id = "s3_guard_pincode")
	    private WebElement s3_guard_pincode;

	    public WebElement getS3_guard_pincode() {
	        return s3_guard_pincode;
	    }

	    @FindBy(id ="step-btn-guardian")
	    private WebElement step_btn_guardian;

	    public WebElement getStep_btn_guardian() {
	        return step_btn_guardian;
	    }

	    @FindBy(id = "guardian_photo")
	    private WebElement guardian_photo;

	    public WebElement getGuardian_photo() {
	        return guardian_photo;
	    }


}
