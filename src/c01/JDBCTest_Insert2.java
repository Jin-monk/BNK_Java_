package c01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCTest_Insert2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner (System.in);  
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String id = "green";
		String pw = "1234";
		
		Connection conn = DriverManager.getConnection(url,id,pw);
		
		String inputid = "beobjin00";
		String inputpw = "1234";
		String inputname = "법진";
		String inputphone = "010-8888-8888";
		String inputgrade = "A";
		
		
		//쿼리담당 객체
		//Statement stmt = conn.createStatement();
		String query = "INSERT INTO TBL_MEMBER VALUES(?,?,?,?,? )";
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		pstmt.setString(1, inputid);
		pstmt.setString(2, inputpw);
		pstmt.setString(3, inputname);
		pstmt.setString(4, inputphone);
		pstmt.setString(5, inputgrade);
		
		int result = pstmt.executeUpdate();
		
		System.out.println(result);
		
	}

}
