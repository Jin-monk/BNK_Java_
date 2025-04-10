package c01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {

	public Statement DBConn1( ) throws ClassNotFoundException, SQLException {
		// db url id pw 입력 및 접속 객체
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = ("jdbc:oracle:thin:@localhost:1521:testdb");
		String id = "green";
		String pw = "1234";
		
		Connection conn = DriverManager.getConnection(url, id, pw);
		
		System.out.println("DB연결 완료");
		return conn.createStatement();
		
	}
}
