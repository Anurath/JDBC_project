package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Student {

public static void main(String[] args) {
		
		try
		{
			String url = "jdbc:mysql://localhost:3306/";
			String username = "root";
			String password = "Anurath@123";
			
			Connection conn = DriverManager.getConnection(url,username,password);
			
			Statement stm = conn.createStatement();
			
			System.out.println("Connected Successfully.");
			
			String query = "create database DB";
			
			boolean isSucc = stm.execute(query);
			
			System.out.println(isSucc);
			
			conn.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
