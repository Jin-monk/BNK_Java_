package newjava;

import java.util.Arrays;
import java.util.Scanner;

public class InfinityArrays {

	public static void main(String[] args) {

		int count = 1;
		Scanner sc = new Scanner(System.in);
		int[] arrA = new int[count];
		int[] arrB = new int[count + 1];
		count = 0;
		while (true) {
			arrA = new int[count + 1];
			arrB = new int[count + 2];
			System.out.print("수를 입력하세요: ");
			int inputNum = sc.nextInt();

			arrA[count] = inputNum;
			arrB[count] = arrA[count];
			count++;
			

			System.out.println(Arrays.toString(arrA));
			System.out.println(Arrays.toString(arrB));
		}
	}

}
