package vo;

public class Static {
	
	public int n ;
	public static int x ; 
	public static int y ; 
	
	public void test() {
		System.out.println("테스트입니다.");
	}
	
	/*
	 * public void nonStaticF() { test(); staticF();
	 * System.out.println("nonf함수 실행"+x); }
	 */
	public static void staticF() {
		//test(); 접근불가
		//staticF();  접근불가
		System.out.println("f함수 실행" );
	}
}
