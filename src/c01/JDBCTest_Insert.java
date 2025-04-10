package c01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCTest_Insert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner (System.in);  
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url = "jdbc:oracle:thin:@localhost:1521:testdb";
		String id = "green";
		String pw = "1234";
		
		Connection conn = DriverManager.getConnection(url,id,pw);
		
		//쿼리담당 객체
		Statement stmt = conn.createStatement();
		System.out.println("INSERT문 입력 >> ");
		String inputInsert = sc.nextLine();
		sc.nextLine();
		//쿼리를 실행한다.
		String query = inputInsert;
		stmt.executeUpdate(query);
	}

}
