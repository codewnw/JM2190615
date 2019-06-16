package com.jm2190615.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) {

		try {
			// 1. Establish connection with database
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

			// 2. Create statement/command
			Statement stmt = con.createStatement();

			// 3. Execute the statement/command
			boolean result = stmt.execute("CREATE TABLE JM2190615_USER(ID NUMBER, NAME VARCHAR2)");

			// 4. Process the returned result
			if (!result) {
				System.out.println("Table created successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
