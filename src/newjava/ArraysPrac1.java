package newjava;

public class ArraysPrac1 {

	static char[] A = { 'A', 'B', 'C', 'D', 'E' };

	public static void main(String[] args) {

		char h1 = (char)65;
		System.out.println(h1);
		
		f1();

		f2();

	}

	public static void f1() {

		for (int i = 0; i < A.length; i++) {
			System.out.print(" "+A[i]);
		}

	}

	public static void f2() { 
		int[] alpa = { 97, 98, 99, 100, 101 };
		int idx = 0;

		for (int i = 0; i < 5; i++) {
			char calpa = (char) alpa[idx];
			idx++;
			System.out.print(" ");
			System.out.print(""+calpa);
		}
	}
}
