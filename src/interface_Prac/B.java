package interface_Prac;
//IB, IBTestMain, B, C
public class B implements IB {
	
// 클래스 B는 인터페이스 IB를 구현한 구현체입니다.
	
	@Override
	public void f1() {
		System.out.println("B클래스의 f1함수 실행");
	}

	@Override
	public int f2() {
		System.out.println("B클래스의 f2함수 실행");
		return 0;
	}

}
