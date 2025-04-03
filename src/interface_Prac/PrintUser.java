package interface_Prac;

public class PrintUser {

	public static void main(String[] args) {
		
		Printable print1 = new BlackPrinter();
		Printable print2 = new ColorPrinter();
		
		
		 
		
		Document doc = new Document();
		doc.setDoc("법진");
		
		
		print1.print(doc); 
		
	}

}
