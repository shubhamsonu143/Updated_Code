package fd_run_package;

import java.util.ArrayList;
import java.util.Iterator;

import org.baseclass.BaseClass;
import org.excel.utils.ExcelUtils;
import org.openqa.selenium.Cookie;
import org.run.Pre_Execution_Fd;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FD_Runner extends BaseClass {

	@BeforeTest
	public static void beforeTest() {

		compatible_Browser();

		initElements();

	}

//	@DataProvider
//	public static Iterator<Object[]> getTestData() {
//		return testData.iterator();
//	}
	@DataProvider
	public Iterator<Object[]> getTestData() {

		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
		return testData.iterator();
	}


	@Test(dataProvider = "getTestData")
	public static void f1(String INDEX, String mobile, String pincode, String otp_code, String pan, String email,
			String DocumentNo, String frontimg, String backimg, String investorphoto, String address1, String address2,
			String accNo, String confirmacc, String ifscode, String accountType, String accName, String cheque,
			String OccupationType, String maritalstatus, String fathername) throws Exception {

		Pre_Execution_Fd.sfl_website(INDEX);
		
		Cookie cookieNamed0 = driver.manage().getCookieNamed("USER_SESSION_ACTIVITY");
        
        System.out.println(cookieNamed0.getValue());

		Pre_Execution_Fd.fd_landing(mobile, pincode, otp_code);
		
		Cookie cookieNamed = driver.manage().getCookieNamed("USER_SESSION_ACTIVITY");
        
        System.out.println(cookieNamed.getValue());

		Pre_Execution_Fd.scheme_selection();
		
		Cookie cookieNamed1 = driver.manage().getCookieNamed("USER_SESSION_ACTIVITY");
        
        System.out.println(cookieNamed1.getValue());

		Pre_Execution_Fd.panscreen(pan, email);
		
		Cookie cookieNamed2 = driver.manage().getCookieNamed("USER_SESSION_ACTIVITY");
        
        System.out.println(cookieNamed2.getValue());

		Pre_Execution_Fd.depositsummaryscreen();
		
		Cookie cookieNamed3 = driver.manage().getCookieNamed("USER_SESSION_ACTIVITY");
        
        System.out.println(cookieNamed3.getValue());

		Pre_Execution_Fd.ckycManualscreen(DocumentNo, frontimg, backimg);

		Pre_Execution_Fd.personalDetailsScren(investorphoto, address1, address2);

		Pre_Execution_Fd.bankDetailsScreen(accNo, confirmacc, ifscode, accountType, accName, cheque);

		Pre_Execution_Fd.additionalDetailsScreen(OccupationType, maritalstatus, fathername);

	}
}
