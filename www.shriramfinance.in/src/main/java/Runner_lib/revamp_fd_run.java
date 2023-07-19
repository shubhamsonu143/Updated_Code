package Runner_lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import XPATHS.fd_xpaths;
import commonPackage.BaseClass;

@Test
public class revamp_fd_run extends BaseClass {

	public static void main(String[] args) throws Exception {

		String dbUrl = "jdbc:mysql://localhost:3306/revamp_fd?enabledTLSProtocols=TLSv1.2";

		// Database Username
		String username = "root";

		// Database Password
		String password = "Shubham@880143";

		// Query to Execute
		String query = "select *  from fd_lead_parameters";

		// Load mysql jdbc driver
		Class.forName("com.mysql.jdbc.Driver");

		// Create Connection to DB
		Connection con = DriverManager.getConnection(dbUrl, username, password);

		// Create Statement Object
		Statement stmt = con.createStatement();

		// Execute the SQL Query. Store results in ResultSet

		ResultSet rs = stmt.executeQuery(query);

		rs.next();

		String string = rs.getString("id");
		Set<String> s = new HashSet<>(Arrays.asList(string));
		System.out.println(s);

		for (int i = 1; i <= s.size(); i++) {

			browserLaunch("CHROME");
			loadUrl("https://sitsfl.stfc.in/");
		
	

		fd_xpaths fd = new fd_xpaths();

		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement deposits = fd.getDeposits();
		actions.moveToElement(deposits).perform();
		Thread.sleep(1000);
		btnClick(fd.getFixedDeposits());

		String mobile = rs.getString("mobile");
		sendKeys(fd.getMobileNum(), mobile);

		String pincode = rs.getString("pincode");
		sendKeys(fd.getPincode(), pincode);

		Thread.sleep(2000);
		btnClick(fd.getInvestNow());

		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='input_field']"));
		for (int j = 0; j < findElements.size(); ++j) {

			WebElement checkbox = findElements.get(j).findElement(By.xpath("./input"));

			String otp_code = rs.getString("otp_code");

			sendKeys(checkbox, otp_code);
		}
		btnClick(fd.getOtpVerifyBtn());

//			String deposit_amount = rs.getString("deposit_amount");
//			sendKeys(fd.getInvestmentAmount(), deposit_amount);
		Thread.sleep(2000);
		scrollDown(fd.getInvestmentAmount());
		Thread.sleep(3000);
		btnClick(fd.getSeniorCitizenYes());
		Thread.sleep(3000);
		btnClick(fd.getWomendepositorYes());
		Thread.sleep(6000);
		btnClick(fd.getApplyInvestNowBtn());
		String pan = rs.getString("pan");
		sendKeys(fd.getPanNumber(), pan);
		/*
		 * Thread.sleep(2000); Actions actions = new Actions(driver); WebElement
		 * deposits = fd.getDeposits(); actions.moveToElement(deposits).perform();
		 * Thread.sleep(1000); WebElement fixedDeposits = fd.getFixedDeposits();
		 * fixedDeposits.click(); Thread.sleep(2000); WebElement mobileNum =
		 * fd.getMobileNum(); mobileNum.sendKeys("8801439001"); WebElement pincode =
		 * fd.getPincode(); pincode.sendKeys("603210"); Thread.sleep(2000); WebElement
		 * investNow = fd.getInvestNow(); investNow.click(); Thread.sleep(5000);
		 * 
		 * List<WebElement> findElements =
		 * driver.findElements(By.xpath("//div[@class='input_field']")); for (int j = 0;
		 * j < findElements.size(); ++j) {
		 * 
		 * WebElement checkbox = findElements.get(j).findElement(By.xpath("./input"));
		 * 
		 * String otp_code = rs.getString("otp_code");
		 * 
		 * sendKeys(checkbox, otp_code); }
		 * 
		 * Thread.sleep(3000); WebElement otpVerifyBtn = fd.getOtpVerifyBtn();
		 * otpVerifyBtn.click();
		 * 
		 * Thread.sleep(5000); WebElement investmentAmount = fd.getInvestmentAmount();
		 * investmentAmount.sendKeys("700"); Thread.sleep(2000); WebElement tenureMonth
		 * = fd.getTenureMonth(); tenureMonth.sendKeys("12");
		 * 
		 * Thread.sleep(2000); // Actions actions1 = new Actions(driver); WebElement
		 * interestPayout = fd.getInterestPayout(); interestPayout.click();
		 * 
		 * /*String text = fd.getFw_notification_text().getText();
		 * 
		 * if(text.equals("Do you want to receive notifications on your browser?")) {
		 * 
		 * btnClick(fp.get__st_bpn_no());
		 * 
		 * }
		 */

//			String title = driver.getTitle();

//			if (title.equals("Four Wheeler Loan: Apply for Car Loan Online at lowest Interest Rate")) {
//
//				stmt.execute("INSERT INTO `fw_results`(fw_title) VALUES ('" + title + "')");
//
//			} else {
//
//				System.out.println("invalid query");
//
//			}

		/*
		 * String mobile_number = rs.getString("mobile_number");
		 * 
		 * sendKeys(fp.getFw_mobile(), mobile_number);
		 * 
		 * btnClick(fp.getFw_send_otp_submit());
		 */

		/*
		 * btnClick(fp.getFw_otpVerifybtn());
		 * 
		 * String residence_pincode = rs.getString("residence_pincode");
		 * 
		 * sendKeys(fp.getFw_residence_pincode(), residence_pincode);
		 * 
		 * String pan_number = rs.getString("pan_number");
		 * 
		 * Thread.sleep(5000);
		 * 
		 * sendKeys(fp.getFw_cus_pan(), pan_number);
		 * 
		 * String father_name = rs.getString("father_name");
		 * 
		 * sendKeys(fp.getFw_father_name(), father_name);
		 * 
		 * String cust_email = rs.getString("cust_email");
		 * 
		 * sendKeys(fp.getFw_cus_email(), cust_email);
		 * 
		 * btnClick(fp.getFw_customer_details_form_submit());
		 * 
		 * btnClick(fp.getFw_residence_type());
		 * 
		 * Thread.sleep(5000);
		 * 
		 * String residence_type = rs.getString("residence_type");
		 * 
		 * List<WebElement> fw_residence_type_list = (List<WebElement>)
		 * fp.getFw_residence_type_list();
		 * 
		 * int size = fw_residence_type_list.size();
		 * 
		 * System.out.println(size);
		 */

	}con.close();
}

}
