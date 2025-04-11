//package c01;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Test {
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		List<Member> mList = new ArrayList<>();
//		List<Board> bList = new ArrayList<>();
//		
//		
//		//MemberService memberservice = new MemberService();
//		BoardService boardService = new BoardService();
//		//Member member = new Member();
//		Board board = new Board();
//		Scanner sc = new Scanner(System.in);
//
//		
////		boardService.BoardUpdate(board);
//		boardService.BoardDelete();
////		boardService.BoardSelect();
//		
//		
//		Class.forName("oracle.jdbc.driver.OracleDriver");
//
//		String url = ("jdbc:oracle:thin:@localhost:1521:testdb");
//		String id = "green";
//		String pw = "1234";
//
//		Connection conn = DriverManager.getConnection(url, id, pw);
//
//		Statement stmt = conn.createStatement();
//
//		// 메뉴 출력
//		// 1. 회원가입 2.게시판 작성 3.게시판 조회
//
//		System.out.println("===MENU===");
//		System.out.println("1.회원가입 / 2.게시판 작성 / 3.게시판 조회");
//		System.out.print("\n" + "입력 >> ");
//		int selectMenu = sc.nextInt();
//		sc.nextLine();
//		if (selectMenu == 1) {
//			// 회원가입 진행
//			System.out.print("회원가입 ID : ");
//			String inputId = sc.nextLine();
//			System.out.print("회원가입 PW : ");
//			String inputPw = sc.nextLine();
//			System.out.print("회원가입 이름 : ");
//			String inputName = sc.nextLine();
//			System.out.print("회원가입 전화번호 : ");
//			String inputPhone = sc.nextLine();
//			System.out.print("회원가입 등급 : ");
//			String inputGrade = sc.nextLine();
//
//			String query = "INSERT INTO tbl_member VALUES('" + inputId + "','" + inputPw + "','" + inputName + "','"
//					+ inputPhone + "','" + inputGrade + "')";
//			stmt.executeUpdate(query);
//
//		} else if (selectMenu == 2) {
//			// 게시판 작성
//			boardService.BoardInsert(board);
////			System.out.print("게시물 번호: ");
////			String inputbno = sc.nextLine();
////			System.out.print("게시물 제목: ");
////			String inputtitle = sc.nextLine();
////			System.out.print("게시물 내용: ");
////			String inputcontents = sc.nextLine();
////			System.out.print("게시물 작성자: ");
////			String inputwriter = sc.nextLine();
////			System.out.print("게시 날짜: ");
////			String inputdate = sc.nextLine();
////
////			String query = "INSERT INTO tbl_board VALUES('" + inputbno + "','" + inputtitle + "','" + inputcontents
////					+ "','" + inputwriter + "','" + inputdate + "')";
////			stmt.executeUpdate(query);
//
//		} else if (selectMenu == 3) {
//			// 게시판 조회
//			System.out.println("1. 게시판 전체 조회 / 2.검색 조회");
//			System.out.print("입력 >> ");
//			int selectMenu2 = sc.nextInt();
//			sc.nextLine();
//			if (selectMenu2 == 1) {
//				// 게시판 전체 조회
//				String query = "SELECT * FROM TBL_BOARD";
//				ResultSet rs = stmt.executeQuery(query);
//
//				while (rs.next()) {
//					//Board board = new Board();
//					int bno = rs.getInt("bno");
//					String title = rs.getString("title");
//					String contents = rs.getString("contents");
//					String writer = rs.getString("writer");
//					String regdate = rs.getString("regdate");
//
//					board.setBno(bno);
//					board.setTitle(title);
//					board.setContents(contents);
//					board.setWriter(writer);
//					board.setRegdate(regdate);
//
//					bList.add(board);
//
//				}
//				for (Board b : bList) {
//					System.out.println(b);
//				}
//
//			} else if (selectMenu2 == 2) {
//				// 검색 조회
//				System.out.println("검색할 제목을 입력하세요: ");
//				System.out.print("입력 >> ");
//				String inputSearch = sc.nextLine();
//				String query = "SELECT * FROM TBL_BOARD WHERE TITLE = '" + inputSearch + "'";
//				ResultSet rs = stmt.executeQuery(query);
//
//				while (rs.next()) {
//					//Board board = new Board();
//					int bno = rs.getInt("bno");
//					String title = rs.getString("title");
//					String contents = rs.getString("contents");
//					String writer = rs.getString("writer");
//					String regdate = rs.getString("regdate");
//
//					board.setBno(bno);
//					board.setTitle(title);
//					board.setContents(contents);
//					board.setWriter(writer);
//					board.setRegdate(regdate);
//
//					bList.add(board);
//
//				}
//				for (Board b : bList) {
//					System.out.println(b);
//				}
//
//			}
//		}
//
//	}
//
//}
