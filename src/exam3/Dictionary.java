package exam3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, String> dictionary = new HashMap<>();
		while (true) {
			// 등록 및 조회
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1: 등록 / 2: 조회 / 3: 종료");
			int selectMenu = sc.nextInt();
			sc.nextLine();
			if (selectMenu == 1) {
				System.out.println("등록할 한글을 쓰세요.");
				String inputkor = sc.nextLine();
				sc.nextLine();
				System.out.println("등록할 영어를 쓰세요.");
				String inputeng = sc.nextLine();
				sc.nextLine();
				dictionary.put(inputkor, inputeng);
				
				
			} else if (selectMenu == 2 ) {
				System.out.println("조회할 한글을 쓰세요.");
				String searchkor = sc.nextLine();
				sc.nextLine();
//				System.out.println("조회할 영어로 쓰세요.");
//				String searcheng = sc.nextLine();
				String result = dictionary.get(searchkor);
				System.out.println(result);
			} else if (selectMenu == 3) {
				System.out.println("종료합니다.");
				break;
				
			}
		}

	}
}
