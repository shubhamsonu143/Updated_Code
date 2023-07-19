package com.demo.Cucuc;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import BasePackage.BaseCodes;
import X_Paths.Deposit_Summary_Page;
import X_Paths.Guardian_Pan;
import X_Paths.Landing_Page;
import X_Paths.Minor_Pan_Details_Page;
import X_Paths.SchemeDeatilsPage;
import io.cucumber.java.en.*;

public class StepDefinition extends BaseCodes {

	@Given("User Landing the STFC Website")
	public void user_landing_the_stfc_website() {
		try {
			if (Constants.URL_VERIFY.contains(getCurrentUrl())) {
				String currentUrl = getCurrentUrl();
				System.out.println(currentUrl + "Url verified Successfully");

			} else {
				System.out.println("Url is mismatch ");

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@When("user entered the mobile number as {string} and Pincode as {string} and Emailid as {string}")
	public void user_entered_the_mobile_number_as_and_pincode_as_and_emailid_as(String MobileNumber, String Pincode,
			String MailId) {
		try {
			highLightWebElements(Landing_Page.getInstance().getMobileNumber());
			sendKeys(Landing_Page.getInstance().getMobileNumber(), MobileNumber);

			highLightWebElements(Landing_Page.getInstance().getPincode());
			sendKeys(Landing_Page.getInstance().getPincode(), Pincode);

			highLightWebElements(Landing_Page.getInstance().getEmailId());
			sendKeys(Landing_Page.getInstance().getEmailId(), MailId);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@When("User click the InvestNow  button")
	public void user_click_the_invest_now_button() {

		try {
			btnClick(Landing_Page.getInstance().getInvest_now_button());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Then("User should see the Verify OTP Field")
	public void user_should_see_the_verify_otp_field() throws Exception {
		try {
			Thread.sleep(5000);

			if (Landing_Page.getInstance().getVerifyOtp().isDisplayed()) {

				System.out.println("OTP field is Displayed");

			} else {
				System.out.println("OTP field is  not Displayed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Given("User landing the STFC Website1")
	public void user_landing_the_stfc_website1() {
		try {
			if (Constants.URL_VERIFY.contains(getCurrentUrl())) {
				String currentUrl = getCurrentUrl();
				System.out.println(currentUrl);
				System.out.println("Url verified Successfully");

			} else {
				System.out.println("Url is mismatch ");

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@When("User Eneterd the Invalid Mobile number as {string} and pincode as {string} and Emailid as {string}")
	public void user_eneterd_the_invalid_mobile_number_as_and_pincode_as_and_emailid_as(String MobileNumber,
			String Pincode, String MailId) {
		try {
			highLightWebElements(Landing_Page.getInstance().getMobileNumber());
			sendKeys(Landing_Page.getInstance().getMobileNumber(), MobileNumber);

			highLightWebElements(Landing_Page.getInstance().getPincode());
			sendKeys(Landing_Page.getInstance().getPincode(), Pincode);

			highLightWebElements(Landing_Page.getInstance().getEmailId());
			sendKeys(Landing_Page.getInstance().getEmailId(), MailId);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@When("User click the InvestNow  button1")
	public void user_click_the_invest_now_button1() {

		try {
			btnClick(Landing_Page.getInstance().getInvest_now_button());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@And("user got the Error message")
	public void user_got_the_error_message() {

		try {
			String text = Landing_Page.getInstance().getMobile_Error().getText();

			if (Constants.MOBILE_NUMBER_ERROR_MSG.contains(text)) {

				System.out.println(text + "User got the error msg");

			} else {

				System.out.println("User couldn't get the error msg");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Then("User should not  see the Verify OTP Field")
	public void user_should_not_see_the_verify_otp_field() throws Exception {

		try {
			Thread.sleep(5000);

			if (Landing_Page.getInstance().getVerifyOtp().isDisplayed()) {

				System.out.println("OTP field is Displayed");

			} else {
				System.out.println("OTP field is  not Displayed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	/*
	*/
	@Given("user verify the Scheme detail Page")
	public void user_verify_the_scheme_detail_page() {

		try {
			if (SchemeDeatilsPage.getInstance().getScheme_Details_Page().isDisplayed()) {
				System.out.println("User In Scheme Details Page ");

			} else {
				System.out.println("User not in  Scheme Details Page ");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@When("user entered the Invest Amount as {string} and tenure input as {string} and select the interest payout as {string}")
	public void user_entered_the_invest_amount_as_and_tenure_input_as_and_select_the_interest_payout_as(
			String amountinputfd, String TenureInput, String InterestPayOut) {

		try {
			clear(SchemeDeatilsPage.getInstance().getAmount_input_fd());
			sendKeys(SchemeDeatilsPage.getInstance().getAmount_input_fd(), amountinputfd);
			keysSendKeys(SchemeDeatilsPage.getInstance().getAmount_input_fd(), Keys.ENTER);

			// btnClick(SchemeDeatilsPage.getInstance().getTenure_info());
			// btnClick(SchemeDeatilsPage.getInstance().getInfo_Done());

			clear(SchemeDeatilsPage.getInstance().getTenure_input_fd());
			sendKeys(SchemeDeatilsPage.getInstance().getTenure_input_fd(), TenureInput);
			keysSendKeys(SchemeDeatilsPage.getInstance().getTenure_input_fd(), Keys.ENTER);

			// btnClick(SchemeDeatilsPage.getInstance().getInterest_info());
			// btnClick(SchemeDeatilsPage.getInstance().getInterest_Done());

			dropDown(SchemeDeatilsPage.getInstance().getIntPayout(), "text", InterestPayOut);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@And("user click the InvestNowButton2")
	public void user_click_the_invest_now_button2() throws Exception {

		try {
			Thread.sleep(3000);
			btnClick(SchemeDeatilsPage.getInstance().getApply_investbtn());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Then("user should see the pan details Page")
	public void user_should_see_the_pan_details_page() {

		try {
			if (SchemeDeatilsPage.getInstance().getMinor_Pan_Page().isDisplayed()) {

				System.out.println("User entered the Pan Details Page Succesfully");

			} else {
				System.out.println("User doesn't entered the Pan Details Page Succesfully");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@When("user entered the Pan Number {string} and select the title as {string} and enter the FirstName as {string} and MiddleName as {string} and LastName as {string} and DOB as {string} and EmailId as {string}")
	public void user_entered_the_pan_number_and_select_the_title_as_and_enter_the_first_name_as_and_middle_name_as_and_last_name_as_and_dob_as_and_email_id_as(
			String MinorPan, String Title, String FirstName, String MiddleName, String LastName, String Minror_DOB,
			String EmailId) throws Exception {

		try {
			sendKeys(Minor_Pan_Details_Page.getInstance().getS1_depositorPAN(), MinorPan);

			Thread.sleep(5000);
			btnClick(Minor_Pan_Details_Page.getInstance().getEditBtn());
			dropDown(Minor_Pan_Details_Page.getInstance().getS1_depositortitle(), "text", Title);
			sendKeys(Minor_Pan_Details_Page.getInstance().getS1_depositorFName(), FirstName);
			sendKeys(Minor_Pan_Details_Page.getInstance().getS1_depositorMName(), MiddleName);
			sendKeys(Minor_Pan_Details_Page.getInstance().getS1_depositorLName(), LastName);
			sendKeys(Minor_Pan_Details_Page.getInstance().getS1_depositorDOB(), Minror_DOB);
			sendKeys(Minor_Pan_Details_Page.getInstance().getS1_depositorEmail(), EmailId);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@And("User click the ProceedButton")
	public void user_click_the_proceed_button() {

		try {
			scrollDown(Minor_Pan_Details_Page.getInstance().getMinor_Proceed());
			btnClick(Minor_Pan_Details_Page.getInstance().getMinor_Proceed());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@Given("user verify ,Whether it is a Guardian Pan Screen")
	public void user_verify_whether_it_is_a_guardian_pan_screen() {

		try {
			if (Guardian_Pan.getInstance().getGuardian_Page().isDisplayed()) {

				System.out.println("User is in Guardian Pan page ");

			} else {

				System.out.println("User couldn't see the Guardian Pan Page ");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@When("user entered the Guradian Pan as {string}")
	public void user_entered_the_guradian_pan_as(String GuradianPan) {

		try {
			sendKeys(Guardian_Pan.getInstance().getS1_depositorGuardianPAN(), GuradianPan);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	@When("user entered the guardTitle as {string} and FirstName as {string} and Middlename as {string} and LastName as {string} and DOB as {string} and Mailid as {string}")
	public void user_entered_the_guard_title_as_and_first_name_as_and_middlename_as_and_last_name_as_and_dob_as_and_mailid_as(
			String G_Title, String G_FName, String G_MName, String G_LName, String G_DOB, String EmailId) throws InterruptedException {

		try {
			Thread.sleep(3000);
			btnClick(Guardian_Pan.getInstance().getEdit_Gurad());
			dropDown(Guardian_Pan.getInstance().getS1_depositorGuardiantitle(), "text", G_Title);
			sendKeys(Guardian_Pan.getInstance().getS1_depositorGuardianFName(), G_FName);
			sendKeys(Guardian_Pan.getInstance().getS1_depositorGuardianMName(), G_MName);
			sendKeys(Guardian_Pan.getInstance().getS1_depositorGuardianLName(), G_LName);
			sendKeys(Guardian_Pan.getInstance().getS1_depositorGuardianDOB(), G_DOB);
			sendKeys(Guardian_Pan.getInstance().getS1_depositorGuardianEmail(), EmailId);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@And("user click the Guardian proceed button")
	public void user_click_the_guardian_proceed_button() throws Exception {

		try {
			Thread.sleep(3000);
			scrollDown(Guardian_Pan.getInstance().getStep_gar_btn_1());
			btnClick(Guardian_Pan.getInstance().getStep_gar_btn_1());
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Then("user should see the Deposit summary Page")
	public void user_should_see_the_deposit_summary_page() throws Exception {

		try {
			Thread.sleep(3000);
			if (Guardian_Pan.getInstance().getDeposit_Summary_Page().isDisplayed()) {
				System.out.println("User in deposit Summary Page");
			} else {
				System.out.println("User couldn't see the Deposit Summary Page ");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

		@Given("User ensure he\\/she is in Deposit_Summary_Page")
		public void user_ensure_he_she_is_in_deposit_summary_page() {
			
			try {
				if(Deposit_Summary_Page.getInstance().getDeposit_Summary_Page().isDisplayed()) {
					System.out.println("user in deposit Summary Page  ");
					
				}else {
					System.out.println("user not  in deposit Summary Page  ");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}

		@When("user verify the PaySecurely button is enabled or not")
		public void user_verify_the_pay_securely_button_is_enabled_or_not() {
			
			try {
				if(Deposit_Summary_Page.getInstance().getDeposit_Proceed().isEnabled()) {
					
					System.out.println("PaySecurely button is enabled " +"  FAIL");
					
				}else {
					System.out.println("PaySecurely button is not enabled  "+  "PASS");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		@When("user click the edit button ,he\\/she should go into the SchemeDetail Page")
		public void user_click_the_edit_button_he_she_should_go_into_the_scheme_detail_page() {
			
			try {
				btnClick(Deposit_Summary_Page.getInstance().getEdit_To_Scheme());
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		@When("User ensure he\\/she in schemeDetails Page")
		public void user_ensure_he_she_in_scheme_details_page() {
			
			try {
				if(Deposit_Summary_Page.getInstance().getScheme_Details_Page().isDisplayed()) {
					
					System.out.println("user is in Scheme Details Page");
				}else {
					System.out.println("user is not  in Scheme Details Page\"");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		@Then("user click the continue button")
		public void user_click_the_continue_button() {
			
			try {
				btnClick(Deposit_Summary_Page.getInstance().getApply_investbtn2());
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		@Then("User click the TermsAndCondition Button")
		public void user_click_the_terms_and_condition_button() {
			
			try {
				btnClick(Deposit_Summary_Page.getInstance().getTermsAndConditons());
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		@Then("user click the Got it button")
		public void user_click_the_got_it_button() {
			
			try {
				btnClick(Deposit_Summary_Page.getInstance().getGotItTerms());
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		@Then("user click the acceptsTermsAndConditions checkBox")
		public void user_click_the_accepts_terms_and_conditions_check_box() {
			
			try {
				btnClick(Deposit_Summary_Page.getInstance().getAcceptTerms());
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		@Then("user click the Accept_Got_It button")
		public void user_click_the_accept_got_it_button() {
			
			try {
				btnClick(Deposit_Summary_Page.getInstance().getAccept_GotIt());
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		@When("user click the Paysecurely button")
		public void user_click_the_paysecurely_button() {
			
			try {
				btnClick(Deposit_Summary_Page.getInstance().getDeposit_Proceed());
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		@When("User did not want to continue the payment ,so he\\/she click the backButton")
		public void user_did_not_want_to_continue_the_payment_so_he_she_click_the_back_button() {
			
			try {
				btnClick(Deposit_Summary_Page.getInstance().getBack_Pay());
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		@When("user Cancel the Payment")
		public void user_cancel_the_payment() {
			
			try {
				btnClick(Deposit_Summary_Page.getInstance().getCancel_Payment());
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		@Then("user tried to Retry the Payment")
		public void user_tried_to_retry_the_payment() {
			
			try {
				btnClick(Deposit_Summary_Page.getInstance().getRetrypopkyc());
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}
		@Then("user return to the Depsoit Summary Page")
		public void user_return_to_the_depsoit_summary_page() {
		
			try {
				btnClick(Deposit_Summary_Page.getInstance().getDeposit_Summary_Page());
			} catch (Exception e) {
				System.out.println(e);
			}
			
		}

}
