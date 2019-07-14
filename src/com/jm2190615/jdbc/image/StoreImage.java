package com.jm2190615.jdbc.image;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jm2190615.jdbc.util.DbUtil;

public class StoreImage {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("resources\\images\\tech-word-cloud.jpg");

			Connection con = DbUtil.getCon();

			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2190615_PROFILE VALUES (?, ?)");
			pstmt.setString(1, "Rohit");
			pstmt.setBinaryStream(2, fis, fis.available());

			int result = pstmt.executeUpdate();

			if (result > 0) {
				System.out.println("Image has been inserted successfully.");
			}
		} catch (SQLException e) {
			System.out.println("Name already exists.\nPlease chnage the name and re-run the program.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
