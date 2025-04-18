package ex0418_3_enum;

public class UserTest {

	public static void main(String[] args) {
		
		User user1 = new User();
		
		user1.setUno(0);
		user1.setName("법진");
		user1.setGender(Gender.MALE);
		user1.setRating(Rating.GOLD);
		
//		for(Rating user2 : Rating.values()) {
//			System.out.println(user1);
//		}
		
		//골드 회원 
		System.out.println("지불한 금액 : "+ user1.pay(10000));
		
		
	}	

}
