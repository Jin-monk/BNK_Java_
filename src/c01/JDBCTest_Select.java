package c01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest_Select {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<Member> list = new ArrayList<>();

		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@localhost:1521:testdb"; // 주소
		String user = "green"; // 아이디
		String password = "1234"; // 비밀번호

		// getConnection메서드 통해 연결을 한다.
		// 접속 담당 = Connection
		Connection conn = DriverManager.getConnection(url, user, password);

		// 쿼리 실행 - Statement
		Statement stmt = conn.createStatement();
		String query = "SELECT * FROM tbl_member";
		// executeQuery 메서드가 ResultSet타입을 반환하기 때문
		ResultSet rs = stmt.executeQuery(query);

		// boolean 타입이며 다음 데이터가 있으면 true, 없으면 false 반환.
		while (rs.next()) {
			Member member = new Member();
			//rs.next();  next()가 데이터를 받아 읽을 때 next가 보는것은 첫 데이터행이 아닌 컬럼명이 담긴 행을 보고있기 때문이다.
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String grade_temp = rs.getString("grade");
			char grade = grade_temp.charAt(0);

			member.setId(id);
			member.setPw(pw);
			member.setName(name);
			member.setPhone(phone);
			member.setGrade(grade);

			list.add(member);
			
			
		}

		for(Member m : list) {
			System.out.println(m);
		}
		
		
	}

}
