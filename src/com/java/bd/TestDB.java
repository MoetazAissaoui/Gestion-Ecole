package com.java.bd;

import java.sql.*;

public class TestDB {
	
	Connection createConnection() throws SQLException, ClassNotFoundException
	{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
			
			
		
		return con;
	}

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		TestDB db = new TestDB();
		Connection con = db.createConnection();
		System.out.println("connection successfuly");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from users");
		
		while (rs.next())
		{
			String name = rs.getString(2);
			System.out.println(name);
//			System.out.println(rs.getString(1));
//			System.out.println(rs.getString(2));
		}
		System.out.println("hi");
	}

}
