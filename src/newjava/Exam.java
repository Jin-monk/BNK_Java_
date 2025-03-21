package newjava;

public class Exam {

	public static void main(String[] args) {
		int n = 1 ;
		int result = f(n);
		System.out.println(result);
	}
	
	static int f(int i) {
		int n = 10;
		
		return f2(i,n);
	}
	
	static int f2(int i,int j) {
		int n = 100;
		return f3(i, j , n);
		
	}
	
	static int f3(int i, int j , int k ) {
		int n = 1000;
		return f4(i, j, k, n);
	}
	
	static int f4(int param1, int param2, int param3, int param4) {
		
		return param1+ param2 + param3+ param4;
	}
}
