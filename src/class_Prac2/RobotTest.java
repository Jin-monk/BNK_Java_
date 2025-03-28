package class_Prac2;
//Robot, RobotTest
import java.util.Scanner;

import vo.Robot;

public class RobotTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		Robot r1 = new Robot();
		System.out.println("이름을 입력하세요: ");
		String inputName = sc.nextLine();
		r1.setName(inputName);
		
		while (true) {
			System.out.println("칭찬:<1> / 꾸중 <2> / 종료: <3>");
			int inputNum = sc.nextInt();
			if (inputNum == 1) { // 칭찬
				r1.praise();
			} else if (inputNum == 2) { // 꾸중
				r1.scold();
			} else if (inputNum == 3 ) {
				System.out.println("종료");
				break;
			}
			System.out.println(r1.toString());
			r1.situation();
		}

	}

}
