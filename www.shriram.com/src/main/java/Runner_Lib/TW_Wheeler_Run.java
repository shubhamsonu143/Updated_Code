package Runner_Lib;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Common_Package.BaseClass;
import Excel_Lib.Excel_Utils;
import Execution_Lib.TW_Wheeler_Execution;

public class TW_Wheeler_Run extends BaseClass {

		
		@BeforeTest
		public  void  browser() {
			
			System.out.println("hii");
			browserLaunch("EDGE");
			loadUrl("https://sitsfl.stfc.in/");
			
	}
		@DataProvider
	    public static Iterator<Object[]> getTestData() {
	        ArrayList<Object[]> dataFromExcel = Excel_Utils.getDataFromTWexcel();
	        return dataFromExcel.iterator();
	    }
		
		@Test(dataProvider ="getTestData")
		public void f1(String INDEX,String tw_cus_mobile, String tw_input_field, String tw_residence_pincode, String tw_pan_number, String tw_father_name, String tw_cust_email) throws Exception {
			
			TW_Wheeler_Execution.Landing_Page();
			TW_Wheeler_Execution.tw_Wheeler_Landing_Page(INDEX,tw_cus_mobile);
			TW_Wheeler_Execution.Otp_Pop_Up(tw_input_field);
			TW_Wheeler_Execution.personal_Details_Page(tw_residence_pincode,  tw_pan_number, tw_father_name, tw_cust_email);
			
			
			
//			quitBrowser();
			
		}

	
}
