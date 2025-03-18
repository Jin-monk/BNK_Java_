package method;

public class MethodCasting01 {

	public static void main(String[] args) {
		double number = 1.5 ; 
		// printNumber(number);  double을 int에 대입 불가능. 형변환 필요 . 
		
		printNumber((int)number); // 명시적 형변환 사용 
		
	}
	public static void printNumber(int n ) {
		System.out.println("숫자: "+ n );
	}
}
