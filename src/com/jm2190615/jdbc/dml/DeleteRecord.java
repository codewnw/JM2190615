package com.jm2190615.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecord {

	public static void main(String[] args) {

		try {
			// 1. Establish connection with database
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			// 2. Create statement/command
			Statement stmt = con.createStatement();

			// 3. Execute the statement/command
			int result = stmt.executeUpdate("DELETE FROM JM2190615_USER WHERE ID = 1");

			// 4. Process the returned result
			if (result > 0) {
				System.out.println("Record deleted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
