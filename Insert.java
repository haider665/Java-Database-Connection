package demo;

import java.sql.*;

public class Insert {

	public static void main(String[] args) throws Exception{
		
		String url="jdbc:mysql://localhost:3306/dbname"+"?autoReconnect=true&useSSL=false";
		String user= "root";
		String pass= "haider665";
		
		// 1. get connection with database
		Connection con = DriverManager.getConnection(url,user, pass);
		// 2. create a statement
		Statement st = con.createStatement();
		// 3. execute sql queries
		String q1= "insert into student values ('0000','Insert', 'nul', 0.0, '2025-11-14')  ";
		st.executeUpdate(q1);
		
		

	}

}
