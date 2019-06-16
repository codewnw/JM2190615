package com.jm2190615.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {

	public static void main(String[] args) {
		try {
			// 1. Establish the connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			// 2. Create statement
			Statement stmt = con.createStatement();

			// 3. Execute statement
			boolean result = stmt.execute("DROP TABLE JMM2190615_USER");

			// 4. Process the result
			if (!result) {
				System.out.println("Table dropped successfully.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
