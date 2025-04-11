package c01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Login {

	public void LoginCheck() throws SQLException, ClassNotFoundException {

		Scanner sc = new Scanner(System.in);
		DBConn dbconn = new DBConn();
		Connection conn = dbconn.DBConn1();

		System.out.print("ID를 입력하세요 >> ");
		String inputid = sc.nextLine();
		System.out.print("PW를 입력하세요 >> ");
		String inputpw = sc.nextLine();

		String query = "SELECT COUNT(*) AS cnt FROM TBL_MEMBER WHERE ID = ? AND PW = ? ";
		PreparedStatement pstmt = conn.prepareStatement(query);

		pstmt.setString(1, inputid);
		pstmt.setString(2, inputpw);

		ResultSet rs = pstmt.executeQuery();

		rs.next();
		
		int result = rs.getInt("cnt");
		
		if (result == 1) {
			System.out.println("로그인성공");
		} else if (result == 0) {
			System.out.println("로그인 실패");
		}

	}

}
