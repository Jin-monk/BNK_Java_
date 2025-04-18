package ex0417_Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TradeDAO {
	Scanner sc = new Scanner(System.in);

	DBConn dbconn = new DBConn();
	Connection conn;
	PreparedStatement pstmt;

	// DB 연결
	public TradeDAO() throws ClassNotFoundException, SQLException {
		conn = dbconn.DBconn1();
	}

	// 매입 장부 입력.
	public void purchase(TradeIn tradein) throws SQLException {
//		String p_code = sc.nextLine();
//		String i_date = sc.nextLine();
//	 	int i_qty = sc.nextInt();
//	 	int i_cost = sc.nextInt(); 
//		int i_seq = sc.nextInt();

		String insertQuery = "INSERT INTO tradein VALUES(?,?,?,?,i_seq.NEXTVAL)";
		pstmt = conn.prepareStatement(insertQuery);

		pstmt.setString(1, tradein.getP_code());
		pstmt.setString(2, tradein.getI_date());
		pstmt.setInt(3, tradein.getI_qty());
		pstmt.setInt(4, tradein.getI_cost());
//		pstmt.setInt(5, tradein.getI-seq());

		pstmt.executeUpdate();
		System.out.println("매입 장부 입력완료.");

		// 재고 관리.
//		tradein이 잡히면 해당 상품코드의 매입수량 만큼 재고수량을 더해준다.

		String updateQuery = "UPDATE stock SET S_QTY = S_QTY+ ? WHERE P_CODE = ? ";
		PreparedStatement pstmt2 = conn.prepareStatement(updateQuery);
		pstmt2.setInt(1, tradein.getI_qty());
		pstmt2.setString(2, tradein.getP_code());

		pstmt2.executeUpdate();

		System.out.println("재고 수량 반영완료.");

	}

	// 매출 장부 입력.
	public void sales(TradeOut tradeout) throws SQLException {
		Stock stock = new Stock();
//		String p_code = sc.nextLine();
//		String c_code = sc.nextLine();
//		String o_date = sc.nextLine();
//		int out_qty = sc.nextInt();
//		int out_cost = sc.nextInt();
//		String s_code = sc.nextLine();
//		int o_seq = sc.nextInt();

		
//		재고수량 0 미만 방지

		// version 1 작동안됨.
//		if (tradeout.getOut_qty() > stock.getS_qty()) {
//			System.out.println("판매수량이 재고보다 많습니다 !! ");
//			return ; 
//		}else {

		// version 2
		// 현재 재고 수량 파악
		String checkQty = "SELECT s_qty FROM STOCK WHERE p_code = ?";
		PreparedStatement checkpstmt = conn.prepareStatement(checkQty);
		checkpstmt.setString(1, tradeout.getP_code());
		ResultSet rs = checkpstmt.executeQuery();
		
		int currentQty = 0 ; 
		if (rs.next()) {
		    currentQty = rs.getInt("s_qty");  
		}
		if ( tradeout.getOut_qty() > currentQty) {
			System.out.println("판매수량이 재고보다 많습니다 !! ");
			return ; 
		}

		String insertQuery = "INSERT INTO tradeout VALUES(?,?,?,?,?,?,o_seq.NEXTVAL)";

		pstmt = conn.prepareStatement(insertQuery);

		pstmt.setString(1, tradeout.getP_code());
		pstmt.setString(2, tradeout.getC_code());
		pstmt.setString(3, tradeout.getO_date());
		pstmt.setInt(4, tradeout.getOut_qty());
		pstmt.setInt(5, tradeout.getOut_cost());
		pstmt.setString(6, tradeout.getS_code());
//		pstmt.setInt(7, o_seq);

		pstmt.executeUpdate();
		System.out.println("판매장부 입력완료.");

		// 재고 관리
//		tradeout 시에 판매수량 만큼 재고에서 빼기.

		String updateQuery = "UPDATE stock SET S_QTY = S_QTY - ? WHERE P_CODE = ? ";

		PreparedStatement pstmt2 = conn.prepareStatement(updateQuery);

		pstmt2.setInt(1, tradeout.getOut_qty());
		pstmt2.setString(2, tradeout.getP_code());

		pstmt2.executeUpdate();
		System.out.println("재고 수량 반영완료.");
	}

	// 거래처 정보 insert
	public void ClientInset(Client client) throws SQLException {
		String query = "INSERT INTO client VALUES (?,?,?,?,?)";
		pstmt = conn.prepareStatement(query);

		pstmt.setString(1, client.getC_code());
		pstmt.setString(2, client.getC_name());
		pstmt.setString(3, client.getC_ceo());
		pstmt.setString(4, client.getC_addr());
		pstmt.setString(5, client.getC_phone());

		pstmt.executeUpdate();
		System.out.println("거래처 정보 등록완료.");
	}

	// 상품 정보 insert
	public void ProductInset(Product product) throws SQLException {
		String query = "INSERT INTO product VALUES (?,?,?,?)";
		pstmt = conn.prepareStatement(query);

		pstmt.setString(1, product.getP_code());
		pstmt.setString(2, product.getP_name());
		pstmt.setInt(3, product.getP_cost());
		pstmt.setString(4, product.getP_group());

		pstmt.executeUpdate();
		System.out.println("상품 정보 등록완료.");

	}

	// 사원 정보 insert
	public void StaffInset(Staff staff) throws SQLException {
		String query = "INSERT INTO staff VALUES (?,?,?)";
		pstmt = conn.prepareStatement(query);

		pstmt.setString(1, staff.getS_code());
		pstmt.setString(2, staff.getD_code());
		pstmt.setString(3, staff.getS_name());

		pstmt.executeUpdate();
		System.out.println("사원 정보 등록완료.");
	}

	// 부서 정보 insert
	public void DeptInset(Dept dept) throws SQLException {
		String query = "INSERT INTO dept VALUES (?,?)";
		pstmt = conn.prepareStatement(query);

		pstmt.setString(1, dept.getD_code());
		pstmt.setString(2, dept.getD_name());

		pstmt.executeUpdate();
		System.out.println("부서 정보 등록완료.");
	}

}
