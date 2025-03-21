package newjava;

import java.util.Arrays;

public class ArraysPrac2 {

	public static void main(String[] args) {

		char[] A = new char[26];

		int numA = 65;

		for (int i = 0; i < 26; i++) {
			A[i] = (char) numA;
			numA++;
		}

		System.out.println(Arrays.toString(A));

		char[] B = new char[26];

		int numB = 97;

		for (int i = 0; i < 26; i++) {
			B[i] = (char) numB;
			numB++;
		}

		System.out.println(Arrays.toString(B));
	}
}
