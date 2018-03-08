package demo;

import java.sql.*;

public class PreparedStatement {

	public static void main(String[] args) throws Exception {
		
		String url="jdbc:mysql://localhost:3306/dbname"+"?autoReconnect=true&useSSL=false";
		String user= "root";
		String pass= "haider665";
		// set up connection
		Connection con = DriverManager.getConnection(url,user, pass);
		// create prepared statement
		String q1= "select * from student where name=?";
		java.sql.PreparedStatement st = null;
		st =  con.prepareStatement(q1);
		// set values
		st.setString(1, "haider");
		// execute sql query
		
		ResultSet rs = st.executeQuery();
		display(rs);
		
		
		
	}
	public static void display(ResultSet rs) throws Exception {
		
		while(rs.next()) {
			System.out.println(rs.getString("id")+" "+rs.getString("name")+" "+rs.getString("dept")+" "+rs.getString("cgpa")+" ");
		}
		
	}

}
















