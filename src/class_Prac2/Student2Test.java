package class_Prac2;
//Student2, Student2Test, Bus

import vo.Bus;
import vo.Student2;

public class Student2Test {

	public static void main(String[] args) {
		
		Student2 stu1 = new Student2("법진",1,10000);
		Bus bus1 = new Bus(6);
		
		bus1.take(stu1);
		System.out.println();
		System.out.println(bus1.toString());
		
	}

}
