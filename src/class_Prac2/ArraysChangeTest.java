package class_Prac2;

import vo.ArraysChange;

public class ArraysChangeTest {

	public static void main(String[] args) {

		ArraysChange ac1 = new ArraysChange();
	
		ac1.addInt(0, 2);
		ac1.addInt(1, 4);
		ac1.addInt(2, 6);
		ac1.addInt(3, 8);
		ac1.addInt(4, 10);
		System.out.println("초기 요소값: " + ac1.toString());
		ac1.addInt(5, 20);
		ac1.addInt(6, 30);
		ac1.addInt(7, 40);
		ac1.addInt(8, 50);
		ac1.addInt(9, 60);
		ac1.addInt(10, 70);
	
		System.out.println(ac1.toString());
		
		
		ac1.removeInt(4);
		ac1.removeInt(6);
		System.out.println(ac1.toString());
		
		
	}

}
