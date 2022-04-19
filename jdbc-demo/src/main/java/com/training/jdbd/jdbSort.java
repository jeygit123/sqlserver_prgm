package com.training.jdbd;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbSort {
	static String url ="jdbc:sqlserver://localhost:1433;"+"databaseName=j_new_Data;"+"encrypt=true;trustServerCertificate = true";
	static String user = "sa";
	static String password="Hotwater007";
	static String query = "SELECT * FROM product";
	
	public static void main(String[] args) 
	   {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try(Connection con = DriverManager.getConnection(url, user, password);
				Statement stmt = (Statement) con.createStatement();	){	
	{
		System.out.println("Fetching product by NAME in ascending order..");
		System.out.println("=========================================");
			ResultSet rs =  stmt.executeQuery("SELECT * FROM product order by prod_name asc");
			while(rs.next()) {
				System.out.print("prod_id: "+rs.getString("prod_id"));
				System.out.print(",prod_name:"+rs.getString("prod_name") );
				System.out.print(",prod_desc: "+rs.getString("prod_desc"));
				System.out.print(",price: "+rs.getInt("price")+"***");
			}
			System.out.println("");
			System.out.println("Fetching product by ID in ascending order..");
			System.out.println("=========================================");
			rs=stmt.executeQuery("select *from product order by prod_id ASC");
			
			while(rs.next()) {
				System.out.print("prod_id: "+rs.getString("prod_id"));
				System.out.print(",prod_name:"+rs.getString("prod_name") );
				System.out.print(",prod_desc: "+rs.getString("prod_desc"));
				System.out.print(",price: "+rs.getInt("price")+"***");
		}
		rs.close();
	   }}catch(SQLException e) {
		   e.printStackTrace();
	   }}}
		
	


		


