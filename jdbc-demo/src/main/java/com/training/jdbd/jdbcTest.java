package com.training.jdbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	   {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url ="jdbc:sqlserver://localhost:1433;"+"databaseName=j_new_Data;"+"encrypt=true;trustServerCertificate = true";
		String user = "sa";
		String password="Hotwater007";
		Connection con = DriverManager.getConnection(url, user, password);
		
		if (con != null) {
			System.out.println("Connection Established!!");
		}else {
			System.out.println("Connection Refused!!");
		}
		}

}
