package ex0418_3_enum;

public class MemberTest {

	public static void main(String[] args) {
	
		Member member = new Member();
		
		member.setName("법진");
		member.setGender(Gender.MALE);
		
		Member member2 = new Member();
		
		member.setName("홍길동");
		member.setGender(Gender.FEMALE);
		
		Member member3 = new Member("철수",Gender.MALE);
		
		
		
	}

}
