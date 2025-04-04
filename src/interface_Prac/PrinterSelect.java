package interface_Prac;

import java.util.Scanner;

public class PrinterSelect {

	Scanner sc = new Scanner(System.in);
	Printable printer ; 
	
	public void select(Document doc) {
		System.out.println("프린터를 선택하세요: black, color ");
		String input = sc.nextLine();
		
		if (input.equals("black")) {

			printer = new BlackPrinter();
		} else  {
			printer = new ColorPrinter();

		}
		printer.print(doc);
	}

}
