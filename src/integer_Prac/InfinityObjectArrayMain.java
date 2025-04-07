package integer_Prac;

import java.util.Scanner;

public class InfinityObjectArrayMain {

	public static void main(String[] args) {

		InfinityObjectArray ioa = new InfinityObjectArray();
		Scanner sc = new Scanner(System.in);
		while(true) {
			String input = sc.nextLine();
			if ( input.equals("END")) {
				break;
			}
			ioa.add(input);
			
		}
		ioa.showArray();

		System.out.println("인덱스 넘버: " + ioa.idx);
		System.out.println("인덱스 넘버: " + ioa.getObjs().length);
	}
}
