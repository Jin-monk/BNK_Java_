package newjava;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryNum1 {

	public static void main(String[] args) {
		
		//10진수 -> 2진수 변환

		Scanner sc = new Scanner(System.in);

		int[] arrA = new int[4];
		int[] arrB = new int[4];
		
		System.out.print("값을 입력하세요:  ");
		int inputNum = sc.nextInt();
		int count = 0;

		while (inputNum > 0 ) {
			if (inputNum % 2 == 0) {
				arrA[count] = 0 ;
				count ++;
				inputNum = inputNum / 2; //몫 초기화
				
			} else if (inputNum % 2 == 1) {
				arrA[count] = 1;
				count ++;
				inputNum = inputNum / 2;
			}
		}
		
		int i = 0 ;
			for ( int j = 3 ; j >= 0 ; j --) {
				arrB[i] = arrA[j]; 
				i ++ ; 
			}
		
			
		System.out.println(inputNum);
		System.out.println(Arrays.toString(arrA));
		System.out.println(Arrays.toString(arrB));
	}

}
