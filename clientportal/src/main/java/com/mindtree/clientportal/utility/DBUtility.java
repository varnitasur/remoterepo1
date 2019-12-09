package com.mindtree.clientportal.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mindtree.clientportal.exception.DaoException;

public class DBUtility {
	
	private static final String URL="jdbc:mysql://localhost:3306/test";
	private static final String USER_NAME="root";
	private static final String PASSWORD="Welcome123";
	private static Connection con;
	public Connection getConnection() throws DaoException {
		Connection con = null;

		try {
			con = DriverManager.getConnection(URL,USER_NAME , PASSWORD);
		} catch (SQLException e) {
throw new DaoException("Connection failed");
}

		return con;
	}
	public static void closeConnection() throws DaoException {

		try {
			con.close();
			System.out.println("Connection is closed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
		//	System.out.println("Unable to close database connection");
		//	System.out.println(e);
			throw new DaoException("Connection failed");
		}

	}

}
