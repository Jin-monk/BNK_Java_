package c01;

import java.sql.SQLException;
import java.util.Scanner;

public class Test_Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);

		MemberService memberService = new MemberService();
		BoardService boardservice = new BoardService();
		Login login = new Login();
		
		System.out.println("====MENU====");
		System.out.println("1. 회원가입 / 2. 로그인 / 3. 게시물 작성 / 4. 게시물 조회 ");
		System.out.print("입력 >> ");
		int selectMenu = sc.nextInt();
		sc.nextLine();
		
		if(selectMenu == 1) {
			memberService.MemberInsert();
			System.out.println("회원가입 성공 ! ");
		}
		if(selectMenu == 2) {
			login.LoginCheck();
		}
		if(selectMenu == 3) {
			
		}
		if(selectMenu == 4) {
			
		}
		
	}

}
