package c01;

public class TryCatch_Prac {

	public static void main(String[] args) {
		try {
			int result = 10 / 0 ; 
			System.out.println("결과: result ");
		}
		catch(ArithmeticException e){
			System.out.println("0으로 나누면 안됩니다. ");
		}
		
		try {
			int[]arr = new int[3] ;
			arr[3] = 10 ;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열 범위 초과");
		}
		
	}
}
