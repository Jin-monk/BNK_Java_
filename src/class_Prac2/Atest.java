package class_Prac2;

import vo.A;

public class Atest {

	public static void main(String[] args) {

		A a = new A();
		
		a.setN(10);
		a.setS("Hello");
		
		System.out.println(a.showinfo());
		System.out.println(a);

	}
	
}

