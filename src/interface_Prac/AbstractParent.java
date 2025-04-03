package interface_Prac;
//AbstractParent, AbstractParent, AbstractTestMain
public abstract class AbstractParent {

	private int n;

	/*
	 * public AbstractParent() { System.out.println("AbstractParent 생성자 호출 "); }
	 */

	public AbstractParent(int n) {
		this.n = n;
		System.out.println("AbstractParent 생성자 호출 ");
	}

	public void f() {
		System.out.println("f()함수 실행");
	}

	public abstract void af(); //abstract 사용하여 추상메서드라 표현해줘야함. 인터페이스랑 다름.

	public void setN(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

}
