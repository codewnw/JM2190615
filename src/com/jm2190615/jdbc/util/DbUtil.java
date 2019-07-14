package com.jm2190615.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {

	static Connection con;

	public static Connection getCon() throws SQLException {
		if (con == null || con.isClosed()) {
			con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		}
		return con;
	}
}
