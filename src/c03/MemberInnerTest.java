package c03;

public class MemberInnerTest {

	public static void main(String[] args) {

		Outer1 out = new Outer1();
		
		out.getUnit();
		//클래스를 멤버변수화 했다.
		Outer1.MemberInner1 inner = out.new MemberInner1();
		inner.move();
	}

}
