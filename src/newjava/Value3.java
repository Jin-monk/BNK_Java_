package newjava;

import java.util.Scanner;

public class Value3 {

	public static void main(String[] args) {
//           idx =    0, 1, 2, 3, 4, 5 ,6                                   

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		Scanner sc = new Scanner(System.in);
		System.out.print("( 1 ~ 7 ) 찾을 값을 입력하세요: ");
		
		int inputNum = sc.nextInt();

		int midIdx = 0;
		int startIdx = 0;
		int endIdx = 0;
		int checkIdx = 0;

		endIdx = arr.length - 1;

		while (true) {
			checkIdx = (startIdx + endIdx) / 2; // 0
			midIdx = checkIdx;
			if (arr[checkIdx] == inputNum) {
				System.out.print("\n ");
				System.out.println("입력한 값: " + inputNum + " / " + checkIdx + "번 인덱스에 있습니다 ! ");
				break;
				
			}

			else if (inputNum < arr[checkIdx]) { //입력값이 작을 때 
				endIdx = checkIdx - 1;
				checkIdx = (startIdx + endIdx) / 2;
				if (arr[checkIdx] == inputNum) {
					System.out.print("\n ");
					System.out.println("입력한 값: " + inputNum + " / " + checkIdx + "번 인덱스에 있습니다 ! ");
					break;
				}

			}
			else if (inputNum > arr[checkIdx]) {
				startIdx = checkIdx + 1 ;
				checkIdx = (startIdx + endIdx) / 2;
				if (arr[checkIdx] == inputNum) {
					System.out.print("\n");
					System.out.println("입력한 값: " + inputNum + " / " + checkIdx + "번 인덱스에 있습니다 ! ");
					break;
					
				}
			}
		}
	}
}
