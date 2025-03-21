package newjava;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrac4 {

	public static void main(String[] args) {
		// arr[0] = str.charAt(0); 문자열에서 해당 자릿수에 있는 문자 들고옴.
		int count = 0;
		Scanner sc = new Scanner(System.in);

		String str = "Java is easy";
		char[] temp = { '*', '*', '*', '*', ' ', '*', '*', ' ', '*', '*', '*', '*' };
		System.out.println(str.charAt(0));
		while (count < 12) {
			System.out.println("");
			System.out.print("문자를 입력하세요: ");
			String inputChar = sc.nextLine();
			char i = (char) inputChar.charAt(0);

			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == i) {
					temp[j] = i;
					count++;
				}
			}
			System.out.println("");
			for (int k = 0; k < temp.length;  k++) {
				System.out.print(temp[k]);
				
			}
		}
		

	}

}
