package interface_Prac;

import java.util.Scanner;

public class PrintUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Printable print1 = new BlackPrinter();
		Printable print2 = new ColorPrinter();
		
		Document doc = new Document();
		System.out.println("프린트할 문서를 작성하세요!");
		String content = sc.nextLine();
		
		//content = "END";
		String[] contentArr = content.split(",");
		for(int i = 0 ; i<contentArr.length ; i ++) {
			doc.setDoc(contentArr[i]);
		
		}
		
		while(true) {
			if (content.equals("END")) {
				break;
				
				
				
			}
		}
		print1.print(doc);
		
		
		
		//doc.setDoc();
		
//		doc.doc = "자바";
//		doc.setDoc("법진");
		
		
//		print1.print(doc); 
		
	}

}
