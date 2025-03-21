package newjava;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrac3 {

	public static void main(String[] args) {
		char[] temp = { '*', '*', '*', '*', ' ', '*', '*', ' ', '*', '*', '*', '*' };
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]);
		}
		// **** ** ****
		// Java is easy
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int score = 0 ;
		int minus = 0 ;
		while (count < 10) {
			System.out.println("");
			System.out.print("값을 입력하세요: ");
			int inputNum = sc.nextInt();
			char[] arrA = { 'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'e', 'a', 's', 'y' };

			char answer = (char) inputNum;

			/*
			 * for (int i = 0; i < arrA.length; i ++){ if(arrA[i]==temp[i]) { break; } }
			 */

			for (int i = 0; i < arrA.length; i++) { // 판정

				if (answer == arrA[i]) {

					temp[i] = arrA[i];
					count++;
					score++; 
					
				} else {
					minus++;
				}
			}

			System.out.println("");
			for (int i = 0; i < temp.length; i++) {
				System.out.print(temp[i]);
				
			}
			System.out.println("");
			System.out.print("점수: "+ score*10);
			//System.out.print("점수: "+ minus*10);
			System.out.println("");
		}
	}
}
