package newjava;

import java.util.*;

public class UsecaseDiagram {
	public static void main(String[] args) {
//                                                             
//                        wantNum                   inputMoney      inven          
//					돈		갯수		합계      잔돈        투입금          재고        	 
//				   [0]      [1]     [2]     [3]        [4]           [5]              
//	             ------------------------------------------------------------
//		drink[0]|   100      2      200     800        1000                                              			
//		drink[1]|   200                                            
//		drink[2]|   300                                                   

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][6];
		System.out.print("돈을 넣으세요: ");
		int inputMoney = sc.nextInt();
		int saveMoney = 0;
		for (int i = 0; i < 3; i++) {
			arr[i][5] = 10;
			
		}
		

		while (inputMoney >= 0) {
			arr[0][0] = 100; // 상품의 가격
			arr[1][0] = 200;
			arr[2][0] = 300;

			int inputDrink = 0;
			
			System.out.print("상품을 선택하세요: ");
			inputDrink = sc.nextInt();
			
			// --------------- 관리자모드 시작 --------------
			if (inputDrink == 99) {
				System.out.println("관리자 모드입니다.");
				System.out.println("무엇을 하실건가요 ? 1: 돈 회수 2: 재고 충전");
				int manager = sc.nextInt();
				if(manager == 1) {
					System.out.println("돈 "+saveMoney+"를 회수합니다.");
					saveMoney = 0 ;
					break;
				} else if (manager == 2) {
					System.out.println("재고를 충전합니다.");
					System.out.print("몇 번 재고를 충전할까요?: ");
					int chargeDrink = sc.nextInt();
					System.out.print("몇 개를 충전할까요?: ");
					int chargeDrinkWantNum = sc.nextInt();
					arr[chargeDrink][5] = arr[chargeDrink][5] + chargeDrinkWantNum;
					break;
				}
			}
			// --------------- 관리자모드 종료 --------------

			System.out.print("갯수를 선택하세요: ");
			int wantNum = sc.nextInt();

			arr[inputDrink][4] = inputMoney; // 투입금 넣기
			arr[inputDrink][1] = wantNum; // 갯수 넣기
			arr[inputDrink][2] = (arr[inputDrink][0] * arr[inputDrink][1]); // 상품가격 * 갯수 = 합계 넣기

			if (arr[inputDrink][2] > arr[inputDrink][4]) {
				System.out.println("\n" + "돈이 부족합니다.");
				break;
			}

			arr[inputDrink][3] = arr[inputDrink][4] - arr[inputDrink][2];

			System.out.println("\n" + "입력하신 " + inputDrink + "번 상품이 " + wantNum + "개 나옵니다.");
			System.out.println("거스름돈: " + arr[inputDrink][3] + "원이 나옵니다.");
			arr[inputDrink][5] = arr[inputDrink][5] - wantNum; // 재고 갱신
			inputMoney = inputMoney - arr[inputDrink][2]; // 사용자의 남은 돈 .
			saveMoney = saveMoney + arr[inputDrink][2]; // 자판기의 저금된 돈
			// System.out.print("자판기가 가진 돈: " + saveMoney + "\n"); // 자판기에 있는 돈

			/*
			 * System.out.print("-----------------------------------------------" + "\n");
			 * for (int i = 0; i < 3; i++) { for (int j = 0; j < 6; j++) {
			 * System.out.print(arr[i][j] + "\t"); } System.out.println(" "); }
			 * System.out.print("-----------------------------------------------" + "\n");
			 */
			inputMoney = arr[inputDrink][3];

			if (inputMoney == 0) {
				System.out.println("\n" + "돈이 부족합니다.");
				break;
			}
			if (arr[inputDrink][5] <= 0) {
				System.out.println("재고가 부족합니다.");
				break;
				//soldout();
			}

			for (int i = 1; i < 5; i++) { // 값 초기화
				arr[inputDrink][i] = 0;
			}

		}
		
		System.out.println("시스템을 종료합니다.");
		System.out.print("-----------------------------------------------" + "\n");
		System.out.print("상품가격\t갯수\t합계\t잔돈\t투입금\t재고"+"\n");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println(" ");
		}
		System.out.print("-----------------------------------------------" + "\n");

		/*
		 * System.out.print("-------------------------------"+"\n"); for (int i = 0; i <
		 * 3; i++) { for (int j = 0; j < 5; j++) { System.out.print(arr[i][j] + " "); }
		 * System.out.println(" "); }
		 * System.out.print("-------------------------------");
		 */

	}

	public static void manager() {

	}

	public static void soldout() {
		System.out.println("재고가 부족합니다.");
		
	}

}