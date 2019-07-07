package com.jm2190615.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecords {

	public static void main(String[] args) throws SQLException {

		Scanner scan = new Scanner(System.in);
		String userChoice = "Y";

		// 1. Establish connection with database
		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");

		// 2. Create statement/command
		Statement stmt = con.createStatement();

		while (userChoice.equalsIgnoreCase("y")) {
			System.out.print("Please enter id :");
			int id = Integer.parseInt(scan.nextLine());

			System.out.print("Please enter name :");
			String name = scan.nextLine();

			// 3. Execute the statement/command
			int result = stmt.executeUpdate("INSERT INTO JM2190615_USER VALUES(" + id + ", '" + name + "')");

			// 4. Process the returned result
			if (result > 0) {
				System.out.println("Record inserted successfully.");
			}

			System.out.print("Do you wish to continue(y/n) :");
			userChoice = scan.nextLine();
		}
	}

}
