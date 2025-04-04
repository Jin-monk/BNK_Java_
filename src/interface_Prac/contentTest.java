package interface_Prac;

import java.util.Scanner;

public class contentTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Printable printer;

		Document doc = new Document();
		PrinterSelect ps = new PrinterSelect();

		// 문서작성
		doc.write();

		// 프린터기 선택
		ps.select(doc);
		
	}

}
