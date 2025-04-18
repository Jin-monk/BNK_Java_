package ex0417_Project;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		TradeDAO tradedao = new TradeDAO();
		
		System.out.print("--------Menu--------");
		System.out.println();
		System.out.print("1. 매입 장부 입력 / 2. 매출 장부 입력 / 3. 거래처 정보 등록");
		System.out.println();	
		System.out.print("4. 상품 정보 등록 / 5. 사원 정보 등록 / 6. 부서 정보 등록 ");
		System.out.println();
		System.out.print("입력 >> ");
		int selectMenu = sc.nextInt();
		sc.nextLine();
		// 1. 매입 장부 입력 / 2. 매출 장부 입력 / 3.거래처정보 등록 / 4.상품정보 등록 / 5. 사원정보 등록 / 6. 부서 정보 등록  
		
//		1. 매입 장부 입력
		if (selectMenu == 1) {
//			List<TradeIn> inList =  new ArrayList<>();
			TradeIn tradein = new TradeIn() ; 
			
			System.out.print("상품코드 입력 >> ");
			String p_code = sc.nextLine();
			System.out.print("매입일자 입력 >> ");
			String i_date = sc.nextLine();
			System.out.print("매입수량 입력 >> ");
		 	int i_qty = sc.nextInt();
		 	sc.nextLine();
		 	System.out.print("매입단가 입력 >> ");
		 	int i_cost = sc.nextInt();
		 	sc.nextLine();
//		 	System.out.print("매입 일련번호 입력 >> ");
//			int i_seq = sc.nextInt();
			
			tradein.setP_code(p_code);
			tradein.setI_date(i_date);
			tradein.setI_qty(i_qty);
			tradein.setI_cost(i_cost);
			
			tradedao.purchase(tradein);

		} 
		
		
		
//		2. 매출 장부 입력
		else if (selectMenu == 2) {
//			List<TradeOut> outList = new ArrayList<>();
			TradeOut tradeout = new TradeOut(); 
			
			System.out.print("상품코드 입력 >> ");
			String p_code = sc.nextLine();
			System.out.print("거래처코드 입력 >> ");
			String c_code = sc.nextLine();
			System.out.print("판매일자 입력 >> ");
			String o_date = sc.nextLine();
			System.out.print("판매수량 입력 >> ");
			int out_qty = sc.nextInt();
			sc.nextLine();
			System.out.print("판매금액 >> ");
			int out_cost = sc.nextInt();
			sc.nextLine();
			System.out.print("사원코드 입력 >> ");
			String s_code = sc.nextLine();
//			System.out.print("판매 일련번호 입력 >> ");  시퀀스 
			
			tradeout.setP_code(p_code);
			tradeout.setC_code(c_code);
			tradeout.setO_date(o_date);
			tradeout.setOut_qty(out_qty);
			tradeout.setOut_cost(out_cost);
			tradeout.setS_code(s_code);
			
			tradedao.sales(tradeout);
			
		}
//		3. 거래처정보 등록 
		else if (selectMenu == 3) {
//			List<Client> cList = new ArrayList<>();
			Client client = new Client();
			
			System.out.print("거래처코드 입력 >> ");
			String c_code = sc.nextLine();
			System.out.print("거래처명 입력 >> ");
			String c_name = sc.nextLine();
			System.out.print("경영자명 입력 >> ");
			String c_ceo = sc.nextLine();
			System.out.print("거래처주소 입력 >> ");
			String c_addr = sc.nextLine();
			System.out.print("거래처연락처 입력 >> ");
			String c_phone = sc.nextLine();
			
			client.setC_code(c_code);
			client.setC_name(c_name);
			client.setC_ceo(c_ceo);
			client.setC_addr(c_addr);
			client.setC_phone(c_phone);
			
			tradedao.ClientInset(client);
			
		}
//		4. 상품 정보 등록
		else if ( selectMenu == 4 ) {
			
			Product product = new Product();
			
			System.out.print("상품코드 입력 >> ");
			String p_code = sc.nextLine();
			System.out.print("상품명 입력 >> ");
			String p_name = sc.nextLine();
			System.out.print("상품단가 입력 >> ");
			int p_cost = sc.nextInt();
			sc.nextLine();
			System.out.print("소분류 입력 >> ");
			String p_group = sc.nextLine();
			
			product.setP_code(p_code);
			product.setP_name(p_name);
			product.setP_cost(p_cost);
			product.setP_group(p_group);
			
			tradedao.ProductInset(product);
		}
//		5. 사원 정보 등록 
		else if ( selectMenu == 5 ) {
			
			Staff staff = new Staff ();
			
			System.out.print("사원코드 입력 >> ");
			String s_code = sc.nextLine(); 
			System.out.print("부서코드 입력 >> ");
			String d_code = sc.nextLine(); 
			System.out.print("사원이름 입력 >> ");
			String s_name = sc.nextLine(); 
			
			staff.setS_code(s_code);
			staff.setD_code(d_code);
			staff.setS_name(s_name);
			
			tradedao.StaffInset(staff);
		}
//		6. 부서 정보 등록
		else if ( selectMenu == 6) {
			
			Dept dept = new Dept();
			
			System.out.print("부서코드 입력 >> ");
			String d_code = sc.nextLine(); 
			System.out.print("부서명 입력 >> ");
			String d_name = sc.nextLine(); 
			
			dept.setD_code(d_code);
			dept.setD_name(d_name);
			
			tradedao.DeptInset(dept);
		}
		
		
	}

}
