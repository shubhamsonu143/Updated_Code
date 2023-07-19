package Runner_Lib;

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

import Common_Package.BaseClass;
import xpaths_Lib.Four_Wheeler_Xpaths;

public class Four_Wheeler_Run extends BaseClass {

	public static void main(String[] args) throws Exception {

		String dbUrl = "jdbc:mysql://localhost:3306/sfl?enabledTLSProtocols=TLSv1.2";

		// Database Username
		String username = "root";

		// Database Password
		String password = "Sathish@3927";

		// Query to Execute
		String query = "select *  from fw_lead_parameters";

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
			loadUrl("http://sitonlinefw.novactech.net/four-wheeler-loan");

			Four_Wheeler_Xpaths fp = new Four_Wheeler_Xpaths();

			String mobile_number = rs.getString("mobile_number");

			sendKeys(fp.getFw_mobile(), mobile_number);

			btnClick(fp.getFw_send_otp_submit());

			List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='input_field']"));
			for (int j = 0; j < findElements.size(); ++j) {

				WebElement checkbox = findElements.get(j).findElement(By.xpath("./input"));

				String otp_code = rs.getString("otp_code");

				sendKeys(checkbox, otp_code);
			}

			btnClick(fp.getFw_otpVerifybtn());

			String residence_pincode = rs.getString("residence_pincode");

			sendKeys(fp.getFw_residence_pincode(), residence_pincode);

			String pan_number = rs.getString("pan_number");

			sendKeys(fp.getFw_cus_pan(), pan_number);

			Thread.sleep(20000);

			String father_name = rs.getString("father_name");

			scrollDown(fp.getFw_father_name());

			sendKeys(fp.getFw_father_name(), father_name);

			String cust_email = rs.getString("cust_email");

			Thread.sleep(2000);

			scrollDown(fp.getFw_cus_email());

			sendKeys(fp.getFw_cus_email(), cust_email);

			btnClick(fp.getFw_customer_details_form_submit());

			btnClick(fp.getFw_residence_type());

			Thread.sleep(5000);

			String residence_type = rs.getString("residence_type");

			List<WebElement> findElements2 = driver.findElements(By.xpath("//*[@id=\"residence_type_list\"]"));

			for (WebElement atag : findElements2) {

				String res = atag.getAttribute("innerHTML");

				if (res.contains(residence_type)) {

					btnClick(atag);

				} else {

					System.out.println("Loop is not Working");

				}

			}

			Thread.sleep(3000);

			doubleClick(fp.getFw_current_residence_age());

			scrollDown(fp.getFw_current_residence_age());

			Thread.sleep(5000);

			String current_residence_age = rs.getString("current_residence_age");

			List<WebElement> findElements3 = driver.findElements(By.xpath("//*[@id=\"current_residence_age_list\"]"));

			for (WebElement atag : findElements3) {

				String res = atag.getAttribute("innerHTML");

				if (res.equals(current_residence_age)) {

					scrollDown(atag);

					btnClick(atag);

				} else {

					System.out.println("Loop is not Working");

				}

			}

			Thread.sleep(3000);

			btnClick(fp.getFw_employment_type());

			String employment_type = rs.getString("employment_type");

			List<WebElement> findElements4 = driver.findElements(By.id("employment_type_list"));

			for (WebElement atag : findElements4) {

				String res = atag.getAttribute("innerHTML");

				if (res.contains(employment_type)) {

					btnClick(atag);

				} else {

					System.out.println("Loop is not Working");

				}

			}

			Thread.sleep(3000);

			String net_month_salary = rs.getString("net_month_salary");

			sendKeys(fp.getFw_cus_net(), net_month_salary);

			btnClick(fp.getFw_purposeOf_Loan());

			String purpose_of_loan = rs.getString("purpose_of_loan");

			List<WebElement> findElements5 = driver.findElements(
					By.xpath("//*[@id=\"additional-details-form\"]/div[1]/div[3]/div/div[1]/div/div[1]/ul"));

			for (WebElement atag : findElements5) {

				String res = atag.getAttribute("innerHTML");

				if (res.contains(purpose_of_loan)) {

					btnClick(atag);

				} else {

					System.out.println("Loop is not Working");

				}

			}

			String reg_number = rs.getString("reg_number");

			sendKeys(fp.getFw_reg_number(), reg_number);

//			String manufacturer_name = rs.getString("manufacturer_name");

//			sendKeys(fp.getFw_cus_man(), manufacturer_name);

		}
		con.close();
	}

}
