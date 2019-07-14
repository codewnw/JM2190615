package com.jm2190615.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

public class DbConnectionUtil {

	static Connection con;

	public static Connection getCon() throws SQLException {
		if (con == null || con.isClosed()) {
			
			ResourceBundle rb = ResourceBundle.getBundle("db", Locale.US);
			String url = rb.getString("url");
			String userName = rb.getString("username");
			String password = rb.getString("password");
			
			con = DriverManager.getConnection(url, userName, password);
		}
		return con;
	}
}
