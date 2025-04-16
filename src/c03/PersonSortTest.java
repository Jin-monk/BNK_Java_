package c03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSortTest {

	public static void main(String[] args) {

		Person p1 = new Person("aaa",20);
		Person p2 = new Person("www",76);
		Person p3 = new Person("ggg",14);
		Person p4 = new Person("ddd",35);
		Person p5 = new Person("bbb",41);

//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());
		
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		System.out.println("정렬 전: " +list);
		
		Collections.sort(list);
		System.out.println("정렬 후 : "+ list);
		
		
		
	}

	

}
