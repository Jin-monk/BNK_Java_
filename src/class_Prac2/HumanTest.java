package class_Prac2;

import java.util.Scanner;

import vo.Human;

public class HumanTest {

	public static void main(String[] args) {

		Human a = new Human();
		Human a2 = new Human("혜민",25);

		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요: ");
		String inputN = sc.nextLine();
		System.out.println("나이를 입력하세요: ");
		int inputA = sc.nextInt();

		a.setName(inputN);
		a.setAge(inputA);

		System.out.println(a.toString());
	}

}
