package com.jm2190615.jdbc.image;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveImage {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2190615_PROFILE WHERE NAME = 'Rohit'");
			rs.next();
			String name = rs.getString(1);
			String fileName = name + ".jpg";

			Blob b = rs.getBlob(2);
			byte[] byteArr = b.getBytes(1, (int) b.length());

			FileOutputStream fos = new FileOutputStream("resources\\images\\output\\" + fileName);
			fos.write(byteArr);
			fos.close();
			System.out.println("Output file has been created.");
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}
}
