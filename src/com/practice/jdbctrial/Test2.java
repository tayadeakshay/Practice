package com.practice.jdbctrial;
import java.sql.*;

public class Test2 {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/newdb";
		String uname = "root";
		String pass = "1234";
		String query ="insert into student values (60,'Pankaj',99)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		int rs = st.executeUpdate(query);
		
System.out.println(rs + " rows affected");		
		st.close();
		con.close();
	
	}
		// TODO Auto-generated method stub

	}


