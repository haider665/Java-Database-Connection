package demo;
import java.sql.*;
public class LetsTry {

	public static void main(String[] args) throws Exception {
//		Class.forName("com.mysql.jdbc.Driver");
		// 1. get a connection to data base
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname"+"?autoReconnect=true&useSSL=false", "root", "haider665");
		// 2. create a statement
		Statement st = con.createStatement();
		Statement st2 = con.createStatement();
		// 3. execute the sql queries
		ResultSet rs = st.executeQuery("select * from student");
		ResultSet name= st2.executeQuery("select name from student where id='1234'");
//		String s = name.getString("name");
//		System.out.println(s);
		 // 4. process the resultset
		while(rs.next()) {
//			System.out.println(rs.getString("id")+" "+rs.getString("name")+" "+rs.getString("dept")+" "+rs.getString("cgpa")+" ");
			
		}
		while(name.next()) {
			String s = name.getString("name");
//			System.out.println(name.getString("name"));
			System.out.println(s);
		}
		
		con.close();
		
		
		
	}
	public static void display() {}

}


















