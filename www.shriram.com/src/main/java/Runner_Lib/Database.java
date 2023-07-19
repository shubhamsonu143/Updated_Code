package Runner_Lib;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"
		
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
		
		System.out.println(rs);

		con.close();
	}

}
