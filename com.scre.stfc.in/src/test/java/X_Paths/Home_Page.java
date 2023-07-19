package X_Paths;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Home_Page {
	
	private static Home_Page hp;
	
	private Home_Page(){
		
	}
	
	public static Home_Page getInstance() {
		
		if(hp==null) {
			
			hp=new Home_Page();
			
		}
		
		return hp;
		
	}
	@CacheLookup
	@FindBy(id="MobileNo")
	private WebElement MobileNo;

	public WebElement getMobileNo() {
		return MobileNo;
	}
	@FindBy(id="pincode")
	private WebElement pincode;

	public WebElement getPincode() {
		return pincode;
	}
	
	}
