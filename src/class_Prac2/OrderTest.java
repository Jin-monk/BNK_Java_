package class_Prac2;

import vo.Member;
import vo.Order;
//Order, OrderTest, Member
public class OrderTest {

	public static void main(String[] args) {

		Member mb1 = new Member();

		mb1.setMemberId("testid");
		mb1.setMemberName("testname");
		mb1.setMemberAddress("testaddress");

		Order od1 = new Order(202503280001L, "2025", "마우스", mb1);

		od1.setOrder(202503280001L);
		od1.setOrderDate("2025년 3월 28일");
		od1.setOrderObject("PD0345-12");

		System.out.println(od1.toString());

	}

}


// 사람 개인정보 
// 학생 정보 
// 개인정보 클래스명: 퍼스널
//       클래스명: 스튜던트 