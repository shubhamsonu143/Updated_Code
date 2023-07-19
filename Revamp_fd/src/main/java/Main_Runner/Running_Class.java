package Main_Runner;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Iteration.Excel_Utility;
import LibGlobal.BaseClass;
import Pre_Execution_Pac.Coding_Class;
import X_paths.Additional_Details_Xpaths;
import X_paths.Bank_Details_Xpaths;
import X_paths.Ckyc_Xpaths;
import X_paths.Guardian_Ckyc_xpaths;
import X_paths.Guardian_Personal_Details_Xpaths;
import X_paths.Minor_Pan_Xpaths;
import X_paths.Pan_Details_Xpaths;
import X_paths.Payment_Failure_Xpaths;
import X_paths.Personal_Details_Xpaths;
import X_paths.SchemeDetails_Xpaths;
import X_paths.Star_Xpaths;

public class Running_Class extends BaseClass{
	
	
	 static ExtentReports report;
	    static ExtentTest test;

	    @DataProvider
	    public static Iterator<Object[]> getTestData() {
	        ArrayList<Object[]> dataFromExcel = Excel_Utility.getDataFromexcel();
	        return dataFromExcel.iterator();
	    }

	    @BeforeTest
	    public void ExtentReport() {

	        report = new ExtentReports("C:\\Users\\s2605\\IdeaProjects\\stfc-fd-automation\\untitled\\ExtentReport\\report.html");

	    }

	    @Test(dataProvider = "getTestData")
	    public void All_Pages(String INDEX, String Iteration, String MobileNo, String PinCode,
	                          String EmailID, String VerifyOtp ,String Amount_input_fd,
	                          String Tenure_input_fd, String Select_Interest_Payout,
	                          String S1_depositorPAN, String S1_depositorMName, String S1_depositorEmail,
	                          String Documenttype, String DocumentNo, String ckyc_frontpic,
	                          String ckyc_backpic, String S3_addrline1, String S3_addrline2,
	                          String S3_pincode, String Profie_Upload, String S1_depositorGuardianPAN,
	                          String S1_depositorGuardianMName, String S1_depositorGuardianEmail,
	                          String Guard_Documenttype, String Guard_DocumentNo,
	                          String Guard_up_ckyc_frontpic, String Guard_up_ckyc_backpic,
	                          String S3_guard_addrline1, String S3_guard_addrline2, String S3_guard_pincode,
	                          String Guardian_photo, String S4_accountno, String S4_confaccountno,
	                          String Banknn, String Bal, String Ifsccodes, String S4_acctype, String S4_accholdername,
	                          String OcrChkUpload, String S5_Occupation, String Others, String S5_othersNmae,
	                          String Marital_Click, String S5_Marital, String S5_Maturity_ins,
	                          String Marital_Status, String Spouse, String S5_spouseName, String S5_fatherName,
	                          String TDS_Certificate, String S5_FinancialYear,
	                          String S5_EstimatedIncome, String S5_esttotincome, String S5_formsfilled,
	                          String S5_AggregateAmount, String Add_Nominee, String S5_nomineeRelation,
	                          String S5_nomineetitle, String s5_nomineeFname, String S5_nomineeMname,
	                          String S5_nomineeLname, String S5_nomineeDOB,
	                          String Nominee_address_same_as_Applicant_address, String S5_nomadd1,
	                          String S5_nomadd2, String S5_nomarea, String S5_nomcity,
	                          String S5_nomstate, String S5_nompincode) throws Exception {



	            String s =Iteration;
	            String s2="Fixed Deposit journey started successfully  in   ";
	            String concat1 = s2.concat(s);
	            test=report.startTest(concat1);

	            launchBrowser("chrome");
	            loadUrl("https://uatfd.stfc.in/fixed-deposit-online-payment/?token=PWV1D3HRXvd3jD1d3bzgdc9kmoEmhNx2");


//	            Coding_Class.Landing_Page(MobileNo, PinCode, EmailID, VerifyOtp, INDEX, Iteration,test);

	            Thread.sleep(3000);
	            SchemeDetails_Xpaths scheme = new SchemeDetails_Xpaths();
	            boolean displayed = scheme.getScheme_Details_Page().isDisplayed();
	            System.out.println(displayed);

	            if (displayed) {


	                Coding_Class.Scheme_Page(Amount_input_fd, Tenure_input_fd, Select_Interest_Payout,
	                        INDEX, Iteration, test);
	            }

	            Thread.sleep(3000);
	            Pan_Details_Xpaths pan = new Pan_Details_Xpaths();
	            boolean displayed1 = pan.getCurrenStatge().isDisplayed();
	            System.out.println(displayed1);

	            if (displayed1) {

	                Coding_Class.Pan_details_Page(S1_depositorPAN, S1_depositorMName, S1_depositorEmail,
	                        INDEX, Iteration,test);
	            }

	            Thread.sleep(3000);
	            Minor_Pan_Xpaths minor = new Minor_Pan_Xpaths();
	            boolean displayed2 = minor.getGuardian_Flow().isDisplayed();
	            System.out.println(displayed2);

	            if (displayed2) {

	                Coding_Class.Guardian_Pan_Page(S1_depositorGuardianPAN, S1_depositorGuardianMName,
	                        S1_depositorGuardianEmail, INDEX, Iteration,test);

	            }

	            Payment_Failure_Xpaths PF=new Payment_Failure_Xpaths();
	            boolean displayed10 = PF.getPF_Screen().isDisplayed();
	            System.out.println(displayed10);
	            if(displayed10){

	              Coding_Class.Failure_Screen(INDEX,Iteration,test);

	            }

	            Thread.sleep(3000);
	            boolean displayed3 = pan.getStage2().isDisplayed();
	            System.out.println(displayed3);

	            if (displayed3) {

	                Coding_Class.Payment_Screen(INDEX, Iteration,test);

	            }

	            Thread.sleep(5000);
	            Star_Xpaths ss = new Star_Xpaths();
	            boolean displayed4 = ss.getCongragulations_Screen().isDisplayed();
	            System.out.println(displayed4);

	            if (displayed4) {

	                Coding_Class.Congragulations_screen(INDEX, Iteration,test);
	            }

	            Thread.sleep(3000);
	            Guardian_Ckyc_xpaths gdf = new Guardian_Ckyc_xpaths();
	            boolean displayed5 = gdf.getGaurdian_CKYC_Fail_Page().isDisplayed();
	            System.out.println(displayed5);

	            if (displayed5) {
	                Coding_Class.Gaurdian_Ckyc_fail(Guard_Documenttype, Guard_DocumentNo,
	                        Guard_up_ckyc_frontpic, Guard_up_ckyc_backpic, INDEX, Iteration,test);
	            }

	            Thread.sleep(3000);
	            Guardian_Personal_Details_Xpaths gd = new Guardian_Personal_Details_Xpaths();
	            boolean displayed6 = gd.getGaurdian_Pd_Page().isDisplayed();
	            System.out.println(displayed6);

	            if (displayed6) {

	                Coding_Class.Gaurdian_Personal_details_Page(S3_guard_addrline1, S3_guard_addrline2,
	                        S3_guard_pincode, Guardian_photo, INDEX, Iteration,test);

	            }

	            Thread.sleep(3000);
	            Ckyc_Xpaths ck = new Ckyc_Xpaths();
	            boolean displayed7 = ck.getCKYC_fail().isDisplayed();
	            System.out.println(displayed7);

	            if (displayed7) {

	                Coding_Class.Ckyc_Fail_Page(Documenttype, INDEX, DocumentNo,
	                        ckyc_frontpic, ckyc_backpic, Iteration,test);

	            }

	            Thread.sleep(3000);
	            Personal_Details_Xpaths pd = new Personal_Details_Xpaths();
	            boolean displayed8 = pd.getPersonalDetails().isDisplayed();
	            System.out.println(displayed8);

	            if (displayed8) {

	                Coding_Class.Personal_Details_Page(Documenttype, DocumentNo,
	                        ckyc_frontpic, ckyc_backpic, S3_addrline1, S3_addrline2,
	                        S3_pincode, Profie_Upload, INDEX, Iteration,test);
	            }

	            Thread.sleep(3000);
	            Bank_Details_Xpaths bd = new Bank_Details_Xpaths();
	            boolean displayed9 = bd.getBankDetails().isDisplayed();
	            System.out.println(displayed9);

	            if (displayed9) {

	                Coding_Class.Bank_Page(S4_accountno, S4_confaccountno, Banknn,
	                        Bal, Ifsccodes, S4_acctype, S4_accholdername, INDEX, Iteration, OcrChkUpload,test);
	            }

	            Thread.sleep(3000);
	            Additional_Details_Xpaths ad = new Additional_Details_Xpaths();
	            boolean displayed11 = ad.getStage_Final().isDisplayed();
	            System.out.println(displayed11);
	            if (displayed11) {

	                Coding_Class.Additonal_Details_page(S5_Occupation, S5_Marital, S5_Maturity_ins,
	                        S5_spouseName, S5_fatherName, TDS_Certificate, S5_FinancialYear,
	                        S5_EstimatedIncome, S5_esttotincome, S5_formsfilled, S5_AggregateAmount,
	                        Add_Nominee, S5_nomineeRelation, S5_nomineetitle, s5_nomineeFname,
	                        S5_nomineeMname, S5_nomineeLname, S5_nomineeDOB,
	                        Nominee_address_same_as_Applicant_address, S5_nomadd1,
	                        S5_nomadd2, S5_nomarea, S5_nomcity, S5_nomstate, S5_nompincode,
	                        INDEX, S5_othersNmae, Others, Spouse, Marital_Click, Iteration,test);
	            }

	            Thread.sleep(10000);
	            int parseInt = Integer.parseInt(INDEX);
	            Excel_Utility.writeinexcel("PASS", parseInt);
	            String s1 = "Fixed Deposit Journey is  Completed Successfully in";
	            String concat = s1.concat(s);
	            Excel_Utility.writeinexcelForReasons(concat, parseInt);
	            passScreenCapture();
	            String s5="Fixed Deposit Journey Completed Successfully in     ";
	            String concat2 = s5.concat(s);
	            test.log(LogStatus.PASS,concat2);
	            quitBrowser();

	    }

	    @AfterTest
	    public void tearDown() {
	        report.endTest(test);
	        report.flush();

	    }

	
	
	 	

}
