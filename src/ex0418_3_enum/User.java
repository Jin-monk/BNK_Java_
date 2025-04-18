package ex0418_3_enum;

import lombok.Data;

/*
 	회원 클래스 생성 (user)
 	회원의 멤버변수는 회원번호, 이름, 성별, 회원등급 입니다.
 	성별은 남자여자 MALE FEMALE로 되어있습니다.
 	회원등급은 골드 실버 브론즈 GOLD SILVER BRONZE로 되어있습니다.
 	회원등급이 골드인 회원은 할인율이 10% 적용됩니다.
 	회원등급이 실버인 회원은 할인율이 5% 적용됩니다.
 	회원등급이 브론즈인 회원은 할인율이 2% 적용됩니다.
 	
 	실행클래스를 만들어 골드 실버 브론즈 회원을 테스트하세요 .
 	
 	enum에 calculateDiscount()메소드를 만들고 등급별 할인율을 적용하여
 	할인금액을 반환하는 메서드
 	int calculateDiscount ( int price);
 	
 	User 클래스에 pay ()메서드를 만들고 
 	void pay ( int price)
 	회원등급과 실제 지불한 금액을 콘솔에 출력하는 기능 
 	할인이 적용된 금액 출력  
 */

@Data
public class User {
	
	private int uno;
	private String name;
	private Gender gender;
	private Rating rating;
	
	int pay (int price) {
		int discountCost = rating.calculateDiscount(price);
		int payment = price - discountCost;
		
		return payment ; 
	}
}
