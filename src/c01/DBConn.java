package c01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBConn {

	public Connection DBConn1( ) throws ClassNotFoundException, SQLException {
		// db url id pw 입력 및 접속 객체
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = ("jdbc:oracle:thin:@localhost:1521:testdb");
		String id = "green";
		String pw = "1234";
		
		return DriverManager.getConnection(url, id, pw);
		 
		
	}
}
