package c01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardService {
	Scanner sc = new Scanner(System.in);
	DBConn dbconn = new DBConn();
//	Connection conn = dbconn.DBConn1();
	PreparedStatement pstmt;
	
	// CRUD
	
	int inputbno ;
	String inputtitle ;
	String inputcontents ;
	String inputwriter ;
	String inputregdate ;

	public void BoardInsert (Board board) throws ClassNotFoundException, SQLException  {
		Connection conn = dbconn.DBConn1();
		inputbno = sc.nextInt();
		inputtitle = sc.nextLine();
		inputcontents = sc.nextLine();
		inputwriter = sc.nextLine();
		inputregdate = sc.nextLine();
		
		String query = "INSERT INTO TBL_BOARD VALUES(?,?,?,?,?)";
		pstmt = conn.prepareStatement(query);
		pstmt.setInt(1,inputbno);
		pstmt.setString(2,inputtitle);
		pstmt.setString(3,inputcontents);
		pstmt.setString(4,inputwriter);
		pstmt.setString(5,inputregdate);
		
		pstmt.executeLargeUpdate();
		
	}

	public void BoardSelect() throws ClassNotFoundException, SQLException {
		
		ArrayList<Board> bList = new ArrayList<>();
		String query = "SELECT * FROM TBL_BOARD";
		ResultSet rs = pstmt.executeQuery(query);
		while ( rs.next()){
			Board board = new Board ();
			int bno = rs.getInt("bno");
			String title = rs.getString("title");
			String contents = rs.getString("contents");
			String writer = rs.getString("writer");
			String regdate = rs.getString("regdate");
			
			board.setBno(bno);
			board.setTitle(title);
			board.setContents(contents);
			board.setWriter(writer);
			board.setRegdate(regdate);
			
			bList.add(board);
			
			
		}
		for(Board b: bList) {
			System.out.println(b);
		}
		
		
	}

	public void BoardUpdate(Board board) throws ClassNotFoundException, SQLException {
		Connection conn = dbconn.DBConn1();
		//무엇을 입력할건지 입력받기.
		System.out.println("무엇을 수정하시겠습니까?");
		System.out.print("1. 제목 / 2. 내용 ");
		int selectUpdate = sc.nextInt();
		sc.nextLine();
		//제목
		if(selectUpdate == 1) {
			System.out.print("변경할 제목 입력 >> "); 
			String setValue1 = sc.nextLine();
			System.out.print("변경할 문서번호 입력 >> "); 
			String setbno = sc.nextLine();
			String query = "UPDATE tbl_board SET TITLE = ? WHERE bno = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,setValue1);	
			pstmt.setString(2,setbno);
			pstmt.executeUpdate();
			System.out.println("수정 완료.");
		}
		//내용
		
		if(selectUpdate == 2) {
			System.out.print("변경할 내용 입력 >> "); 
			String setValue2 = sc.nextLine();
			System.out.print("변경할 문서번호 입력 >> "); 
			String setbno = sc.nextLine();
			String query = "UPDATE tbl_board SET CONTENTS = ? WHERE bno = ?";
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1,setValue2);	
			pstmt.setString(2,setbno);
			pstmt.executeUpdate();
			System.out.println("수정 완료.");
		}
		
	}

	public void BoardDelete() throws ClassNotFoundException, SQLException {
		Connection conn = dbconn.DBConn1();
		System.out.print("삭제할 문서번호 입력 >> "); 
		String setbno = sc.nextLine();
		String query = "DELETE FROM TBL_BOARD WHERE bno = ? " ;
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, setbno);
		pstmt.executeUpdate();
		System.out.println("삭제 완료.");
		
	}
}
