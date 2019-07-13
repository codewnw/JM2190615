package com.jm2190615.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateRecordsUsingPstmt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String userChoice = "Y";

		try {
			// 1. Establish connection
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			// 2. Create Statement
			PreparedStatement pstmt = con.prepareStatement("UPDATE JM2190615_USER SET NAME = ? WHERE ID = ?");

			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter ID: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Enter new name: ");
				String name = scan.nextLine();

				pstmt.setInt(2, id);
				pstmt.setString(1, name);

				// 3. Execute statement
				int i = pstmt.executeUpdate();
				// 4. Process the result
				if (i > 0) {
					System.out.println("Record inserted successfully.");
				}

				System.out.print("Do you wish to continue? (Y/N): ");
				userChoice = scan.nextLine();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
