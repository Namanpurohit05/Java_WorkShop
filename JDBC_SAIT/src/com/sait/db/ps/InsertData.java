package com.sait.db.ps;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;
import java.sql.*;
public class InsertData {
		
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sait",
					"root","ramnagar");
			PreparedStatement ps=c.prepareStatement("insert into students(sname,sphone) values(?,?)");
			ps.setString(1, "Himanshu");
			ps.setString(2,"1234567634");
			ps.executeUpdate();
			System.out.println("Data inserted Successfully!!");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}