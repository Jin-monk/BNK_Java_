package newjava;

public class Value4 {

	// 사칙연산 4개 함수로 그대로 전달.
			//각 함수의 결과를 calc로 전달.
			//div함수는 실수값 리턴.
			//4개 결과의 총합을 더해서 그 값은 main에 리턴 그리고 출력 
 //총합 홀짝 판단후 홀수면 0, 짝수면 1을 넘겨주고 main은 0과 1을 판단후에 짝수 또는 홀수 반환 후 출력 . 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 2;
		int n2 = 1;
		
		
		int x = calc(n1,n2);
		
		if( x == 0 ) {
			System.out.println("짝수입니다.");
		} else if( x == 1) {
			System.out.println("홀수입니다.");
		}

	}
	public static int calc(int n1, int n2 ) {
		int returnResult = 0 ; 
		int a = add(n1,n2);
		int b = sub(n1,n2);
		int c = mul(n1,n2);
		int d = (int)div(n1,n2);
		
		int result = a + b + c + d ; 
		
		if (result % 2 == 0 ) {
			returnResult = 0 ;
		} else if (result % 2 == 1){
			returnResult = 1 ;
		}
		
		
		
		
		return returnResult; 
	}
	public static int add(int n1 , int n2) { //더하기
		
		int sum = n1 + n2 ; 
		
		return sum ; 
	}
	public static int sub(int n1 , int n2) { //빼기
		
		int sub = n1 - n2 ;
		
		return sub ; 
	}
	public static int mul(int n1 , int n2) { //곱하기
		
		int mul = n1 * n2 ;
		
		return mul ; 
	}
	public static double div(int n1 , int n2) { //나누기
		
		double div = n1 * n2 ; 
		
		return (int)div ; 
	}
}
