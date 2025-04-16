package c03;

public class Outer1 {

	private int speed = 10 ; 
	
	//클래스내에 클래스를 정의할 수도 있긴 한데 이걸 내부클래스라 부른다.
	//아우터클래스가 내부클래스를 필요로하기 때문에 사용하고 묶어서 사용함.
	//내부 클래스는 외부 클래스의 자원을 제약없이 사용 가능하다.
	class MemberInner1{
		public void move() {
			System.out.printf("인간형 유닛이 %d 속도로 이동합니다. \n",speed);
			
		}
	}
	
	public void getUnit() {
		MemberInner1 inner = new MemberInner1();
		inner.move();
	}
	
	
	
}
