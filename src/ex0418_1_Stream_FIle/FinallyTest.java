package ex0418_1_Stream_FIle;

public class FinallyTest {

	public static void main(String[] args) {
		
//		System.out.println("----Start----");
//		//해야할 일 (기능)
//		String s = null ; 
//		System.out.println(s.charAt(0));
//		//문제가 생겼다면 문제가 생겼다고 알려주고 프로그램은 지속되어야한다.
//		System.out.println("----End----");
		
		
//		=====================================
		
		System.out.println("----Start2----");
		
		try{    //해야할 일 (기능)
			String s2 = "aaa" ; 
			System.out.println(s2.charAt(0));
		} catch(NullPointerException e) {
			//문제가 생겼다면 문제가 생겼다고 알려주고 프로그램은 지속되어야한다.
			System.out.println("문제 발생 ! ");
			System.out.println("s2에 문자열이 담겨있지 않아요.");
		}finally {
			System.out.println("반드시 해야 할일을 하지.");
		}
		
		System.out.println("----End2---");
		
		
		
		
		
	}

}
