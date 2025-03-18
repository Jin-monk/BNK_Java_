package Overloading;

public class Overloading2 {
	
	public static void main (String[] args) {
		System.out.println("1"+myMethod(1, 1.2));
		System.out.println("2"+myMethod(1.2, 1));
		
	}
	public static double myMethod( int a, double b ) {
		System.out.println("int a , double b ");
		return a + b;
		
	}
	public static double myMethod( double a, int b ) {
		System.out.println("double a , int b ");
		return a + b;
	}
}
