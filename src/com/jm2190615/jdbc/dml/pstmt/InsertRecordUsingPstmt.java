package com.jm2190615.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecordUsingPstmt {

	public static void main(String[] args) {

		try {
			// 1. Establish connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create Statement
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2190615_USER VALUES(?, ?)");
			pstmt.setInt(1, 1001);
			pstmt.setString(2, "Rohit");

			// 3. Execute statement
			int i = pstmt.executeUpdate();
			// 4. Process the result
			if (i > 0) {
				System.out.println("Record inserted successfully.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
