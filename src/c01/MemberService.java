package c01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MemberService {
	Scanner sc = new Scanner(System.in);
	DBConn dbconn = new DBConn();
//	Connection conn = dbconn.DBConn1();
	PreparedStatement pstmt;

	String inputid;
	String inputpw;
	String inputname;
	String inputphone;
	String inputgrade;

	public void MemberInsert() throws ClassNotFoundException, SQLException {
		
		Connection conn = dbconn.DBConn1();
		System.out.print("ID를 입력하세요 >> ");
		inputid = sc.nextLine();
		System.out.print("PW를 입력하세요 >> ");
		inputpw = sc.nextLine();
		System.out.print("이름을 입력하세요 >> ");
		inputname = sc.nextLine();
		System.out.print("전화번호를 입력하세요 >> ");
		inputphone = sc.nextLine();
		System.out.print("등급을 입력하세요 >> ");
		inputgrade = sc.nextLine();

		String query = "INSERT INTO tbl_member VALUES(?,?,?,?,?)";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, inputid);
		pstmt.setString(2, inputpw);
		pstmt.setString(3, inputname);
		pstmt.setString(4, inputphone);
		pstmt.setString(5, inputgrade);
		pstmt.executeUpdate();

	}

	public void MemberSelect() throws ClassNotFoundException, SQLException {
		ArrayList<Member> mList = new ArrayList<>();
		String query = "SELECT * FROM tbl_member";
		ResultSet rs = pstmt.executeQuery(query);
		while (rs.next()) {
			Member member = new Member();
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String grade = rs.getString("grade");

			member.setId(id);
			member.setPw(pw);
			member.setName(name);
			member.setPhone(phone);
			member.setGrade(grade);

			mList.add(member);

		}
		
		for(Member m : mList) {
			System.out.println(m);
		}
	}

	public void MemberUpdate() throws ClassNotFoundException, SQLException {
		Connection conn = dbconn.DBConn1();
		System.out.println("무엇을 수정하시겠습니까?");
		System.out.print("1. 비밀번호 / 2. 이름 / 3. 전화번호");
		int selectUpdate = sc.nextInt();
		
		if(selectUpdate == 1 ) {
			System.out.print("아이디 입력 >> "); 
			String setValue1 = sc.nextLine();
			System.out.print("변경할 비밀번호 입력 >> "); 
			String setValue2 = sc.nextLine();
			
			String query = "UPDATE tbl_member SET PW = ? WHERE ID = ?";
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1,setValue2);	
			pstmt.setString(2,setValue1);
			pstmt.executeUpdate();
			System.out.println("수정 완료.");
		}
		
		if(selectUpdate == 2 ) {
			System.out.print("아이디 입력 >> "); 
			String setValue1 = sc.nextLine();
			System.out.print("변경할 이름 입력 >> "); 
			String setValue2 = sc.nextLine();
			String query = "UPDATE tbl_member SET NAME = ? WHERE ID = ?";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,setValue2);	
			pstmt.setString(2,setValue1);
			pstmt.executeUpdate();
			System.out.println("수정 완료.");
		}
		
		if(selectUpdate == 3 ) {
			System.out.print("아이디 입력 >> "); 
			String setValue1 = sc.nextLine();
			System.out.print("변경할 전화번호 입력 >> "); 
			String setValue2 = sc.nextLine();
			String query = "UPDATE tbl_member SET PHONE = ? WHERE ID = ?";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,setValue2);	
			pstmt.setString(2,setValue1);
			pstmt.executeUpdate();
			System.out.println("수정 완료.");
			
		}
	}

	public void MemberDelete() throws ClassNotFoundException, SQLException {
		Connection conn = dbconn.DBConn1();
		System.out.print("삭제할 ID 입력 >> "); 
		String setValue1 = sc.nextLine();
		String query = "DELETE FROM TBL_MEMBER WHERE ID = ? " ;
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, setValue1);
		pstmt.executeUpdate();
		System.out.println("삭제 완료.");
		
	}
}
