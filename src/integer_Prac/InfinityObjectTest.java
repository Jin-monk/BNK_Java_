package integer_Prac;

class A {
	private int n ;
	private String s ;
	
	public A () {}
	
	public A(int n , String s) {
		this.n = n;
		this.s = s;
		
	}
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}
	@Override
	public String toString() {
		return "A [n=" + n + ", s=" + s + "]";
	}
	
	
}

class B{
	
	private float f ; 
	private char c ;
	
	public B (float f , char c) {
		
		this.f = f;
		this.c = c;
	}
	
	public float getF() {
		return f;
	}
	public void setF(float f) {
		this.f = f;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "B [f=" + f + ", c=" + c + "]";
	} 
	
}


public class InfinityObjectTest {
//오브젝트 타입 무한 배열 만들기 . 
	public static void main(String[] args) {
		
		//오브젝트 성격알기 - 오브젝트 클래스는 모든 클래스의 부모이다.
		//상속 관계에서 자식들은 타입이 다를 수 있다.
		//타입이 다르다는 것은 배열을 만들수 없다는 의미이다.
		//부모타입으로 선언한 배열에 자식 타입들이 들어갈 수 있다.
		//결과적으로 상속관계는 부모타입으로 서로 다른 자식 타입을 하나로 묶을 수 있다는 뜻이다.
		
//		String s = (String)objs[0] ;
//		System.out.println(s);
//		
//		int n = a.getN();
//		String name = a.getS();
//		
//		A ra = (A)objs[1];
//		int n1 = ra.getN();
//		String name1 = ra.getS();
//		
//		System.out.println(n);
		
		Object[] objs = new Object[3];
		
		objs[0] = "Hello";
		objs[1] = new A (1, "James") ; 
		objs[2] = new B(2.3f,'B');
		
		//배열이 꽉 찼으니 새로운 데이터를 넣기 위해 더 큰 배열을 만들어야겠다. 
		Object[] temp = new Object[objs.length+3];  
		
		temp[0] = objs[0];
		temp[1] = objs[1];
		temp[2] = objs[2];
		//objs 라는 변수명 사용
		objs = temp; 
		objs[3] = "Good";
		objs[4] = new A (2, "Ann") ; 
		objs[5] = new B(3.3f,'C');
		
		for (int i = 0 ; i < objs.length; i ++) {
			System.out.println(objs[i]);
		}
		
		
		
		
	}

}
