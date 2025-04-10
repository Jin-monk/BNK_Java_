package c01;

import java.sql.SQLException;
import java.util.Scanner;

public class BoardService {

	//CRUD 
	Scanner sc = new Scanner(System.in);
	public void BoardInsert (Board board) throws ClassNotFoundException, SQLException {
		DBConn dbconn = new DBConn(); 
		System.out.print("게시물 번호: ");
		int inputbno = sc.nextInt();
		board.setBno(inputbno) ;
		System.out.print("게시물 제목: ");
		String inputtitle = sc.nextLine();
		System.out.print("게시물 내용: ");
		String inputcontents = sc.nextLine();
		System.out.print("게시물 작성자: ");
		String inputwriter = sc.nextLine();
		System.out.print("게시 날짜: ");
		String inputdate = sc.nextLine();

		String query = "INSERT INTO tbl_board VALUES('" + inputbno + "','" + inputtitle + "','" + inputcontents
				+ "','" + inputwriter + "','" + inputdate + "')";
		dbconn.DBConn1().executeUpdate(query); 
	}
	public void BoardSelect () {
		
	}
	public void BoardUpdate () {
		
	}
	public void BoardDelete () {
		
	}
}
