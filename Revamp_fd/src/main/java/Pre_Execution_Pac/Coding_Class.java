package Pre_Execution_Pac;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Iteration.Excel_Utility;
import LibGlobal.BaseClass;
import X_paths.Additional_Details_Xpaths;
import X_paths.Bank_Details_Xpaths;
import X_paths.Ckyc_Xpaths;
import X_paths.Guardian_Ckyc_xpaths;
import X_paths.Guardian_Personal_Details_Xpaths;
import X_paths.LandingPage_Xpaths;
import X_paths.Minor_Pan_Xpaths;
import X_paths.Pan_Details_Xpaths;
import X_paths.Payment_Failure_Xpaths;
import X_paths.PennyDrop_Xpaths;
import X_paths.Personal_Details_Xpaths;
import X_paths.SchemeDetails_Xpaths;
import X_paths.Star_Xpaths;

public class Coding_Class extends BaseClass{
	
	
	  static LandingPage_Xpaths lp;
	    static SchemeDetails_Xpaths scheme;

	    static Pan_Details_Xpaths pan;

	    static Minor_Pan_Xpaths minor;

	    static  Payment_Failure_Xpaths PF;

	    static Star_Xpaths s;

	    static Guardian_Ckyc_xpaths gaurd;

	    static Guardian_Personal_Details_Xpaths gpd;

	    static Ckyc_Xpaths ck;

	    static Personal_Details_Xpaths pr;

	    static Bank_Details_Xpaths bd;

	    static PennyDrop_Xpaths penny;

	    static Additional_Details_Xpaths ad;

	    public static void Landing_Page(String MobileNo, String PinCode, String EmailID,
	                                    String VerifyOtp, String INDEX, String Iteration, ExtentTest test) throws Exception {

	        try {
	            lp = new LandingPage_Xpaths();

	            Thread.sleep(1500);

	            waitSendKeys(lp.getMobileNo(), MobileNo);

	            waitSendKeys(lp.getPinCode(), PinCode);

	            waitSendKeys(lp.getEmailID(), EmailID);

	            btnClick(lp.getInvest_now_button());

	            waitSendKeys(lp.getVerifyOtp(), VerifyOtp);

	            btnClick(lp.getVerifyOtpSubmit());


	            boolean displayed = lp.getGetNewCustomer().isDisplayed();
	            if (displayed) {

	                btnClick(lp.getGetNewCustomer());

	            }


	        } catch (Exception e) {
	            System.out.println(e);
	            int parseInt = Integer.parseInt(INDEX);
	            Excel_Utility.writeinexcel("FAIL", parseInt);
	            String s = Iteration;
	            String ss = e + "Landing Page Fail in";
	            String concat = ss.concat(s);
	            Excel_Utility.writeinexcelForReasons(concat, parseInt);
	            String s5 = "Fixed Deposit Journey isn't  Completed in Landing page      ";
	            String concat2 = s5.concat(s);
	            test.log(LogStatus.FAIL, concat2);
	            failScreenCapture();
	        }

	    }

	    public static void Scheme_Page(String Amount_input_fd, String Tenure_input_fd,
	                                   String Select_Interest_Payout, String INDEX,
	                                   String Iteration, ExtentTest test) throws Exception {

	        try {

	            scheme = new SchemeDetails_Xpaths();

	            waitClear(scheme.getAmount_input_fd());

	            waitSendKeys(scheme.getAmount_input_fd(), Amount_input_fd);

	            waitSendKeys(scheme.getAmount_input_fd(), String.valueOf(Keys.ENTER));

//	            Thread.sleep(2000);
	//
//	            btnClick(scheme.getTenure_info());

//	            Thread.sleep(2000);
	//
//	            btnClick(scheme.getTenure_info_done());

	            Thread.sleep(2000);

	            waitClear(scheme.getTenure_input_fd());

	            Thread.sleep(2000);

	            waitSendKeys(scheme.getTenure_input_fd(), Tenure_input_fd);

	            Thread.sleep(2000);

	            waitSendKeys(scheme.getTenure_input_fd(), String.valueOf(Keys.ENTER));

	            Thread.sleep(2000);


//	            btnClick(scheme.getSelect_Interest_Payout_Info());

	            Thread.sleep(2000);


//	            btnClick(scheme.getSelect_Interest_Payout_Info_done());
	//
//	            Thread.sleep(2000);


	            selectOptionByText(scheme.getSelect_Interest_Payout(), Select_Interest_Payout);

	            Thread.sleep(2000);


//	            btnClick(scheme.getSenior_citizen_info());

//	            Thread.sleep(2000);


//	            btnClick(scheme.getSenior_citizen_info_done());
	//
//	            Thread.sleep(2000);


//	            btnClick(scheme.getMaturity_info());
	//
//	            Thread.sleep(2000);


//	            btnClick(scheme.getMaturity_info_done());
	//
	//
//	            Thread.sleep(2000);


//	            btnClick(scheme.getPoppular_picks_info());
	//
//	            Thread.sleep(2000);

//	            btnClick(scheme.getPoppular_picks_info_done());

	            Thread.sleep(2000);

	            scrollDown(scheme.getApply_investbtn());

	            Thread.sleep(2000);

	            btnClick(scheme.getApply_investbtn());


	        } catch (Exception e) {
	            System.out.println(e);
	            int parseInt = Integer.parseInt(INDEX);
	            Excel_Utility.writeinexcel("FAIL", parseInt);
	            String s = Iteration;
	            String ss = e + "Scheme detail Page Fail in";
	            String concat = ss.concat(s);
	            Excel_Utility.writeinexcelForReasons(concat, parseInt);
	            String s5 = "Fixed Deposit Journey isn't  Completed in scheme details page      ";
	            String concat2 = s5.concat(s);
	            test.log(LogStatus.FAIL, concat2);
	            failScreenCapture();

	        }

	    }

	    public static void Pan_details_Page(String S1_depositorPAN, String S1_depositorMName,
	                                        String S1_depositorEmail, String INDEX,
	                                        String Iteration, ExtentTest test) throws Exception {

	        try {

	            pan = new Pan_Details_Xpaths();

	            waitSendKeys(pan.getS1_depositorPAN(), S1_depositorPAN);

	            Thread.sleep(10000);

	            waitSendKeys(pan.getS1_depositorMName(), S1_depositorMName);

	            Thread.sleep(2000);

	            waitSendKeys(pan.getS1_depositorEmail(), S1_depositorEmail);

	            Thread.sleep(2000);

	            scrollDown(pan.getProceed_Button());

	            Thread.sleep(2000);

	            btnClick(pan.getProceed_Button());


	        } catch (Exception e) {
	            System.out.println(e);
	            int parseInt = Integer.parseInt(INDEX);
	            Excel_Utility.writeinexcel("FAIL", parseInt);
	            String s = Iteration;
	            String ss = e + "PAN detail Page Fail in";
	            String concat = ss.concat(s);
	            Excel_Utility.writeinexcelForReasons(concat, parseInt);
	            String s5 = "Fixed Deposit Journey isn't  Completed in Pan details page      ";
	            String concat2 = s5.concat(s);
	            test.log(LogStatus.FAIL, concat2);
	            failScreenCapture();

	        }
	    }

	    public static void Guardian_Pan_Page(String S1_depositorGuardianPAN, String S1_depositorGuardianMName,
	                                         String S1_depositorGuardianEmail,
	                                         String INDEX, String Iteration, ExtentTest test) throws Exception {

	        try {
	            minor = new Minor_Pan_Xpaths();

	            waitSendKeys(minor.getS1_depositorGuardianPAN(), S1_depositorGuardianPAN);

	            Thread.sleep(10000);

	            btnClick(minor.getGuardian_Edit());

	            waitSendKeys(minor.getS1_depositorGuardianMName(), S1_depositorGuardianMName);

	            waitSendKeys(minor.getS1_depositorGuardianEmail(), S1_depositorGuardianEmail);

	            scrollDown(minor.getStep_gar_btn_1());
	            btnClick(minor.getStep_gar_btn_1());


	        } catch (Exception e) {
	            System.out.println(e);
	            int parseInt = Integer.parseInt(INDEX);
	            Excel_Utility.writeinexcel("FAIL", parseInt);
	            String s = Iteration;
	            String ss = e + "Guardian PAN  Page Fail in";
	            String concat = ss.concat(s);
	            Excel_Utility.writeinexcelForReasons(concat, parseInt);
	            String s5 = "Fixed Deposit Journey isn't  Completed in Guardian  page      ";
	            String concat2 = s5.concat(s);
	            test.log(LogStatus.FAIL, concat2);
	            failScreenCapture();

	        }

	    }
	    public static void Failure_Screen(String INDEX, String Iteration,ExtentTest test) throws Exception {

	        try {
	            PF=new Payment_Failure_Xpaths();

	            pan = new Pan_Details_Xpaths();

	            scheme = new SchemeDetails_Xpaths();

	            btnClick(PF.getTrans_error_pop());

	            btnClick(PF.getModalerror_btn());

	            btnClick(PF.getRetrypopkyc());

	            btnClick(pan.getTermsAndConditions());

	            btnClick(pan.getGotIt());

	            btnClick(pan.getDeposit_Summary_Edit());

	            scrollDown(scheme.getApply_investbtn2());
	            btnClick(scheme.getApply_investbtn2());

	            btnClick(pan.getDepositorTC());

	            btnClick(pan.getGotIt());

	            btnClick(pan.getFailurekyc_pop());

	            scrollDown(pan.getNetBanking());
	            btnClick(pan.getNetBanking());

	            btnClick(pan.getHDFC());

	            btnClick(pan.getPAY());

	            btnClick(pan.getSucessful());

	        } catch (Exception e) {

	            System.out.println(e);
	            int parseInt = Integer.parseInt(INDEX);
	            Excel_Utility.writeinexcel("FAIL", parseInt);
	            String s = Iteration;
	            String ss = e + "Payment detail Page Fail in";
	            String concat = ss.concat(s);
	            Excel_Utility.writeinexcelForReasons(concat, parseInt);
	            String s5 = "Fixed Deposit Journey isn't  Completed in Payment screen       ";
	            String concat2 = s5.concat(s);
	            test.log(LogStatus.FAIL, concat2);
	            failScreenCapture();

	        }


	    }

	    public static void Payment_Screen(String INDEX, String Iteration, ExtentTest test) throws Exception {

	        try {

	            pan = new Pan_Details_Xpaths();

	            scheme = new SchemeDetails_Xpaths();

	            btnClick(pan.getTermsAndConditions());

	            btnClick(pan.getGotIt());

	            btnClick(pan.getDeposit_Summary_Edit());

	            scrollDown(scheme.getApply_investbtn2());
	            btnClick(scheme.getApply_investbtn2());

	            btnClick(pan.getDepositorTC());

	            btnClick(pan.getGotIt());

	            btnClick(pan.getFailurekyc_pop());

	            scrollDown(pan.getNetBanking());
	            btnClick(pan.getNetBanking());

	            btnClick(pan.getHDFC());

	            btnClick(pan.getPAY());

	            btnClick(pan.getSucessful());


	        } catch (Exception e) {
	            System.out.println(e);
	            int parseInt = Integer.parseInt(INDEX);
	            Excel_Utility.writeinexcel("FAIL", parseInt);
	            String s = Iteration;
	            String ss = e + "Payment detail Page Fail in";
	            String concat = ss.concat(s);
	            Excel_Utility.writeinexcelForReasons(concat, parseInt);
	            String s5 = "Fixed Deposit Journey isn't  Completed in Payment screen       ";
	            String concat2 = s5.concat(s);
	            test.log(LogStatus.FAIL, concat2);
	            failScreenCapture();

	        }

	    }



	    public static void Congragulations_screen(String INDEX, String Iteration, ExtentTest test) throws Exception {

	        try {

	            Thread.sleep(5000);
	            s = new Star_Xpaths();

	            btnClick(s.getStar());

	            btnClick(s.getPaymentSuccess());


	        } catch (Exception e) {
	            System.out.println(e);
	            int parseInt = Integer.parseInt(INDEX);
	            Excel_Utility.writeinexcel("FAIL", parseInt);
	            String s = Iteration;
	            String ss = "Congragulations screen Fail in";
	            String concat = ss.concat(s);
	            Excel_Utility.writeinexcelForReasons(concat, parseInt);
	            String s5 = "Fixed Deposit Journey isn't  Completed in Congratulations  page      ";
	            String concat2 = s5.concat(s);
	            test.log(LogStatus.FAIL, concat2);
	            failScreenCapture();

	        }


	    }


	    public static void Gaurdian_Ckyc_fail(String Guard_Documenttype, String Guard_DocumentNo,
	                                          String Guard_up_ckyc_frontpic,
	                                          String Guard_up_ckyc_backpic,
	                                          String INDEX, String Iteration, ExtentTest test) throws Exception {

	        try {
	            gaurd = new Guardian_Ckyc_xpaths();

	            selectOptionByText(gaurd.getGuard_Documenttype(),Guard_Documenttype);

	            waitSendKeys(gaurd.getGuard_DocumentNo(), Guard_DocumentNo);

	            WebElement guard_up_ckyc_frontpic = gaurd.getGuard_up_ckyc_frontpic();
	            guard_up_ckyc_frontpic.sendKeys(Guard_up_ckyc_frontpic);

	            WebElement guard_up_ckyc_backpic = gaurd.getGuard_up_ckyc_backpic();
	            guard_up_ckyc_backpic.sendKeys( Guard_up_ckyc_backpic);

	            Thread.sleep(3000);

	           btnClick(gaurd.getGuard_img_preview());

	           btnClick(gaurd.getPreview_img_done());

	            btnClick(gaurd.getStep_btn_upload_guardian());


	        } catch (Exception e) {
	            System.out.println(e);
	            int parseInt = Integer.parseInt(INDEX);
	            Excel_Utility.writeinexcel("FAIL", parseInt);
	            String s = Iteration;
	            String ss = "Guardian CKYC  detail Page Fail in";
	            String concat = ss.concat(s);
	            Excel_Utility.writeinexcelForReasons(concat, parseInt);
	            String s5 = "Fixed Deposit Journey isn't  Completed in Guardian_CKYC_Fail page      ";
	            String concat2 = s5.concat(s);
	            test.log(LogStatus.FAIL, concat2);
	            failScreenCapture();


	        }
	    }

	    public static void Gaurdian_Personal_details_Page(String S3_guard_addrline1, String S3_guard_addrline2,
	                                                      String S3_guard_pincode, String Guardian_photo,
	                                                      String INDEX, String Iteration, ExtentTest test) throws Exception {

	        try {

	            gpd = new Guardian_Personal_Details_Xpaths();

	            scrollDown(gpd.getGd_reference());

	            scrollDown(gpd.getGdAddress_Edit());

	            btnClick(gpd.getGdAddress_Edit());

	            waitSendKeys(gpd.getS3_guard_addrline1(), S3_guard_addrline1);

	            waitSendKeys(gpd.getS3_guard_addrline2(), S3_guard_addrline2);

	            waitSendKeys(gpd.getS3_guard_pincode(), S3_guard_pincode);

	            scrollUp(gpd.getGuardian_photo());

	            WebElement guardian_photo = gpd.getGuardian_photo();
	            guardian_photo.sendKeys(Guardian_photo);

	            scrollDown(gpd.getStep_btn_guardian());
	            btnClick(gpd.getStep_btn_guardian());


	        } catch (Exception e) {
	            System.out.println(e);
	            int parseInt = Integer.parseInt(INDEX);
	            Excel_Utility.writeinexcel("FAIL", parseInt);
	            String s = Iteration;
	            String ss = "Guardian Personal detail Page Fail in";
	            String concat = ss.concat(s);
	            Excel_Utility.writeinexcelForReasons(concat, parseInt);
	            String s5 = "Fixed Deposit Journey isn't  Completed in Guardian Personal detail page      ";
	            String concat2 = s5.concat(s);
	            test.log(LogStatus.FAIL, concat2);
	            failScreenCapture();

	        }

	    }

	    public static void Ckyc_Fail_Page(String Documenttype, String INDEX,
	                                      String DocumentNo, String ckyc_frontpic,
	                                      String ckyc_backpic, String Iteration, ExtentTest test) throws Exception {

	        try {

	            ck = new Ckyc_Xpaths();

	            selectOptionByText(ck.getDocumenttype(), Documenttype);

	            waitSendKeys(ck.getDocumentNo(), DocumentNo);

	            Thread.sleep(3000);

	            WebElement up_ckyc_frontpic = ck.getUp_ckyc_frontpic();
	            up_ckyc_frontpic.sendKeys(ckyc_frontpic);

//	            waitSendKeys(ck.getUp_ckyc_frontpic(), ckyc_frontpic);

	            Thread.sleep(3000);

	            WebElement up_ckyc_backpic = ck.getUp_ckyc_backpic();
	            up_ckyc_backpic.sendKeys(ckyc_backpic);

//	            waitSendKeys(ck.getUp_ckyc_backpic(), ckyc_backpic);

	            Thread.sleep(3000);
	            WebElement depInv_img_preview = ck.getDepInv_img_preview();
	            scrollDown(depInv_img_preview);
	            depInv_img_preview.click();

	            WebElement dep_preview_img_done = ck.getDep_preview_img_done();
	            dep_preview_img_done.click();

//	            scrollDown(ck.getStep_btn_2());
	            btnClick(ck.getStep_btn_2());

	        } catch (Exception e) {
	            System.out.println(e);
	            int parseInt = Integer.parseInt(INDEX);
	            Excel_Utility.writeinexcel("FAIL", parseInt);
	            String s = Iteration;
	            String ss = "Depositor CKYC Page Fail in";
	            String concat = ss.concat(s);
	            Excel_Utility.writeinexcelForReasons(concat, parseInt);
	            String s5 = "Fixed Deposit Journey isn't  Completed in Depositor page      ";
	            String concat2 = s5.concat(s);
	            test.log(LogStatus.FAIL, concat2);
	            failScreenCapture();

	        }

	    }

	    public static void Personal_Details_Page(String Documenttype, String DocumentNo, String Up_ckyc_frontpic,
	                                             String Up_ckyc_backpic, String S3_addrline1, String S3_addrline2,
	                                             String S3_pincode, String Profie_Upload, String INDEX,
	                                             String Iteration, ExtentTest test) throws Exception {
	        try {
	            pr = new Personal_Details_Xpaths();

	            scrollDown(pr.getAddress_Edit());


	            btnClick(pr.getAddress_Edit());
	            scrollDown(pr.getS3_addrline1());


	            waitSendKeys(pr.getS3_addrline1(), S3_addrline1);


	            waitSendKeys(pr.getS3_addrline2(), S3_addrline2);


	            scrollUp(pr.getInvestor_photo());
	            Thread.sleep(2000);
	            WebElement investor_photo = pr.getInvestor_photo();
	            investor_photo.sendKeys(Profie_Upload);

	            scrollDown(pr.getStep_btn_3());
	            btnClick(pr.getStep_btn_3());

	        } catch (Exception e) {
	            System.out.println(e);
	            int parseInt = Integer.parseInt(INDEX);
	            Excel_Utility.writeinexcel("FAIL", parseInt);
	            String s = Iteration;
	            String ss = "Depositor detail Page Fail in";
	            String concat = ss.concat(s);
	            Excel_Utility.writeinexcelForReasons(concat, parseInt);
	            String s5 = "Fixed Deposit Journey isn't  Completed in Landing page      ";
	            String concat2 = s5.concat(s);
	            test.log(LogStatus.FAIL, concat2);
	            failScreenCapture();

	        }
	    }


	    public static void Bank_Page(String S4_accountno, String S4_confaccountno,
	                                 String Banknn, String Bal, String Ifsccodes,
	                                 String S4_acctype, String S4_accholdername,
	                                 String INDEX, String Iteration, String OcrChkUpload, ExtentTest test) throws Exception {

	        try {
	            bd = new Bank_Details_Xpaths();

	            waitSendKeys(bd.getS4_accountno(), S4_accountno);

	            waitSendKeys(bd.getS4_confaccountno(), S4_confaccountno);

	            btnClick(bd.getInfo_Icon());

	            btnClick(bd.getInfo_done());

	            btnClick(bd.getDont_Know_IFSC());

	            waitSendKeys(bd.getBanknn(), Banknn);

	            waitSendKeys(bd.getBal(), Bal);

	            btnClick(bd.getIfsc_code_search());

	            waitSendKeys(bd.getIfsccodes(), Ifsccodes);

	            selectOptionByText(bd.getS4_acctype(), S4_acctype);

	            btnClick(bd.getLabelAccName());

	            waitSendKeys(bd.getS4_accholdername(), S4_accholdername);

	            penny = new PennyDrop_Xpaths();

	            Thread.sleep(5000);
	            PennyDrop_Xpaths penny = new PennyDrop_Xpaths();
	            boolean displayed10 = penny.getOcr_Page().isDisplayed();
	            System.out.println(displayed10);

	            if (displayed10) {

	                WebElement ocrChkUpload = penny.getOcrChkUpload();
	                ocrChkUpload.sendKeys(OcrChkUpload);
	            }
	            Thread.sleep(7000);
	            scrollDown(penny.getStep_btn_5());
	            WebElement step_btn_5 = penny.getStep_btn_5();
	            step_btn_5.click();

	        } catch (Exception e) {
	            System.out.println(e);
	            int parseInt = Integer.parseInt(INDEX);
	            Excel_Utility.writeinexcel("FAIL", parseInt);
	            String s = Iteration;
	            String ss = "Bank detail Page Fail in";
	            String concat = ss.concat(s);
	            Excel_Utility.writeinexcelForReasons(concat, parseInt);
	            String s5 = "Fixed Deposit Journey isn't  Completed in Bank page      ";
	            String concat2 = s5.concat(s);
	            test.log(LogStatus.FAIL, concat2);
	            failScreenCapture();

	        }
	    }

	    public static void Additonal_Details_page(String S5_Occupation, String S5_Marital, String S5_Maturity_ins,
	                                              String S5_spouseName, String S5_fatherName, String TDS_Certificate,
	                                              String S5_FinancialYear, String S5_EstimatedIncome,
	                                              String S5_esttotincome, String S5_formsfilled, String S5_AggregateAmount,
	                                              String Add_Nominee, String S5_nomineeRelation, String S5_nomineetitle,
	                                              String s5_nomineeFname, String S5_nomineeFname, String S5_nomineeLname,
	                                              String S5_nomineeDOB, String Nominee_address_same_as_Applicant_address,
	                                              String S5_nomadd1, String S5_nomadd2, String S5_nomarea,
	                                              String S5_nomcity, String S5_nomstate, String S5_nompincode, String INDEX,
	                                              String S5_othersNmae, String Others, String Spouse,
	                                              String Marital_Click, String Iteration, ExtentTest test) throws Exception {

	        try {

	            ad = new Additional_Details_Xpaths();

	            btnClick(ad.getS5_Occupation());

	            waitSendKeys(ad.getInput_occupation(), S5_Occupation);

	            waitSendKeys(ad.getInput_occupation(), String.valueOf(Keys.ENTER));


	            String sss = Others;
	            if (sss.equals("Yes")) {

	                waitSendKeys(ad.getS5_othersNmae(), S5_othersNmae);

	            }

	            btnClick(ad.getS5_Marital());

	            String ss = Marital_Click;
	            if (ss.equals("Yes")) {

	                waitSendKeys(ad.getMarital_input(), S5_Marital);
	                waitSendKeys(ad.getMarital_input(), String.valueOf(Keys.ARROW_DOWN));
	                waitSendKeys(ad.getMarital_input(), String.valueOf(Keys.ENTER));


	            } else {
	                waitSendKeys(ad.getMarital_input(), S5_Marital);
	                waitSendKeys(ad.getMarital_input(), String.valueOf(Keys.ARROW_DOWN));
	                waitSendKeys(ad.getMarital_input(), String.valueOf(Keys.ARROW_DOWN));
	                waitSendKeys(ad.getMarital_input(), String.valueOf(Keys.ENTER));
	            }

	            btnClick(ad.getS5_Maturity_ins());

	            waitSendKeys(ad.getMaturityins_input(), S5_Maturity_ins);

	            waitSendKeys(ad.getMaturityins_input(), String.valueOf(Keys.ENTER));

	            String s = Spouse;

	            if (s.equals("Yes")) {

	                waitSendKeys(ad.getS5_spouseName(), S5_spouseName);

	            }

	            waitSendKeys(ad.getS5_fatherName(), S5_fatherName);


	            String s1 = TDS_Certificate;
	            System.out.println(TDS_Certificate);

	            if (s1.equals("Yes")) {

	                scrollDown(ad.getTds_show());
	                btnClick(ad.getTds_show());

	                btnClick(ad.getS5_FinancialYear());

	                selectOptionByText(ad.getS5_FinancialYear(), S5_FinancialYear);

	                waitSendKeys(ad.getS5_EstimatedIncome(), S5_EstimatedIncome);

	                waitSendKeys(ad.getS5_esttotincome(), S5_esttotincome);

	                scrollDown(ad.getS5_formsfilled());
	                waitSendKeys(ad.getS5_formsfilled(), S5_formsfilled);

	                waitSendKeys(ad.getS5_AggregateAmount(), S5_AggregateAmount);

	            }
	//
//	                Thread.sleep(1500);
//	                String text = Add_Nominee;
//	                if (text.equals("Yes")) {
	//
//	                    WebElement nomineeshow = ad.getNomineeshow();
//	                    lib.btnClick(nomineeshow);
	//
//	                    Thread.sleep(1500);
//					    WebElement s5_nomineeRelation1 = ad.getS5_nomineeRelation();
//					    lib.scrollDown(s5_nomineeRelation1);
//	                    lib.btnClick(s5_nomineeRelation1);
	//
//	                    Thread.sleep(1500);
//	                    WebElement input_n_relation = ad.getInput_N_relation();
//	                    input_n_relation.sendKeys(S5_nomineeRelation);
//	                    input_n_relation.sendKeys(Keys.ENTER);
	//
//	                    WebElement s5_nomineetitle = ad.getS5_nomineetitle();
//	                    lib.btnClick(s5_nomineetitle);
	//
//	                    WebElement input_n_title = ad.getInput_n_title();
//	                    input_n_title.sendKeys(S5_nomineetitle);
//	                    input_n_title.sendKeys(Keys.ENTER);
	//
//	                    Thread.sleep(1500);
//					    WebElement s5_nomineeFname1 = ad.getS5_nomineeFname();
//					    s5_nomineeFname1.sendKeys(s5_nomineeFname);
	//
//	                    Thread.sleep(1500);
//					    WebElement s5_nomineeMname1 = ad.getS5_nomineeMname();
//					    s5_nomineeMname1.sendKeys(S5_nomineeFname);
	//
	//
	//
//	                }
//	            }
	//
	//
//					Thread.sleep(1500);
//					WebElement s5_nomineeLname1 = ad.getS5_nomineeLname();
//					s5_nomineeLname1.sendKeys(S5_nomineeLname);
	//
//					Thread.sleep(1000);
//					WebElement s5_nomineeDOB1 = ad.getS5_nomineeDOB();
//					s5_nomineeDOB1.sendKeys(S5_nomineeDOB);
//				}
//				String same_Nominee = Nominee_address_same_as_Applicant_address;
	//
//				if (same_Nominee.equals("No")) {
	//
//					Thread.sleep(2000);
//					WebElement nomineeaddshow = ad.getNomineeaddshow();
//					lib.scrollDown(nomineeaddshow);
//					lib.btnClick(nomineeaddshow);
	//
//					Thread.sleep(1500);
//					WebElement s5_nomadd11 = ad.getS5_nomadd1();
//					s5_nomadd11.sendKeys(S5_nomadd1);
//					Thread.sleep(1000);
	//
//					WebElement s5_nomadd22 = ad.getS5_nomadd2();
//					s5_nomadd22.sendKeys(S5_nomadd2);
	//
//					Thread.sleep(1500);
//					WebElement s5_nomarea1 = ad.getS5_nomarea();
//					s5_nomarea1.sendKeys(S5_nomarea);
	//
//					Thread.sleep(1000);
//					WebElement s5_nomcity1 = ad.getS5_nomcity();
//					s5_nomcity1.sendKeys(S5_nomcity);
	//
//					WebElement s5_nomstate1 = ad.getS5_nomstate();
//					s5_nomstate1.sendKeys(S5_nomstate);
	//
//					Thread.sleep(1500);
//					WebElement s5_nompincode1 = ad.getS5_nompincode();
//					s5_nompincode1.sendKeys(S5_nompincode);
//				}
	            Thread.sleep(3000);
	            scrollDown(ad.getStep_btn_6());
	            btnClick(ad.getStep_btn_6());


	        } catch (Exception e) {
	            System.out.println(e);
	            int parseInt = Integer.parseInt(INDEX);
	            Excel_Utility.writeinexcel("FAIL", parseInt);
	            String s = Iteration;
	            String ss = "Additonal detail Page Fail in";
	            String concat = ss.concat(s);
	            Excel_Utility.writeinexcelForReasons(concat, parseInt);
	            String s5 = "Fixed Deposit Journey isn't  Completed in Additional details  page      ";
	            String concat2 = s5.concat(s);
	            test.log(LogStatus.FAIL, concat2);
	            failScreenCapture();

	        }

	    }

}
