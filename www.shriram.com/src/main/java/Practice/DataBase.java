package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import Common_Package.BaseClass;

public class DataBase extends BaseClass {

	public static void main(String[] args) throws Exception {

		String dbUrl = "jdbc:mysql://127.0.0.1:3306/fw_wheeler?enabledTLSProtocols=TLSv1.2";

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
			
			stmt.execute("truncate table fw_results");
			

		}
	}

}
