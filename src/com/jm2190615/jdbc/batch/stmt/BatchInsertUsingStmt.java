package com.jm2190615.jdbc.batch.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BatchInsertUsingStmt {

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

			stmt.addBatch("INSERT INTO JM2190615_USER VALUES(" + id + ", '" + name + "')");

			System.out.print("Do you wish to continue(y/n) :");
			userChoice = scan.nextLine();
		}
		// 3. Execute the statement/command
		int[] result = stmt.executeBatch();

		// 4. Process the returned result
		for (int i = 0; i < result.length; i++) {
			System.out.println("Record inserted successfully.");
		}

	}

}
