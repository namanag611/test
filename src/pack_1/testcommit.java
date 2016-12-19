package pack_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testcommit {

	@Test
	public void SQLConnection() {
		// this is test ghjg hgfhdfh g
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			// Creating a connection to the database
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://artOfTesting.com/testDB", "userName",
					"password");

			// Executing SQL query and fetching the result
			Statement st = conn.createStatement();
			String sqlStr = "select * from testTable";
			ResultSet rs = st.executeQuery(sqlStr);
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}

		} catch (Exception ex) {
			System.out.println(ex);
			Assert.fail();
			// this is test file 3
		}
	}
}
