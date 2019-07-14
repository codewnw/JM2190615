package com.jm2190615.jdbc.batch.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.jm2190615.jdbc.util.DbConnectionUtil;

public class BatchInsertUsingPstmt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String userChoice = "Y";

		try {
			// 1. Establish connection
			Connection con = DbConnectionUtil.getCon();
			// 2. Create Statement
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2190615_USER VALUES(?, ?)");

			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter ID: ");
				int id = Integer.parseInt(scan.nextLine());

				System.out.print("Enter name: ");
				String name = scan.nextLine();

				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				
				pstmt.addBatch();
				
				System.out.print("Do you wish to continue? (Y/N): ");
				userChoice = scan.nextLine();
			}
			// 3. Execute statement
			int[] result = pstmt.executeBatch();
			// 4. Process the result
			for (int j = 0; j < result.length; j++) {
				System.out.println("Record inserted successfully.");
			}
		}catch(

	SQLException e)
	{
		e.printStackTrace();
	}
}

}
