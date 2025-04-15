package book01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookDAO {
//	List<Book> bkList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	DBConn dbconn = new DBConn();
	// CRUD
	// Connection conn = dbconn.DBconn1();
	PreparedStatement pstmt;
	Connection conn;

	public BookDAO() throws ClassNotFoundException, SQLException {
		conn = dbconn.DBconn1();
	}

	public void Insert() throws SQLException, ClassNotFoundException {
		
		System.out.print("추가할 책 번호를 입력하세요 >> ");
		String inputbkno = sc.nextLine();
		System.out.print("추가할 책 이름을 입력하세요 >> ");
		String inputbkname = sc.nextLine();
		System.out.print("추가할 책 저자를 입력하세요 >> ");
		String inputbkwriter = sc.nextLine();
		System.out.print("추가할 책 출판사를 입력하세요 >> ");
		String inputbkpublisher = sc.nextLine();
		System.out.print("추가할 책 가격을 입력하세요 >> ");
		int inputbkprice = sc.nextInt();
		String query = "INSERT INTO BOOK VALUES(?,?,?,?,? )";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, inputbkno);
		pstmt.setString(2, inputbkname);
		pstmt.setString(3, inputbkwriter);
		pstmt.setString(4, inputbkpublisher);
		pstmt.setInt(5, inputbkprice);

		pstmt.executeUpdate();
		System.out.println("책이 추가 되었습니다 ! " + "\n");

	}

	public void Delete() throws SQLException, ClassNotFoundException {
		System.out.print("삭제할 책 번호를 입력하세요 >> ");
		String inputbkno = sc.nextLine();
		String query = "DELETE BOOK WHERE BK_NO = ?";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, inputbkno);
		pstmt.executeUpdate();
		System.out.println("책이 삭제 되었습니다 ! " + "\n");
	}

	public void UpdateNo() throws SQLException, ClassNotFoundException {
		System.out.print("수정할 책 번호를 입력하세요 >> ");
		String inputbkno = sc.nextLine();
		System.out.print("몇 번으로 바꿀까요 ?  >> ");
		String updateNo = sc.nextLine();
		String query = "UPDATE BOOK SET BK_NO = ? WHERE BK_NO = ? ";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, updateNo);
		pstmt.setString(2, inputbkno);
		pstmt.executeUpdate();
		System.out.println("책이 수정 되었습니다 ! " + "\n");

	}
	public void UpdateName() throws SQLException, ClassNotFoundException {
		System.out.print("몇 번 책의 이름을 바꿀까요? >>");
		String updateNo = sc.nextLine();
		System.out.print("수정할 책 이름를 입력하세요 >> ");
		String inputname = sc.nextLine();
		String query = "UPDATE BOOK SET BK_NAME = ? WHERE BK_NO = ? ";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, inputname);
		pstmt.setString(2, updateNo);
		pstmt.executeUpdate();
		System.out.println("책이 수정 되었습니다 ! " + "\n");
		
	}
	public void UpdateWriter() throws SQLException, ClassNotFoundException {
		System.out.print("몇 번 책의 저자를 바꿀까요? >>");
		String updateNo = sc.nextLine();
		System.out.print("수정할 책 저자를 입력하세요 >> ");
		String inputWriter = sc.nextLine();
		String query = "UPDATE BOOK SET BK_WRITER = ? WHERE BK_NO = ? ";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, inputWriter);
		pstmt.setString(2, updateNo);
		pstmt.executeUpdate();
		System.out.println("책이 수정 되었습니다 ! " + "\n");
		
	}
	public void UpdatePublisher() throws SQLException, ClassNotFoundException {
		System.out.print("몇 번 책의 출판사를 바꿀까요? >>");
		String updateNo = sc.nextLine();
		System.out.print("수정할 책 출판사를 입력하세요 >> ");
		String inputpublisher = sc.nextLine();
		String query = "UPDATE BOOK SET BK_PUBLISHER = ? WHERE BK_NO = ?";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, inputpublisher);
		pstmt.setString(2, updateNo);
		pstmt.executeUpdate();
		System.out.println("책이 수정 되었습니다 ! " + "\n");
		
	}
	public void UpdatePrice() throws SQLException, ClassNotFoundException {
		System.out.print("몇 번 책의 가격을 바꿀까요? >>");
		String updateNo = sc.nextLine();
		System.out.print("수정할 책 가격을 입력하세요 >> ");
		String inputprice = sc.nextLine();
		String query = "UPDATE BOOK SET BK_PRICE = ? WHERE BK_NO = ? ";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, inputprice);
		pstmt.setString(2, updateNo);
		pstmt.executeUpdate();
		System.out.println("책이 수정 되었습니다 ! " + "\n");
		
	}
	
	
	
	

	// 책 조회
	public List<Book> SelectAll() throws SQLException, ClassNotFoundException {
		List<Book> bkList = new ArrayList<>();

//		System.out.println("1. 책 전체 조회 / 2. 책 부분 조회 ");
//		System.out.print("조회할 메뉴를 입력하세요 >> ");
//		int inputselect = sc.nextInt();
//		sc.nextLine();

		// 책 전체 조회

		String query = "SELECT * FROM  BOOK";
		pstmt = conn.prepareStatement(query);
		ResultSet rs = pstmt.executeQuery(query);
		while (rs.next()) {
//			Book book = new Book();
//			String bk_no = rs.getString("BK_NO");
//			String bk_name = rs.getString("BK_NAME");
//			String bk_writer = rs.getString("BK_WRITER");
//			String bk_publisher = rs.getString("BK_PUBLISHER");
//			String bk_price = rs.getString("BK_PRICE");
//
//			book.setBk_no(bk_no);
//			book.setBk_name(bk_name);
//			book.setBk_writer(bk_writer);
//			book.setBk_publisher(bk_publisher);
//			book.setBk_price(bk_price);
			Book book = resultSetToBook(rs);
			bkList.add(book);

		}
//		for (Book b : bkList) {
//			System.out.println(b);
//		}
//		System.out.println("책을 조회했습니다 ! " + "\n");
		return bkList;

	}

	public List<Book> SelectPart() throws SQLException, ClassNotFoundException {
		List<Book> bkList = new ArrayList<>();

		System.out.print("조회할 책 제목을 입력하세요 >> ");
		String searchname = sc.nextLine();

		String query = "SELECT * FROM  BOOK WHERE BK_NAME = ?";
		pstmt = conn.prepareStatement(query);
		pstmt.setString(1, searchname);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
//			Book book = new Book();
//			String bk_no = rs.getString("BK_NO");
//			String bk_name = rs.getString("BK_NAME");
//			String bk_writer = rs.getString("BK_WRITER");
//			String bk_publisher = rs.getString("BK_PUBLISHER");
//			String bk_price = rs.getString("BK_PRICE");
//
//			book.setBk_no(bk_no);
//			book.setBk_name(bk_name);
//			book.setBk_writer(bk_writer);
//			book.setBk_publisher(bk_publisher);
//			book.setBk_price(bk_price);
			Book book = resultSetToBook(rs);
			bkList.add(book);

		}
//		for (Book b : bkList) {
//			System.out.println(b);
//		}
		return bkList;

	}
	
	private Book resultSetToBook (ResultSet rs ) throws SQLException {
		Book book = new Book ();
		book.setBk_no(rs.getString("BK_No"));
		book.setBk_name(rs.getString("BK_NAME"));
		book.setBk_writer(rs.getString("BK_WRITER"));
		book.setBk_publisher(rs.getString("BK_PUBLISHER"));
		book.setBk_price(rs.getString("BK_PRICE"));
		return book ; 
	}
}
