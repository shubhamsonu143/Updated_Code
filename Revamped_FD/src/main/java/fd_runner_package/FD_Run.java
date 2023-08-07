package fd_runner_package;

import java.util.ArrayList;
import java.util.Iterator;

import org.baseclass.BaseClass;
import org.excel.utils.ExcelUtils;
import org.openqa.selenium.Cookie;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FD_Run extends BaseClass {

	@BeforeTest
	public static void beforeTest() {

		compatible_Browser();

		initElements();

	}

	@DataProvider
	public Iterator<Object[]> getTestData() {

		ArrayList<Object[]> testData = ExcelUtils.getDataFromexcel();
		return testData.iterator();
	}

	@Test(dataProvider = "getTestData")
	public static void f1(String INDEX, String mobile, String pincode, String otp_code, String investAmount,
			String choosepayout, String PAN_No, String FName, String LName, String Email, String DocumentNo,
			String frontimg, String backimg, String investorphoto, String address1, String address2, String accNo,
			String confirmacc, String ifscode, String accountType, String accName, String cheque, String OccupationType,
			String maritalstatus, String fathername) throws Exception {

		fd_pre_executions.sfl_website(INDEX);

		Cookie cookieNamed0 = driver.manage().getCookieNamed("USER_SESSION_ACTIVITY");

		System.out.println(cookieNamed0.getValue());

		fd_pre_executions.fd_landing(mobile, pincode, otp_code);

		fd_pre_executions.Scheme_selectionscreen(investAmount, choosepayout, PAN_No, FName, LName, Email);

		fd_pre_executions.Paymentscreen();
		Thread.sleep(5000);
		fd_pre_executions.ckycManualscreen(DocumentNo, frontimg, backimg);

		fd_pre_executions.personalDetailsScren(investorphoto, address1, address2);

		fd_pre_executions.bankDetailsScreen(accNo, confirmacc, ifscode, accountType, accName, cheque);

		fd_pre_executions.additionalDetailsScreen(OccupationType, maritalstatus, fathername);

	}
}