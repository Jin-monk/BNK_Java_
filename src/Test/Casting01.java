package Test;

public class Casting01 {

	public static void main(String[] args) {
		
		double doubleValue = 1.7 ; 
		int intValue = 2;
		
		//doubleValue = intValue ;
		
		intValue = (int) doubleValue ;
		
		System.out.println(intValue);
		System.out.println(doubleValue); // 실제로 값이 변하는건 아니고 출력할 때만 변함.

	}

}
