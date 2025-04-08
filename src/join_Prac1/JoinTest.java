package join_Prac1;

import java.util.ArrayList;
import java.util.Scanner;

public class JoinTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입 아이디를 입력하세요: ");
		String id99 = sc.nextLine();
		System.out.println("회원가입 비밀번호를 입력하세요: ");
		String pw99 = sc.nextLine();

		Join join1 = new Join(id99, pw99);
		Login login1 = new Login();
		ArrayList<Join> joinList = new ArrayList<>();

		System.out.println("로그인 아이디를 입력하세요 : ");
		String loginId = sc.nextLine();
		System.out.println("로그인 비밀번호를 입력하세요 : ");
		String loginPw = sc.nextLine();
		
		boolean found = false; 
		for (int i = 0; i < joinList.size(); i++) {
			Join member = joinList.get(i);
			if (join1.getInputJoinId().equals(loginId) && join1.getInputJoinPw().equals(loginPw)) {
				System.out.println("로그인 성공");
				found = true ; 
				break;
			}
		}

		System.out.println(joinList.toString());

	}
}
