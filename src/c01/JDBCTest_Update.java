package c01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest_Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String id = "green";
		String pw = "1234";
		
		Connection conn = DriverManager.getConnection(url,id,pw);
		
		Statement stmt = conn.createStatement(); 
		
		String query = "UPDATE tbl_member SET phone ='010-3333-3333' WHERE ID = 'HYE'";
		stmt.executeUpdate(query) ;  
	}

}
