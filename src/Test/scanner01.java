package Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class scanner01 {
	// 1~10까지 랜덤수 갯수

	public static void main ( String[] args) {

		Random rd = new Random() ;
		Scanner sc = new Scanner(System.in);

		int[] inputArr = new int [10];
		int score = 100; 
		int rdNum = rd.nextInt(10) + 1; 
		int count = 0 ;  // 변수명에서 헷갈리지 않게끔 변수명 선언 
		int highscore = 0; 
		int idx = 0 ;

		while (true) {

			count++;

			System.out.print("숫자를 입력하세요: ");
			int inputNum = sc.nextInt();
			inputArr[idx] = inputNum ;
			idx++;

			if (rdNum == inputNum) {

				System.out.println(count + "번째 도전에서 맞추셨습니다.");
				System.out.println();

				System.out.println("게임 점수는 "+score+"입니다.");
				System.out.println();

				if (highscore < score ) {
					highscore = score ;
				}

				System.out.println("게임 최고점수는 "+highscore+"입니다.");
				System.out.println();

				for ( int i = 0 ; i < inputArr.length ; i ++) {
					if (inputArr[i] != 0) {
						System.out.print(inputArr[i] + " ");
					}
				}

				System.out.println();
				System.out.println("게임을 계속하시겠습니까? ");
				System.out.println();
				System.out.println("재시작은 1, 종료는 2를 입력하세요. ");
				System.out.println();

				//-------------------------------------------------------게임 재시작

				int restart = sc.nextInt();

				for ( int i = 0 ; i < inputArr.length; i ++) {
					inputArr[i] = 0;
				}
				rdNum = rd.nextInt(10) + 1; 
				count = 0;
				count ++;
				score = 100 ; 
			

				if (restart == 1) {
					System.out.print("숫자를 입력하세요: ");

					inputNum = sc.nextInt();
					if (rdNum == inputNum) {

						//inputArr = 
						System.out.println(count + "번째 도전에서 맞추셨습니다.");
						System.out.println();
						System.out.println("게임 점수는 "+score+"입니다.");
						System.out.println();

						if (highscore < score ) {
							highscore = score ;
						}

						System.out.println("게임 최고점수는 "+highscore+"입니다.");
						System.out.println();

						for ( int i = 0 ; i < inputArr.length ; i ++) {

							if (inputArr[i] != 0) {
								System.out.print(inputArr[i] + " ");
							}
						}

					}else if ( rdNum > inputNum){
						System.out.println("틀리셨습니다. 난수는 더 큽니다.");
						System.out.println();

					}else {
						System.out.println("틀리셨습니다. 난수는 더 작습니다.");
						System.out.println();
					}
					score= score - 5 ; 

				}else {

					// ----------------------------------------------------재시작 게임 끝 
					for ( int i = 0 ; i < inputArr.length ; i ++) {

						if (inputArr[i] != 0) {
							System.out.print(inputArr[i] + " ");
						}
					}
					break;
				}

				//배열 출력 부분 수정필요 

			} else if ( rdNum > inputNum){
				System.out.println("틀리셨습니다. 난수는 더 큽니다.");
				System.out.println();

			} else {
				System.out.println("틀리셨습니다. 난수는 더 작습니다.");
				System.out.println();
			}
			score= score - 5 ; 
		}
	}
} 