package integer_Prac;

public class XYTest {
	
	public static void main(String[]args) {
		
	
	X a = new X () ; 
	a.x = 10 ; 
	System.out.println(a.x);
	
	Y b = new Y () ;
	b.y = "hello";
	System.out.println(b.y);
	
	// 상속 
	//자식은 부모의 필드도 가지고 있기에 부모보다 자식클래스가 더 크다 . 
	
	X a1  = new Y () ;
	a1.x = 20 ; 
	System.out.println(a1.x);
	
	Y b1 = (Y)a1 ; 
	b1.y = "bye";
	System.out.println(b1.y);
	
	//상속관계 제거 
//	Object a1  = new Y () ;
//	
//	Y b1 = (Y)a1 ; 
//	b1.y = "bye";
//	System.out.println(b1.y);
//	
	
	
	
	
	}
}
