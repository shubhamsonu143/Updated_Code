package fd_run_package;

import java.util.ArrayList;
import java.util.Iterator;

import org.baseclass.BaseClass;
import org.excel.utils.excel_Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.run.Pre_Execution_Fd;
import org.testng.SkipException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FD_Runner extends BaseClass {

	@BeforeTest
	public static void beforeTest() {

		compatible_Browser();

		initElements();

	}

	@DataProvider
	public static Iterator<Object[]> getTestData() {
		ArrayList<Object[]> dataFromExcel = excel_Utility.getDataFromexcel();
		return dataFromExcel.iterator();
	}

	@Test(dataProvider = "getTestData")
	public static void f1(String INDEX, String mobile, String pincode, String otp_code, String pan, String email,
			String DocumentNo, String frontimg, String backimg, String investorphoto, String address1, String address2,
			String accNo, String confirmacc, String ifscode, String accountType, String accName, String cheque,
			String OccupationType, String maritalstatus, String fathername) throws Exception {

		Pre_Execution_Fd.sfl_website(INDEX);

		Pre_Execution_Fd.fd_landing(mobile, pincode, otp_code);
		
		
		try {
            Thread.sleep(15000);
            boolean isPresent = driver.findElement(By.xpath("//h3[text()='Fixed deposit scheme selection calculator']")).isDisplayed();
            System.out.println(isPresent);
            Thread.sleep(3000);
            if (isPresent) {
            	Pre_Execution_Fd.scheme_selection();
            	
                System.out.println("STAGE-1_SCHEME_SELECTION_SCREEN - COMPLETED");
            } else {
                System.out.println("STAGE-1_SCHEME_SELECTION_SCREEN - STEPS SKIPPED");
                // throw new SkipException("Skipping this exception");
            }
        }

        catch (SkipException e) {
            // TODO Auto-generated catch block
            System.out.println("STAGE-1_SCHEME_SELECTION_SCREEN - STEPS SKIPPED");
            // throw new SkipException("Skipping this exception");

        }
		
		
		try {
            Thread.sleep(15000);
            Boolean isPresent = driver.findElement(By.xpath("//h3[text()='Enter your PAN details']")).isDisplayed();
            Thread.sleep(3000);
            if (isPresent) {
            	Pre_Execution_Fd.panscreen(pan, email);
            	
                System.out.println("STAGE-2_PAN_DETAILS_SCREEN - COMPLETED");
            } else {
                System.out.println("STAGE-2_PAN_DETAILS_SCREEN - STEPS SKIPPED");
                // throw new SkipException("Skipping this exception");
            }
        }

        catch (SkipException e) {
            // TODO Auto-generated catch block
            System.out.println("STAGE-2_PAN_DETAILS_SCREEN - STEPS SKIPPED");
            // throw new SkipException("Skipping this exception");

        }

		try {
            Thread.sleep(3000);
            Boolean isPresent = driver.findElement(By.xpath("//h3[text()='Your Deposit Summary']")).isDisplayed();
            Thread.sleep(3000);
            if (isPresent) {
            	Pre_Execution_Fd.depositsummaryscreen();
            	
                System.out.println("STAGE-3_DEPOSIT_SUMMARY_SCREEN - COMPLETED");
            } else {
                System.out.println("STAGE-3_DEPOSIT_SUMMARY_SCREEN - STEPS SKIPPED");
                // throw new SkipException("Skipping this exception");
            }
        }

        catch (SkipException e) {
            // TODO Auto-generated catch block
            System.out.println("STAGE-3_DEPOSIT_SUMMARY_SCREEN - STEPS SKIPPED");
            // throw new SkipException("Skipping this exception");

        }
		try {
            Thread.sleep(3000);
            Boolean isPresent = driver.findElement(By.xpath("//p[text()='We are unable to verify depositor details with C-KYC']")).isDisplayed();
            Thread.sleep(3000);
            if (isPresent) {
            	Pre_Execution_Fd.ckycManualscreen(DocumentNo, frontimg, backimg);
            	
                System.out.println("STAGE-4_CKYC_MANUAL_SCREEN - COMPLETED");
            } else {
                System.out.println("STAGE-4_CKYC_MANUAL_SCREEN - STEPS SKIPPED");
                // throw new SkipException("Skipping this exception");
            }
        }

        catch (SkipException e) {
            // TODO Auto-generated catch block
            System.out.println("STAGE-4_CKYC_MANUAL_SCREEN - STEPS SKIPPED");
            // throw new SkipException("Skipping this exception");

        }

		try {
            Thread.sleep(3000);
            Boolean isPresent = driver.findElement(By.xpath("//h3[text()='KYC Details']")).isDisplayed();
            Thread.sleep(3000);
            if (isPresent) {
            	Pre_Execution_Fd.personalDetailsScren(investorphoto, address1, address2);
            	
                System.out.println("STAGE-5_PERSONAL_DETAILS_SCREEN - COMPLETED");
            } else {
                System.out.println("STAGE-5_PERSONAL_DETAILS_SCREEN - STEPS SKIPPED");
                // throw new SkipException("Skipping this exception");
            }
        }

        catch (SkipException e) {
            // TODO Auto-generated catch block
            System.out.println("STAGE-5_PERSONAL_DETAILS_SCREEN - STEPS SKIPPED");
            // throw new SkipException("Skipping this exception");

        }

		try {
            Thread.sleep(3000);
            Boolean isPresent = driver.findElement(By.xpath("//p[text()=' Enter your bank information here; once the fixed deposit maturity date has passed, the maturity amount will be processed using the same account.']")).isDisplayed();
            Thread.sleep(3000);
            if (isPresent) {
            	
            	Pre_Execution_Fd.bankDetailsScreen(accNo, confirmacc, ifscode, accountType, accName, cheque);
            	
                System.out.println("STAGE-6_BANK_DETAILS_SCREEN - COMPLETED");
            } else {
                System.out.println("STAGE-6_BANK_DETAILS_SCREEN - STEPS SKIPPED");
                // throw new SkipException("Skipping this exception");
            }
        }

        catch (SkipException e) {
            // TODO Auto-generated catch block
            System.out.println("STAGE-6_BANK_DETAILS_SCREEN - STEPS SKIPPED");
            // throw new SkipException("Skipping this exception");

        }

		try {
            Thread.sleep(3000);
            Boolean isPresent = driver.findElement(By.xpath("//h3[text()='Do you want the tax to be deducted ? ']")).isDisplayed();
            Thread.sleep(3000);
            if (isPresent) {
            	
            	Pre_Execution_Fd.additionalDetailsScreen(OccupationType, maritalstatus, fathername);
            	
                System.out.println("STAGE-7_ADDITIONAL_DETAILS_SCREEN - COMPLETED");
            } else {
                System.out.println("STAGE-7_ADDITIONAL_DETAILS_SCREEN - STEPS SKIPPED");
                // throw new SkipException("Skipping this exception");
            }
        }

        catch (SkipException e) {
            // TODO Auto-generated catch block
            System.out.println("STAGE-7_ADDITIONAL_DETAILS_SCREEN - STEPS SKIPPED");
            // throw new SkipException("Skipping this exception");

        }

		

	}
}
