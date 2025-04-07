package integer_Prac;

import java.util.ArrayList;
import java.util.List;

public class ZenericTest {

	public static void main(String[] args) {
		
		Box<String> box = new Box<>();  
		
		box.t = "hello";
		System.out.println(box.t);
		
		Box<X> xbox = new Box<>();
		xbox.t = new X () ;  
		xbox.t.x = 10 ;
		System.out.println(xbox.t.x);
		
		ArrayList<Integer> sList = new ArrayList<>();
		sList.add(10);
		sList.add(20);
		sList.add(40);
		sList.add(20);
		sList.add(60);
		System.out.println(sList);
		
		
	}

}
