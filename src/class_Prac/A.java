package class_Prac;

public class A {
	public int n ; // 접근 제한자 
	String s;
	
	void f() {
		int x = f2();
		System.out.println(x+","+s);
	}
	int f2() {
		return n ; 
	}
	
}
 