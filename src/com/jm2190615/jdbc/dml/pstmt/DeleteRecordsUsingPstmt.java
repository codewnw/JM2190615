package com.jm2190615.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecordsUsingPstmt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String userChoice = "Y";

		try {
			// 1. Establish connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create Statement
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM JM2190615_USER WHERE ID = ?");

			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter ID: ");
				int id = Integer.parseInt(scan.nextLine());

				pstmt.setInt(1, id);

				// 3. Execute statement
				int i = pstmt.executeUpdate();
				// 4. Process the result
				if (i > 0) {
					System.out.println("Record deleted successfully.");
				}

				System.out.print("Do you wish to continue? (Y/N): ");
				userChoice = scan.nextLine();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
