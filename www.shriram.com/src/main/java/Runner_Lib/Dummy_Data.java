package Runner_Lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Common_Package.BaseClass;
import xpaths_Lib.All_Xpaths;

public class Dummy_Data extends BaseClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception {

		String dbUrl = "jdbc:mysql://127.0.0.1:3306/sfl?enabledTLSProtocols=TLSv1.2";

		// Database Username
		String username = "root";

		// Database Password
		String password = "Sathish@3927";

		// Query to Execute
		String query = "select *  from fw_lead_parameters";

		// Load mysql jdbc driver
		Class.forName("com.mysql.jdbc.Driver");

		// Create Connection to DB
		Connection con = DriverManager.getConnection(dbUrl,username,password);

		// Create Statement Object
		Statement stmt = con.createStatement();

		// Execute the SQL Query. Store results in ResultSet

		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			String string = rs.getString("id");
			Set<String> s = new HashSet<>(Arrays.asList(string));

			System.out.println(s);

			for (int i = 1; i <= s.size(); i++) {

				System.out.print("sathish" + "sfhskdhfshfd");

				browserLaunch("CHROME");
				loadUrl("http://sitonlinefw.novactech.net/four-wheeler-loan");

				All_Xpaths xp = new All_Xpaths();
				

				WebElement findElement = driver.findElement(
						By.xpath("/html/body/app-root/app-header/header/section[2]/div/div/div[2]/p/span[1]"));

				Actions ac = new Actions(driver);
				ac.moveToElement(findElement).perform();

				btnClick(xp.getPcvl());

				String cust_name = rs.getString("cust_name");

				System.out.println(cust_name);

				sendKeys(xp.getPcvl_name(), cust_name);

				String cust_mobile = rs.getString("cust_mobile");

				System.out.println(cust_mobile);

				sendKeys(xp.getPcvl_mobile(), cust_mobile);

				String cust_email = rs.getString("cust_email");

				System.out.println(cust_email);

				sendKeys(xp.getPcvl_email(), cust_email);
				con.close();

				
				
				
			}
		}


	

	}

}
