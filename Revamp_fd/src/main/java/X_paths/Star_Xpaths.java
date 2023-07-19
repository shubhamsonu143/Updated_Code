package X_paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Star_Xpaths {
	
	
	 private static Star_Xpaths xpathsPageInstance;

	    public Star_Xpaths(){

	    }
	    public static Star_Xpaths getInstance(){
	        if (xpathsPageInstance==null){
	            xpathsPageInstance=new Star_Xpaths();
	        }
	        return xpathsPageInstance;
	    }

	    @CacheLookup
	    @FindBy(xpath="//h2[text()='Congratulations!']")
	    private WebElement congragulations_Screen;

	    public WebElement getCongragulations_Screen() {
	        return congragulations_Screen;
	    }

	    @FindBy(xpath="//label[@for=\"star6\"]")
	    private WebElement star;

	    public WebElement getStar() {
	        return star;
	    }
	    @FindBy(id="paymentSuccess")
	    private WebElement paymentSuccess;

	    public WebElement getPaymentSuccess() {
	        return paymentSuccess;
	    }

}
