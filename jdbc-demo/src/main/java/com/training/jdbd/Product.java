package com.training.jdbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Product {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	   {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String url ="jdbc:sqlserver://localhost:1433;"+"databaseName=j_new_Data;"+"encrypt=true;trustServerCertificate = true";
		String user = "sa";
		String password="Hotwater007";
		Connection con = DriverManager.getConnection(url, user, password);
		
		String query = "select * from product order by price asc"; 
		java.sql.Statement stmt = con.createStatement();
		ResultSet rs =  stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.println("prod_name:"+rs.getString("prod_name"));
			System.out.println("prod_desc:"+rs.getString("prod_desc"));
			System.out.println("prod_pric:"+rs.getDouble("price"));
		}
//		System.out.println("");
		}

}
