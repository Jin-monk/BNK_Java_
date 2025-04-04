package interface_Prac;

import java.util.Scanner;

public class Document {

	private String doc;

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	public void write() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문서를 작성하세요: ");
		String content = "";
		while (true) {
			String s = sc.nextLine();

			if (s.equals("END")) {
				System.out.println("문서 작성 완료.");
				break;
			}
			content = content + "\n" + s;

		}
		doc = content ; 
	}

	public void brand() {
		
		
		
		
	}

}
