package X_paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Personal_Details_Xpaths {
	
	 private static Personal_Details_Xpaths xpathsPageInstance;

	    public Personal_Details_Xpaths(){

	    }
	    public static Personal_Details_Xpaths getInstance(){
	        if (xpathsPageInstance==null){
	            xpathsPageInstance=new Personal_Details_Xpaths();
	        }
	        return xpathsPageInstance;
	    }
	    @CacheLookup
	    @FindBy(xpath ="//h3[text()='KYC Details']")
	    private WebElement personalDetails;

	    public WebElement getPersonalDetails() {
	        return personalDetails;
	    }
	    @FindBy(id ="docuploaddiv")
	    private WebElement docuploaddiv;

	    public WebElement getDocuploaddiv() {
	        return docuploaddiv;
	    }
	    @FindBy(id ="depInv-img-preview")
	    private WebElement depInv_img_preview;

	    public WebElement getDepInv_img_preview() {
	        return depInv_img_preview;
	    }
	    @FindBy(id ="dep-preview-img-done")
	    private WebElement dep_preview_img_done;

	    public WebElement getDep_preview_img_done() {
	        return dep_preview_img_done;
	    }

	    @FindBy(id ="step-btn-2")
	    private WebElement step_btn_2;

	    public WebElement getStep_btn_2() {
	        return step_btn_2;
	    }
	    @FindBy(xpath ="//span[@class='s3_editbtn edit-btn']")
	    private WebElement Address_Edit;

	    public WebElement getAddress_Edit() {
	        return Address_Edit;
	    }
	    @FindBy(id = "s3_addrline1")
	    private WebElement s3_addrline1;

	    public WebElement getS3_addrline1() {
	        return s3_addrline1;
	    }

	    @FindBy(id ="s3_addrline2")
	    private WebElement s3_addrline2;

	    public WebElement getS3_addrline2() {
	        return s3_addrline2;
	    }
	    @FindBy(id ="s3_pincode")
	    private WebElement s3_pincode;

	    public WebElement getS3_pincode() {
	        return s3_pincode;
	    }

	    @FindBy(id ="investor_photo")
	    private WebElement investor_photo;

	    public WebElement getInvestor_photo() {
	        return investor_photo;
	    }
	    @FindBy(id="step-btn-3")
	    private WebElement step_btn_3;

	    public WebElement getStep_btn_3() {
	        return step_btn_3;
	    }

}
